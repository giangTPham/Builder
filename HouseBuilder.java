public interface HouseBuilder {
  public void reset();
  public void buildWalls(int number);
  public void buildDoors(int number);
  public void buildWindows(int number);
  public void buildRoof();
  public void buildGarage(int number);
  public House getResult();
}