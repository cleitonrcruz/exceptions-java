package model.entities;

import java.util.Date;

public class Reservation {

	private Integer rommNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(Integer rommNumber, Date checkIn, Date checkOut) {
		this.rommNumber = rommNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRommNumber() {
		return rommNumber;
	}

	public void setRommNumber(Integer rommNumber) {
		this.rommNumber = rommNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	
	
}
