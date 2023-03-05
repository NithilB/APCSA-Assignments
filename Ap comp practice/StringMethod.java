public class StringMethod{

  public static String removeDashes(String ssn){
	 /* String s = ssn;
	  String n = ssn;
	  ssn.substring(0,4);
	  s.substring(5,7);
	  n.substring(8,12);
	  ssn.concat(s.concat(n));*/
      String s = ssn.replace("-","");
      return s;
}

  public static String reformatDate(String date){
	  String d = date.replace("/","-");
	  String a = d;
	  String b = d;
	  int x = 0;
	  int y = 0;
      int z = 0;

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
	/*  if (d.length() == 10){
	     d = d.substring(0,3);
	     a = a.substring(3,6);
	     b = b.substring(6,10);
	     return (a.concat(d)).concat(b);
     } else if (d.length() == 9 && d.length()== 8){
		  System.out.println(d);
		  z = d.indexOf('-',0);
		  d = d.substring(0,z+1);
		  System.out.println(d);
		  x = d.indexOf('-',3);
		  System.out.println(x);
		  a = a.substring(z,x);
		  return a;
		  b = b.substring(x,b.length()-1);
          return (a.concat(d));
*/
     // }


}

public static String capitalizeEveryOtherWord(String input){
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
	// System.out.println(s2);
 while (y < input.length()){
  if (a == 1){
	 y = s1.indexOf(' ',z);
	 if (y == -1){
		 s1 = s1.substring(x,input.length());
	     s3 = s1.toLowerCase();
	     s2 += s3;
	     break;
	 }
	// System.out.println(y);
	 s1 = s1.substring(x,y + 1);
	 s3 = s1.toLowerCase();
	 x = y + 1;
	 z = y + 1;
	 a *= -1;
	 s2 += s3;
	 s1 = input;
	// System.out.println(s2);
  } else if (a == -1){
     y = s1.indexOf(' ',z);
     if (y == -1){
	     s1 = s1.substring(x,input.length());
	 	 s3 = s1.toLowerCase();
	 	 s2 += s3;
	     break;
	 }
    // System.out.println(y);
     s1 = s1.substring(x,y + 1);
     s3 = s1.toUpperCase();
     x = y + 1;
     z = y + 1;
     a *= -1;
     s2 += s3;
     s1 = input;
  //   System.out.print(s2);
  }
 }
     return s2;
}



}
