package in.ashokit.repo;

import javax.management.relation.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
