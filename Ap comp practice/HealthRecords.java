public class HealthRecords{
    private String firstname;
    private String lastname;
    private String gender;
    private int month;
    private int date;
    private int year;
    private int height;
    private int weight;

 public HealthRecords(String f, String l, String g, int m, int d, int y, int h, int w){
    firstname = f;
    lastname = l;
    gender = g;
    month = m;
	date = d;
	year = y;
	height = h;
	weight = w;
 }
 public String toString(){
	 return("Name: " + firstname + " " + lastname + "\nGender: " + gender + "\nDate of Birth: " + month + "/" + date + "/" + year + "\nHeight: " + height + " inches\nWeight: " + weight + " pounds");
 }
 public String getFirstName(){
	 return firstname;
 }
 public String getLastName(){
	 return lastname;
 }
 public String getGender(){
	 return gender;
 }
 public int getBirthMonth(){
	 return month;
 }
 public int getBirthYear(){
	 return year;
 }
 public int getBirthDate(){
	 return date;
 }
 public int getHeight(){
	 return height;
 }
 public int getWeight(){
	 return weight;
 }

 public int getAge(){
	int age = 0;
	if (month <= 9 && date <= 21){
		 age = 2018 - year;
    } else {
	     age = 2017 - year;
    }
    return age;
}

  public int getMaximumHeartRate(){
	 int x = 0;
	 x = 220 - getAge();
	 return x;
}

  public double getBMI(){
	  double bmi = 0;
	  bmi = (weight * 703);
	  bmi /=(height * height);
	  return bmi;
}

}




