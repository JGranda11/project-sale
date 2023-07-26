package com.example.projectsale.services;

import java.util.List;

public interface ICRUD<T,ID> { //Interfaz generica
        T crear(T e) throws Exception;
        List<T> buscar() throws Exception;
        T buscarXID(ID id) throws Exception;
        T actualizar(T e) throws Exception;
        void eliminar(ID id) throws Exception;

}
