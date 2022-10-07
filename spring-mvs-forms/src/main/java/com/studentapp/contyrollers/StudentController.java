package com.studentapp.contyrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.studentapp.model.Student;

//@Controller
//public class StudentController {
//@RequestMapping("/show")
//	public String printStudent(@RequestParam("studentName")String name,
//			@RequestParam("city")String city,
//			@RequestParam("studentId")int studentId,Model model) {
//		
//		Student student=new Student();
//		student.setStudentName(name);
//		student.setCity(city);
//		student.setStudentId(studentId);
//		model.addAttribute("mystudent", student);
//		return "success";
//	}



@Controller
public class StudentController {
@RequestMapping(value ="/show", method=RequestMethod.POST)
	public String printStudent(Student student) {
		return "success";
	}

}
