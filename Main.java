package AutoPark;

public class Main {

  public static void main(String[] args) {

    AutoPark taxi7788 = new AutoPark();
    System.out.println(taxi7788.getDrivers().length);
    System.out.println(taxi7788.getGarage().length);

    Car mercedes = new Car();
    mercedes.setBrand("MERCEDES");
    mercedes.setColor("BLUE");
    mercedes.setYear(1999);

    taxi7788.addCar(mercedes);
    System.out.println(taxi7788.getGarage()[0].getBrand());

    Car bmw = new Car("auto", "BMW", "12321sdfdf", "2147-gd4",
        "disel", 2020, true, "yellow", 123123.12);

    taxi7788.addCar(bmw);
    System.out.println(taxi7788.getGarage()[1].getBrand());

  }
}
