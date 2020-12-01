package com.askevy.ecom.dao;

import com.askevy.ecom.model.ProductMasterBean;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface IProductMasterDao extends CrudRepository<ProductMasterBean, Serializable> {
}
