package com.nosql.demo.Repositories;

import com.nosql.demo.Entities.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
