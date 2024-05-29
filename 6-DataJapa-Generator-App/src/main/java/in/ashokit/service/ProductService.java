package in.ashokit.service;

//public class ProductService {
//package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;


@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	
	public void saveProduct() {
		
		Product p= new Product();
		//p.setPid(3);
		p.setName("monitor");
		p.setPrice(5000.00);
		
		
		
		productRepo.save(p);//Upset method
		
		System.out.println("product saved........");
		
	}
	

}
