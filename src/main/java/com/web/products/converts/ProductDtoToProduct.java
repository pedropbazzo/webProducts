package com.web.products.converts;

import com.web.products.model.Product;
import com.web.products.model.dto.ProductDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoToProduct implements Converter<ProductDto, Product> {

    @Override
    public Product convert(ProductDto productDto) {
        Product product = Product.builder().name(productDto.getName()).build();
        return product;
    }
}
