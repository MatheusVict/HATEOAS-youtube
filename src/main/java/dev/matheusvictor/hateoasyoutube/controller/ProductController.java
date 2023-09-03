package dev.matheusvictor.hateoasyoutube.controller;

import dev.matheusvictor.hateoasyoutube.domain.Product;
import dev.matheusvictor.hateoasyoutube.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        return allProducts.stream().map(product ->
                product.add(linkTo(methodOn(ProductController.class).getProductById(product.getId())).withSelfRel())
                )
                .map(product -> product.add(linkTo(methodOn(ClientController.class).getClientById(
                        product.getClient().getId()
                )).withRel("Get client")))
                .toList();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
