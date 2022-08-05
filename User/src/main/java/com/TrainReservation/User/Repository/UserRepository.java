package com.TrainReservation.User.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.TrainReservation.User.model.User;

@Repository

public interface UserRepository extends MongoRepository<User,String> {

}
