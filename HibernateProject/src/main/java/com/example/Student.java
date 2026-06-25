package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollNo;
    private String sname;
    private int sAge;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sname;
    }

    public void setsName(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return sAge;
    }

    public void setAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sname='" + sname + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}
