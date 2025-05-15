package test;

import java.util.List;

public class Owner extends User {

    public void listProperty(Property property) {
        throw new UnsupportedOperationException();
    }

    public void updateProperty(Property property) {
        throw new UnsupportedOperationException();
    }

    public void removeProperty(Property property) {
        throw new UnsupportedOperationException();
    }

    public void approveBooking(Booking booking) {
        throw new UnsupportedOperationException();
    }

    public void rejectBooking(Booking booking) {
        throw new UnsupportedOperationException();
    }

    public List<Booking> viewBookings() {
        throw new UnsupportedOperationException();
    }
}
