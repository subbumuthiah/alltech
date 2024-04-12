package com.shopping.repository;

import com.shopping.entity.Sku;
import com.shopping.entity.Txndetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TxndetailRepository extends JpaRepository<Txndetail, Integer> {
    @Override
    Optional<Txndetail> findById(Integer integer);

    Txndetail findBySkuNo(Sku skuNo);
}