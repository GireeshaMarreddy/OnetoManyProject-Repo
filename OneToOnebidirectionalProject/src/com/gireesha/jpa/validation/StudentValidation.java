package com.gireesha.jpa.validation;

import com.gireesha.jpa.exception.InvalidInputException;

public class StudentValidation 
{
	
	public static boolean validateName(String name)
	{
		  String stringRegex="^[a-zA-Z]+$";
		 if(name.matches(stringRegex))
		    return true;
		 else
		    throw new InvalidInputException();
		 }

	public static boolean validateEmailID(String emailId)
	{
		String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-z"+"A-Z]{2,7}$";  
		if(emailId.matches(emailRegex))
				return true;
		else
			  throw new InvalidInputException();
		}
	
	public static boolean validatePhoneNo(String phoneNo)
	{
		String phoneNoRegex="(0/91)?[6-9][0-9]{9}";
		if(phoneNo.matches(phoneNoRegex))
				return true;
		else
			  throw new InvalidInputException();
	}
	
	public static boolean validateDate(String date)
	{
		String dateRegex="^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
		
		String currentDate=java.time.LocalDate.now().toString();
		System.out.println(currentDate+" "+date);
		if(date.matches(dateRegex) && date.compareTo(currentDate)==0)
		   return true;
		else
		   throw new InvalidInputException();
		}	
}
