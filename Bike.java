class Bike{
  String brand;
  double price;
  String color;
  double mileage;
  int cc;

// Bike constructor
public Bike(String brand, double price, String color,double mileage,int cc) {
  this.brand = brand;
  this.price = price;
  this.color = color;
  this.mileage = mileage;
  this.cc = cc;
}
@Override
public String toString() {
  String s = brand + "  " + price + "  " + color + "  "+ mileage + "  "+cc;
  return s;
}
public static void main(String[] args) {
  Bike b1 = new Bike("Duke", 1000000, "red",30,200);
  Bike b2 = new Bike("pulser", 1000, "blue",35,125);
  Bike b3= new Bike("hero", 10000, "black",20,200);
  Bike b4 = new Bike("honda", 1000000, "white", 15, 310);
  Bike b5 = new Bike("nija h2r", 100000, "green",10,1000);

  System.out.println(b1);
  System.out.println(b2);
  System.out.println(b3);
  System.out.println(b4);
  System.out.println(b5);
}
}