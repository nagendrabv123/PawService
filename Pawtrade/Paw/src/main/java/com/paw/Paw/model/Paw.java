package com.paw.Paw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Paw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pawName;
    private String pawDescription;
    private String pawBreed;
    private String gender;
    private Date dateOfBirth;
    private String placeOfBirth;
    private Date createdDate;
    private Date modifiedDate;

    public Paw() {
    }

    public Paw(int id, String pawName, String pawDescription, String pawBreed, String gender, Date dateOfBirth, String placeOfBirth, Date createdDate, Date modifiedDate) {
        this.id = id;
        this.pawName = pawName;
        this.pawDescription = pawDescription;
        this.pawBreed = pawBreed;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPawName() {
        return pawName;
    }

    public void setPawName(String pawName) {
        this.pawName = pawName;
    }

    public String getPawDescription() {
        return pawDescription;
    }

    public void setPawDescription(String pawDescription) {
        this.pawDescription = pawDescription;
    }

    public String getPawBreed() {
        return pawBreed;
    }

    public void setPawBreed(String pawBreed) {
        this.pawBreed = pawBreed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
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
        return "Paw{" +
                "id=" + id +
                ", pawName='" + pawName + '\'' +
                ", pawDescription='" + pawDescription + '\'' +
                ", pawBread='" + pawBreed + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
