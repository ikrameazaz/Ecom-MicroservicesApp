package org.sid.billingservice.entities;

import jakarta.persistence.*;

public class ProductItem {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String productId;
    @ManyToOne(fetch = FetchType.LAZY)
    private Bill bill;
    private int quantity;
    private double price;


}
