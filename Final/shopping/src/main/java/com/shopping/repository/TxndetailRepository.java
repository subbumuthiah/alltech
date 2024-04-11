package com.shopping.repository;

import com.shopping.entity.Txndetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxndetailRepository extends JpaRepository<Txndetail, Integer> {
}