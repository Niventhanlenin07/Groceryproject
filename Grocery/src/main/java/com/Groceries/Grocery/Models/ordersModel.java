package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name="Orders")
public class ordersModel {
    @Id
    @Column(name="Order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @Column(name="Order_date")
    private Date orderDate;
    @Column(name="Order_time")
    private Time orderTime;
    @Column(name="Payment_type")
    private String paymentType;
    @Column(name="Delivery_time")
    private Time deliveryTime;
    @Column(name="Return_boundary")
    private int returnBoundary;
    @ManyToOne
    @JoinColumn(name="Person_id")
    private personModel person;
    @OneToOne
    @JoinColumn(name="Payment_id")
    private paymentsModel payment;
    @OneToOne(mappedBy ="orders")
    private returnsModel returns;
    public ordersModel(){

    }

    public ordersModel(long orderId, Date orderDate, Time orderTime, String paymentType, Time deliveryTime, int returnBoundary, personModel person,
                       paymentsModel payment,returnsModel returns) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.returnBoundary = returnBoundary;
        this.person = person;
        this.payment = payment;
        this.returns=returns;
    }
}
