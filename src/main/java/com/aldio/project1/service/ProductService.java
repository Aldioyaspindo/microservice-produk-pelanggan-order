package com.aldio.project1.service;

import com.aldio.project1.model.Product;
import com.aldio.project1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Read all
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Read by ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Update
    public Product updateProduct(Long id, Product productDetails) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setNama(productDetails.getNama());
            existingProduct.setSatuan(productDetails.getSatuan());
            existingProduct.setHarga(productDetails.getHarga());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    // Delete
    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Product with id " + id + " deleted!";
    }
}
