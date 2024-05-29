package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Reservation;
import in.ashokit.entity.User;
@Repository

public interface ReservationRepository extends JpaRepository<Reservation, Long> { 
	 
	 public  Reservation findByPnr(String pnr);
}
