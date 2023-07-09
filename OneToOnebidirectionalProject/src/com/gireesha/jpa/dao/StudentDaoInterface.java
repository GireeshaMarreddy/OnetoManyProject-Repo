package com.gireesha.jpa.dao;
import java.util.List;

import com.gireesha.jpa.model.Address;
import com.gireesha.jpa.model.Student;


public interface StudentDaoInterface 
{
   String addStudent(Student student);
   String updateStudent(Student student);
   String deleteStudent(Integer studentId);
   Student findByStudentId(Integer studentId);
   Address findByAddressId(Integer addressId);
   List<Student> findByStudentName(String firstName);
   List<Address> findByCity(String city);
   List<Student> findAllStudent();
   
}
