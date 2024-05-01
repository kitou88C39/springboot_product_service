package com.techie.microservices.productservice.Repository;

import com.techie.microservices.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product> {

}