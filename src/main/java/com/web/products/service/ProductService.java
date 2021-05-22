package com.web.products.service;

import com.web.products.model.Product;
import com.web.products.model.dto.ProductDto;
import com.web.products.repository.ProductRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.time.LocalDate;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final ConversionService conversionService;

    public ProductService(ProductRepository productRepository, ConversionService conversionService) {
        this.productRepository = productRepository;
        this.conversionService = conversionService;
    }

    @Transactional
    public Product createProduct(ProductDto productDto) {
        if (ObjectUtils.isEmpty(productDto)) {
            return null;
        }
        Product product = conversionService.convert(productDto, Product.class);
        product.setCreateDate(LocalDate.now());
        return productRepository.save(product);
    }
}
