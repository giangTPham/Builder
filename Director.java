public class Director {
  HouseBuilder builder;
  public Director(HouseBuilder builder) {
    this.builder = builder;
  }
  public void changeBuilder(HouseBuilder builder) {
    this.builder = builder;
  }
  public void maketype(String type) {
    if (type == "normal") {
      this.builder.buildWalls(4);
      this.builder.buildDoors(1);
      this.builder.buildWindows(1);
      this.builder.buildRoof();
    }
    if (type == "classy") {
      this.builder.buildWalls(10);
      this.builder.buildDoors(10);
      this.builder.buildWindows(10);
      this.builder.buildRoof();
      this.builder.buildGarage(10);
    }
  }
}