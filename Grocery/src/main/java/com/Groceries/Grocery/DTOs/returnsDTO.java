package com.Groceries.Grocery.DTOs;

import java.sql.Time;

public class returnsDTO {
    private String Complaints;
    private String replacementType;
    private Time replacementTime;

    public String getComplaints() {
        return Complaints;
    }

    public void setComplaints(String complaints) {
        Complaints = complaints;
    }

    public String getReplacementType() {
        return replacementType;
    }

    public void setReplacementType(String replacementType) {
        this.replacementType = replacementType;
    }

    public Time getReplacementTime() {
        return replacementTime;
    }

    public void setReplacementTime(Time replacementTime) {
        this.replacementTime = replacementTime;
    }
}
