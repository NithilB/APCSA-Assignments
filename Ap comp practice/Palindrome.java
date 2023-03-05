public class Palindrome{
  public static boolean isPalindrome(String input){
	char a;
	char b;
	int z = input.length();
	int x = -1;
	boolean c = false;

	for(int h = 0; h < input.length() && z>0 && x < input.length() - 1; h++){
		z--;
		x++;
		a = input.charAt(z);
		b = input.charAt(x);

		//checks for letter or digit of a
		while (Character.isLetterOrDigit(a)==false){
		z--;
		a = input.charAt(z);
	    }

		// checks for letter or digit of b
		while (Character.isLetterOrDigit(b)==false){
		x++;
		b = input.charAt(x);
	    }

		// returns wether or not it works
		if (Character.toLowerCase(a) == Character.toLowerCase(b)){
			c = true;
		} else {
			c = false;
			break;
		}
	}

if (c == true){
	return true;
}
return false;



}
}