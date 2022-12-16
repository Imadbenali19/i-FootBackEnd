package ma.emsi.iFoot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.iFoot.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

	User findByUsername(String username);
}
