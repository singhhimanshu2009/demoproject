package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Students;
import demo.service.StudentServiceLayer;

@RestController
public class MyController {

	@Autowired
	StudentServiceLayer studentServiceLayer;

	@PostMapping("/save")
	public Students saveStudentController(@RequestBody Students stu) {

		studentServiceLayer.saveStudentObject(stu);
		
		return stu;

	}

	@GetMapping("/fetch")
	public List<Students> fetchData() {

	List<Students> myList =  studentServiceLayer.fetchAllStudents();
	
	return myList;

	}

}
