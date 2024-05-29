package in.ashokit.repo;
//1)Devlop Data JPA application to insert person data into db i.e., p_id,name,gender,dob,photo,resume..

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import in.ashokit.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {
	
	
	
	
	
	
	
	
	
}

//	@Query("from Employee")
//	public List<Employee> getAllEmpHQL();
//	
//	@Query("from Employee where eid=:id")
//	public Employee getEmpById(Integer id);
//	
//	@Query(value="select* from employee ",nativeQuery=true)
//	public List<Employee> getAllEmpsSql();
//	
//	//select*from employee where ename =:ename
//	public List<Employee> findByEname(String ename);
//	
//	//select *from employee where esalary=:esalary
//	public List<Employee> findByEsalary(Double esalary);
//	
//
//	//select *from employee where esalary=:esalary
//		public List<Employee> findByEsalaryGreaterThanEqual(Double esalary);
//		
//}
