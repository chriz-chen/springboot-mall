package com.chris.springbootmall.service;

import com.chris.springbootmall.constant.ProductCategory;
import com.chris.springbootmall.dto.ProductRequest;
import com.chris.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
