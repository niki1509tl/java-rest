package restapi.service;

import restapi.models.Student;

public interface IStudentService {
	Student createStudent(Student student);
	Student getStudentById(Long id);
}
