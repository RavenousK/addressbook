package com.vaadin.tutorial.addressbook.backend;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * A simple DTO for the address book example.
 *
 * Serializable and cloneable Java Object that are typically persisted
 * in the database and can also be easily converted to different formats like JSON.
 */
// Backend DTO class. This is just a typical Java backend implementation
// class and nothing Vaadin specific.
public class Contact implements Serializable, Cloneable {
 
 public static final long HOUR = 3600*1000;
    private Long id;

    private String firstName = "";
    private String lastName = "";
    private String task = "";
    private Date startDate;
    private long endDate;
    
    public Long getId() {
     return id;
    }

    public void setId(Long id) {
     this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

   
    public long getStartDate() {
        return startDate.getTime();
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    

    public long getEndDate() {
     return (startDate.getTime() + 2 * HOUR);
    }

    public void setEndDate(long endDate) {
     this.endDate = endDate;
    }

    @Override
    public Contact clone() throws CloneNotSupportedException {
        try {
            return (Contact) BeanUtils.cloneBean(this);
        } catch (Exception ex) {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "Task{" + " id " + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", phone=" + task + ", email="
                + task + ", startDate=" + startDate + ", endDate=" + endDate +'}';
    }

}
