package com.techie.microservices.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")

public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public void createProduct(@RequestBody ProductRequest productRequest) {

    }

}