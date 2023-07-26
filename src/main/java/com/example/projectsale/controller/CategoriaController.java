package com.example.projectsale.controller;

import com.example.projectsale.dto.CategoriaDto;
import com.example.projectsale.model.Categoria;
import com.example.projectsale.services.CategoriaServicios;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {

    @Autowired
    private CategoriaServicios ctgServices;

    @Autowired
    @Qualifier("categoriaMapper")
    private ModelMapper mapper;

    @GetMapping()
    public ResponseEntity<List<CategoriaDto>> buscar() throws Exception{
        List<CategoriaDto> lista = ctgServices.buscar().stream().
        map(c ->mapper.map(c, CategoriaDto.class)).collect(Collectors.toList());

        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
