package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name="Products")
public class productModel {
    @Id
    @Column(name="Product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    @Column(name="Product_name")
    private String productName;
    @Column(name="Brand_name")
    private String brandName;
    @Column(name="Product_price",precision = 10,scale = 2)
    private BigDecimal productPrice;
    @Column(name="Net_weight")
    private String netWeight;
    @Column(name="Catagory")
    private String catagory;
    @Column(name="Used_by")
    private LocalDate usedBy;
    @OneToOne(mappedBy ="products")
    private returnsModel returns;
    public productModel(){

    }
    public productModel(long productId, String productName,String brandName, BigDecimal productPrice, String netWeight,
                        String catagory, LocalDate usedBy,returnsModel returns) {
        this.productId = productId;
        this.productName = productName;
        this.brandName=brandName;
        this.productPrice = productPrice;
        this.netWeight = netWeight;
        this.catagory = catagory;
        this.usedBy = usedBy;
        this.returns=returns;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }


    public LocalDate getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(LocalDate usedBy) {
        this.usedBy = usedBy;
    }

    public returnsModel getReturns() {
        return returns;
    }

    public void setReturns(returnsModel returns) {
        this.returns = returns;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
}
