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
public class Probability {
    private int timeBetweenArrival;
    private int actualProbability;
    private int inferiorLimit;
    private int superiorLimit;

    public Probability(int timeBetweenArrival, int actualProbability, int superiorLimit) {
        this.timeBetweenArrival = timeBetweenArrival;
        this.actualProbability = actualProbability;
        this.superiorLimit = superiorLimit - 1;
    }

    public int getTimeBetweenArrival() {
        return timeBetweenArrival;
    }

    public void setTimeBetweenArrival(int timeBetweenArrival) {
        this.timeBetweenArrival = timeBetweenArrival;
    }

    public int getActualProbability() {
        return actualProbability;
    }

    public void setActualProbability(int actualProbability) {
        this.actualProbability = actualProbability;
    }

    public int getInferiorLimit() {
        return inferiorLimit;
    }

    public void setInferiorLimit(int inferiorLimit) {
        this.inferiorLimit = inferiorLimit;
    }

    public int getSuperiorLimit() {
        return superiorLimit;
    }

    public void setSuperiorLimit(int superiorLimit) {
        this.superiorLimit = superiorLimit;
    }

}
