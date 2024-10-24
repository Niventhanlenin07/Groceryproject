package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Cart")
public class cartModel {
    @Id
    @Column(name="Cart_id")
    private long cartId;
    @Column(name="Quantity")
    private long quantity;
    @Column(name="Total_price")
    private long totalPrice;
    @OneToOne
    @JoinColumn(name="Person_id")
    private personModel person;
    public cartModel(){

    }
    public cartModel(long cartId, long quantity, long totalPrice, personModel person) {
        this.cartId = cartId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.person = person;
    }
}
