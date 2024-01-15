package net.students.sms.service;
import java.util.List;

import net.students.sms.entity.*;
public interface StudentService {
List<Student> getAllStudents();

Student saveStudent(Student student);

Student getStudentById(Long id);

Student updateStudent(Student student);

void deleteStudentById(Long Id);
}
