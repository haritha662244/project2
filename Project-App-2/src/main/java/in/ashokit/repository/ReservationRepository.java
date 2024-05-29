package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	Reservation findByPnrNumber(String pnrNumber);
    void deleteByPnrNumber(String pnrNumber);
}
