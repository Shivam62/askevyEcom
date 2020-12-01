package com.askevy.ecom.dao;

import com.askevy.ecom.model.UserDetailsBean;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
public interface IUserDetailsDao extends CrudRepository<UserDetailsBean, Serializable> {

   }
