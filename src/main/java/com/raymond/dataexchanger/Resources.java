package com.raymond.dataexchanger;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.raymond.domain.Products;

public class Resources {

	@PersistenceContext
	@Produces
	@ConversationScoped
	private EntityManager entityManager;

	@Produces
	@ApplicationScoped
	protected List<Products> getProductList() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Products> resultList = entityManager.createQuery(
				"select product from Products product order by product.id ASC")
				.getResultList();
		return resultList;
	}

}
