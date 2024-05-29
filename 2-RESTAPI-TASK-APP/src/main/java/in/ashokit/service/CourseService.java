package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.binding.Course;
@Service
public interface CourseService {
	public String upsert(Course course);//insert+update=upsert method.
	
	public Course getById(Integer cid);//parctilar course based on the id.
	
	public  List<Course> getAllCourses();//all the exitting the table will be db table available.
	
	public String deleteById(Integer cid);//delete by id based on the pk (course +id)

}
