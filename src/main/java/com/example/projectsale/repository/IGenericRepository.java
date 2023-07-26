package com.example.projectsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //Anotacion para ajustar repositorio Jpa, la interfaz no puede crear objetos en la app.
public interface IGenericRepository<E,ID> extends JpaRepository<E,ID> {

}
