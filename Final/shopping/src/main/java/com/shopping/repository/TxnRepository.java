package com.shopping.repository;

import com.shopping.entity.Txn;
import com.shopping.entity.Txndetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TxnRepository extends JpaRepository<Txn, Integer> {
    List<Txn> findByTxndetails(Txndetail txndetails);
}