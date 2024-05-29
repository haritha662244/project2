package in.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	@RequestMapping("/salary")
	public Integer getEmployeeSalary(@RequestParam String empName, @RequestParam Integer deptId) {
	return employeeService.getEmployeeSalary(empName, deptId);

   }
	
	@RequestMapping("/isEligible/{id}")
	public Boolean getEmployeeSalary(@PathVariable Integer id) {
		return employeeService.isEligibleForBouns(id);
	}
	@RequestMapping("/empsalarydept/{id}")
	public Map<String ,Object>fetchEmployeeSalaryDeptProceder(Integer id){
		return employeeService.fetchEmployeeSalaryDeptProcedure(id);
	}
	@RequestMapping("/empdetails/{id}")
	public Employee fetchEmployeeDetails(@PathVariable Integer id) {
		return employeeService.fetchEmployeeDatails(id);
	}
	
}
	
	
	
	
