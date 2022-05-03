package com.kijani.restapi.model;

/**
 * @author Christopher
 */

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Integer productId;
    private String name;
    private String description;
    private String supplier;
    private Integer number;
    private String certificate;
    private String picture;
    private String link;
}

