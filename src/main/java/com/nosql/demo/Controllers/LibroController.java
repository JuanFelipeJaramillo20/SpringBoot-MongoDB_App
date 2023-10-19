package com.nosql.demo.Controllers;

import com.nosql.demo.RequestObjects.LibroCreateRequest;
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
@RequestMapping("/book")
@Tag(name = "Book services controller" )
public class LibroController {

    @Autowired
    LibroService libroService;
    @PostMapping()
    @Operation(summary = "This method is used to create a book" )
    public ResponseEntity<?> createBook(@RequestBody LibroCreateRequest libroCreateRequest ) {
        return ResponseEntity .ok(libroService .createBook(libroCreateRequest ));
    }
}
