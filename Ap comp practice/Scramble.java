import java.util.Scanner;

public class Scramble{

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String word = input.next();

	word = word.toUpperCase();
	for (int i = 0; i < word.length() - 1; i++){
		if(word.substring(i,i+1).equals("A") && !(word.substring(i+1,i+2).equals("A"))){
			word = word.substring(0,i) + word.substring(i+1,i+2) + "A" + word.substring(i+2);
			i++;
		}
	}
	System.out.println("word is : " + word);
}
}



