package com.nosql.demo.RequestObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PrestadoARequest {

    @JsonProperty
    private String nombre;
    private String id_usuario;
}
