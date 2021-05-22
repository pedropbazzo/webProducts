package com.web.products.resource;

import com.web.products.model.dto.ProductDto;
import com.web.products.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductResource.class)
public class ProductResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

//    @Test
//    public void createProductWithSuccess() throws Exception{
//
//        ProductDto productDto = ProductDto.builder().name("cadeira").build();
//
//
//            mockMvc.perform(
//                    post("api/v1/products")
//                            .contentType(MediaType.APPLICATION_JSON)
//                            .content(productDto.toString()))
//                    .andExpect(status().isCreated());
//
//
//
//        }
}
