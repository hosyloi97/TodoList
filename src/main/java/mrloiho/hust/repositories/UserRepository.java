package mrloiho.hust.repositories;

import lombok.val;
import mrloiho.hust.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

//    public User findUserById(String id);

    @Query(value = "{'username' : ?0 }")
    public User findUserByUsername(String username);
}
