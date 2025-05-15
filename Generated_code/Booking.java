package test;

import java.util.Date;

public class Booking {

	private String bookingId;
	private Date bookingDate;
	private String status;

	public Booking(String bookingId, Date bookingDate) {
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.status = "Active";
	}

	public void cancel() {
		this.status = "Cancelled";
	}

	public String getStatus() {
		return status;
	}
}
