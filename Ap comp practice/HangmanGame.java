public class HangmanGame{

	private String word;
	private StringBuffer length;
	private StringBuffer letters;

public HangmanGame(String ans){
	word = ans;
	letters = new StringBuffer();
	String yeet = "";
	for (int y = 0; y < word.length(); y++){
		yeet += "-";
	}
	length = new StringBuffer(yeet);
}

public String getWord(){
	return word;
}

public String getGuessed(){
	return length.toString();
}

public String getTried(){
	return letters.toString();
}



public int tryLetter(char letter){
int w = 0;
char a;
for(int x = 0; x < letters.length(); x++){
	a = letters.charAt(x);
	if (letter == Character.toLowerCase(a)){
		return 0;
	}
}

if (word.indexOf(letter) >= 0){
 int index = word.indexOf(letter);
  while (index != -1 && index < word.length()){
	length.setCharAt(index, letter);
	index = word.indexOf(letter,index+1);
	}
	letters = letters.append(letter);
	return 1;
} else if(word.indexOf(letter) == -1){
	letters = letters.append(letter);
	return -1;
}

return -1;
}



}