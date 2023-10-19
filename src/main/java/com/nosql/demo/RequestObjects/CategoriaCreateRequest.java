package com.nosql.demo.RequestObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CategoriaCreateRequest {

    @JsonProperty
    private String titulo;
}
