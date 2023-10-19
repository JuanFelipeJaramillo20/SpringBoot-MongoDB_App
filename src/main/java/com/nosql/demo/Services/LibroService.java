package com.nosql.demo.Services;

import com.nosql.demo.Entities.Escritor;
import com.nosql.demo.Entities.Libro;
import com.nosql.demo.Entities.PrestadoA;
import com.nosql.demo.Repositories.EscritorRepository;
import com.nosql.demo.RequestObjects.LibroCreateRequest;
import com.nosql.demo.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LibroService {

    @Autowired
    private LibroRepository bookRepository;

    @Autowired
    private EscritorRepository escritorRepository;

    public Libro createBook(LibroCreateRequest bookCreateRequest ){
        Libro book = Libro.builder()
                .uuid(bookCreateRequest .getUuid())
                . titulo(bookCreateRequest .getTitulo ())
                . autor(bookCreateRequest .getAutor())
                . genero(bookCreateRequest .getGenero())
                . editorial(bookCreateRequest .getEditorial())
                . anioPublicacion(bookCreateRequest .getAnioPublicacion())
                . estado(bookCreateRequest .getEstado())
                . prestadoA(PrestadoA.builder().nombre(bookCreateRequest.getPrestadoA().getNombre()).id_usuario(bookCreateRequest.getPrestadoA().getId_usuario()).build())
                . build();
        String autor = bookCreateRequest.getAutor();
        if(autor != null){
            Escritor escritor = escritorRepository.findByNombres(autor);
            if(escritor != null){
                List<Libro> libros = escritor.getLibros();
                libros.add((book));
                escritor.setLibros(libros);
                escritorRepository.save((escritor));
            }else{
                List<Libro> libros = new ArrayList<>();
                libros.add(book);
                escritor = Escritor.builder().nombres(autor).libros(libros).build();
                escritorRepository.save((escritor));
            }
        }
        return bookRepository .save(book);
    }
}
