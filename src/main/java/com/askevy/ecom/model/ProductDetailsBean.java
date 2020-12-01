package com.askevy.ecom.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "product_details")
public class ProductDetailsBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_details_id")
    private BigInteger productDetailsId;

    @Column(name = "product_id")
    private BigInteger productId;

    @Column(name="product_name")
    private String productName;

    @Column(name = "price")
    private Integer price;

    @Column(name="discount")
    private Integer discount;

    @Column(name = "image_id")
    private String imageId;

    @Column(name = "insertion_date")
    private Timestamp insertionDate;

    @Column(name = "last_updated_date")
    private Timestamp lastUpdatedDate;

    @Column(name = "isactive")
    private Boolean isActive;

    @Column(name = "isdeleted")
    private Boolean isDeleted;

    public BigInteger getProductDetailsId() {
        return productDetailsId;
    }

    public void setProductDetailsId(BigInteger productDetailsId) {
        this.productDetailsId = productDetailsId;
    }

    public BigInteger getProductId() {
        return productId;
    }

    public void setProductId(BigInteger productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Timestamp getInsertionDate() {
        return insertionDate;
    }

    public void setInsertionDate(Timestamp insertionDate) {
        this.insertionDate = insertionDate;
    }

    public Timestamp getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
