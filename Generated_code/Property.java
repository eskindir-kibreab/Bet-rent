package test;

public class Property {

    private String propertyId;
    private String title;
    private String description;
    private String location;
    private double price;
    private String status;

    // ✅ Minimal added no-arg constructor
    public Property() {
        // No initialization needed unless you want defaults
    }

    /**
     * 
     * @param status
     */
    public void updateStatus(String status) {
        throw new UnsupportedOperationException();
    }
}
