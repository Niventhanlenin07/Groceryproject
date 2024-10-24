package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Admin")
public class adminModel {
    @Id
    @Column(name="Activity")
    private String activity;
    @OneToOne
    @JoinColumn(name="Person_id")
    private personModel person;
    public adminModel(){

    }
    public adminModel(String activity, personModel person) {
        this.activity = activity;
        this.person = person;
    }
}
