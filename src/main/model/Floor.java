package main.model;

import main.client.Facility;
import main.client.FacilityVisitor;

public class Floor implements Facility {
    int numRooms;
    int floorNum;
    Building building;

    public Floor(){}

    @Override
    public void accept(FacilityVisitor facilityVisitor){
        facilityVisitor.visit(this);
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
