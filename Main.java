class Main {
  public static void main(String[] args) {

    // director with stone builder
    HouseBuilder builder = new StoneHouseBuilder();
    Director director = new Director(builder);
    director.maketype("classy");
    House h = builder.getResult();
    System.out.println(h.doors);

    //switch type of builder
    HouseBuilder builder1 = new BrickHouseBuilder();
    director.changeBuilder(builder1);
    director.maketype("normal");
    House h1 = builder1.getResult();
    System.out.println(h1.doors);
  }
}