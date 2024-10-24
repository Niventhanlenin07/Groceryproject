package com.Groceries.Grocery.DTOs;

public class cartDTO {
    private long Quantity;
    private long totalPrice;

    public long getQuantity() {
        return Quantity;
    }

    public void setQuantity(long quantity) {
        Quantity = quantity;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
