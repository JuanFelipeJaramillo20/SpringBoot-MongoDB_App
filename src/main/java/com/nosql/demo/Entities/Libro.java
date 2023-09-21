package com.nosql.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "libros")
public class Libro implements Serializable {
    @Id
    private String id;

    private String uuid;
    private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private Integer anioPublicacion;
    private String estado;
    private PrestadoA prestadoA;
}