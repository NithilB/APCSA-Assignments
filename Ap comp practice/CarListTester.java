/*
 * Programmer:    Kevin Streib
 * Date:          November 18, 2013
 * Assignment:    Lab 10.4 - CarList
 * File Name:     CarListTester.Java
 * Description:   This is a wrapper program to test the methods of CarList.java
 *
 */
import java.util.*;
public class CarListTester{
	public static void main(String[] args){
		CarList list = new CarList(2);

		System.out.println("Increase Inventory: ");
		list.increaseInventory();

		System.out.println("Print Inventory: ");
		list.printInventory();

		Car oldest = list.getOldestCar();
		Car leastDriven = list.getCarWithLowestMileage();
		Car mostExpensive = list.getMostExpensiveCar();

		System.out.println("\nOldest Car: " + oldest.toString());
		System.out.println("Least Driven Car: " + leastDriven.toString());
		System.out.println("Most Expensive Car: " + mostExpensive.toString());

		System.out.println("\nPurchase Least Driven Car:");
		list.purchaseCar(leastDriven.getVin());

		System.out.println("\nPrint Inventory: ");
		list.printInventory();

	}
}


class CarList{
	// implement your code here
private ArrayList<Car> inventory;

public CarList(int n){
	inventory = new ArrayList<Car>(n);
	for(int r = 0; r < n; r++){
		//System.out.println(n);
		increaseInventory();
	}
}

public void increaseInventory(){
	Scanner keyboard = new Scanner(System.in);

	System.out.println("print vin");
	String vin = keyboard.next();

	System.out.println("print model");
	String model = keyboard.next();

	System.out.println("print year");
	int year = keyboard.nextInt();

	System.out.println("print mileage");
	int mileage = keyboard.nextInt();

	System.out.println("print price");
	int price = keyboard.nextInt();

	Car n = new Car(vin, model, year, mileage, price);
	inventory.add(n);
}

public void printInventory(){
	System.out.println(inventory);
}

public Car getOldestCar(){
int x = inventory.get(0).getModelYear();
Car t = null;
	for(int r = 0; r < inventory.size(); r++){
		if(inventory.get(r).getModelYear() < x){
			x = inventory.get(r).getModelYear();
			t = inventory.get(r);
		} else {
			t = inventory.get(0);
		}
	}

	return t;
}

public Car getCarWithLowestMileage(){
int x = inventory.get(0).getMileage();
Car t = inventory.get(0);
	for(int r = 0; r < inventory.size(); r++){
		if(inventory.get(r).getMileage() < x){
			x = inventory.get(r).getMileage();
			t = inventory.get(r);
		}
	}
	return t;
}

public Car getMostExpensiveCar(){
int x = inventory.get(0).getPrice();
Car t = inventory.get(0);
	for(int r = 0; r < inventory.size(); r++){
		if(inventory.get(r).getPrice() > x){
			x = inventory.get(r).getPrice();
			t = inventory.get(r);
		}
	}
	return t;

}

public void purchaseCar(String v){
int x = inventory.size();

if(inventory.size() < x){
	System.out.println("That Car is not in the inventory");
}

for(int r = 0; r < inventory.size(); r++){
	if(v.equals(inventory.get(r).getVin())){
	inventory.remove(r);
	System.out.println("You bought a car");
	}
}

}


}

class Car{
  // initialize fields
  private int modelYear;
  private String make;
  private int price;
  private int mileage;
  private String vin;
  // construct Car object with specified values
  public Car (String v, String type, int year, int miles, int cost){
    vin = v;
    modelYear = year;
    make = type;
    price = cost;
    mileage = miles;
  }
  // accessor methods
  public String getVin(){
	  return vin;
  }

  public int getModelYear() {
    return modelYear;
  }

  public String getMake(){
    return make;
  }

  public int getPrice(){
    return price;
  }

  public int getMileage(){
      return mileage;
  }
  // toString method
  public String toString(){
	  return "Vin# " + vin + ": " + modelYear + " Make: " + make + " with " + mileage + " miles: $" + price;
  }

}
