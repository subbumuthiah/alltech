package com.shopping.controller;

import com.shopping.response.SkuResponse;
import com.shopping.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sku")
public class SkuController {


        @Autowired
        SkuService skuService;

        @GetMapping("/getById/{id}")
        public SkuResponse getById(@PathVariable int id) {
            return skuService.getById(id);
        }
    }


