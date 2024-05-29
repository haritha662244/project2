package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.binding.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
