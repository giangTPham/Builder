public class BrickHouseBuilder implements HouseBuilder {
  private BrickHouse house;
  public BrickHouseBuilder() {
    this.house = new BrickHouse();
  }
  public void reset() {
    this.house = new BrickHouse();
  }
  public void buildWalls(int number){
    this.house.walls = number;
  }
  public void buildDoors(int number){
    this.house.doors = number;
  }
  public void buildWindows(int number){
    this.house.windows = number;
  }
  public void buildRoof(){
    this.house.hasRoof = true;
  }
  public void buildGarage(int number){
    this.house.garage = number;
  }
  public House getResult() {
    BrickHouse home = house;
    this.reset();
    return home;
  }
}