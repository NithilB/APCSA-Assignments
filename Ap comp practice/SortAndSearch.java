import java.util.*;
public class SortAndSearch{

  private static String[] names = {"Suzy Mazza","Rogelio Devalle","Lawanda Lease","Rickey Capshaw","Harris Oakes","Pasty Rew","Buck Zachery","Marietta Moulder","Natalya Broadus",
    "Shoshana Muldowney","Shirlee Morrison","Octavia Kouba","Brendon Amsden","Norberto Schoemaker","Erna Artman","Desmond Alper","Cyril Repka","Elayne Kendra","Ailene Weve",
    "John Swallow","Retha Regan","Deeanna Blosser","Velvet Stanger","Anya Zollinger","Marvella Laforge","Laure Karam","Carli Soares","Casandra Dellinger","Jamal Edlin","Lenard Karas",
    "Ranae Christon","Keiko Lockamy","Fransisca Ornellas","Claretta Dopp","Aletha Chancy","Tamekia Reuss","Marybelle Canterbury","Pearlene Shehan","Sharan Baker","Yong Rousey",
    "Shantell Leto","Leida Brigman","Ethyl Shier","Deborah Mendelson","Willy Cuadrado","Lorine Ratcliff","Neville Feder","Pattie Morefield","Sabine Leiker","Marquetta Silliman",
    "Woodrow Kersten","Caren Marra","Li Sabat","Lashandra Crank","Jennine Best","Cristine Pasco","Kennith Ferrero","Richard Englund","Jonas Waldrep","Ailene Scarberry",
    "Sterling Wensel","Janett Romney","Lindy Kyser","Irwin Mceuen","Dannette Villalvazo","Ngoc Irizarry","Clair Dealba","Veola Huth","Graciela Hohlt","Felisa Albarado",
    "Dakota Wrede","Mozell Dreier","Alena Mechling","Temeka Dutta","Trudy Chamblee","Emma Velez","Orval Elliot","Leonore Kirklin","Kaycee Hughley","Alesia Elsey","Madeline Barrows",
    "Darrel Prescott","Brandy Lorentzen","Bernard Lanigan","Michale Combes","Shondra Barish","Verna Gleason","Marci Hanlon","Jeanmarie Barner","Everette Peiffer",
    "Taneka Mobley","Bernadine Branson","Sasha Battey","Almeda Waltz","Jacklyn Faunce","Hilton Mcgivney","Rosetta Salamone","Shelton Pellett","Gillian Mitchel","Kathline Riggan"};

  public static void main (String[] args){
	String[] n = new String[names.length];
	for(int r = 0; r < names.length; r++){
		n[r] = formatName(names[r]);
	}

	ArrayList<String> list = sort(n);

	System.out.println("The location of (Elsey, Alesia) is at index " + binarySearch(list,"Elsey, Alesia"));
	System.out.println("The location of (Waldrep, Jonas) is at index " + binarySearch(list,"Waldrep, Jonas"));
	System.out.println("The location of (Dingus, James) is at index " + binarySearch(list,"Dingus, James"));

  }

  public static String formatName(String s){
	 int i = s.indexOf(" ");
	 String str = s.substring(i+1, s.length());
	 return str + ", " + s.substring(0,i);

  }

  public static ArrayList<String> sort(String[] arr){
	  ArrayList<String> list = new ArrayList<String>(arr.length);
	  for(int i = 0; i < arr.length; i++){
	  	for(int r = 0; r < arr.length; r++){
		  if(arr[r].compareTo(arr[i]) < 0){
			  String m = arr[i];
			  arr[i] = arr[r];
			  arr[r] = m;
		  }
	  	}
	  }

	  for(int r = arr.length - 1; r > 0; r--){
		  list.add(arr[r]);
	  }

	  return list;
  }

  public static int binarySearch(ArrayList<String> list, String str){
	  int left = 0;
	  int right = list.size() - 1;
	  while(left <= right){
		  int middle = (left + right) / 2;
		  if(list.get(middle).equals(str)){
			  return middle;
		  } else if(list.get(middle).compareTo(str) > 0 ) {
			  right = middle - 1;
		  } else {
			  left = middle + 1;
		  }
	  }
		  return -1;
  }

}