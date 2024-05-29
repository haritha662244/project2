package in.ashokit.service;
import java.time.LocalDate;

//7-3-2024
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {
	
	//@Autowired
	private ProductRepo  productRepo;
	
	
	public void saveProduct() {//one record into table create
		
		Product p = new Product();
		p.setPid(1);//2/3
		p.setName("laptop");//samsung/tv
		p.setPrice(50000.00);//40000/60000//
		
		// no records UPdate ,Create date andhukosam e stmt
		
		//p.setCreateDate(LocalDate.now());//e stmt rayakunda defaultga @creationtimestaping create chesamu
		
		productRepo.save(p);// save method is a upset  
		//psert means check the record is available in the record
		System.out.println("product saved .....");
		
	
	
	}
	
	
	

}
