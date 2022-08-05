package TrainReservation.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TrainReservation.payment.model.Payment;
import TrainReservation.payment.repository.Paymentrepository;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private Paymentrepository paymentrepository;
	
	
	@RequestMapping("/payment")
	public List<Payment> getdetails() 
	{
		return paymentrepository.findAll();
	}
	
	
	@PostMapping("/payment")
	public String reserve(@RequestBody Payment paying) {
		paymentrepository.insert(paying);
		return String.format("Added Admin user: %s",paying.getCardno());
	}

	
	
	
	
	
	/*@RequestMapping("/payment/{cardno}")
	public String getUser(@PathVariable("cardno") String cardno)
	{
		return payment.getCardno(cardno);
	}*/
}
