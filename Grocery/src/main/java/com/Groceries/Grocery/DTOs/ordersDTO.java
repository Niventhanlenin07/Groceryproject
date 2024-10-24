package com.Groceries.Grocery.DTOs;

import java.sql.Time;
import java.util.Date;

public class ordersDTO {
    private Date orderDate;
    private Time deliveryTime;
    private int returnBoundary;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Time getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Time deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getReturnBoundary() {
        return returnBoundary;
    }

    public void setReturnBoundary(int returnBoundary) {
        this.returnBoundary = returnBoundary;
    }
}
