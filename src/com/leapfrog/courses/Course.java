/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.courses;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Course {

    private int id;
    private String name, description;
    private int fees;
    private Date added_date, modified_date;
    private boolean status;

    public Course() {
    }

    public Course(int id, String name, String description, int fees, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fees = fees;

        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Date getAdded_date() {
        return added_date;
    }

    public void setAdded_date(Date added_date) {
        this.added_date = added_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", description=" + description + ", fees=" + fees + ", added_date=" + added_date + ", modified_date=" + modified_date + ", status=" + status + '}';
    }
    
    

}
