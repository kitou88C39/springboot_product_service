package com.techie.microservices.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.techie.microservices.product.dto.ProductRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {

    }

}
