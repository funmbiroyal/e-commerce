package com.ecommerce.shop.data.repository;

import com.ecommerce.shop.data.model.Currency;
import com.ecommerce.shop.data.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
@Sql(scripts = {"/db/insert.sql"})
class ProductRepositoryTest {
    @Autowired
      ProductRepository productRepositoryImpl;
    @BeforeEach
    void setUp() {
    }

    @Test
    void createProductTest(){
        Product product = new Product();
        product.setName("Luxury Sofa");
        product.setPrice(4000.00);
        product.setCurrency(Currency.NGN);
        product.setDetails("Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit, sed do " +
                "eiusmod tempor incididunt ut labore et dolore" +
                " magna aliqua. Ut enim ad minim veniam, quis " +
                "nostrud exercitation ullamco laboris nisi ut");
        log.info("Product before saving --> {}",product);
        assertThat(product).isNotNull();
        assertThat(product.getId()).isNull();
        productRepositoryImpl.save(product);
        assertThat(product.getId()).isNotNull();
        log.info("Product after saving --> {}",product);
    }


    @Test
    @Transactional
    public void whenFindAllProductIsCalledThenProductListIsReturnedTest(){
        List<Product> products = productRepositoryImpl.findAll();
        assertThat(products).hasSize(5);
        log.info("product returned from database -->{}",products);
    }

    @AfterEach
    void tearDown() {
    }
}