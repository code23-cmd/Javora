public class Car{
  String Car_Company;
  String Model;
  String Fuel_Type;
  double Price;

Car(){
	System.out.println("\n--Default Constructor--");
  }

Car(String Car_Company,String Model,String Fuel_Type,double Price){
  this.Car_Company = Car_Company;
  this.Model = Model;
  this.Fuel_Type = Fuel_Type;
  this.Price = Price;
  System.out.println("\n--Parameterized Constructor--");
  }

Car(String Car_Company,String Model) {
  this.Car_Company = Car_Company;
  this.Model = Model;
  System.out.println("\n--Constructor with comapny and model--");
  }

 void display_details(){
  System.out.println("Car Company :" + Car_Company);
  System.out.println("Car Model :" + Model);
  System.out.println("Car Type :" + Fuel_Type);
 System.out.println("Car Price :" + Price);
 }

public static void main(String args[]){

Car c1 = new Car();
  c1.display_details();

Car c2 = new Car("Toyota" , "Corolla");
  c2.display_details();

Car c3 = new Car("Toyota", "Corolla","Petrol",100000);
 c3.display_details();

 }
}



