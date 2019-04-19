package main;

import main.client.Facility;
import main.model.*;

public class demo {
    public static void main(String[] args){
        Compound compound = new Compound();
        Building building = new Building();
        Floor floor = new Floor();
        Room room = new Room();

        compound.setName("C1");
        compound.setNumBuildings(2);

        floor.setBuilding(building);
        floor.setFloorNum(1);
        floor.setNumRooms(2);

        room.setFloor(floor);
        room.setRoomNum(1);

        building.setBuilidingNum(1);
        building.setCompound(compound);
        building.setName("B1");
        building.setNumFloors(5);
        building.addBuildingToCompound(building);

        Building building2 = new Building();
        building2.setBuilidingNum(2);
        building2.setCompound(compound);
        building2.setName("B2");
        building2.setNumFloors(5);
        building2.addBuildingToCompound(building2);

        compound.accept(new FacilityDisplayVisitor());
        floor.accept(new FacilityDisplayVisitor());
        room.accept(new FacilityDisplayVisitor());
    }
}
