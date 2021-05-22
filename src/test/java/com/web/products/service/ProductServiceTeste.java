package com.web.products.service;

import com.web.products.model.dto.ProductDto;
import com.web.products.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;


@SpringBootTest
public class ProductServiceTeste {

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    public ProductService productService;

    @Autowired
    public ConversionService conversionService;

    @Test
    public void createProductWithSuccess() {

        ProductDto productDto = ProductDto.builder().name("Cadeira").build();

        Assertions.assertNotNull(productService.createProduct(productDto));
    }
}
