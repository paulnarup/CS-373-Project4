package main.model;

import main.client.Facility;
import main.client.FacilityVisitor;

import java.util.ArrayList;

public class Compound implements Facility {
    String name;
    int numBuildings;
    ArrayList<Building> buildings;


    public Compound(){
        buildings = new ArrayList<>();
    }

    @Override
    public void accept(FacilityVisitor facilityVisitor){
        facilityVisitor.visit(this);

        for(Building building : buildings){
            building.accept(facilityVisitor);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumBuildings() {
        return numBuildings;
    }

    public void setNumBuildings(int numBuildings) {
        this.numBuildings = numBuildings;
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }
}
