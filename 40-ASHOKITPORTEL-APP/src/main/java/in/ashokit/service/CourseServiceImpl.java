package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Course;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course updatedCourse) {
        Course existingCourse = getCourseById(id);
        existingCourse.setName(updatedCourse.getName());
        existingCourse.setDescription(updatedCourse.getDescription());
        return courseRepository.save(existingCourse);
    }

    @Override
    public void deleteCourse(Long id) {
        Course courseToDelete = getCourseById(id);
        courseRepository.delete(courseToDelete);
    }
}
