public class Test{
	public static void main(String[] args){
		//Derived a = new Derived();
		/*EnhancedItem enItemObj = new EnhancedItem();*/
		Item enItemObj = new EnhancedItem();
		enItemObj.setX(52);
		//enItemObj.setY(32);

	}
}

class Base{
	public Base(){
		System.out.print("Base" + " ");
	}
	public Base(int i){
		System.out.print("Base" + i);
	}

}

class Derived extends Base{
	public Derived(){
		System.out.print("Derived" + " ");
	}

}

class Item
{
   private int x;

   public void setX(int theX)
   {
      x = theX;
   }
   // ... other methods not shown
}

class EnhancedItem extends Item
{
   private int y;

   public void setY(int theY)
   {
      y = theY;
   }

  // ... other methods not shown
}