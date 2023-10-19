package com.nosql.demo.Repositories;

import com.nosql.demo.Entities.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibroRepository extends MongoRepository<Libro, String> {
}
