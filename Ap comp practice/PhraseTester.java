/*
 * Programmer:
 * Date:
 * Assignment:    Lab 3.7 - Phrase
 * File Name:     PhraseTester.Java
 * Description:   A wrapper program to test the methods in the Phrase class
 *
 */

public class PhraseTester{
  public static void main( String[] args ){

	  Phrase phrase1 = new Phrase("A cat ate late.");
	  phrase1.replaceNthOccurrence("at", 1, "rane");
	  System.out.println(phrase1);

	  phrase1 = new Phrase("A cat ate late.");
	  phrase1.replaceNthOccurrence("at", 6, "xx");
	  System.out.println(phrase1);

	  phrase1 = new Phrase("A cat ate late.");
	  phrase1.replaceNthOccurrence("bat", 2, "xx");
	  System.out.println(phrase1);

	  phrase1 = new Phrase("aaaa");
	  phrase1.replaceNthOccurrence("aa", 1, "xx");
	  System.out.println(phrase1);

	  phrase1 = new Phrase("aaaa");
	  phrase1.replaceNthOccurrence("aa", 2, "bbb");
	  System.out.println(phrase1);

	  phrase1 = new Phrase("A cat ate late.");
	  System.out.println(phrase1.findLastOccurrence("at"));
	  System.out.println(phrase1.findLastOccurrence("cat"));
	  System.out.println(phrase1.findLastOccurrence("bat"));

  }
}

