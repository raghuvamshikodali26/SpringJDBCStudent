package com.raghu.SpringJDBCStudent;

import com.raghu.SpringJDBCStudent.model.Student;
import com.raghu.SpringJDBCStudent.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcStudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcStudentApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(1016);
		s.setName("Raghu");
		s.setMarks(85);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.findAll();
		System.out.println(students);

		System.out.println("Pushed and updated to git");
		System.out.println("Pushed and updated to git");
	}

}
