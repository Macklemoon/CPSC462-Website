package com.example.cat1;

public class payment {
    public float total;
    public float tax;
    public float subTotal;

    public payment() {
    }

    public payment(float total) {
        this.total = total;
    }

    public payment(float total, float tax, float subTotal) {
        this.total = total;
        this.tax = tax;
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "payment{" +
                "total=" + total +
                ", tax=" + tax +
                ", subTotal=" + subTotal +
                '}';
    }
}
