package com.nosql.demo.Entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrestadoA {

    private String nombre;
    private String id_usuario;
}
