package net.students.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.students.sms.entity.Student;
import net.students.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagentSystemApplication.class, args);
	}
@Autowired
	private StudentRepository studentrepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("ephraim","njogu","ephraimnjogu@gmail.com");
		studentrepository.save(student1);
		Student student2 = new Student("ephraim","one","ephraimnone@gmail.com");
		studentrepository.save(student2);
		Student student3 = new Student("Lucy","njogu","lucynjogu@gmail.com");
		studentrepository.save(student3);*/
	}

	public StudentRepository getStudentrepository() {
		return studentrepository;
	}

	public void setStudentrepository(StudentRepository studentrepository) {
		this.studentrepository = studentrepository;
	}

}
