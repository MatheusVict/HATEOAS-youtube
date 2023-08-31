package dev.matheusvictor.hateoasyoutube.service.impl;

import dev.matheusvictor.hateoasyoutube.domain.Product;
import dev.matheusvictor.hateoasyoutube.repository.ProductRepository;
import dev.matheusvictor.hateoasyoutube.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return saveProduct(product);
    }
}
