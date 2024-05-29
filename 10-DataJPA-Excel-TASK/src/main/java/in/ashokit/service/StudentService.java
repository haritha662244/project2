package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
@Service
public interface StudentService {
	void addStudent(Student student);
    List < Student > getTheListStudent();
}
