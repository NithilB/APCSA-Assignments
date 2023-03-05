public class DiplomaTester{
	public static void main(String[] args){

	Diploma d1 = new Diploma("Murray Smith","Gardening");
	System.out.println(d1);
	System.out.println();

	Diploma d2 = new DiplomaWithHonors("Lisa Smith","Evolutionary Psychology");
	System.out.println(d2);

	}
}

class Diploma{
private String name;
private String course;

public Diploma(String n, String w){
	name = n;
	course = w;
}

public String toString(){
	String s = "This certifies that \n" + name + "\nhas completed a course in " + course;
	return s;
}

}

class DiplomaWithHonors extends Diploma{

public DiplomaWithHonors(String n, String w){
	super(n,w);
}

public String toString(){
	String s = super.toString() + "\n*** with honors ***";
	return s;
}


}