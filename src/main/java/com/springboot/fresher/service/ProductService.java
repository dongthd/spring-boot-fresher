package com.springboot.fresher.service;

import com.springboot.fresher.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    ProductEntity createProduct(ProductEntity productEntity);

    List<ProductEntity> findAllProducts();
}
