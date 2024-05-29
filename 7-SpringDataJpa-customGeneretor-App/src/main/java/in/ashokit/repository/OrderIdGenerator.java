package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.OrderDetails;
@Repository
public interface OrderIdGenerator  extends JpaRepository<OrderDetails,Serializable> {
	

}
