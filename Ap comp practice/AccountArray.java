public class AccountArray{
	public static void main(String[] args){

	Account[] arr = new Account[10];

	for(int r = 0; r < 5; r++){
		arr[r] = new Checking(r + 100, (r+1)*1000);
	}

	for(int c = 5; c < 10; c++){
		arr[c] = new Savings(c + 100, (c+1)*1000, 0.02);
	}

	for(int x = 0; x < 10; x++){
		System.out.print(arr[x].toString());
		System.out.println("Interest earned: " + arr[x].computeInterest(2) + "\n");
	}

	}
}

abstract class Account{
	private int accnum;
	private double balance;

	public Account(int a, double b){
		accnum = a;
		balance = b;
	}

	public int getAccNum(){
		return accnum;
	}
	public double getBalance(){
		return balance;
	}

	public void setAccNum(int x){
		accnum = x;
	}
	public void setBalance(double y){
		balance = y;
	}

	public String toString(){
		return "Account # = " + accnum +"\nAccount Balance = " + balance + "\n";
	}

	public abstract double computeInterest(int i);

}

class Checking extends Account{
	public Checking(int a, double b){
		super(a,b);
	}

	public String toString(){
		return "Checking\n" + super.toString();
	}

	public double computeInterest(int i){
		double n = i / 100.0;
		n *= (getBalance() - 700) * 3;
		return Math.round(n * 100) / 100.0;
	}
}

class Savings extends Account{
	private double interest;
	public Savings(int a, int b, double c){
		super(a,b);
		interest = c;
	}
	public double getInterest(){
		return interest;
	}
	public void setInterest(double i){
		interest = i;
	}

	public String toString(){
		return "Savings\n" + super.toString();
	}

	public double computeInterest(int i){
		double x = getBalance() * (Math.pow((1 + interest),3) - 1);
		return Math.round(x * 100) / 100.0;
	}

}