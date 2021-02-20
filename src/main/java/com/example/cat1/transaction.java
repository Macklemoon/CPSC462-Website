package com.example.cat1;

public class transaction {
    //TODO print all transaction history for the USER;
    public String history;
    public String transactionID;
    public String datePurchased;
    public float Total;
    public String userName;

    public transaction() {

    }

    public transaction(String history, String transactionID, String datePurchased, float total, String userName) {
        this.history = history;
        this.transactionID = transactionID;
        this.datePurchased = datePurchased;
        Total = total;
        this.userName = userName;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
