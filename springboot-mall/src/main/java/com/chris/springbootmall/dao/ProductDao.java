package com.chris.springbootmall.dao;

import com.chris.springbootmall.dto.ProductQueryParams;
import com.chris.springbootmall.dto.ProductRequest;
import com.chris.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
