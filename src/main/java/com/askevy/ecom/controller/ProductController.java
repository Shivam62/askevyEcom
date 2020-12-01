package com.askevy.ecom.controller;

import com.askevy.ecom.model.ProductDetailsBean;
import com.askevy.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/getAllProducts",method = RequestMethod.GET)
    public ResponseEntity<?> getProductDetails()
    {
        try{
            Optional<List<ProductDetailsBean>> productDetailsBeans = Optional.of(productService.getAllProductDetails());
            if(productDetailsBeans.isPresent() && Objects.nonNull(productDetailsBeans.get()) && productDetailsBeans.get().size()>0)
            {
                return new ResponseEntity<>(productDetailsBeans.get(),HttpStatus.OK);
            }
            else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch(Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

}
