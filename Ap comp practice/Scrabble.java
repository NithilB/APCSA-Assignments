import java.util.*;
public class Scrabble{
   public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("please type in a word");
	String w = keyboard.nextLine();
	Scrabble d = new Scrabble();
	System.out.println("The word " + w + " is worth " +  d.computerScore(w) + " points.");
}

private String letters = "abcdefghijklmnopqrstuvwxyz";
private int [] numbers = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,3,3,10,1,1,1,1,4,4,8,4,10};

public int computerScore(String word){
	char s = ' ';
	int a = 0;
	for(int x = 0; x < word.length(); x++){
	s = word.charAt(x);
	a += numbers[letters.indexOf(s)];
	}
	return a;
}


}