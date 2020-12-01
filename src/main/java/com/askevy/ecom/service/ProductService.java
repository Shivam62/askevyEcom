package com.askevy.ecom.service;

import com.askevy.ecom.dao.IProductDetailsDao;
import com.askevy.ecom.dao.IProductMasterDao;
import com.askevy.ecom.model.ProductDetailsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ProductService {

    @Autowired
    IProductDetailsDao productDetailsDao;

    @Autowired
    IProductMasterDao productMasterDao;

    Logger logger = Logger.getLogger(ProductService.class.toString());

    public List<ProductDetailsBean> getAllProductDetails()
    {

        logger.info(new Throwable().getStackTrace()[0].getMethodName() + " STARTS");
        try{

            return (List<ProductDetailsBean>)productDetailsDao.findAll();
        }
        catch(Exception ex)
        {
            logger.warning(ex.getMessage());
            throw ex;
        }
        finally {
            logger.info(new Throwable().getStackTrace()[0].getMethodName() + " ENDS");
        }

    }
}
