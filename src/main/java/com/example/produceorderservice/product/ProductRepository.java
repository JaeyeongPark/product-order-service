package com.example.produceorderservice.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
