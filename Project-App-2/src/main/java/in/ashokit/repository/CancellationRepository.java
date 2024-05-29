package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Cancellation;
@Repository
public interface CancellationRepository extends JpaRepository<Cancellation, Long> {

	 public Cancellation findByPnrNumber(String pnrNumber);

}
