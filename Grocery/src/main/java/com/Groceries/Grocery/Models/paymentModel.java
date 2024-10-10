package com.Groceries.Grocery.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Payments")
public class paymentModel {
    @Id
    @Column(name="Payment_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long payment_id;
    @Column(name="PaymentType")
    private String paymenttype;
    @OneToOne
    @JoinColumn(name = "Person_id")
    private personModel person;

    public paymentModel(){

    }
    public paymentModel(Long payment_id, String paymenttype, personModel person) {
        this.payment_id = payment_id;
        this.paymenttype = paymenttype;
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
