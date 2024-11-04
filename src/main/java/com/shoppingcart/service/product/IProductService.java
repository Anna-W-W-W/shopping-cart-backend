package com.shoppingcart.service.product;

import com.shoppingcart.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void updateProduct(Product product, Long productId);
    void deleteProduct(Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByCategoryId(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName (String name);
    List<Product> getProductsByBrandAndName (String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}