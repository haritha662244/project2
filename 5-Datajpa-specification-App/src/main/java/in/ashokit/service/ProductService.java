package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;
import in.ashokit.specification.ProductSpecifications;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
	//only 2 records retrieve in the table  this method use fully data
	
	public void getProductSpecification( String name, Double  minPrice,Double maxPrice) {
		Specification<Product> spec= Specification.where(null);
		if(name!=null) {
			spec=spec.and(ProductSpecifications.nameLike(name));
		}
		if(minPrice!=null) {
			spec=spec.and(ProductSpecifications.priceGreaterThan(minPrice));
		}
		
		if(maxPrice!=null) {
			spec=spec.and(ProductSpecifications.pricelessThan(maxPrice));
		}
		List<Product> findAll = repo.findAll(spec);
		findAll.forEach(System.out::println);
		
	}
	
	public void getProduct() {
		
	////what is the some filter method
		
// how can moblie category this line is used to entity class obj
		
	  Product p= new Product();//product obj created
	  p.setCategory("mobile");
	  p.setPrice(10000.00);//i wantto  to 1000 to 20000 rang inthe mobiles 
	  Example<Product>of=Example.of(p);// i want to filter mobiles this line
	List<Product> findAll=repo.findAll();
    findAll.forEach(System.out::println);
	}
	
	
	
	public void saveProduct() {
		
		Product p1 = new Product();
		p1.setCategory("mobiles");
		p1.setName("samsung");
		p1.setPrice(10000.00);
		
		Product p2 = new Product();
		p2.setCategory("mobiles");
		p2.setName("Ap");
		p2.setPrice(50000.00);
		
		Product p3 = new Product();
		p3.setCategory("mobiles");
		p3.setName("mi");
		p3.setPrice(30000.00);
		
		Product p4 = new Product();
		p4.setCategory("mobiles");
		p4.setName("oppo");
		p4.setPrice(40000.00);
		
		
		repo.saveAll(Arrays.asList(p1,p2,p3,p4));
	}
	

}
