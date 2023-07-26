package com.example.projectsale.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "categories")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(length = 50, nullable = false)
    @Size(min = 5)
    private String name;

    @Column(length = 150, nullable = false)
    private String description;

    private boolean enabled;
}
