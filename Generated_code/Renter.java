package test;

import java.util.List;

public class Renter extends User {

    /**
     * Searches for properties based on a given criteria.
     * 
     * @param criteria The search criteria.
     * @return A list of properties matching the criteria.
     */
    public List<Property> searchProperty(String criteria) {
        throw new UnsupportedOperationException();
    }

    /**
     * Books a property.
     * 
     * @param property The property to book.
     * @return A booking object representing the booking.
     */
    public Booking bookProperty(Property property) {
        throw new UnsupportedOperationException();
    }

    /**
     * Makes a payment for a booking.
     * 
     * @param booking The booking to pay for.
     * @return A payment object representing the payment.
     */
    public Payment makePayment(Booking booking) {
        throw new UnsupportedOperationException();
    }

    /**
     * Cancels an existing booking.
     * 
     * @param booking The booking to cancel.
     */
    public void cancelBooking(Booking booking) {
        throw new UnsupportedOperationException();
    }

    /**
     * Views the booking history of the renter.
     * 
     * @return A list of the renter's previous bookings.
     */
    public List<Booking> viewBookingHistory() {
        throw new UnsupportedOperationException();
    }

    /**
     * Leaves a review for a property.
     * 
     * @param property The property to review.
     * @param review   The review to leave.
     */
    public void leaveReview(Property property, Review review) {
        throw new UnsupportedOperationException();
    }
}
