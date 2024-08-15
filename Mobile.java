class Mobile{
  String brand;
  double price;
  String color;

// Mobile constructor
public Mobile(String brand, double price, String color) {
  this.brand = brand;
  this.price = price;
  this.color = color;
}
@Override
public String toString() {
  String s = brand + "  " + price + "  " + color;
  return s;
}
public static void main(String[] args) {
  Mobile m1 = new Mobile("oppo", 1000000, "red");
  Mobile m2 = new Mobile("vivo", 1000, "blue");
  Mobile m3= new Mobile("redmi", 10000, "black");
  Mobile m4 = new Mobile("nothing", 1000000, "white");
  Mobile m5 = new Mobile("one plues", 100000, "green");

  System.out.println(m1);
  System.out.println(m2);
  System.out.println(m3);
  System.out.println(m4);
  System.out.println(m5);
}
}