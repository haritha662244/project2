package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {
  @Autowired
  private EmpRepo empRepo;
  
  
  @Autowired
  private AddressRepo addressRepo;
  
  
  public void deleteEmp() {
	  empRepo.deleteById(1);
  }
  
  
  public void getAddress() {
		 addressRepo.findById(1);///child+parent table create
	  }
  

  
  
  //this method  is only parent created
  public void getEmp() {
	  Optional<Emp> findById=empRepo.findById(1);
	  if(findById.isPresent()) {
		  Emp emp= findById.get();
		  List<Address> addrList= emp.getAddrList();
		 
	  }
  }
  
  
  public void saveEmployee() {
	  Emp e= new Emp();
	  e.setEname("orlen");  //one employee  obj
	  e.setEsal(12000.00);
	  
	  
	  Address a1= new Address();
	  a1.setCity("hyd");
	  a1.setState("TG");
	  a1.setCountry("India");    // address 1 obj
	  a1.setType("present");
	  
	  
	  Address a2= new Address();
	  a2.setCity("Gnt");
	  a2.setState("Ap");       //address 2 obj
	  a2.setCountry("India");
	  a2.setType("permanent");
	  
	  
	  //Assosiation means(a1,a2 adress is wich  emp iam setting that)
	   //this line is which employee
	  
	  a1.setEmp(e);// setting  parent table to child table
	  a2.setEmp(e);// setting  parent table to child table
	   //child table
	   e.setAddrList( Arrays.asList(a1,a2));//seting  child table to parent table
	   
	   
	   
	  //save parent record
	   
	   empRepo.save(e);//parent +child table created
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
  
   
}
