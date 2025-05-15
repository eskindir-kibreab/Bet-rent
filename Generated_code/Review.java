package test;

import java.util.Date;

public class Review {

    private String reviewId;
    private Date reviewDate;
    private String reviewText;
    private int rating;

    public Review(String reviewText, int rating) {
        this.reviewText = reviewText;
        this.rating = rating;
        this.reviewDate = new Date(); // Initialize with current date
    }

    // Getter and Setter methods
    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
