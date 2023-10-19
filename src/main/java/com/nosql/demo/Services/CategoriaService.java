package com.nosql.demo.Services;

import com.nosql.demo.Entities.Categoria;
import com.nosql.demo.Entities.Libro;
import com.nosql.demo.Entities.PrestadoA;
import com.nosql.demo.Repositories.CategoriaRepository;
import com.nosql.demo.RequestObjects.CategoriaCreateRequest;
import com.nosql.demo.RequestObjects.LibroCreateRequest;
import com.nosql.demo.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    public Categoria createCategoria(CategoriaCreateRequest categoriaCreateReques ){
        Categoria categoria = Categoria.builder()
                . titulo(categoriaCreateReques .getTitulo ())
                . build();
        return categoriaRepository .save(categoria);
    }
}
