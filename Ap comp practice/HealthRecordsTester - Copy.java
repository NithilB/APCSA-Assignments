public class HealthRecordsTester{
 public static void main (String[] args){
  HealthRecords p1 = new HealthRecords("John","Doe","Male",5,5,1975,72,175);
  HealthRecords p2 = new HealthRecords("Jane","Smith","Female",9,21,1985,66,130);
  HealthRecords p3 = new HealthRecords("Bob","Johnson","Male",12,10,1990,76,220);

  System.out.println("Person 1:\n" + p1);
  System.out.println("\n\nPerson 2:\n" + p2);
  System.out.println("\n\nPerson 3:\n" + p3.getFirstName() + " " + p3.getLastName());
  System.out.println("Gender: " + p3.getGender());
  System.out.println("Date of Birth: " + p3.getBirthMonth() + "/" + p3.getBirthDate() + "/" + p3.getBirthYear());
  System.out.println("Height: " + p3.getHeight() + " inches");
  System.out.println("Weight: " + p3.getWeight() + " pounds");

  System.out.println("\n\n" + p1.getFirstName() + " " + p1.getLastName() + " is " + p1.getAge() + " years old, has a max heart rate of " + p1.getMaximumHeartRate() +
   ",\nand a BMI of " + p1.getBMI());

  System.out.println("\n\n" + p2.getFirstName() + " " + p2.getLastName() + " is " + p2.getAge() + " years old, has a max heart rate of " + p2.getMaximumHeartRate() +
   ",\nand a BMI of " + p2.getBMI());

  System.out.println("\n\n" + p3.getFirstName() + " " + p3.getLastName() + " is " + p3.getAge() + " years old, has a max heart rate of " + p3.getMaximumHeartRate() +
   ",\nand a BMI of " + p3.getBMI() + "\n\n");



 }
}

