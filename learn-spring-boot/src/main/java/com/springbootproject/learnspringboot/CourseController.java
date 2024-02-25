package com.springbootproject.learnspringboot;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	// Courses with id,name,author
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"AWS","John"),
				new Course(2,"Java","Micheal"),
				new Course(3,"GoogleCloud Computing","Joy"),
				new Course(4,"Embedded Systems","George"),
				new Course(5,"C++","Robinson"),
				new Course(6,"Code in Python","Micheal Jackson")
				
				);
	}
	

}
