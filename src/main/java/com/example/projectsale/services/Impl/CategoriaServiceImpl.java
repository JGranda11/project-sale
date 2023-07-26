package com.example.projectsale.services.Impl;

import com.example.projectsale.model.Categoria;
import com.example.projectsale.repository.CategoriaRepositorio;
import com.example.projectsale.repository.IGenericRepository;
import com.example.projectsale.services.CategoriaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl extends CRUDImpl<Categoria, Long> implements CategoriaServicios {

    @Autowired
    private CategoriaRepositorio catRep;

    protected IGenericRepository<Categoria, Long> getRepo(){
        return catRep;
    }

    @Override
    public List<Categoria> findByName(String name) {
        return catRep.findByName(name);
    }

    public Categoria crear(Categoria t) throws Exception {
        return getRepo().save(t);
    }

    public Categoria actualizar(Categoria t) throws Exception {
        return getRepo().save(t);
    }

    public List<Categoria> buscar() throws Exception {
        return getRepo().findAll();
    }

    public Categoria buscarXID(Long id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }

    public void eliminar(Long id) throws Exception {
        getRepo().deleteById(id);
    }

}
