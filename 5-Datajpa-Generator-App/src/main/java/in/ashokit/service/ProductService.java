package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

public class ProductService {

@Autowired
private ProductRepo productRepo;

public void saveProduct() {

	Product p = new Product();

	p.setName("HDD");
	p.setPrice(9000.00);

	productRepo.save(p);

	System.out.println("Product saved...");
}
}