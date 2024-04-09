package com.chris.springbootmall.dao;

import com.chris.springbootmall.dto.ProductRequest;
import com.chris.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
