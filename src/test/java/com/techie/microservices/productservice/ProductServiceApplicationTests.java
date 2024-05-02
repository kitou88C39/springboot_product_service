package com.techie.microservices.productservice;

import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductServiceApplicationTests {

	@ServiceConnection
	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mango:7.0.5");
	@LocalServerPort
	private integer port;

	@BeforeEach
	void setup() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = port;
	}

	static {
		mongoDBContainer.start();
	}

	@Test
	void shouldCreateProduct() {
		String getRequestBody = """
				{
					"name": "iPhone 15",
					"description": "iPhone 15 is a smartphone from Apple",
					"price": 1000
				}
				""";
	
	RestAssured.given()
	.contentType("application/json")
	.body(requestBody)
	.when()
	.post("/api/product")
	.then()
	.statusCode(201)
	.body("id",.notNullValue())
}
}
