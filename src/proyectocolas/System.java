/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolas;

import java.util.ArrayList;

/**
 *
 * @author LABAM
 */
public class System {
    private int timeModel;
    private boolean[] serverStatus;
    private int waitingLength;
    private Event history;
    
    public System(){
        this.timeModel = 0;
        this.serverStatus = null;
        this.waitingLength = 0;
    }

    public System(int timeModel, int numServers, int waitingLength, Event history) {
        this.timeModel = timeModel;
        this.serverStatus = new boolean[numServers];
        this.waitingLength = waitingLength;
        this.history = history;
    }
       
    public int getTimeModel() {
        return timeModel;
    }

    public void setTimeModel(int timeModel) {
        this.timeModel = timeModel;
    }

    public boolean[] getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(boolean[] serverStatus) {
        this.serverStatus = serverStatus;
    }

    public Event getHistory() {
        return history;
    }

    public void setHistory(Event history) {
        this.history = history;
    }

    public int getWaitingLength() {
        return waitingLength;
    }

    public void setWaitingLength(int waitingLength) {
        this.waitingLength = waitingLength;
    }
    
}

