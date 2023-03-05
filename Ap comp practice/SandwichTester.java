import java.util.*;
public class SandwichTester {
	public static void main( String[] args ){
		Sandwich meal;
		int x;
		Scanner keyboard = new Scanner(System.in);

		do{
			meal = new Sandwich();

		System.out.println("For lunch today you will be having a " + meal.getMeat() +
			" sandwich \nwith " + meal.getCheese() + " cheese on " + meal.getBread() + " bread.");

		System.out.println("\n\nYour sandwich costs $" + meal.getPrice() + " and has a total of "
			+ meal.getCalories() + " calories. \n\n\n");

		System.out.println("Enter 1 to generate a new sandwich.");
		x = keyboard.nextInt();
	}while (x == 1);
	}
}