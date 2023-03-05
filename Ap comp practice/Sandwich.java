public class Sandwich{

	private String bread;
	private String meat;
	private String cheese;
	private double price;
	private int calories;

public Sandwich(){
	bread = selectBread();
	meat = selectMeat();
	cheese = selectCheese();

}

public String selectBread(){
	String [] bread = {"White Bread","Wheat Bread","Whole Grain Bread","Rye Bread","Flat Bread"};
	int [] r = {132,132,138,166,165};
	int rand = (int)(Math.random() * 5);
	calories += r[rand];
	if(bread[rand].equals("Flat Bread")){
		price += 3.25;
	} else {
		price += 2.50;
	}
	return bread[rand];

}

public String selectMeat(){
	String [] meat = {"Ham","Roast Beef","Chicken","Turkey","Tuna Salad"};
	int [] r = {91,66,44,42,105};
	int ra = (int)(Math.random()*5);
	calories += r[ra];
	if(meat[ra].equals("Roast Beef")){
		price += 1.00;
	}
	return meat[ra];

}

public String selectCheese(){
	String [] cheese = {"Swiss Cheese","American Cheese","Colby Cheese","Cheddar Cheese","Provolone Cheese"};
	int [] r = {106,94,110,113,98};
	int ran = (int)(Math.random()*5);
	calories += r[ran];
	return cheese[ran];

}

public String getBread(){
	return bread;
}

public String getMeat(){
	return meat;
}

public String getCheese(){
	return cheese;
}

public double getPrice(){
	return price;
}

public int getCalories(){
	return calories;
}




}