package com.shopping.store.services.impls;

import com.shopping.store.entites.Seller;
import com.shopping.store.entites.SubCategory;
import com.shopping.store.repositories.SubCategoryRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.SellerService;
import com.shopping.store.services.SubCategoryService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryServiceImpl extends BaseServiceImpl<SubCategory,Integer> implements SubCategoryService {

    private SubCategoryRepository subCategoryRepository;

    public SubCategoryServiceImpl(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @Override
    protected BaseRepository<SubCategory, Integer> getBaseRepository() {
        return subCategoryRepository;
    }


    @Override
    public List<SubCategory> findAll() {
        return subCategoryRepository.findAll();
    }

    @Override
    public SubCategory save(SubCategory entity) {
        return subCategoryRepository.save(entity);
    }

    @Override
    public List<SubCategory> saveAll(List<SubCategory> entities) {
        return subCategoryRepository.saveAll(entities);
    }

    @Override
    public Optional<SubCategory> findById(Integer id) {
        return subCategoryRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        subCategoryRepository.deleteById(id);
    }

    @Override
    public SubCategory update(SubCategory entity) {
        return subCategoryRepository.save(entity);
    }
}
