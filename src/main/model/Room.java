package main.model;

import main.client.Facility;
import main.client.FacilityVisitor;

public class Room implements Facility {
    int roomNum;
    Floor floor;

    public Room(){}

    @Override
    public void accept(FacilityVisitor facilityVisitor){
        facilityVisitor.visit(this);
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
