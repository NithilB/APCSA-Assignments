public class StringMethods{

  public static String removeDashes(String ssn){
      String s = ssn.replace("-","");
      return s;
}

  public static String reformatDate(String date){
	  String d = date.replace("/","-");
	  String a = d;
	  String b = d;
	  int x = 0;
	  int y = 0;

      x = d.indexOf('-');
      d = d.substring(0,x);
      Integer.parseInt(d);
if(x == 1){
    y = a.indexOf('-',x+1);
	      a = a.substring(x+1,y);
	      Integer.parseInt(a);

	if(y - (x+1) == 1){
		b = b.substring(y+1,date.length());
		Integer.parseInt(b);

		  return ("0" + a + "-0" + d + "-" + b);
    }
    b = b.substring(y+1,date.length());
    Integer.parseInt(b);

	  return (a + "-0" + d + "-" + b);
}

      y = a.indexOf('-',x+1);
      a = a.substring(x+1,y);
      Integer.parseInt(a);

if(y - (x+1) == 1){
	b = b.substring(y+1,date.length());
	Integer.parseInt(b);

	  return ("0" + a + "-" + d + "-" + b);
}

      b = b.substring(y+1,date.length());
      Integer.parseInt(b);

	  return (a + "-" + d + "-" + b);
}

public static String capitalizeEveryOtherWord(String input){
	 input = input.trim();
	 String s1 = input;
	 String s2;
	 String s3;
	 int x = 0, y = 0, z = 0, a = 1;

	 y = s1.indexOf(' ',z);
     s1 = s1.substring(x,y + 1);
     s2 = s1.toLowerCase();
     x = y + 1;
	 z = y + 1;
	 a *= -1;
	 s1 = input;
 while (y < input.length()){
  if (a == 1){
	 y = s1.indexOf(' ',z);
	 if (y == -1){
		 s1 = s1.substring(x,input.length());
	     s3 = s1.toLowerCase();
	     s2 += s3;
	     break;
	 }
	 s1 = s1.substring(x,y + 1);
	 s3 = s1.toLowerCase();
	 x = y + 1;
	 z = y + 1;
	 a *= -1;
	 s2 += s3;
	 s1 = input;
  } else if (a == -1){
     y = s1.indexOf(' ',z);
     if (y == -1){
	     s1 = s1.substring(x,input.length());
	 	 s3 = s1.toLowerCase();
	 	 s2 += s3;
	     break;
	 }
     s1 = s1.substring(x,y + 1);
     s3 = s1.toUpperCase();
     x = y + 1;
     z = y + 1;
     a *= -1;
     s2 += s3;
     s1 = input;
  }
 }
     return s2;
}



}
