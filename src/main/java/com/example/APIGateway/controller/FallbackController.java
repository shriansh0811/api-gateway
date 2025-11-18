package com.example.APIGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	@GetMapping("/product-fallback")
	public String productFallback() {
		return "Product service is down-served by API Gateway " + "Fallback Mechanism";
	}

	@GetMapping("/department-fallback")
	public String departmentFallback() {
		return "Department service is down-served by API Gateway " + "Fallback Mechanism";
	}

}