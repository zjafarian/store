package com.shopping.store.services.impls;

import com.shopping.store.entites.Address;
import com.shopping.store.entites.Customer;
import com.shopping.store.repositories.AddressRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.AddressService;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address,Long> implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    protected BaseRepository<Address, Long> getBaseRepository() {
        return addressRepository;
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address save(Address entity) {
        return addressRepository.save(entity);
    }

    @Override
    public List<Address> saveAll(List<Address> entities) {
        return addressRepository.saveAll(entities);
    }

    @Override
    public Optional<Address> findById(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
       addressRepository.deleteById(id);
    }

    @Override
    public Address update(Address entity) {
        return addressRepository.save(entity);
    }
}
