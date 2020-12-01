package com.askevy.ecom.dao;

import com.askevy.ecom.model.CompanyMasterBean;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface ICompanyMasterDao extends CrudRepository<CompanyMasterBean, Serializable> {
}
