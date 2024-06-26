package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.MCQ;

@Repository
public interface MCQRepository extends JpaRepository<MCQ, Long> {
}
