package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name="Returns")
public class returnsModel {
    @Id
    @Column(name="Return_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long returnId;
    @Column(name="Return_date")
    private Date returnDate;
    @Column(name="Complaints")
    private String complaints;
    @Column(name="Replacement_type")
    private String replacementType;
    @Column(name="Replacement_time")
    private Time replacementTime;
    @ManyToOne
    @JoinColumn(name="Person_id")
    private personModel person;
    @OneToOne
    @JoinColumn(name="Order_id")
    private ordersModel orders;
    @OneToOne
    @JoinColumn(name="Product_id")
    private productModel products;
    public returnsModel(){

    }
    public returnsModel(long returnId, Date returnDate, String complaints, String replacementType, Time replacementTime, personModel person, ordersModel orders, productModel products) {
        this.returnId = returnId;
        this.returnDate = returnDate;
        this.complaints = complaints;
        this.replacementType = replacementType;
        this.replacementTime = replacementTime;
        this.person = person;
        this.orders = orders;
        this.products = products;
    }
}
