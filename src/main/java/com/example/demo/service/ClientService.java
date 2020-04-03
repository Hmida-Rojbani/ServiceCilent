package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Article;



//8087  mongo-service
@FeignClient(name = "CrudApplication" , url = "http://localhost:8010")
public interface ClientService {
	
	@GetMapping("/article")
	Resources<Article> findAllArticle();

	@GetMapping("/article/{id}")
	public Optional<Article> getProductById(@PathVariable("id") String id );
	
}
