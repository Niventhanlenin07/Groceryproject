package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.math.BigInteger;

@Getter
@Setter

@NoArgsConstructor
@Entity
@Table(name="Persons")
public class personModel {
    @Id
    @Column(name = "Person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "First_name")
    private String first_name;
    @Column(name = "Last_name")
    private String last_name;
    @Column(name = "Role")
    private String role;
    @Column(name = "Contact")
    private BigInteger number;
    @OneToOne
    @JoinColumn(name="address_id")
    private addressModel address;
    @OneToOne(mappedBy = "person")
    private paymentModel paymentmodel;

    public personModel(Long id, String first_name, String last_name, String role, BigInteger number, Long address_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.number = number;
    }
}