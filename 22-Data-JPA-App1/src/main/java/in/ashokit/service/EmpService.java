package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepository;


@Service
public class EmpService {

	     private EmpRepository empRepo;
	     
	     public EmpService( EmpRepository empRepo) {
	    	 this.empRepo=empRepo;
	     }
	     public void callFindByMethod() {
		    	// List<Employee> emps = empRepo.findByEname("Haritha");//userdefined method
		    	 
		    	 List<Employee> emps =empRepo.findByEsalaryGreaterThanEqual(4000.00);
		    	 
		    	 emps.forEach(System.out::println);
		     }
		    
		     public void getEmps() {
		 	    Iterable<Employee> emps = empRepo.findAll();//predefind method
		 	   emps.forEach(System.out::println);
		     }
		     
		     public void getEmps(List<Integer> eids) {
		 	    Iterable<Employee> emps = empRepo.findAllById(eids);
		 	    
		 	   
		 	     emps.forEach(e->System.out.println(e));
		 	    
		 	   // emps.forEach(System.out::println);
		     }
	     
	     public void getEmp(Integer eid) {
	    	 Optional<Employee> findById = empRepo.findById(201);
	    	 
	    	 if(findById.isPresent()) {
	    		 Employee employee=findById.get();
	    		 System.out.println(employee);
	    	 }else {
	    		 System.out.println("Record Not Found");
	    	 }
	     }
	     
//	     public void saveEmps() {
//	    	 Employee e1=new Employee(201,"Ram",1000.00,"pune");
//	    	 Employee e2=new Employee(202,"anil",1000.00,"hyd");
//	    	 Employee e3=new Employee(203,"sunil",1000.00,"kadapa");
//	    	 Employee e4=new Employee(204,"hari",1000.00,"nellore");
//	    	 
//	    	 List<Employee> emps = Arrays.asList(e1,e2,e3);
//	    	 empRepo.saveAll(emps);
//	    	 System.out.println("Records saved ........");
//	     }
	     
	     
	     public void saveEmployee() {
	    	 
	    	 System.out.println("Imple class:"+empRepo.getClass().getName());
	    	 
	    	 Employee e= new Employee();
	    	 e.setEid(202);
	    	 e.setEname("Raja");
	    	 e.setEsalary(3000.00);
	    	 e.setEaddress("kavali");
	    	 
	    	//inserting record based on given object
	    	  empRepo.save(e);//upsert method
	    	  
	    	  System.out.println("Record saved.....");//polimorphism method
	     }
	}



