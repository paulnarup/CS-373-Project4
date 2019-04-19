package main.model;

import main.client.FacilityVisitor;

public class FacilityDisplayVisitor implements FacilityVisitor {
    @Override
    public void visit(Compound compound){
        System.out.println("Visit compound: " + compound.getName());
    }

    @Override
    public void visit(Building building){
        if(building.getBuilidingNum()==2){
            building.setBuilidingNum(20);
        }
        System.out.println("Visit building: " + building.getBuilidingNum());
    }

    @Override
    public void visit(Floor floor){
        System.out.println("Visit floor: " + floor.getFloorNum());
    }

    @Override
    public void visit(Room room){
        System.out.println("Visit room: " + room.getRoomNum());
    }
}
