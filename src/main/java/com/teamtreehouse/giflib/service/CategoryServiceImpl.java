package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.dao.CategoryDao;
import com.teamtreehouse.giflib.exc.NotEmptyException;
import com.teamtreehouse.giflib.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(long id) {
        return categoryDao.findById(id);
    }

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void delete(Category category)throws NotEmptyException {
        if (category.getGifs().size() > 0){
            throw new NotEmptyException("Categories as to be empty");
        }else {
            categoryDao.delete(category);
        }
    }
}
