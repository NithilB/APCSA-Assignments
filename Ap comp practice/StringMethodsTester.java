/*
 * Programmer:
 * Date:
 * Assignment:    Lab 5.1 - StringMethods
 * File Name:     StringMethodsTester.Java
 * Description:   A wrapper program to test the methods in the StringMethods class
 *
 */

public class StringMethodsTester{
  public static void main( String[] args ){

    String input = "413-56-7812";

    System.out.println("Remove dashes from " + input + ": " + StringMethods.removeDashes(input));

    input = "10/25/2013";
    System.out.println("\nReformat " + input + ": " + StringMethods.reformatDate(input));

    input = "1/25/2013";
    System.out.println("\nReformat " + input + ": " + StringMethods.reformatDate(input));

    input = "5/1/2013";
    System.out.println("\nReformat " + input + ": " + StringMethods.reformatDate(input));

    input = "Capitalize Every Other Word In This Sentence";
    System.out.println("\nRewrite: " + input + "\n" + StringMethods.capitalizeEveryOtherWord(input));

    input = "     OLENTANGY LIBERTY PATRIOTS        ";
    System.out.println("\nRewrite: " + input + "\n" + StringMethods.capitalizeEveryOtherWord(input));


 }
}