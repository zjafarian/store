package com.shopping.store.repositories;

import com.shopping.store.entites.Seller;
import com.shopping.store.repositories.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends BaseRepository<Seller,Long> {
}
