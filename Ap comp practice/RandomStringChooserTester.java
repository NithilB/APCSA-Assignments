import java.util.*;
public class RandomStringChooserTester {
    public static void main(String[] args) {
		String [] wordArray = {"wheels","on","the","bus"};
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for (int k = 0; k < 6; k++)
			System.out.println(sChooser.getNext() + " ");


		RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
		for (int k = 0; k < 4; k++)
			System.out.println(letterChooser.getNext() + " ");

	}
}

class RandomLetterChooser extends RandomStringChooser{

	public RandomLetterChooser(String str){
		super(getSingleLetters(str));
	}

	public static String[] getSingleLetters(String str){
		String[] out = new String[str.length()];
		for (int i = 0; i < str.length(); i++)
			out[i] = str.charAt(i) + "";
		return out;
	}
}

class RandomStringChooser{

	private ArrayList<String> arr;

	public RandomStringChooser(String[] word){
		arr = new ArrayList<String>();
		for(int r = 0; r < word.length; r++){
			arr.add(word[r]);
		}
	}

	public String getNext(){
		if(arr.size() > 0){
		int x =(int)(Math.random() * arr.size());
		String w = arr.get(x);
		arr.remove(x);
		return w;
		}
		return "NONE";
	}

}