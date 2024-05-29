package in.ashokit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.dto.LoginDto;
import in.ashokit.dto.QuoteDto;
import in.ashokit.dto.RegisterDto;
import in.ashokit.dto.ResetPwdDto;
import in.ashokit.dto.UserDto;
import in.ashokit.entity.CityEntity;
import in.ashokit.entity.CountryEntity;
import in.ashokit.entity.StateEntity;
import in.ashokit.entity.UserEntity;
import in.ashokit.repo.CityRepo;
import in.ashokit.repo.CountryRepo;
import in.ashokit.repo.StateRepo;
import in.ashokit.repo.UserRepo;
import in.ashokit.utils.EmailUtils;
@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
    private  EmailUtils emialUtils;
   
    private QuoteDto[] quotations= null;
    
 
   
   
	@Override
	public Map<Integer, String> getCountries() {
		
		Map<Integer,String> countryMap = new HashMap<>();
		
		List<CountryEntity> countriesList = countryRepo.findAll();
		
		countriesList.forEach(c -> {
			countryMap.put(c.getCountryId(), c.getCountryName());
		});
		
		return countryMap;
	}

	@Override
	public Map<Integer, String> getStates(Integer cid) {
		
		Map<Integer , String> statesMap = new HashMap<>();
		
		/*
		
		CountryEntity country= new CountryEntity();
		country.setCountryId(cid);
		
		StateEntity entity= new StateEntity();
		entity.setCountry(country);
		
		Example<StateEntity> of = Example.of(entity);
		List<StateEntity> statesList = stateRepo.findAll(of);
		*/
		List<StateEntity> statesList = stateRepo.getStates(cid);
		statesList.forEach(s->{
			statesMap.put(s.getStateId(), s.getStateName());
			
		});
		 return statesMap;
	}

	@Override
	public Map<Integer, String> getCities(Integer sid) {
		
		Map<Integer, String> citiesMap= new HashMap<>();
		
		List<CityEntity> CitiesList = cityRepo.getCities(sid);
		
		CitiesList.forEach(c->{
			citiesMap.put(c.getCityId(), c.getCityName());
			
			
		});
		
		return citiesMap;
	}

	@Override
	public UserDto getUser(String email) {
		//copy date from one object to another  object
		System.out.println(email);
		UserEntity userEntity = userRepo.findByEmail(email);
		if(userEntity!=null) {
			ModelMapper  mapper =  new ModelMapper();
			UserDto userDto = mapper.map(userEntity, UserDto.class);
			return userDto;
		}
		/*
		UserDto dto= new UserDto();
		BeanUtils.copyProperties(userEntity, dto);
		*/
		return null;
	}

	
	@Override
	public boolean registerUser(RegisterDto regDto) {
		System.out.println("haii-2");
		ModelMapper  mapper =  new ModelMapper();
		UserEntity  entity = mapper.map(regDto, UserEntity.class);
		
		CountryEntity country= countryRepo.findById(regDto.getCountryId()).orElseThrow();		
		StateEntity  state = stateRepo.findById(regDto.getStateId()).orElseThrow();
		CityEntity city = cityRepo.findById(regDto.getCityId()).orElseThrow();
		System.out.println("haii-3");
		System.out.println(state);
		entity.setCountry(country);
		entity.setState(state);
		entity.setCity(city);
		
		entity.setPwd(generateRandom());
		entity.setPwdUpdate("NO");
		
		//user registration
		UserEntity savedEntity =userRepo.save(entity);
		
		String subject="User Registration";
	    String  body="Your temporary Pwd is "+entity.getPwd();
	    emialUtils.sendEmail(regDto.getEmail(),subject,body);
	   
	   
		return savedEntity.getUserId()!=null;
	}

	@Override
	public UserDto getUser(LoginDto loginDto) {
	    UserEntity userEntity =  userRepo.findByEmailAndPwd(loginDto.getEmail(),loginDto.getPwd());
	    System.out.println(userEntity.getPwdUpdate());
	    if(userEntity == null) {
	        return null;
	    }
	    
	    // Create a new ModelMapper instance
	    ModelMapper mapper = new ModelMapper();
	    
	    // Map UserEntity to UserDto
	    UserDto userDto = mapper.map(userEntity, UserDto.class);
	    System.out.println(userDto.getPwdUpdate());
	    
	    return userDto;
	}

	@Override
	public boolean resetPwd(ResetPwdDto pwdDto) {
		
	UserEntity userEntity = userRepo.findByEmailAndPwd(pwdDto.getEmail(),pwdDto.getOldPwd());
		
		if(userEntity!=null) {
		userEntity.setPwd(pwdDto.getNewPwd());
		userEntity.setPwdUpdate("YES");
	    userRepo.save(userEntity);
		return true;
	  }
		
	  return false;
	}
	
	//to comunicate application with  3rd api.we need to make one web service call.
	//web service noting but our application then sholud communicate with 3 rd pary api.
	//3 rd party api is a text format.(url and string data display covert into java object.)
	
	@Override
	public String getQuote() {
		
		//out side of the try catch block
		QuoteDto[]quotations=null;
		
		String url="http://type.fit/api/quotes";
		
		//web service call
		//by using consumer template  data logic
		//our application url that is a 3rd party api which will response for the text format.
		
		RestTemplate rt= new RestTemplate();
		ResponseEntity<String> forEntity= rt.getForEntity(url, String.class);//response entity line
		String responseBody= forEntity.getBody();//this line object mapper.(actuval respones)
		ObjectMapper mapper= new ObjectMapper();//covert any json obj into java object kosam this line
		
		try {
			  quotations = mapper.readValue(responseBody, QuoteDto[].class);//this method read value  is going to read the value
			                                                       //and coverted into our java object.
			                                              //but currently 1 quotettions.
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		Random r= new Random();
		int index = r.nextInt(quotations.length-1);		
		return quotations[index].getText();
	}
	
	//randam access msg will be available in the dashboard page purpose kosam this method.
	//our applictaion should be 3 rd party application api.
	private static String generateRandom() {
		String aToz="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		Random rand = new Random();
		StringBuilder res= new StringBuilder();
		for(int i=0; i< 5; i++) {
			int randIndex=rand.nextInt(aToz.length());
			res.append(aToz.charAt(randIndex));
		}
		return res.toString();
	}

}
