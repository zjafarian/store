package com.shopping.store.services.impls;

import com.shopping.store.entites.Customer;
import com.shopping.store.entites.MainCategory;
import com.shopping.store.repositories.CustomerRepository;
import com.shopping.store.repositories.MainCategoryRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.MainCategoryService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainCategoryServiceImpl extends BaseServiceImpl<MainCategory,Integer> implements MainCategoryService {

    private MainCategoryRepository mainCategoryRepository;

    public MainCategoryServiceImpl(MainCategoryRepository mainCategoryRepository) {
        this.mainCategoryRepository = mainCategoryRepository;
    }

    @Override
    protected BaseRepository<MainCategory, Integer> getBaseRepository() {
        return mainCategoryRepository;
    }

    @Override
    public List<MainCategory> findAll() {
        return mainCategoryRepository.findAll();
    }

    @Override
    public MainCategory save(MainCategory entity) {
        return mainCategoryRepository.save(entity);
    }

    @Override
    public List<MainCategory> saveAll(List<MainCategory> entities) {
        return mainCategoryRepository.saveAll(entities);
    }

    @Override
    public Optional<MainCategory> findById(Integer id) {
        return mainCategoryRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        mainCategoryRepository.deleteById(id);
    }

    @Override
    public MainCategory update(MainCategory entity) {
        return mainCategoryRepository.save(entity);
    }
}
