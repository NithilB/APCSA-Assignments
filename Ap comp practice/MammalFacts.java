public class MammalFacts{
	public static void main(String[] args){
		Mammal[] arr = new Mammal[3];

		arr[0] = new Mammal();
		arr[1] = new Primate();
		arr[2] = new Chimpanzee();

		for(int r = 0; r < arr.length; r++){
			System.out.println("\n" + arr[r].funFact());
		}

	}
}

class Mammal{

	public String funFact(){
		return "A Platypus is the only mammal that lays eggs.";
	}


}

class Primate extends Mammal{

	public String funFact(){
		return "The largest living primate is the eastern lowland gorilla.";
	}

}

class Chimpanzee extends Primate{

	public String funFact(){
		return "Humans and chimpanzees share 95 to 98 percent of the same DNA.";
	}

}

