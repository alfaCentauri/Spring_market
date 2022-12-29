package com.alfaCentauri.onlineshop.domain.repository;


import com.alfaCentauri.onlineshop.domain.dto.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProduct(int quantity);
    Optional<Product> getProduct(int poductId);
    Product save(Product product);
    void delete(int productId);
}
