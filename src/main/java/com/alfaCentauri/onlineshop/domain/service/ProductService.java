package com.alfaCentauri.onlineshop.domain.service;

import com.alfaCentauri.onlineshop.persistence.ProductoRepository;
import com.alfaCentauri.onlineshop.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAll() {
        return productoRepository.getAll();
    }
}
