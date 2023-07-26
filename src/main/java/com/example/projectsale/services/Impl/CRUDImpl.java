package com.example.projectsale.services.Impl;

import com.example.projectsale.repository.IGenericRepository;
import com.example.projectsale.services.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericRepository<T,ID> getRepo();




}
