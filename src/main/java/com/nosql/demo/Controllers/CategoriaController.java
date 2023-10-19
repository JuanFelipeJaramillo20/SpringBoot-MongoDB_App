package com.nosql.demo.Controllers;

import com.nosql.demo.RequestObjects.CategoriaCreateRequest;
import com.nosql.demo.RequestObjects.LibroCreateRequest;
import com.nosql.demo.Services.CategoriaService;
import com.nosql.demo.Services.LibroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
@Tag(name = "Category services controller" )
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;
    @PostMapping()
    @Operation(summary = "This method is used to create a category" )
    public ResponseEntity<?> createCategory(@RequestBody CategoriaCreateRequest categoriaCreateRequest ) {
        return ResponseEntity .ok(categoriaService .createCategoria(categoriaCreateRequest ));
    }
}
