public class HealthRecords{
  
  private String firstName;
  private String lastName;
  private String gender;
  private int month;
  private int day;
  private int year;
  private int height;
  private int weight;
  
  public HealthRecords (String f, String l, String g, int m, int d, int y, int h, int w){
  
    firstName = f;
    lastName = l;
    gender = g;
    month = m;
    day = d;
    year = y;
    height = h;
    weight = w;
  }
  
  public String toString(){
  return (firstName + " " + lastName + "\n" + gender + "\n" + month + "/" + day + "/" + year + "\n" + height + "\n" + weight);
  
  
  
  }

  public String getFirstName(){
    return firstName;
  }
 
  public String getLastName(){
    return lastName;
  }

  public String getGender(){
    return gender;
  }

  public int getBirthMonth(){
    return month;
  }

  public int getBirthDate(){
    return day;
  }
  
  public int getBirthYear(){
    return year;
  }

  public int getHeight(){
    return height;
  }

  public int getWeight(){
    return weight; 
  }
  

  public int getAge(){
    int age = 0;
    if(month < 9){
      age = 2018 - year;

    } else if (month == 9 && day <= 21) {
      age = 2018 - year;
    } else {
      age = 2017 - year;

    }
     return age;
  }

  public int getMaximumHeartRate(){
     int heart;
     heart = 220 - getAge();
     return heart;
  }

  public double getBMI(){
     double bmi;
     bmi = weight * 703;
     bmi /= (height * height);
     return bmi;
  }
}
