package com.app.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Category;

@Repository //=> spring bean containing Data access logic
public class CategoryDaoImpl implements CategoryDao {
	@Autowired //byType : field level D.I
	private EntityManager manager;

	@Override
	public List<Category> getAllCategories() {
		String jpql="select c from Category c";
		return manager.createQuery(jpql, Category.class).getResultList();
	}

}
