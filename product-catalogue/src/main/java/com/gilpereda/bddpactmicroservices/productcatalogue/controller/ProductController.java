package com.gilpereda.bddpactmicroservices.productcatalogue.controller;

import com.gilpereda.bddpactmicroservices.productcatalogue.model.Product;
import com.gilpereda.bddpactmicroservices.productcatalogue.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(path = "/{productId}", method = RequestMethod.GET)
    public Product getProductDetail(@PathVariable("productId") final long productId) {
        return productRepository.findOneById(productId);
    }

}
