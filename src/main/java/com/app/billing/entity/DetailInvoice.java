package com.app.billing.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "DetailBillings")
public class DetailInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal salePrice;
    private int quantity;
    private BigDecimal discountAmount;
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private int productId;
    @ManyToOne
    @JoinColumn(name = "invoice_id",nullable = false)
    private int invoiceId;

    public DetailInvoice() {
    }

    public DetailInvoice(int id, BigDecimal salePrice, int quantity, BigDecimal discountAmount, BigDecimal total, int productId, int invoiceId) {
        this.id = id;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.discountAmount = discountAmount;
        this.total = total;
        this.productId = productId;
        this.invoiceId = invoiceId;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public int getProductId() {
        return productId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public String toString() {
        return "DetailInvoice{" +
                "id=" + id +
                ", salePrice=" + salePrice +
                ", quantity=" + quantity +
                ", discountAmount=" + discountAmount +
                ", total=" + total +
                ", productId=" + productId +
                ", invoiceId=" + invoiceId +
                '}';
    }
}
