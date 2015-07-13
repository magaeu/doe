package com.database;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helpers.JPAUtil;
import com.models.Doacao;

public class DoacaoDao {
	
	@PersistenceContext
	private EntityManager manager = JPAUtil.getEntityManager();
	
	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void inserir(Doacao doacao) {
		try {
			this.manager.getTransaction().begin();
			this.manager.persist(doacao);
			this.manager.getTransaction().commit();
			this.manager.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

/*	public void remover(Doacao doacao) {
		try {
			em.remove(doacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/


}
