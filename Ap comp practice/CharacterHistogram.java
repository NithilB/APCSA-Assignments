public class CharacterHistogram{
	public static void generateHistogram(String input){

	String dictionary = "abcdefghijklmnopqrstuvwxyz0123456789";
	String a = "";
	String b = "";
	int y = 0;

	for(int z = 0; z < input.length(); z++){
		b = dictionary.substring(z,z+1);
		for(int x = 0; x < dictionary.length(); x++){
	   		a = input.substring(x,x+1);
			if (b.equalsIgnoreCase(a)){
			y++;
	    	}

	}
	System.out.println(b + " " + y);
	a = "";
	b = "";
	y = 0;
  }



}
}