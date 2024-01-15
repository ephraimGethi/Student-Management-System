package net.students.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.students.sms.entity.Student;
import net.students.sms.repository.StudentRepository;
import net.students.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
private StudentRepository studentrepository;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}
	
	public StudentServiceImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	public StudentRepository getStudentrepository() {
		return studentrepository;
	}
	public void setStudentrepository(StudentRepository studentrepository) {
		this.studentrepository = studentrepository;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(Long Id) {
		// TODO Auto-generated method stub
		studentrepository.deleteById(Id);
		
	}

}
