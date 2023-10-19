package com.nosql.demo.RequestObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LibroCreateRequest {

    @JsonProperty
    private String uuid;
    @JsonProperty
    private String titulo;
    @JsonProperty
    private String autor;
    @JsonProperty
    private String genero;
    @JsonProperty
    private String editorial;
    @JsonProperty
    private Integer anioPublicacion;
    @JsonProperty
    private String estado;
    @JsonProperty
    private PrestadoARequest prestadoA;
}
