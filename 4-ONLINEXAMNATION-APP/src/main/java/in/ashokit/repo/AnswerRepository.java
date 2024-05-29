package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
