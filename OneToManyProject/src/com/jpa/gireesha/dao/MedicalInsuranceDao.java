package com.jpa.gireesha.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.gireesha.model.Subscriber;

public class MedicalInsuranceDao 
{
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	static
	{
		emf = Persistence.createEntityManagerFactory("Gireesha");
		em = emf.createEntityManager();
	}
	
	public String addSubscriber(Subscriber subscriber)
	{
		et=em.getTransaction();
		et.begin();
		em.persist(subscriber);
		et.commit();
		return "Subscriber added";
	}
}
