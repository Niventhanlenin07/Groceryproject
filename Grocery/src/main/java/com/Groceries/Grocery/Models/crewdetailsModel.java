package com.Groceries.Grocery.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name="crewDetails")
public class crewdetailsModel {
    @Id
    @Column(name="Proof_id")
    private long proofId;
    @Column(name="Proof_type")
    private long proofType;
    @Column(name="Salary",precision = 10,scale = 2)
    private BigDecimal salary;
    @OneToOne
    @JoinColumn(name="Person_id")
    private personModel person;
    public crewdetailsModel(){

    }
    public crewdetailsModel(long proofType, long proofId, BigDecimal salary, personModel person) {
        this.proofType = proofType;
        this.proofId = proofId;
        this.salary = salary;
        this.person = person;
    }
}
