package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class Ecolabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ecolabel_id", nullable = false)
    private Integer id;

    public Ecolabel() {
    }

    /*
    @ManyToMany
    @JsonBackReference
    private Set<Product> products;

     */

    @ManyToMany(mappedBy = "ecolabels")
    private Set<Product> products;

    private String type;

}
