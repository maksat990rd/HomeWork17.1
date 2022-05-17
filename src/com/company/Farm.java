package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;

    public Farm() {}

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm address: " + address +
                ", ownerName: " + ownerName + "\n" +
                ", cows: " + Arrays.toString(cows) + "\n" +
                ", sheeps: " + Arrays.toString(sheeps) + "\n" +
                ", horses: " + Arrays.toString(horses);
    }
}
