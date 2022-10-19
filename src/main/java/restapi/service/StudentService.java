package restapi.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import restapi.models.Student;

@Service
public class StudentService implements IStudentService {

	@Override
	public Student createStudent(Student student) {
		System.out.println("creating user in the database...");
		Random rnd = new Random();
		long id = Math.abs(rnd.nextLong());
		Student newStudent = new Student(id, student.getName(), student.getFacNumber());
		StudentSamples.students.add(newStudent);
		return newStudent;
	}

	@Override
	public Student getStudentById(Long id) {
		System.out.println("returning user with id: " + id);
		for (Student std : StudentSamples.students) {
			if (std.getId().equals(id)) {
				return std;
			}
		}
		return null;
	}

}
