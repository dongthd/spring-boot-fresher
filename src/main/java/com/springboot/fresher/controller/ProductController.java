package com.springboot.fresher.controller;

import com.springboot.fresher.entity.ProductEntity;
import com.springboot.fresher.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product/create")
    ProductEntity createProduct(ProductEntity product) {
        return productService.createProduct(product);
    }

    @GetMapping("/products")
    List<ProductEntity> findAllProducts() {
        return productService.findAllProducts();
    }
}
