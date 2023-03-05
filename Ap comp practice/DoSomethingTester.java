public class DoSomethingTester{
	public static void main(String[] args){
 		DoSomething x = new DoSomething("First");
  		DoSomething y = new DoSomething("Last");
		System.out.println(x.equals(y));
		System.out.println(x.compareTo(y));


	}
}

class DoSomething implements Comparable<DoSomething>{

  private String val;

  public DoSomething( String in ){  val = in;   }

  public String getVal( ){ return val; }

  public boolean equals( DoSomething other ){

    char me = val.charAt(val.length( ) - 1);

    char you = other.getVal( ).charAt(other.getVal( ).length( ) - 1);

    return me == you;

  }

  public int compareTo( DoSomething other ){

    if (this.equals(other))

      return 0;

    Character me = (Character) val.charAt(val.length( ) - 1);

    Character you = (Character) other.getVal( ).charAt(other.getVal( ).length( ) - 1);

    if (me.compareTo( you ) > 0)

        return 1;

    return -1;

  }

}