package in.ashokit.client;

import in.ashokit.bean.Employee;
import in.ashokit.util.JsonUtil;

public class Test {
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setEmpNo(201);
		emp.setName("suma");
		emp.setSalary(40000.0);
		String JsonEmployee = JsonUtil.convertJavaToJson(emp);
		System.out.println(JsonEmployee);
		System.out.println("==============================");
		
		Employee emp1=JsonUtil.convertJsonToJava(JsonEmployee, Employee.class);
		System.out.println(emp.getEmpNo()+" "+emp.getSalary()+" "+emp.getName());
		
	}

}
