package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Enquiry;
@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer> {
   //custom query
	//total enuries
	//this method is used to get the  total enquery is available of that particular counsellore
	@Query(value="select count(*) from enquiry where counsellore_id=:id" ,
			nativeQuery = true)
    public Long getEnquries(Integer id);
	
	//it is used to enuery  based on the counsellerid based on the status
	@Query(value="select count(*) from enquiry where counsellore_id=:id and status=:status" ,
			nativeQuery = true)
    public Long getEnquries(Integer id, String status);
	
	
	
	
	
}
