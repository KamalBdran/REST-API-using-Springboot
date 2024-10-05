package com.example.sjprogramming.restapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNum;
    @Column (name = "student_name")
    private String name;
    @Column (name = "student_percentage")
    private float percentage;
    @Column (name = "student_branch")
    private String branch;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(String name, float percentage, String branch) {
        super();
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    // Getters and setters
    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }

}