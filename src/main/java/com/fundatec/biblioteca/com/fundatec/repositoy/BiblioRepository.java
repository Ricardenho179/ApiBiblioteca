package com.fundatec.biblioteca.com.fundatec.repositoy;

import com.fundatec.biblioteca.com.fundatec.domain.Biblioteca;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BiblioRepository extends MongoRepository<Biblioteca, String> {


    Biblioteca findBy_id(ObjectId _id);
}
