import java.util.*;
public class RemoveVowelTester{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please type a word");
		String x = keyboard.nextLine();
		System.out.println(removeVowels(x));




	}

	public static String removeVowels(String n){

		if(n.length() < 1){
			return n;
		}

		String x = n.substring(0,1);
		if(x.equalsIgnoreCase("a") || x.equalsIgnoreCase("e") || x.equalsIgnoreCase("i") || x.equalsIgnoreCase("o") || x.equalsIgnoreCase("u")){
			return removeVowels(n.substring(1));
		} else {
			return x + removeVowels(n.substring(1));
		}

	}
}