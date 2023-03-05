import java.util.*;
import java.io.*;

public class CreateIndex{
  public static void main(String[] args) throws IOException{
    Scanner keyboard = new Scanner(System.in);
    String fileName;


    // Open input file:

    if (args.length > 0)
      fileName = args[0];
    else
    {
      fileName = "dream.txt";
    }


    File inputFile = new File(fileName);
    Scanner in = new Scanner(inputFile);

    // Create output file:
    if (args.length > 1)
      fileName = args[1];
    else{
      fileName = "index.txt";
    }

    PrintWriter outputFile =
                 new PrintWriter(new FileWriter(fileName));


    String word;
	ArrayList <Index> obj = new ArrayList<Index>(535);
    while(in.hasNext()){//inputFile.hasNext( )){
      	word = in.next();//inputFile.next();
		// Start your code here
		word = word.trim();
		word = word.toLowerCase();
 		for(int x = word.length()/2; x < word.length(); x++){
			if (Character.isLetter(word.charAt(x)) == false){
				word = word.substring(0,x).concat(word.substring(x+1,word.length()));
			}
		}
		if(word.length() == 0){
			continue;
		}
		if(obj.size() == 0){
			obj.add(new Index(word));
			continue;
		}
		int y = 0;
		boolean u = false;
		for(int a = 0; a < obj.size(); a++){
			if(obj.get(a).getWords().equalsIgnoreCase(word)){
				u = true;
				y = a;
				break;
			}
		}

		if(u == true){
			obj.get(y).increaseIndex();
		} else {
			int cnt = -1;
			for(int i = 0; i < obj.size(); i++){
				if(word.compareTo(obj.get(i).getWords()) < 0){
					cnt = i;
					break;
				}
			}
			if (cnt == -1){
				cnt = obj.size();
				obj.add(cnt, new Index(word));
			} else {
				obj.add(cnt, new Index(word));
			}
		}

    }

int z = obj.get(0).getIndex();
int r = 0;
	for(int n = 0; n < obj.size(); n++){
		if(z < obj.get(n).getIndex()){
			z = obj.get(n).getIndex();
			r = n;
		}
	}
System.out.println("There are 535 unique words in the speech.");
System.out.println("The most common word is " + obj.get(r).getWords() + ", which appears " + z + " times.");



    // pass in a String to the method call below to add a line to your index.txt file
    for(int t = 0; t < obj.size(); t++){
    outputFile.println(obj.get(t).getWords() + " " + obj.get(t).getIndex());
	}


	// close the output file
   outputFile.close();

  }
}

class Index{
	private String words;
	private int index;

	public Index(String word){
		words = word;
		index = 1;
	}

	public String getWords(){
		return words;
	}

	public int getIndex(){
		return index;
	}

	public void increaseIndex(){
		index++;
	}
}
