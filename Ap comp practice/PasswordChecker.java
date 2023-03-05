import java.util.*;

public class PasswordChecker{

 public static void main( String [] args ){

    Scanner keyboard = new Scanner(System.in);

    String password = "";
    System.out.println("Write a password that contains\n1. Has at least 7 characters\n2. both upper and lowercase letters\n3. contains at least one digit\n4. Starts with a letter\n5. doesn't contain spaces or punctuation marks");
    keyboard.nextLine();

for(int g = 0; g <= password.length(); g++){
//1
    while (password.length() < 7){
      System.out.println("Write your password again");
      password = keyboard.nextLine();
	}

//2
 int y = 0, z = 0;
 char pass;
 //
 for(int x = 0; x < password.length();x++){
    pass = password.charAt(x);

    if (Character.isUpperCase(pass)){
      y = 1;
	}
    if (Character.isLowerCase(pass)){
	  z = 1;
    }

}
  if (y != 1 || z != 1){
	  System.out.println("Write your password again");
      password = keyboard.nextLine();
  }

//3
int n = 0, b = 0;
String word;
//
for(int a = 0; a < password.length(); a++){
    word = password.substring(a,a+1);
    try{
    n = Integer.parseInt(word);
    }
	catch(NumberFormatException ex){
	  b = 0;
	}
 if (n > 0){
	b = 1;
}
	word = "";
}

if (b == 0){
  System.out.println("Write your password again");
  password = keyboard.nextLine();
}

//4
int q = 0, h = 0;
String first;
//
first = password.substring(0,1);
try{
q = Integer.parseInt(first);
} catch(NumberFormatException ex){
	h = 0;
}
if (q > 0){
	h = 1;
}
if (h == 1){
  System.out.println("Write your password again");
  password = keyboard.nextLine();
}


//5
char punc;
//
 for(int l = 0; l < password.length(); l++){
    punc = password.charAt(l);
    if(Character.isLetterOrDigit(punc) == false || Character.isWhitespace(punc) == true){
		  System.out.println("Write your password again");
          password = keyboard.nextLine();
	}

}

}




}
}