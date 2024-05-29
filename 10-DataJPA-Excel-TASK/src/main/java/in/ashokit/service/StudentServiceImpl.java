package in.ashokit.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepo;

    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    @Override
    public List < Student > getTheListStudent() {
        return studentRepo.findAll();
    }
}
