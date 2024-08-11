package com.app.billing.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="Invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="invoice_number")
    private int invoiceNumber;

    private BigDecimal totalAmount;

    private int clientId;

    private Date date;
    private String paymentMethod;

    public Invoice() {
    }

    public Invoice(int id, int invoiceNumber, BigDecimal totalAmount, int clientId, Date date, String paymentMethod) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.totalAmount = totalAmount;
        this.clientId = clientId;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public int getClientId() {
        return clientId;
    }

    public Date getDate() {
        return date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", invoiceNumber=" + invoiceNumber +
                ", totalAmount=" + totalAmount +
                ", clientId=" + clientId +
                ", date=" + date +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

}
