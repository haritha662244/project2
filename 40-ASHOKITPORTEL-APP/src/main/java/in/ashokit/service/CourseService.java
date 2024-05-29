package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Course;
@Service
public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course createCourse(Course course);
    Course updateCourse(Long id, Course updatedCourse);
    void deleteCourse(Long id);
}
