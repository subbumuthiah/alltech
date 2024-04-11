package com.shopping.repository;

import com.shopping.entity.Sku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkuRepository extends JpaRepository<Sku, Integer> {
}