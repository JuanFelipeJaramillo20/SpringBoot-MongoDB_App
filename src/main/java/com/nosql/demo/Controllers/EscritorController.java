package com.nosql.demo.Controllers;

import com.nosql.demo.RequestObjects.EscritorCreateRequest;
import com.nosql.demo.RequestObjects.LibroCreateRequest;
import com.nosql.demo.Services.EscritorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/escritor")
@Tag(name = "Writer services controller" )
public class EscritorController {

    @Autowired
    EscritorService escritorService;

    @PostMapping()
    @Operation(summary = "This method is used to create a Writer")
    public ResponseEntity<?> createWriter(@RequestBody EscritorCreateRequest escritorCreateRequest ) {
        return ResponseEntity .ok(escritorService .crearEscritor(escritorCreateRequest ));
    }

    @GetMapping
    @Operation(summary = "This method is used to retrieve a list of Writers")
    public ResponseEntity<?> getWriters() {
        return ResponseEntity .ok(escritorService.obtenerEscritores());
    }
}
