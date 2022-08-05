package com.TrainReservation.Checkin.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.TrainReservation.Checkin.model.Checkin;



public interface CheckInRepo extends MongoRepository<Checkin,String> {

}
