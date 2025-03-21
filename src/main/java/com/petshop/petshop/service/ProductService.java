package com.petshop.petshop.service;

import com.petshop.petshop.DTO.ApiResponseDTO;
import com.petshop.petshop.DTO.ProductDTO;
import com.petshop.petshop.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public abstract ApiResponseDTO<List<Product>> getAllProducts();
    public abstract ApiResponseDTO<Product> getProduct(String id);
    public abstract ApiResponseDTO<Product> createProduct(ProductDTO requestNewProduct);
    public abstract ApiResponseDTO<Product> updateProduct(String id, ProductDTO requestUpdateProduct);
    public abstract void deleteProduct(String id);
}
