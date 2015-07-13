package com.database;

import java.io.Serializable;

public interface GenericoDao<T, ID extends Serializable> {
        
        T inserir(T entity);
        T atualizar(T entity);
/*        void delete(T entity);
        T findById(ID id);
        List<T> findAll();
        void flush();*/
}
