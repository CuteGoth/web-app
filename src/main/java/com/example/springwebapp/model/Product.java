package com.example.springwebapp.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products", schema = "coffeshop")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "count")
    private int count;
    @Column(name = "image")
    private String image;

//    множеству продуктов соответствует одна категория
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ordered_products", schema = "coffeshop",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Order> orders;

}
