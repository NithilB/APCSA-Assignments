public class PoemTester{
	public static void main(String[] args){
	Poem p = new Haiku();
	p.printRhythm();
	System.out.println();

	p = new Limerick();
	p.printRhythm();
	System.out.println();
	}

}

abstract class Poem{
	public abstract int getNumLines();
	public abstract int getSyllables(int k);

	public void printRhythm(){
		for(int r = 0; r < getNumLines(); r++){
			for(int s = 0; s < getSyllables(r) - 1; s++){
				System.out.print("ta-");
				if(s == getSyllables(r)-2){
					System.out.print("ta");
				}
			}
			System.out.println();
		}

	}

}

class Haiku extends Poem{
	public int getNumLines(){
		return 3;
	}

	public int getSyllables(int k){
		if(k == 1){
			return 7;
		}
		return 5;
	}

}

class Limerick extends Poem{
	public int getNumLines(){
		return 5;
	}

	public int getSyllables(int k){
		if (k == 2 || k == 3){
			return 6;
		}
		return 9;
	}

}