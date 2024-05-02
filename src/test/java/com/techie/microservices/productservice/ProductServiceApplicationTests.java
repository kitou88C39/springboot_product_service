package com.techie.microservices.productservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductServiceApplicationTests {

	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mango:7.0.5");

	@BeforeEach

	void setup() {
		RestAssured.baseURI = "http://localhost";

	}

	@Test
	void shouldCreateProduct() {
	}

}
