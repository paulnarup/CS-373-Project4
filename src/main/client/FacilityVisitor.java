package main.client;

import main.model.Building;
import main.model.Compound;
import main.model.Floor;
import main.model.Room;

public interface FacilityVisitor {
    public void visit(Building building);
    public void visit(Compound compound);
    public void visit(Floor floor);
    public void visit(Room room);
}
