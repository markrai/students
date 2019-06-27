package com.markrai.departments.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseManager {

	protected EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEntityManager() {
		if (em == null || !em.isOpen()) {
			return new DbManager().getEntityManager();
		} else {
			return em;
		}
	}

	public class DbManager {

		private EntityManagerFactory factory;

		public EntityManager getEntityManager() {

			if (factory == null || !factory.isOpen()) {
				factory = Persistence.createEntityManagerFactory("codeChallengePersistence");
			}

			return factory.createEntityManager();

		}

	}

}
