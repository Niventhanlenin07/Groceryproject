package com.Groceries.Grocery.DTOs;

import java.math.BigDecimal;

public class crewdetailsDTO {
    private long proofId;
    private long proofType;
    private BigDecimal Salary;

    public long getProofId() {
        return proofId;
    }

    public void setProofId(long proofId) {
        this.proofId = proofId;
    }

    public long getProofType() {
        return proofType;
    }

    public void setProofType(long proofType) {
        this.proofType = proofType;
    }

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }
}
