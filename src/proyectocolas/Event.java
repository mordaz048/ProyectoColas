/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolas;

/**
 *
 * @author LABAM
 */
public class Event {
    private int eventNumber;
    private char eventType;
    private Client client;
    private int arrivalTime;
    private int departureTime;

    public Event(int eventNumber, char eventType, Client client, int arrivalTime, int departureTime) {
        this.eventNumber = eventNumber;
        this.eventType = eventType;
        this.client = client;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public int getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(int eventNumber) {
        this.eventNumber = eventNumber;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(char eventType) {
        this.eventType = eventType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }
    
    
}
