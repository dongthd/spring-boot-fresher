package com.springboot.fresher.repository.impl;

import com.springboot.fresher.entity.ProductEntity;
import com.springboot.fresher.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Product name 1");
        productEntity.setProductPrice(new BigDecimal("68.86"));
        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Product name 2");
        productEntity.setProductPrice(new BigDecimal("68.86"));
        return List.of(productEntity);
    }
}
