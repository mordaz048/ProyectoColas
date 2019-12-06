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
public class Client {
    private int clientNumber;
    private int timeBetweenArrival;
    private int serviceTime;
    private boolean inQueue;
    private boolean inServer;
    private boolean hasFinished;

    public Client(){
        this.clientNumber = 0;
        this.timeBetweenArrival = 0;
        this.serviceTime = 0;
        this.inQueue = false;
        this.inServer = false;
        this.hasFinished = false;
    }
    
    public Client(int clientNumber, int timeBetweenArrival, int serviceTime, boolean inQueue, boolean inServer, boolean hasFinished) {
        this.clientNumber = clientNumber;
        this.timeBetweenArrival = timeBetweenArrival;
        this.serviceTime = serviceTime;
        this.inQueue = inQueue;
        this.inServer = inServer;
        this.hasFinished = hasFinished;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public int getTimeBetweenArrival() {
        return timeBetweenArrival;
    }

    public void setTimeBetweenArrival(int timeBetweenArrival) {
        this.timeBetweenArrival = timeBetweenArrival;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }

    public boolean isInServer() {
        return inServer;
    }

    public void setInServer(boolean inServer) {
        this.inServer = inServer;
    }

    public boolean isHasFinished() {
        return hasFinished;
    }

    public void setHasFinished(boolean hasFinished) {
        this.hasFinished = hasFinished;
    }
    
    
}
