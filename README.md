# CS-373-Project4

### Visitor Pattern 
The visitor pattern is implemented in this project to move the operational logic from each individual class into one class- FacilityDisplayVisitor. This allows for code to be well organized and if changes need to be made, they only need to be made in the visitor class. For example, to change a building number from the list in Compound, the logic only needs to be applied to the visit building method in FacilictyDisplayVisitor. This will apply the logic everytime a building is visited.If a new object needs to be added it will only require an addition in the visitor interface. 
