package in.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmployeRepository;

public class EmployeeService {
	
	@Autowired
	EmployeRepository employeeRepository;
	
	
	public Integer getEmployeeSalary(String empName,Integer deptId) {
		System.out.println(empName);
		System.out.println(deptId);
		return employeeRepository.getEmployeeSalary(empName,deptId);
	}
	
	
	public Boolean isEligibleForBouns(Integer empId) {
		return employeeRepository.isEligibleForBonus(empId);
		
	}
	
	
	public Map<String, Object>fetchEmployeeSalaryDeptProcedure(Integer id){
		return employeeRepository.fetchEmployeeSalaryDeptProcedure(id);
	}
	
	public Employee fetchEmployeeDatails(Integer id) {
		return employeeRepository.fetchEmployeeDetails(id);
	}
	

}
