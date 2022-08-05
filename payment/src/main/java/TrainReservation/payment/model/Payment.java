package TrainReservation.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="paymentdetails")
public class Payment {
	
	@Id
	private String bankname;
	private String cardno;
	private String cvvno;
	private String amount;
	public Payment(String bankname, String cardno, String cvvno, String amount) {
		super();
		this.bankname = bankname;
		this.cardno = cardno;
		this.cvvno = cvvno;
		this.amount = amount;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCvvno() {
		return cvvno;
	}
	public void setCvvno(String cvvno) {
		this.cvvno = cvvno;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [bankname=" + bankname + ", cardno=" + cardno + ", cvvno=" + cvvno + ", amount=" + amount + "]";
	}
	
	

}
