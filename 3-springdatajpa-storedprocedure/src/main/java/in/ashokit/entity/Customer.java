package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;

@Entity
@NamedStoredProcedureQuery (name="customer .salarydept",
       procedureName="get_customer_salary_dept_proc"
, parameters= {
		 @StoredProcedureParamater(mode=ParameterMode.IN,name="in_customer_id",type=Integer.class),
		 @StoredProcedureParamater(mode=ParameterMode.OUT,name="customer_name",type=String.class),
		 @StoredProcedureParamater(mode=ParameterMode.OUT,name="salary",type=Integer.class),
		 @StoredProcedureParameter(mode=ParameterMode.OUT,name="deptname",type=String.class),
       }
    )
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="name")
	private String customerName;
	
	@Column(name="dept_id")
	private Integer deptId;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="performance")
	private String performance;
	
	public int getCustromerId() {
		return customerId;
	}

	public void setEmployeeTd(int custromerId) {
		this.customerId = custromerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public int getcustomerTd() {
		return customerId;
		
		
	}

	@Override
	public String toString() {
		return "Customer [customerTd=" + customerId + ", customerName=" + customerName + ", deptId=" + deptId
				+ ", salary=" + salary + ", status=" + status + ", performance=" + performance + "]";
	}

}


