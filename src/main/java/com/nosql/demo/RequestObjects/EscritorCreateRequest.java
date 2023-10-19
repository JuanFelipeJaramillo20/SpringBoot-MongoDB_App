package com.nosql.demo.RequestObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nosql.demo.Entities.Libro;
import lombok.Data;

import java.util.List;

@Data
public class EscritorCreateRequest {
    @JsonProperty
    private String nombres;
    @JsonProperty
    private List<Libro> libros;
}
