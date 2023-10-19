package com.nosql.demo.Services;

import com.nosql.demo.Entities.Escritor;
import com.nosql.demo.Repositories.EscritorRepository;
import com.nosql.demo.RequestObjects.EscritorCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscritorService {

    @Autowired
    private EscritorRepository escritorRepository;

    public Escritor crearEscritor(EscritorCreateRequest escritorCreateRequest){
        Escritor escritor = Escritor.builder().nombres(escritorCreateRequest.getNombres()).libros(escritorCreateRequest.getLibros()).build();
        return escritorRepository.save(escritor);
    }

    public List<Escritor> obtenerEscritores(){
        return escritorRepository.findAll();
    }
}
