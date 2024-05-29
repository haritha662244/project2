package in.ashokit.entity;

public class Product {
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQut() {
		return qut;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", qut=" + qut + "]";
	}
	public void setQut(Integer qut) {
		this.qut = qut;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	private String name;
	private Double price;
	private Integer qut;


}
