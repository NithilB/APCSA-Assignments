import java.util.*;
public class temp{
	public static void main(String[] args){
		//int [] data = {1, 3, 5, 2, 4, 2, 1, 5, 6, 3, 2, -1, -5, -6, 10, 1, 4, 6, 2};
		System.out.println(mystery(0, 18, 2));
		System.out.println(convertToPiglatin("cat"));
	}

public static int mystery(int low, int high, int num){
int [] data = {1, 3, 5, 2, 4, 2, 1, 5, 6, 3, 2, -1, -5, -6, 10, 1, 4, 6, 2};
int mid = (low + high) / 2;
if (low > high)
     return low;
else if (data[mid] < num)
     return mystery(mid + 1, high, num);
else if (data[mid] > num)
     return mystery(low, mid - 1, num);
else // arr[mid] == num
     return mid;
}

public static String convertToPiglatin(String str){
	if(str.length() < 1){
		return str;
	}else if (str.charAt(0) != 'a' || str.charAt(0) != 'A' || str.charAt(0) != 'e' || str.charAt(0) != 'E' || str.charAt(0) != 'i' || str.charAt(0) != 'I' || str.charAt(0) != 'o' || str.charAt(0) != 'O' ||   str.charAt(0) != 'u' || str.charAt(0) != 'U'){
		return convertToPiglatin(str.substring(0,1)) + str.substring(0,1);
	}
	return str + "ay";
}


}
