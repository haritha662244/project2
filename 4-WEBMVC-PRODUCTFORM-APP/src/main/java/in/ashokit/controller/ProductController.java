package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {
	 @Autowired
	    private ProductService productService;
//        //load form -GET
//	    @GetMapping("/")
//	    public ModelAndView loadForm() {
//	        //Product product = new Product();
//	        ModelAndView mav = new ModelAndView();
//	        mav.addObject("pobj",  new Product());//for form binding
//	        mav.setViewName("index");
//	        return mav;
//	    }
	    @GetMapping("/")
		public String getForm(Model model)
		{
			
	    	Product product= new Product();
			model.addAttribute("product", product);
			return "index";
		}
	    
        //save  product -Post
	    @PostMapping("/addProduct")
	    public ModelAndView saveProduct(Product product) {
	    	  ModelAndView mav = new ModelAndView();
	    	  
	    	 	        
	        if(product.getPid()!=null) {
	        	 Optional<Product> product2 = productService.getProduct(product.getPid());
	        	 Product product3 = product2.get();
	        	 product3.setPname(product.getPname());
	        	 product3.setPrice(product.getPrice());
	        	 product3.setQty(product.getQty());
	        	 boolean status = productService.saveProduct(product3);

	        	if(status) {
		        	mav.addObject("msg", "sucessfully  edited");
		        }else {
		        	mav.addObject("msg", "Failed ");
		        }
	        	List<Product> productList = productService.getAllProducts();
		        mav.addObject("plist", productList); 
		        mav.addObject("msg",  status);//for form binding
		        mav.setViewName("data");
		        
		        return mav;
	        	
	        }else {
	        	boolean status = productService.saveProduct(product);
	        	if(status) {
		        	mav.addObject("smsg", "sucessfully  saved");
		        }else {
		        	mav.addObject("errmsg", "Failed to save");
		        }
		        
		        mav.addObject("product",  new Product());//for form binding
		        mav.setViewName("index");
		        return mav;
	        	
	        }
	        
	    }
	    
	    @GetMapping("/delete/{pid}")
	    public ModelAndView deleteProduct(@PathVariable Integer pid) {
	    	String status = productService.deleteByIdProduct(pid);
	    	  ModelAndView mav = new ModelAndView();
	    	  List<Product> productList = productService.getAllProducts();
		        mav.addObject("plist", productList); 
		        mav.addObject("msg",  status);//for form binding
		        mav.setViewName("data");
		        return mav;
	    }
	    
	    @GetMapping("/edit/{pid}")
	    public ModelAndView updateProduct(@PathVariable Integer pid) {
	    	ModelAndView mav= new ModelAndView();
	    	Optional<Product> product = productService.getProduct(pid);
	    	mav.addObject("product", product.get());
	    	 mav.setViewName("index");
		        return mav;
	    	
	    }
	    
       //get product- GET
	    @GetMapping("/Products")
	    public ModelAndView viewProducts() {
	        List<Product> productList = productService.getAllProducts();
	        ModelAndView mav = new ModelAndView();
	        mav.addObject("plist", productList);
	        mav.setViewName("data");
	        return mav;
	    }
}
