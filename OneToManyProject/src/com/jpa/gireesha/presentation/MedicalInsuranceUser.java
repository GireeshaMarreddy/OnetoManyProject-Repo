package com.jpa.gireesha.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jpa.gireesha.validation.Validation;
import com.jpa.gireesha.dao.MedicalInsuranceDao;
import com.jpa.gireesha.model.Member;
import com.jpa.gireesha.model.Subscriber;

public class MedicalInsuranceUser 
{
  private Integer subId,membershipId,houseNo,pincode,premium,claim,choice;
  private String subName,memName,startDate,endDate,relation,phoneNumber,city;
  List<Member> memberList=new  ArrayList<Member>();
  Subscriber subscriber=new Subscriber();
  
  Scanner scanner= new Scanner(System.in);
  
  MedicalInsuranceDao medDao=new  MedicalInsuranceDao();
  
  public void addSubscriber()
  {
	  System.out.println("Enter Subscriber name :");
	  subName=scanner.next();
	  subscriber.setSubName(subName);
	  do
	  {
		  System.out.println("Enter Member name to be added in :"+subName.toUpperCase()+":");  
		  memName=scanner.next();
		  
		  Member member=new Member();
		  member.setMemberId(membershipId);
		  member.setMemName(memName);
		  member.setRelation(relation);
		  memberList.add(member);
		  
		  System.out.println("press 1to add another member....:");
		  choice=scanner.nextInt();
	  }
	  while(choice==1);
	  
  }
}