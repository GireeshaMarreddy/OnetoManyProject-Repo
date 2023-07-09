package com.gireesha.jpa.presentation;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.gireesha.jpa.dao.StudentDaoInterfaceImpl;
import com.gireesha.jpa.exception.InvalidInputException;
import com.gireesha.jpa.model.Address;
import com.gireesha.jpa.model.Student;
import com.gireesha.jpa.service.StudentServiceInterfaceImpl;
import com.gireesha.jpa.validation.StudentValidation;

public class StudentUserInterfaceImpl implements StudentUserInterface
{
	private Integer studentId,addressId,houseNo,pinCode;
	private String firstName,lastName,phoneNo,emailId,addmissionDate,city;
	StudentDaoInterfaceImpl studentDao = new StudentDaoInterfaceImpl();
	Scanner scanner = new Scanner(System.in);
	StudentServiceInterfaceImpl stuService = new StudentServiceInterfaceImpl();
	
	public void inputAddStudent()
	{	
		boolean flagFirstName=true;
		boolean flagLastName=true;
		boolean flagEmailId=true;
		boolean flagPhoneNo=true;
		boolean flagAddmissionDate=true;
		boolean flagCity=true;
		
		
		Student student = new Student();
		Address address = new Address();
		while(flagAddmissionDate)
		{
			System.out.print("Enter Addmission Date:");
			addmissionDate=scanner.next();
			try
			{
			if(StudentValidation.validateDate(addmissionDate))
			{
				student.setAddmisionDate(addmissionDate);
				flagAddmissionDate=false;
				while(flagFirstName)
				{
					System.out.print("Enter First Name:");
					firstName=scanner.next();
					try
					{
					if(StudentValidation.validateName(firstName))
					{
						student.setFirstName(firstName);
						flagFirstName=false;
						while(flagLastName)
						{
							System.out.print("Enter Last Name:");
							lastName=scanner.next();
							try
							{
							if(StudentValidation.validateName(lastName))
							{
								student.setLastName(lastName);
								flagLastName=false;							
								while(flagEmailId)
								{
									System.out.print("Enter Email Id:");
									emailId=scanner.next();		
									try
									{
									if(StudentValidation.validateEmailID(emailId))
									{
										student.setEmailId(emailId);
										flagEmailId=false;
										while(flagPhoneNo)
										{
											System.out.print("Enter Contact No:");
											phoneNo=scanner.next();
											try
											{
											if(StudentValidation.validatePhoneNo(phoneNo))
											{
												student.setPhoneNo(phoneNo);
												flagPhoneNo=false;
												while(flagCity)
												{
													System.out.print("Enter City:");
													city=scanner.next();
													try
													{
													if(StudentValidation.validateName(city))
													{
														address.setCity(city);
														flagCity=false;
														
																System.out.print("Enter HouseNo:");
																houseNo=scanner.nextInt();
																System.out.print("Enter Pincode:");
																pinCode=scanner.nextInt();
																address.setHouseNo(houseNo);
																address.setPincode(pinCode);
																student.setAddress(address);
																System.out.println(stuService.addStudent(student));
															}
												   
												    }
													catch(InvalidInputException e)
													{
														System.out.println(e);
													}
											        }
											        }
										            }
											catch(InvalidInputException e)
											{
												System.out.println(e);
											}
									        }
									        }
							                }
									catch(InvalidInputException e)
									{
										System.out.println(e);
									}
							        }
							        }
						            }
							catch(InvalidInputException e)
							{
								System.out.println(e);
							}
					        }
					        }
				            }
					catch(InvalidInputException e)
					{
						System.out.println(e);
					}
			        }
			        }
			        }
			catch(InvalidInputException e)
			{
				System.out.println(e);
			}
	        }
            }
	
	public void inputUpdateStudent() 	
	{
		boolean flagFirstName=true;
		boolean flagLastName=true;
		boolean flagEmailId=true;
		boolean flagPhoneNo=true;
		boolean flagAddmissionDate=true;
		boolean flagCity=true;
		
		
		Student student = new Student();
		Address address = new Address();
		
		System.out.print("Enter Student Id :");
		studentId = scanner.nextInt();
		try
		{
		if(stuService.findByStudentId(studentId)!=null)
		{
			student.setStudentId(studentId);
			while(flagAddmissionDate)
			{
				System.out.print("Enter Addmission Date (YYYY-MM-DD): ");
				addmissionDate=scanner.next();
				try
				{
				if(StudentValidation.validateDate(addmissionDate))
				{
				student.setAddmisionDate(addmissionDate);
				flagAddmissionDate=false;
				while(flagFirstName)
				{
					System.out.print("Enter First Name:");
					firstName=scanner.next();
					try
					{
					if(StudentValidation.validateName(firstName))
					{
						student.setFirstName(firstName);
						flagFirstName=false;
						while(flagLastName)
						{
							System.out.print("Enter Last Name:");
							lastName=scanner.next();
							try
							{
							if(StudentValidation.validateName(lastName))
							{
								student.setLastName(lastName);
								flagLastName=false;							
								while(flagEmailId)
								{
									System.out.print("Enter Email Id:");
									emailId=scanner.next();		
									try
									{
									if(StudentValidation.validateEmailID(emailId))
									{
										student.setEmailId(emailId);
										flagEmailId=false;
										while(flagPhoneNo)
										{
											System.out.print("Enter Contact No:");
											phoneNo=scanner.next();
											try
											{
											if(StudentValidation.validatePhoneNo(phoneNo))
											{
												student.setPhoneNo(phoneNo);
												flagPhoneNo=false;
												while(flagCity)
												{
													System.out.print("Enter City:");
													city=scanner.next();
													try
													{
													if(StudentValidation.validateName(city))
													{
														address.setCity(city);
														flagCity=false;
														
																System.out.print("Enter HouseNo:");
																houseNo=scanner.nextInt();
																System.out.print("Enter Pincode:");
																pinCode=scanner.nextInt();
																address.setHouseNo(houseNo);
																address.setPincode(pinCode);
																student.setAddress(address);
																System.out.println(stuService.updateStudent(student));
															}
												           }
													catch(InvalidInputException e)
													{
														System.out.println(e);
													}
											        }
											        }
										            }
											catch(InvalidInputException e)
											{
												System.out.println(e);
											}
									        }
									        }
								            }
									catch(InvalidInputException e)
									{
										System.out.println(e);
									}
							        }
							        }
						            }
							catch(InvalidInputException e)
							{
								System.out.println(e);
							}
					        }
					        }
				            }
					catch(InvalidInputException e)
					{
						System.out.println(e);
					}
			        }
			        }
			        }
				catch(InvalidInputException e)
				{
					System.out.println(e);
				}
		        }
		        }
		        }
		catch(InvalidInputException e)
		{
			System.out.println(e);
		}
        }
	
	public void inputDeleteStudent() 
	{
		System.out.print("Enter Student Id :");
		studentId = scanner.nextInt();
		if(stuService.findByStudentId(studentId)!=null)
		{
			System.out.println(stuService.deleteStudent(studentId));
		}
		else
		{
			System.out.println("Record Not Found");
		}
	}

	
	public void inputFindByStudentId() 
	{
		System.out.print("Enter Student Id :");
		studentId = scanner.nextInt();
		Student student = stuService.findByStudentId(studentId);		
		if(student!=null)
		{
			System.out.println("StudentId\tFName\tLName\tAddmissionDate\t\tPhoneNo\t\tMailId\t\tHNo\tCity\tPinCode");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(student.getStudentId() + "\t\t" + student.getFirstName() + "\t" +
					student.getLastName() + "\t" + student.getAddmisionDate() + "\t\t" +
					student.getPhoneNo()+"\t" + student.getEmailId() + "\t" + 
					student.getAddress().getHouseNo()+ "\t" + student.getAddress().getCity() + "\t" + student.getAddress().getPincode());
		}
		else
		{
			System.out.println("Record Not Found");
		}
	}

	public void inputFindByName() 
	{
		System.out.print("Enter Student First Name :");
		firstName = scanner.next();
		List<Student> list = stuService.findByStudentName(firstName);
		Iterator<Student> itr = list.iterator();
		if(list.size()!=0)
		{
			System.out.println("StudentId\tFName\tLName\tAddmissionDate\t\tPhoneNo\t\tMailId\t\tHNo\tCity\tPinCode");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			while(itr.hasNext())
			{
			Student student = itr.next();
			System.out.println(student.getStudentId() + "\t\t" + student.getFirstName() + "\t" +
					student.getLastName() + "\t" + student.getAddmisionDate() + "\t\t" +
					student.getPhoneNo()+"\t" + student.getEmailId() + "\t" + 
					student.getAddress().getHouseNo()+ "\t" + student.getAddress().getCity() + "\t" +
					 student.getAddress().getPincode());
			}
		}
		else
		{
			System.out.println("Record Not Found");
		}
	}
	
	public void inputFindByCity() 
	{
		System.out.print("Enter City :");
		city = scanner.next();
		List<Address> list = stuService.findByCity(city);
		Iterator<Address> itr = list.iterator();
		if(list.size()!=0)
		{
			System.out.println("StudentId\tFName\tLName\tAddmissionDate\t\tPhoneNo\t\tMailId\t\tHNo\tCity\tPinCode");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			while(itr.hasNext())
			{
			Address address = itr.next();
			System.out.println(address.getStudent().getStudentId() + "\t\t" + address.getStudent().getFirstName() + "\t" + 
					address.getStudent().getLastName() + "\t" + address.getStudent().getAddmisionDate() + "\t\t" + 
					address.getStudent().getPhoneNo() + "\t" + address.getStudent().getEmailId() + "\t" + 
					address.getHouseNo() + "\t"+ address.getCity() + "\t" +
					address.getPincode());
			}
		}
		else
		{
			System.out.println("Record Not Found");
		}
	}
	
	
	
	public void inputFindByAddressId() 
	{
		System.out.print("Enter Address Id :");
		addressId = scanner.nextInt();
		Address address = stuService.findByAddressId(addressId);
		if(address!=null)
		{
			System.out.println("AddressId\tFName\tLName\tAddmisionDate\t\tPhoneNo\t\tMailId\t\tHNo\tCity\tPinCode");		
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");			
			System.out.println(address.getAddressId() + "\t\t" + address.getStudent().getFirstName() + "\t" + 
					address.getStudent().getLastName() + "\t" + address.getStudent().getAddmisionDate() + "\t\t" + 
					address.getStudent().getPhoneNo() + "\t" + address.getStudent().getEmailId() + "\t" + 
					address.getHouseNo() + "\t"+ address.getCity() + "\t" + 
					address.getPincode());
		}
		else
		{  
			System.out.println("Record Not Found");
		}
	}
	
	public void findAllStudent() 
	{
		List<Student> list = stuService.findAllStudent();
		Iterator<Student> itr = list.iterator();
		System.out.println("StudentId\tFName\tLName\tAddmissionDate\t\tPhoneNo\t\tMailId\t\t\tHNo\tCity\tPinCode");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		while(itr.hasNext())
		{
			Student student = itr.next();
			System.out.println(student.getStudentId() + "\t\t" + student.getFirstName() + "\t" +
					student.getLastName() + "\t" + student.getAddmisionDate() + "\t\t" +
					student.getPhoneNo()+"\t" + student.getEmailId() + "\t\t" + 
					student.getAddress().getHouseNo()+ "\t" + student.getAddress().getCity() + "\t" +
					+ student.getAddress().getPincode());
		}
	}	
	
	
}
