package com.nosql.demo;

import com.nosql.demo.Entities.Libro;
import com.nosql.demo.Entities.PrestadoA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    private LibroRepository bookRepository;
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
        return bookRepository .save(book);
    }
}
