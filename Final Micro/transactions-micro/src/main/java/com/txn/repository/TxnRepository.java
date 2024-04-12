package com.txn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

//import com.transactions.entity.Transaction;
import com.txn.entity.Txn;

public interface TxnRepository extends JpaRepository<Txn, Integer>{
//getbytranscationid
//	Optional <Txn>
}
