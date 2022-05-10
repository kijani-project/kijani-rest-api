package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToMany(mappedBy = "ecolabels")
    @JsonBackReference
    private Set<Product> products;

    private String type;

}
