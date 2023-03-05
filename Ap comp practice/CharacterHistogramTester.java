/*
 * Programmer:
 * Date:
 * Assignment:    Lab 5.3 - CharacterHistogram
 * File Name:     CharacterHistogramTester.Java
 * Description:   A wrapper program to test the methods in the CharacterHistogram class
 *
 */


public class CharacterHistogramTester{
  public static void main(String [] args){

    String input = "The five boxing wizards jump quickly";

    System.out.println("Generate Histogram for: " + input);
    CharacterHistogram.generateHistogram(input);

    input = "   OSU won 34-10 and now have 7 wins";

    System.out.println("Generate Histogram for: " + input);
    CharacterHistogram.generateHistogram(input);
  }
}