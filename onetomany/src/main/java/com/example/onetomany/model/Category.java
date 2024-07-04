package com.example.onetomany.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table (name = "category")
@Getter
@Setter
@ToString
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   /* @Column(name = "category_id")
    private  Long categoryId;*/

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Product> productList;

    private String name;
}
