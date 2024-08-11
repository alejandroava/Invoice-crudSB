package com.app.billing.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int dni;

    private String name;
    private String lastname;
    @Column(unique = true)
    private String email;
    private boolean status;
    private LocalDateTime dateCreation;

    public Client() {
    }

    public Client(int id, int dni, String name, String lastname, String email, boolean status, LocalDateTime dateCreation) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.status = status;
        this.dateCreation = dateCreation;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public boolean isStatus() {
        return status;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", dni=" + dni +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
