package com.gireesha.jpa.service;

import java.util.List;

import com.gireesha.jpa.model.Address;
import com.gireesha.jpa.model.Student;

public interface StudentServiceInterface 
{
	public String addStudent(Student student);
	public String updateStudent(Student student); 
	public String deleteStudent(Integer studentId);
	public Student findByStudentId(Integer studentId);
	public List<Student> findByStudentName(String firstName);
	public List<Address> findByCity(String city);
	public Address findByAddressId(Integer addressId);
	public List<Student> findAllStudent(); 
}
