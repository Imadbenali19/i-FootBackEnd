package ma.emsi.iFoot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.iFoot.model.Annonce;

@Repository
public interface AnnonceRepository extends MongoRepository<Annonce, Integer> {

}
