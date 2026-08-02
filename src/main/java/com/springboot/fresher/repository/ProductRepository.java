package com.springboot.fresher.repository;

import com.springboot.fresher.entity.ProductEntity;

import java.util.List;

public interface ProductRepository {

    ProductEntity createProduct(ProductEntity productEntity);

    List<ProductEntity> findAllProducts();
}
