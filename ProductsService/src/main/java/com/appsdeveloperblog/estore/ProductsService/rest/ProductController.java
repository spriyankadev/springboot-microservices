package com.appsdeveloperblog.estore.ProductsService.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private Environment env;

    @PostMapping
    public String createProduct(){
        return "HTTP POST HANDLE";
    }

    @GetMapping
    public String getProduct(){
        log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
//
        return "HTTP GET HANDLE "+ env.getProperty("local.server.port");
    }

    @PutMapping
    public String updateProduct(){
        return "HTTP PUT HANDLE";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "HTTP DELETE HANDLE";
    }
}
