/*
 * Programmer:
 * Assignment:    Lab 6.1 - ArrayStats
 * File Name:     ArrayStats.Java
 * Description:   This program outputs various statistics about an array of integers.
 *
 */


public class ArrayStats{

	// return minimum value in array
	public static int min( int[] input ){
	int x = input[0];
	for(int y = 0; y < input.length; y++){
		if(x > input[y]){
		   x = input[y];
	}
	}

	return x;

}

	// return maximum value in array
	public static int max( int[] input ){
	int x = input[0];
	for(int y = 0; y < input.length; y++){
		if(x < input[y]){
		x = input[y];
	}
	}

	return x;

}

	// return the range of the data (max - min)
	public static int range( int[] input ){
		return ArrayStats.max(input) - ArrayStats.min(input);

	}

	// return the average of the data
	public static double mean( int[] input ){
		int sum = 0;
		double y = 0;
		for (int s : input){
			sum+=s;
			y++;
		}
		return sum / y;
	}

	// return the variance of the data (the average square difference between the data and the mean)
	public static double variance( int[] input ){
		double sum = 0;
		double mean = ArrayStats.mean(input);
		for (int y = 0; y<input.length; y++){
			double x = input[y] - mean;
			sum += Math.pow(x,2);
		}
	return sum / input.length;
	}

	// return the standard deviation of the data (the square root of the average square difference between the data and the mean)
	public static double standardDeviation( int[] input ){
	double stan = Math.sqrt(ArrayStats.variance(input));
	return stan;

	}

	public static void main( String[] args ){
		int [] data = {1, 3, 5, 2, 4, 2, 1, 5, 6, 3, 2, -1, -5, -6, 10, 1, 4, 6, 2};

		// test stats algorithms
		System.out.println("Min: " + min(data));
		System.out.println("Max: " + max(data));
		System.out.println("Range: " + range(data));
		System.out.println("Mean: " + mean(data));
		System.out.println("Variance: " + variance(data));
		System.out.println("Standard Deviation: " + standardDeviation(data));

	}

}