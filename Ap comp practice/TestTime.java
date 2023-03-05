import java.util.Scanner;

public class TestTime
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    Time t1 = new Time(2, 15);
    Time t2 = new Time(14, 30);
    Time t3 = new Time(17, 0);

 System.out.println("The time for t1 is: " + t1 + ", or equivalently: " + t1.to12HourClock());
 System.out.println("The time for t2 is: " + t2 + ", or equivalently: " + t2.to12HourClock());
 System.out.println("The time for t3 is: " + t3 + ", or equivalently: " + t3.to12HourClock());

    System.out.println("\n\n" + t1 + " <= " + t2 + "? " + t1.lessThan(t2));
    System.out.println(t2.elapsedSince(t1) + " minutes elapsed from t1 to t2.");

    System.out.println("\n\n" + t3 + " <= " + t2 + "? " + t3.lessThan(t2));
    System.out.println(t2.elapsedSince(t3) + " minutes elapsed from t3 to t2.");

    int h = 6, m = 80;
    System.out.println("\n\nAdd " + h + " hours and " + m + " minutes to time to t3 which is currently: " + t3 + ", or \nequivalently: " + t3.to12HourClock());
    t3.addTime(h,m);
    System.out.println("\n\nThe new time for t3 is: " + t3 + ", or equivalently: " + t3.to12HourClock() + "\n\n");

 
  }
}
