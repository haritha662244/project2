package in.ashokit.specification;

import org.springframework.data.jpa.domain.Specification;

import in.ashokit.entity.Product;

public class ProductSpecifications {
	
	public static  Specification<Product> nameLike(String name){//not = not like
		return (root ,query,criteriaBuilder)-> criteriaBuilder.like(root.get("name"),"%"+ name+"%");
		
	}
	
	public static  Specification<Product> pricelessThan(Double price){
		return (root ,query,criteriaBuilder)-> criteriaBuilder.lessThan(root.get("price"),price);
	}
	
	
		public static  Specification<Product> priceGreaterThan(Double price){
			return (root ,query,criteriaBuilder)-> criteriaBuilder.greaterThan(root.get("price"),price);
			

}
}
