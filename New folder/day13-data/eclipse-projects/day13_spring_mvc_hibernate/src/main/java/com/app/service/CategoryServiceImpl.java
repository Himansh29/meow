package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CategoryDao;
import com.app.pojos.Category;

@Service //=> spring bean holding B.L
@Transactional //=> to support auto tx management
public class CategoryServiceImpl implements CategoryService {
	//dep : dao layer i/f
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
	}

}
