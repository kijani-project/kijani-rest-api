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
    private String productName;
    private String productDescription;
    private String productSupplier;
    private Integer productNumber;
    private String productCertificate;
    private String productPicture;
    private String productLink;
}

