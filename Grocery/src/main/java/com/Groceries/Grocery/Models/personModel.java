package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name="Persons")
public class personModel {
    @Id
    @Column(name = "Person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "First_name")
    private String first_name;
    @Column(name = "Last_name")
    private String last_name;
    @Column(name = "Role")
    private String role;
    @Column(name = "Contact")
    private Long number;
    @OneToOne
    @JoinColumn(name="address_id")
    private addressModel address;
    @OneToOne(mappedBy = "person")
    private paymentsModel paymentmodel;
    @OneToOne(mappedBy = "person")
    private crewdetailsModel crewdetailsmodel;
    @OneToOne(mappedBy = "person")
    private cartModel cartmodel;
    @OneToOne(mappedBy = "person")
    private adminModel adminmodel;
    @OneToMany(mappedBy = "person")
    private List<ordersModel>orders;
    @OneToMany(mappedBy = "person")
    private List<returnsModel>returns;
    public personModel(){

    }
    public personModel(Long id, String first_name, String last_name, String role, Long number,
                       addressModel address, paymentsModel paymentmodel, crewdetailsModel crewdetailsmodel, cartModel cartmodel, adminModel adminmodel, List<ordersModel>orders,List<returnsModel>returns) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.number = number;
        this.address = address;
        this.paymentmodel = paymentmodel;
        this.crewdetailsmodel=crewdetailsmodel;
        this.cartmodel=cartmodel;
        this.adminmodel=adminmodel;
        this.orders=orders;
        this.returns=returns;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public addressModel getAddress() {
        return address;
    }

    public void setAddress(addressModel address) {
        this.address = address;
    }

    public paymentsModel getPaymentmodel() {
        return paymentmodel;
    }

    public void setPaymentmodel(paymentsModel paymentmodel) {
        this.paymentmodel = paymentmodel;
    }

    public crewdetailsModel getCrewdetailsmodel() {
        return crewdetailsmodel;
    }

    public void setCrewdetailsmodel(crewdetailsModel crewdetailsmodel) {
        this.crewdetailsmodel = crewdetailsmodel;
    }

    public cartModel getCartmodel() {
        return cartmodel;
    }

    public void setCartmodel(cartModel cartmodel) {
        this.cartmodel = cartmodel;
    }

    public adminModel getAdminmodel() {
        return adminmodel;
    }

    public void setAdminmodel(adminModel adminmodel) {
        this.adminmodel = adminmodel;
    }

    public List<ordersModel> getOrders() {
        return orders;
    }

    public void setOrders(List<ordersModel> orders) {
        this.orders = orders;
    }

    public List<returnsModel> getReturns() {
        return returns;
    }

    public void setReturns(List<returnsModel> returns) {
        this.returns = returns;
    }
}