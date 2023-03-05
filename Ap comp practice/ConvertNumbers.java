
public class ConvertNumbers{
	public static void main(String[] args){

		System.out.println("Convert binary to octal: ");
		System.out.println("Converting 10101101 to octal. The correct answer is: 255. Your answer is: " + binaryToOctal(10101101));
		System.out.println("Converting 1001001 to octal. The correct answer is: 111. Your answer is: " + binaryToOctal(1001001));
		System.out.println("Converting 110 to octal. The correct answer is: 6. Your answer is: " + binaryToOctal(110));

		System.out.println("\n\n\nConvert octal to binary: ");
		System.out.println("Converting 250 octal to binary. The correct answer is: 10101000. Your answer is: " + octalToBinary(250));
		System.out.println("Converting 1000 octal to binary. The correct answer is: 1000000000. Your answer is: " + octalToBinary(1000));
		System.out.println("Converting 17 octal to binary. The correct answer is: 1111. Your answer is: " + octalToBinary(17));

		System.out.println(binaryToDecimal(10110));

	}

	public static int binaryToOctal(int n){
		if(n == 0){
			return 0;
		}else{
			int cnt = n % 1000;
			int x = cnt % 10;
			cnt /= 10;
			int y = cnt % 10;
			cnt /= 10;
			int z = cnt % 10;
			return x + (y*2) + (z*4) + binaryToOctal(n / 1000) * 10;
		}

	}

	public static int binaryToDecimal(int n){
		int c = 1;
		if(n == 0){
			return 0;
		} else {
			c *= 2;
		}

		if(n % 10 != 0){
			return (n%10)*c + binaryToDecimal(n/10);
		}// else {
		//	return binaryToDecimal(n/10);
		//}

	}


	public static int octalToBinary(int n){
		if(n == 0){		//base case
			return n;
		}else{
			int x = 0; // variables for binary 1 or 0
			int y = 0;
			int z = 0;

			if((n%10) % 2 != 0){ // seperates numbers based on (odd) or even
				x = 1;
				if((n%10) == 5){
					z = 1;
				} else if ((n%10) == 3) {
					y = 1;
				} else if((n%10) == 7) {
					z = 1;
					y = 1;
				}
			} else {    // even
				if((n%10) == 6){
					y = 1;
					z = 1;
				}else if((n%10) == 4){
					x = 1;
				}else if((n%10) == 2){
					y = 1;
				}
			}

			if(n%10 == 1){
				return x + octalToBinary(n/10) * 1000;
			} else {
				return z + (y*10) + (x*100) + octalToBinary(n/10) * 1000;
			}

		}

	}

}