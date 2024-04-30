package com.sku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.product.entity.Product;
import com.sku.entity.Sku;

@Repository
public interface SkuRepository extends JpaRepository<Sku, Integer>{

}
