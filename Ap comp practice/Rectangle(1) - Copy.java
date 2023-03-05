public class Rectangle {
  
  private int width;
  private int height;
 
 public Rectangle(){
   width = 1;
   height = 1;
} 
  
  public Rectangle(int w, int h){
   width = w;
   height = h;
 } 
   
  public Rectangle(int a){
    width = a;
    height = a;
   }
  
  public boolean isSquare(){
    int w = getWidth();
    int h = getHeight();
    if (w == h){
       return true;
    }
    else{ 
      return false;
    }
  }
  
  public void quadratize(){
    int w = getWidth();
    int h = getHeight();
    int rectarea = w * h;
    int sqrsize = (w+h)/2;
    width = sqrsize;
    height = sqrsize;
  }
    
  public int getWidth(){
   return width;
   }
  public int getHeight(){
   return height;
   }
     
}