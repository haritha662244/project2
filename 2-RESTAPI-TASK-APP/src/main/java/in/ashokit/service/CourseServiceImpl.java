package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Course;
import in.ashokit.repo.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository  courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);//upsert (insert/update based on pk)
		return "sucess";
	}

	@Override
	public Course getById(Integer cid) {
		  Optional<Course> findById = courseRepo.findById(cid);
		  if(findById.isPresent()) {
			  return findById.get();
		  }
		  
		return null;
	}
	//optional is a container in the if check entity obj is present or not

	@Override
	public List<Course> getAllCourses() {
		 return courseRepo.findAll();
		

	}

	@Override
	public String deleteById(Integer cid) {
		
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete Sucess";
		}else {
			return "No Record found";
		}
		
	}

}
