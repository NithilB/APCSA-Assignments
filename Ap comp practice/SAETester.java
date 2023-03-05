public class SAETester{
	public static void main(String[] args){
		SAE s = new SAE("Bob", 17, 11, "Olentangy Liberty High School", "basketball", "server", "BW3");
		System.out.println(s.toString());


	}
}

class Person{
	private String name;
	private int age;

	public Person(String n, int a){
		name = n;
		age = a;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String toString(){
		return name + " is " + age + " years old.";
	}

}

interface Student{

	void setGrade(int grade);
	void setSchool(String school);
	int getGrade();
	String getSchool();

}

interface Athlete{

	void setSport(String sport);
	String getSport();

}

interface Employee{

	void setJobTitle(String jobTitle);
	void setJobLocation(String jobLocation);
	String getJobTitle();
	String gerJobLocation();

}

class SAE extends Person implements Student, Athlete, Employee{
	private int grade;
	private String school;
	private String sport;
	private String jobTitle;
	private String jobLocation;

	public SAE(String a, int b, int g, String s, String sp, String jt, String jl){
		super(a, b);
		grade = g;
		school = s;
		sport = sp;
		jobTitle = jt;
		jobLocation = jl;
	}

	public void setGrade(int gr){
		grade = gr;
	}
	public void setSchool(String sc){
		school = sc;
	}
	public int getGrade(){
		return grade;
	}
	public String getSchool(){
		return school;
	}

	public void setSport(String spo){
		sport = spo;
	}
	public String getSport(){
		return sport;
	}

	public void setJobTitle(String jT){
		jobTitle = jT;
	}
	public void setJobLocation(String jobLocation){
		jobLocation = jobLocation;
	}
	public String getJobTitle(){
		return jobTitle;
	}
	public String gerJobLocation(){
		return jobLocation;
	}

	public String toString(){
		return super.toString() + "\nHe/She is in grade " + grade + " at " + school + "\n" +
		"where he/she plays " + sport + ".\nHe/She is also a " + jobTitle + " at " + jobLocation + ".";
	}
}