package com.jpa.gireesha.presentation;

import java.util.Scanner;

public class MedicalInsuranceApplication 
{
public static void main(String args[])
{
	MedicalInsuranceUser medUser =new MedicalInsuranceUser();
	Scanner scanner=new Scanner(System.in);
	int option=0;
	do
	{
		System.out.println("-------------------------------");
		System.out.println("---Medical Insurance Record---");
		System.out.println("-------------------------------");
		System.out.println("1.add Subscriber");
		System.out.println("2.delete Subscriber");
		System.out.println("3.update Subscriber");
		System.out.println("4.find Subscriber by ID");
		System.out.println("5.find All Records");
		System.out.println("6.Exit Application");
		
		System.out.println("Enter your option : ");
		option=scanner.nextInt();
		switch(option)
		{
		case 1 :medUser.addSubscriber();
		        break;
		        
		case 6: System.out.println("User Quit Application ");
                System.exit(0); 
                
		default : System.out.println("Enter valid option");       
		        
		}
	}
	while(option!=6);
}
}

