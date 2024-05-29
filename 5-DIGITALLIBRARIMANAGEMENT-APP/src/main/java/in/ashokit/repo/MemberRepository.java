package in.ashokit.repo;

import java.lang.reflect.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//MemberRepository.java
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
 // Additional methods if needed
}
