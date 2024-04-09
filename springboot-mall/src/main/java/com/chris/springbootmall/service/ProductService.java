package com.chris.springbootmall.service;

import com.chris.springbootmall.dto.ProductRequest;
import com.chris.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
