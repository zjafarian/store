package com.shopping.store.repositories.base;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public interface BaseRepository<T,ID extends Serializable>  extends JpaRepository<T,ID> {

}
