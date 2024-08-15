class Account{
  String AccountHolderName;
  double price;
  long acNumber;

// Account constructor
public Account(String AccountHolderName, double price, long acNumber) {
  this.AccountHolderName = AccountHolderName;
  this.price = price;
  this.acNumber = acNumber;
}
@Override
public String toString() {
  String s = AccountHolderName + "  " + price + "  " + acNumber;
  return s;
}
public static void main(String[] args) {
  Account a1 = new Account("santhosh", 1000000, 1234);
  Account a2 = new Account("srikanth", 1000, 134);
  Account a3= new Account("karthick", 10000, 1234);
  Account a4 = new Account("vishwa", 1000000, 14);
  Account a5 = new Account("poo", 100000, 12345);

  System.out.println(a1);
  System.out.println(a2);
  System.out.println(a3);
  System.out.println(a4);
  System.out.println(a5);
}
}