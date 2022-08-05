package TrainReservation.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import TrainReservation.payment.model.Payment;

public interface Paymentrepository extends MongoRepository<Payment, String> {

}
