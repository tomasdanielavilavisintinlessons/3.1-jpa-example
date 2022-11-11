package com.example.jpaExample.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Db {
	private static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("jpaee");
		}
		
		return emf.createEntityManager();
	}
}
