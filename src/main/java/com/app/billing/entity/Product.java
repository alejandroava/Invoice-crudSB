package com.app.billing.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String barcode;
    private String name;
    @Column(precision = 15, scale = 2)
    private BigDecimal price;
    private int quantity;
    private String category;
    private boolean available;
    private int currentStock;
    private int minStock;

    public Product() {
    }

    public Product(int id, String barcode, String name, BigDecimal price, int quantity, String category, boolean available, int currentStock, int minStock) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.available = available;
        this.currentStock = currentStock;
        this.minStock = minStock;
    }

    public int getId() {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", available=" + available +
                ", currentStock=" + currentStock +
                ", minStock=" + minStock +
                '}';
    }

}
