package com.askevy.ecom.dao;

import com.askevy.ecom.model.ProductDetailsBean;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface IProductDetailsDao extends CrudRepository<ProductDetailsBean, Serializable> {
}
