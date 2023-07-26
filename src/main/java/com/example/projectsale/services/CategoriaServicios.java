package com.example.projectsale.services;

import com.example.projectsale.model.Categoria;

import java.util.List;

public interface CategoriaServicios extends ICRUD<Categoria, Long> {
    List<Categoria> findByName(String name);

}
