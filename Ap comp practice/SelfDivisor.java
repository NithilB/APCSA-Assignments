public class SelfDivisor{
	public static void main(String[] args){
		System.out.println(isSelfDivisor(124));

		int[] arr = firstNumSelfDivisors(124, 3);
		for(int r = 0; r< arr.length; r++){
			System.out.println(arr[r]);
		}

	}

public static boolean isSelfDivisor(int number){
	int digit = 0;
	   while(number > 0){
	   digit = number % 10;
	   if(digit == 0 || number % digit != 0){
	   	return false;
	   }
	   number /= 10;
	   }
	   return true;
}

public static int[] firstNumSelfDivisors(int start, int num){
int[] arr = new int[num];
   for(int r = 0; r < num; r++){
       if(isSelfDivisor(start)){
       arr[r] = start;
       } else {
       r--;
       }
       start++;
   }
   return arr;
}

}