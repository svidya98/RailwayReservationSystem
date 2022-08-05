package TrainReservation.Search.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import TrainReservation.Search.model.Search;


public interface Train extends MongoRepository<Search, String> {

}
