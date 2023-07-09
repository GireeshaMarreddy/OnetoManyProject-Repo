package com.gireesha.jpa.service;

import java.util.List;

import com.gireesha.jpa.dao.StudentDaoInterfaceImpl;
import com.gireesha.jpa.model.Address;
import com.gireesha.jpa.model.Student;

public class StudentServiceInterfaceImpl implements StudentServiceInterface
{
   StudentDaoInterfaceImpl stuDao=new StudentDaoInterfaceImpl();
   
   public String addStudent(Student student) 
	{
	   return stuDao.addStudent(student);
	}
   public String updateStudent(Student student) 
	{
	   return stuDao.updateStudent(student);
	}
   public String deleteStudent(Integer studentId) 
	{
	   return stuDao.deleteStudent(studentId);
	}
   public Student findByStudentId(Integer studentId)
	{
	   return stuDao.findByStudentId(studentId);
	}
   public List<Student> findByStudentName(String firstName)
	{
	   return stuDao.findByStudentName(firstName);
	}
   
   public List<Address> findByCity(String city)
	{
	   return stuDao.findByCity(city);
	}
   public Address findByAddressId(Integer addressId)
	{
	   return stuDao.findByAddressId(addressId);
	}
   public List<Student> findAllStudent() 
	{
	   return stuDao.findAllStudent();
	}
   
}
