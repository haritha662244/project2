package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//dialect classes are used to  convert HQL to SQL.
import in.ashokit.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee,Integer> {
	
	@Query("from Employee")
	public List<Employee> getAllEmpHQL();
	
	@Query("from Employee where eid=:id")
	public Employee getEmpById(Integer id);
	
	@Query("from Employee where eaddress=:address")
	public Employee getEmpByString(String address);
	
	@Query("from Employee where ename=:name")
	public Employee getEmpByEname(Integer name);
	
	@Query(value="select* from employee ",nativeQuery=true)
	public List<Employee> getAllEmpsSql();
	
	//select*from employee where ename =:ename
	public List<Employee> findByEname(String ename);
	
	//select *from employee where esalary=:esalary
	public List<Employee> findByEsalary(Double esalary);
	
	//select *from employee where eaddress=:address
		public List<Employee> findByEaddress(String eAddresss);
		
	//select *from employee where esalary=:esalary
	public List<Employee> findByEsalaryGreaterThanEqual(Double esalary);
		

}
