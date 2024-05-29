package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service 
public class ProductServiceImpl  implements ProductService{
	@Autowired
	private  ProductRepo productRepo;
	//save the product into db table
	@Override
	public boolean saveProduct(Product p) {
		Product saveProduct = productRepo.save(p);
		return saveProduct.getPid()!=null;
		
	}
	
	@Override
	public List<Product> getAllProducts(){
		
		return  productRepo.findAll();
		
	}

	@Override
	public String deleteByIdProduct(Integer productId) {
		Optional<Product> product = productRepo.findById(productId);
		System.out.println(product);
	if(product!=null) {
		productRepo.deleteById(productId);
		return "Deleted Sucussfully";
	}else {
		return "Deleted failed please provide current id";
	}
		
	}

	@Override
	public Optional<Product> getProduct(Integer productId) {
		
		return productRepo.findById(productId);
	}
	
	

	

}
