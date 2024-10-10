package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Entity
@Table(name="Address")
public class addressModel {
    @Id
    @Column(name="Address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long address_id;
    @Column(name="DoorNum")
    private String doornum;
    @Column(name="Street")
    private String street;
    @Column(name="City")
    private String city;
    @Column(name="District")
    private String district;
    @Column(name="State")
    private String state;
    @Column(name="Country")
    private String country;
    @Column(name="Pincode")
    private Integer pincode;
    @OneToOne(mappedBy = "address")
    private personModel person;
    public addressModel(){

    }
    public addressModel(Long address_id, String doornum, String street, String city, String district, String state, String country, Integer pincode) {
        this.address_id = address_id;
        this.doornum = doornum;
        this.street = street;
        this.city = city;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public String getDoornum() {
        return doornum;
    }

    public void setDoornum(String doornum) {
        this.doornum = doornum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
}
