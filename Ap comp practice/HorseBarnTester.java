import java.util.*;
public class HorseBarnTester {
    public static void main(String[] args) {
		Horse[] h = new Horse[7];
		h[0] = new ActualHorse("Trigger",1340);
		h[2] = new ActualHorse("Silver",1210);
		h[5] = new ActualHorse("Patches",1350);
		h[6] = new ActualHorse("Duke",1410);
		HorseBarn sweetHome = new HorseBarn(h);

		System.out.println("\n\n" + sweetHome + "\n\n");

		System.out.println(sweetHome.findHorseSpace("Trigger"));
		System.out.println(sweetHome.findHorseSpace("Silver"));
		System.out.println(sweetHome.findHorseSpace("Coco"));


		sweetHome.consolidate();
		System.out.println("\n\n" + sweetHome);

	}
}

class ActualHorse implements Horse{
	String name;
	int weight;

	public ActualHorse(String n, int w){
		name = n;
		weight = w;
	}

	public String getName(){ return name; }
	public int getWeight() { return weight; }
}

interface Horse{
	String getName();
	int getWeight();
}

class HorseBarn{
	private Horse[] spaces;

	public HorseBarn(Horse[] h){
		spaces = h;
	}

	public int findHorseSpace(String name){
		for(int r = 0; r < spaces.length; r++){
			if(spaces[r] != null && spaces[r].getName().equals(name)){
				return r;
			}
		}
		return -1;

	}

	public void consolidate(){
		ArrayList<Horse> arr = new ArrayList<Horse>();
		for(int r = 0; r < spaces.length; r++){
			if(spaces[r] != null){
				arr.add(spaces[r]);
			}
		}
		for(int c = 0; c < spaces.length; c++){
			spaces[c] = null;
		}
		for(int i = 0; i < arr.size(); i++){
			spaces[i] = arr.get(i);
		}

	}

	public String toString(){
		String out = "";
		for (Horse h:spaces){
			if (h == null)
				out += "null\n";
			else
				out += "\"" + h.getName() + "\" - " + h.getWeight() + "\n";
		}
		return out;
	}
}