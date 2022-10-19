package restapi.service;

import java.util.ArrayList;
import java.util.List;

import restapi.models.Student;

public class StudentSamples {
	public static List<Student> students = new ArrayList<>();

	public static void fillStudentSamples() {
		StudentSamples.students.add(new Student((long) 1231232131, "Niki", 121219052));
		StudentSamples.students.add(new Student((long) 1231232132, "Ivan", 191900000));
		StudentSamples.students.add(new Student((long) 1231232133, "Niki", 191900001));
	}

}
