package net.students.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.students.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
