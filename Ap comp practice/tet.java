import java.util.*;
public class tet{
	public static void main(String[] args){

		int[] nums = {0, 4, 4, 5, 6, 7};

int result = bSearch(nums, 0, nums.length - 1, 4);

System.out.println(result);

bark(5);

ArrayList<String> words = new ArrayList<String>();
words.add("jewelry");
words.add("jukebox");
words.add("jelly bean");

printRightToLeft(words);



	}
public static void printRightToLeft(ArrayList<String> words)

{

if (words.size() > 0)

{

System.out.println(words.get(words.size() - 1));
words.remove(words.size() - 1);
printRightToLeft(words);
/* missing code */

}

}



public static void bark(int num)

{

if (num > 0)

{

System.out.println("woof");
bark(num -1);
/* missing code */

}

}




public static int bSearch(int[] arr, int left, int right, int x)

{

if (right >= left)

{

int mid = (left + right) / 2;

if (arr[mid] == x)

{

return mid;

}

else if (arr[mid] > x)

{

return bSearch(arr, left, mid - 1, x);

}

else

{

return bSearch(arr, mid + 1, right, x);

}

}

return -1;

}

}