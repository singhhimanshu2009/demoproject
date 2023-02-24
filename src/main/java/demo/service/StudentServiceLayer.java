package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Students;
import demo.repository.StudentRepository;

@Service
public class StudentServiceLayer {

	@Autowired
	StudentRepository studentRepository;

	public void saveStudentObject(Students stu) {

		studentRepository.save(stu);

	}
	
	public List<Students> fetchAllStudents() {
		return studentRepository.findAll();
	}

}
