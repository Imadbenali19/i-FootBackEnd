package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Annonce;


@Repository
public interface AnnonceRepository extends MongoRepository<Annonce, Long> {

}
