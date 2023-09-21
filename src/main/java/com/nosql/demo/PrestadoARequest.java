package com.nosql.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PrestadoARequest {

    @JsonProperty
    private String nombre;
    private String id_usuario;
}
