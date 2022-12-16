package ma.emsi.iFoot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.iFoot.model.Terrain;

@Repository
public interface TerrainRepository extends MongoRepository<Terrain, Long> {

}
