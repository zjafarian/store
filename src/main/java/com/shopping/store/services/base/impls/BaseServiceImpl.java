package com.shopping.store.services.base.impls;

import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T,ID> {



    protected abstract BaseRepository<T,ID> getBaseRepository();

    @Override
    public List<T> findAll() {


        return getBaseRepository().findAll();
    }

    @Override
    public T save(T entity) {
        return getBaseRepository().save(entity);
    }

    @Override
    public List<T> saveAll(List<T> entities) {
        return getBaseRepository().saveAll(entities);
    }

    @Override
    public Optional<T> findById(ID id) {
        return getBaseRepository().findById(id);
    }

    @Override
    public void delete(ID id) {
        getBaseRepository().deleteById(id);

    }

    @Override
    public T update(T entity) {
        return getBaseRepository().save(entity);
    }
}
