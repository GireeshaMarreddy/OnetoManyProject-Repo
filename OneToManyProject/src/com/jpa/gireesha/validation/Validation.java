package com.jpa.gireesha.validation;

import com.jpa.gireesha.exception.InvalidInputException;

public class Validation 
{
	public static boolean validateName(String name)
	{
		  String stringRegex="^[a-zA-Z]+$";
		 if(name.matches(stringRegex))
		    return true;
		 else
		    throw new InvalidInputException();
		 }

/*	public static Boolean validateEmailID(String emailId)
	{
		String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-z"+"A-Z]{2,7}$";  
		if(emailId.matches(emailRegex))
				return true;
		else
			  throw new InvalidInputException();
		}*/
	
	public static Boolean validatePhoneNo(String phoneNo)
	{
		String phoneNoRegex="(0/91)?[6-9][0-9]{9}";
		if(phoneNo.matches(phoneNoRegex))
				return true;
		else
			  throw new InvalidInputException();
	}
	
	public static Boolean validateDate(String date)
	{
		String dateRegex="^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
		
		String currentDate=java.time.LocalDate.now().toString();
		System.out.println(currentDate+" "+date);
		if(date.matches(dateRegex) && date.compareTo(currentDate)==0)
		   return true;
		else
		   throw new InvalidInputException();
		}	
	public static Boolean validateNo(String no)
	{
		String NoRegex="^[1-9][0-9]{5}";
		if(no.matches(NoRegex))
				return true;
		else
			  throw new InvalidInputException();
	}
}


