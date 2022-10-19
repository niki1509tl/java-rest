package restapi.controller;

import restapi.models.Student;
import restapi.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class AppController {

	@Autowired
	private IStudentService studentService;

	@GetMapping(value = "/{studentId}", produces = MediaType.APPLICATION_XML_VALUE)
	public Student findStudent(@PathVariable Long studentId) {
		return studentService.getStudentById(studentId);
	}

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@GetMapping(value = "/test")
	public String test() {
		return "Test";
	}

}
