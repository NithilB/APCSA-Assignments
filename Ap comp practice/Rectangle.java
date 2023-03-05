public class Rectangle{
  
  private int width;
  private int height;
  
  public Rectangle(int w, int h){
    width = w;
    height = h;
  }
  
  public Rectangle(int w){
    width = w;
    height = w;
  }
  
  public Rectangle(){
    width = 1;
    height = 1;
  }
  
  public boolean isSquare(){
    if (width == height){
      return true;
    } 
    return false;
  }
  
  public Rectangle quadratize(){
    int w = width;
    w += height;
    w /= 2;
    width = w;
    height = w;
    
    Rectangle knew = new Rectangle(width, height);
    return knew;
  }
  
  public int getWidth(){
    return width;
  }

  public int getHeight(){
    return height;
  }
  
  
}
  
  
 