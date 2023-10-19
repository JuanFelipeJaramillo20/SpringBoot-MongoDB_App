package com.nosql.demo.Repositories;

import com.nosql.demo.Entities.Escritor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EscritorRepository extends MongoRepository<Escritor, String> {
    Escritor findByNombres(String nombres);
}
