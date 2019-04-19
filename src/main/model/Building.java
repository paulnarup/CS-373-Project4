package main.model;

import main.client.Facility;
import main.client.FacilityVisitor;

public class Building implements Facility {
    String name;
    int builidingNum;
    int numFloors;
    Compound compound;

    public Building(){

    }

    @Override
    public void accept(FacilityVisitor facilityVisitor){
        facilityVisitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuilidingNum() {
        return builidingNum;
    }

    public void setBuilidingNum(int builidingNum) {
        this.builidingNum = builidingNum;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public Compound getCompound() {
        return compound;
    }

    public void setCompound(Compound compound) {
        this.compound = compound;
    }

    public void addBuildingToCompound(Building building){
        compound.addBuilding(building);
    }
}
