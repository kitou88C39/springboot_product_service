package com.techie.microservices.product.service;

import com.techie.microservices.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
}
