package com.shopping.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.repository.SkuRepository;
import com.shopping.entity.*;
import com.shopping.response.*;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SkuService {

    Logger logger = LoggerFactory.getLogger(SkuService.class);

    @Autowired
    SkuRepository skuRepository;

    @Autowired
    WebClient webclient;


    public SkuResponse getById(int id) {
        Sku s = skuRepository.findById(id).get();
        return new SkuResponse(s);
    }
}
