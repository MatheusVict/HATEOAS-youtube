package dev.matheusvictor.hateoasyoutube.service;

import dev.matheusvictor.hateoasyoutube.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product saveProduct(Product product);
}
