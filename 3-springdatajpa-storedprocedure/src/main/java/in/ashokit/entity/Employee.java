package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;



@Entity
@NamedStoredProcedureQuery (name="employee .salarydept",
       procedureName="get_employee_salary_dept_proc"
, parameters= {
		 @StoredProcedureParamater(mode=ParameterMode.IN,name="in_employee_id",type=Integer.class),
		 @StoredProcedureParamater(mode=ParameterMode.OUT,name="emp_name",type=String.class),
		 @StoredProcedureParamater(mode=ParameterMode.OUT,name="salary",type=Integer.class),
		 @StoredProcedureParameter(mode=ParameterMode.OUT,name="deptname",type=String.class),
       }
    )

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeTd;
	
	@Column(name="name")
	private String employeeName;
	
	@Column(name="dept_id")
	private Integer deptId;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="performance")
	private String performance;
	
	public int getEmployeeTd() {
		return employeeTd;
	}

	public void setEmployeeTd(int employeeTd) {
		this.employeeTd = employeeTd;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public int getEmployeeId() {
		return employeeTd;
		
		
	}

	@Override
	public String toString() {
		return "Employee [employeeTd=" + employeeTd + ", employeeName=" + employeeName + ", deptId=" + deptId
				+ ", salary=" + salary + ", status=" + status + ", performance=" + performance + "]";
	}

}
