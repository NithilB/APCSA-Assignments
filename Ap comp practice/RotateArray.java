/*
 * Programmer:
 * Assignment:    Lab 6.4 - RotateArray
 * File Name:     RotateArray.Java
 * Description:   This program rotates a given array forward or backward.
 *
 */

public class RotateArray{
	// rotate the array to the right if d is positive and to the left if d is negative
	public static int[] rotate( int[] a, int d ){
		int x = a.length - 1;
		int [] rot = new int [a.length];
		int y = 0;
		int z = 0;
		int v = d;
		if (d > 0){
			if (d > a.length){
				d = d % a.length;
				v = d;
			}
		  for (int i = 0; i < a.length; i++){
			if(i + d > x){
				y =	(i + d) - (a.length);
				rot[y] = a[i];
			} else {
				rot[v] = a[i];
				v++;
			}
	      }

		} else if (d < 0) {
			if(Math.abs(d) > a.length){
				d = Math.abs(d) % a.length;
				d *= -1;
			}
			for (int b = 0; b < a.length; b++){
			  if(b + d < 0 && Math.abs(b + d) <= a.length){
				 z = a.length - Math.abs(b + d);
				 rot[z] = a[b];
		      } else {
				 z = Math.abs(b + d);
				 rot[z] = a[b];
			  }
			}

		} else {
		  return a;
	    }

		return rot;
	}

	public static String toString( int[] a ){
		String b = "";
		for (int i = 0; i < a.length; i++)
			b += a[i] + " ";
		return b;
	}

	public static void main( String[] args ){
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println(toString(a));
		System.out.println("rotate(a, 3) = " + toString(rotate(a,3)));
		System.out.println("rotate(a, -6) = " + toString(rotate(a,-6)));
		System.out.println("rotate(a, 20) = " + toString(rotate(a,20)));
	}
}