package com.example.projectsale;

import com.example.projectsale.dto.CategoriaDto;
import com.example.projectsale.model.Categoria;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class MapperConfig {

    @Bean("categoriaMapper")
    public ModelMapper categoriaMapper(){
       return new ModelMapper();
        /*ModelMapper mapper = new ModelMapper();
        TypeMap<CategoriaDto, Categoria> typeMap = mapper.createTypeMap(CategoriaDto.class, Categoria.class);
        typeMap.addMapping(CategoriaDto::getDescripcion,Categoria::setDescription);
        return mapper;*/
    }
}
