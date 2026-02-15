package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private Double purchasePrice;
    private Date purchaseDate;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    public Security(String name, String category, Double purchasePrice, Date purchaseDate, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Security() {}

    public Long getSecurityId() { return securityId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }

    public Date getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}