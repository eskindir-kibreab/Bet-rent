package test;

import java.util.Date;
import java.io.File;  // Import the File class

public class Receipt {

    private String receiptId;
    private Date issuedDate;

    public Receipt() {
        // Constructor to initialize the receipt object
    }

    public void generate() {
        // Simulating receipt generation
        // TODO - implement Reciept.generate
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public File download() {
        // Simulating file download
        // TODO - implement Reciept.download
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Getter for issuedDate
    public Date getIssuedDate() {
        return issuedDate;
    }

    // Getter for receiptId
    public String getReceiptId() {
        return receiptId;
    }
}
