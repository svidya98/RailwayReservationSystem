package com.TrainReservation.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.TrainReservation.Admin.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

}
