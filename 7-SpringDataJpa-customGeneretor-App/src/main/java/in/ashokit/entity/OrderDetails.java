package in.ashokit.entity;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="ORDER_DTLS")
@Data
public class OrderDetails {
	
	@Id
	@Column(name="ORDER_Id")
	@GenericGenerator(name="oder_id_gen",strategy="in.ashoit.generators.OrderIdGenerator")
	@GeneratedValue(generator="oder_id_gen")
	private String oderId;
	
	@Column( name="ORDER_By")
	private String orderBy;
	
	@Column( name="ORDER_PLACED_Date")
	private Date orderplaceDate;

	public void setOderPlaceDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setorderBy(String string) {
		// TODO Auto-generated method stub
		
	}


	public OrderDetails save(OrderDetails entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
