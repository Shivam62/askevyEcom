package com.askevy.ecom.service;

import com.askevy.ecom.dao.IUserDetailsDao;
import com.askevy.ecom.model.UserDetailsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

@Service
public class UserDetailService {

    @Autowired
    IUserDetailsDao userDetailsDao;

    Logger logger = Logger.getLogger(UserDetailService.class.toString());

    public List<UserDetailsBean> getUserData()
    {
        logger.info(new Throwable().getStackTrace()[0].getMethodName() + " STARTS");
        try{

            return (List<UserDetailsBean>)userDetailsDao.findAll();
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
