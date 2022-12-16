package ma.emsi.iFoot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.iFoot.model.Demande;

@Repository
public interface DemandeRepository extends MongoRepository<Demande, Long> {

}
