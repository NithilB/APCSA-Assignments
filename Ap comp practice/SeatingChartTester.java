import java.util.*;

public class SeatingChartTester{
	public static void main(String[] args){
		List<Student> roster = new ArrayList<Student>();
		roster.add(new Student("Karen",3));
		roster.add(new Student("Liz",1));
		roster.add(new Student("Paul",4));
		roster.add(new Student("Lester",1));
		roster.add(new Student("Henry",5));
		roster.add(new Student("Renee",9));
		roster.add(new Student("Glen",2));
		roster.add(new Student("Fran",6));
		roster.add(new Student("David",1));
		roster.add(new Student("Danny",3));

		SeatingChart chart = new SeatingChart(roster, 3, 4);
		System.out.print(chart);

		System.out.println("\n\nRemove students with 4 absences\n\n");
		int removed = chart.removeAbsentStudents(4);
		System.out.println(removed + " students were removed from the roster");
		System.out.print(chart);



	}
}

class SeatingChart{
  private Student[][] seats;
  public SeatingChart(List<Student> studentList, int rows, int cols){
	// implement part a
	seats = new Student[rows][cols];
	int x = 0;
	for(int c = 0; c < cols; c++){
		for(int r = 0; r < rows; r++){
			if(x < studentList.size()){
			seats[r][c] = studentList.get(x);
			x++;
			} else {
			seats[r][c] = null;
			}

		}
	}


  }
  public int removeAbsentStudents(int allowedAbsences){
	  // implement part b
	  int y = 0;
	  for(int r = 0; r < seats.length; r++){
		  for(int c = 0; c < seats[0].length; c++){
			  if(seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences){
				  seats[r][c] = null;
				  y++;
			  }
		  }
	  }
	  return y;

  }

  public String toString(){
	  String out = "";
	  for (int r = 0; r < seats.length; r++){
	  	  for (int c = 0; c < seats[r].length; c++){
	  		if (seats[r][c] == null)
	  			out += "null\t";
	  		else
	  			out += seats[r][c].toString();

	  	  }
	  	  out += "\n";
	  }
	  return out;
  }
}

class Student{
	private String name;
	private int absences;
	public Student(String n, int a){
		name = n;
		absences = a;
	}
	public String getName(){
		return name;
	}
	public int getAbsenceCount(){
		return absences;
	}
	public String toString(){
		return name + " - " + absences + "\t";
	}
}
