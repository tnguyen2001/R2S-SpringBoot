package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    Optional<Page<Category>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Boolean existsByName(String name);

    Optional<Page<Category>> findAll(Pageable pageable);
}
