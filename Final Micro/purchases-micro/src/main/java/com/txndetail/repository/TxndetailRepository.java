package com.txndetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.txndetail.entity.Sku;
import com.txndetail.entity.Txndetail;

import java.util.*;

public interface TxndetailRepository extends JpaRepository<Txndetail, Integer>{
//List<TxnLineItem> findByTxnId(int id);
//	@Override
//    Optional<Txndetail> findById(Integer integer);
//
//    Txndetail findBySkuNo(Sku skuNo);
}
