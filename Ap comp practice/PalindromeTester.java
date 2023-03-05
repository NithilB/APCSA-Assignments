/*
 * Programmer:
 * Date:
 * Assignment:    Lab 5.4 - Palindrome
 * File Name:     PalindromeTester.Java
 * Description:   A wrapper program to test the methods in the Palindrome class
 *
 */

public class PalindromeTester{
  public static void main( String[] args ){
    boolean value;

    String input = "madam, I'M Adam  %$#";
    value = Palindrome.isPalindrome(input);
    if (value)
      System.out.println(input + " is a palindrome");
    else
      System.out.println(input + " is not a palindrome");

    input = "   12 test set $ 21";
    value = Palindrome.isPalindrome(input);
    if (value)
      System.out.println(input + " is a palindrome");
    else
      System.out.println(input + " is not a palindrome");

    input = "racecars";
    value = Palindrome.isPalindrome(input);
    if (value)
      System.out.println(input + " is a palindrome");
    else
      System.out.println(input + " is not a palindrome");

    input = "123321";
    value = Palindrome.isPalindrome(input);
    if (value)
      System.out.println(input + " is a palindrome");
    else
      System.out.println(input + " is not a palindrome");

  }
}