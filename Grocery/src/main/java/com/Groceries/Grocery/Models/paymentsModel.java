package com.Groceries.Grocery.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Payments")
public class paymentsModel {
    @Id
    @Column(name="Payment_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long payment_id;
    @Column(name="PaymentType")
    private String paymenttype;
    @OneToOne
    @JoinColumn(name = "Person_id")
    private personModel person;
    @OneToOne(mappedBy = "payment")
    private ordersModel orders;
    public paymentsModel(){

    }
    public paymentsModel(Long payment_id, String paymenttype, personModel person, ordersModel orders) {
        this.payment_id = payment_id;
        this.paymenttype = paymenttype;
        this.orders=orders;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public personModel getPerson() {
        return person;
    }

    public void setPerson(personModel person) {
        this.person = person;
    }
}
