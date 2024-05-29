package in.ashokit.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;



@Repository
public interface EmployeRepository extends CrudRepository<Employee,Integer> {

	
	@Query(value="select get_emp_salary(?1,?2)",nativeQuery=true)
	public Integer getEmployeeSalary(String empName,Integer deptId);
	
	@Query(value="select is_eligible_for_bonus(?1)",nativeQuery=true)
	public Boolean isEligibleForBonus(Integer id);
	
	@Procedure("employee.salarydept")
	public Map<String,Object>fetchEmployeeSalaryDeptProcedure(Integer employee_id);

	
	
}
