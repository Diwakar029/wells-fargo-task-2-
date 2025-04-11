package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name="clientID")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name="advisorID")
    private Advisor advisor;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String category;

    protected Security(){

    }
    public Security(Portfolio portfolio, Advisor advisor, String name, double price, Date purchaseDate, int quantity, String category){
        this.portfolio= portfolio;
        this.advisor=advisor;
        this.name=name;
        this.price=price;
        this.purchaseDate=purchaseDate;
        this.quantity=quantity;
        this.category=category;
    }

}
