2/*
 * Programmer:
 * Date:1
 * Assignment:    Lab 4.7 - LogMessage
 * File Name:     LogMessageTester.Java
 * Description:   A wrapper program to test the methods in the LogMessage class
 *
 */

public class LogMessageTester{
  public static void main( String[] args ){

	  LogMessage l = new LogMessage("test:disk");
	  System.out.println("disk: " + l.containsWord("disk"));

	  l = new LogMessage("test:DISK");
	  System.out.println("DISK: " + l.containsWord("disk"));

	  l = new LogMessage("test:error on disk");
	  System.out.println("error on disk: " + l.containsWord("disk"));

	  l = new LogMessage("test:error on disk3");
	  System.out.println("error on disk3: " + l.containsWord("disk"));

	  l = new LogMessage("test:error on /dev/disk disk");
	  System.out.println("error on /dev/disk disk: " + l.containsWord("disk"));

	  l = new LogMessage("test:error on /dev/disk");
	  System.out.println("error on /dev/disk: " + l.containsWord("disk"));

	  l = new LogMessage("test:error on disk DSK1");
	  System.out.println("error on disk DSK1: " + l.containsWord("disk"));

	  l = new LogMessage("test:diskette");
	  System.out.println("diskette: " + l.containsWord("disk"));

  }
}

