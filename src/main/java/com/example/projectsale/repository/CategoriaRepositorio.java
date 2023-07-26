package com.example.projectsale.repository;

import com.example.projectsale.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepositorio extends IGenericRepository<Categoria, Long> {
    //SELECT * FROM CATEGORIA WHERE NAME = ?          -->     deviredqueris
    //Busqueda por 2 parametros: findByNameAndEnabled.

    List<Categoria> findByName(String name);

    /*SELECT * FROM CATEGORY WHERE NAME LIKE '%xx%'
    '%XYZ%' findByXXXConstains   --> query personalizados
    'XYZ%' findByXXXStartWith
    '%XYZ' findByXXXEndsWith

     */
     List<Categoria> findByNameLike(String name);


}
