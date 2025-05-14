package com.paw.pawAdmin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String adminName;
    private String password;
    private Date passwordExpiryDate;
    private Date createdDate;
    private Date modifiedDate;

    public Admin() {
    }

    public Admin(int id, String adminName, String password, Date passwordExpiryDate, Date createdDate, Date modifiedDate) {
        this.id = id;
        this.adminName = adminName;
        this.password = password;
        this.passwordExpiryDate = passwordExpiryDate;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getPasswordExpiryDate() {
        return passwordExpiryDate;
    }

    public void setPasswordExpiryDate(Date passwordExpiryDate) {
        this.passwordExpiryDate = passwordExpiryDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", passwordExpiryDate=" + passwordExpiryDate +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
