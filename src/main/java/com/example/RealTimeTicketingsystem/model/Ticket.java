package com.example.RealTimeTicketingsystem.model;

public class Ticket {
    private int id;
    private String eventName;
    private double price;

    public Ticket(int id ,String eventName, double price){
        this.id =id;
        this.eventName = eventName;
        this.price =price;
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
