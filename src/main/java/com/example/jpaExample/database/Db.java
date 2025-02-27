package com.example.jpaExample.database;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Db {
	private static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("jpaee");
		}
		
		return emf.createEntityManager();
	}
}
