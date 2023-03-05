// Name:


import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class CarViewer{
	public static void main(String[] args){
		// make a frame
		JFrame frame = new JFrame();

		// set the size of the frame
		frame.setSize(300,400);

		// give the frame a title
		frame.setTitle("Two Cars");

		// exit frame when x is clicked
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a new CarComponent object
		CarComponent component = new CarComponent();

		// add CarComponent to frame
		frame.add(component);

		// set frame to be visible
		frame.setVisible(true);

	}
}


class Car{
	// enter the code for you car class here
private int x = 0;
private int y = 10;
private Color z;

public Car(int a, int b, Color d){
	x = a;
	y = b;
	z = d;
}

public void drawTires(Graphics2D g2d){
	Ellipse2D.Double circle1 = new Ellipse2D.Double(x,y,10,10);
	 g2d.setColor(Color.BLACK);
	 g2d.draw(circle1);
	 g2d.fill(circle1);

	 Ellipse2D.Double circle2 = new Ellipse2D.Double(x+30,y,10,10);
	 g2d.setColor(Color.BLACK);
	 g2d.draw(circle2);
	 g2d.fill(circle2);
}

public void drawBody(Graphics2D g2d){
    Rectangle body= new Rectangle(x-10,y-10,60,10);
    g2d.setColor(z);
    g2d.draw(body);
    g2d.fill(body);
}

  public void drawRoof(Graphics2D g2d){
     Line2D.Double roof= new Line2D.Double(x+10,y-20,x+30,y-20);
     g2d.setColor(Color.BLACK);
     g2d.draw(roof);
}

 public void drawFrontWindshield(Graphics2D g2d){
   Line2D.Double frontWindshield= new Line2D.Double(x,y-10,x+10,y-20);
   g2d.setColor(Color.BLACK);
   g2d.draw(frontWindshield);
}

 public void drawRearWindshield(Graphics2D g2d){
  Line2D.Double rearWindshield= new Line2D.Double(x+40,y-10,x+30,y-20);
  g2d.setColor(Color.BLACK);
  g2d.draw(rearWindshield);
}

public  void draw(Graphics2D g2d){
 drawTires(g2d);
 drawBody(g2d);
 drawRoof(g2d);
 drawFrontWindshield(g2d);
 drawRearWindshield(g2d);
}

}

class CarComponent extends JComponent{
	public void paintComponent(Graphics g){

		// create Graphics2D object
		Graphics2D g2d = (Graphics2D) g;

		// create Car object
		Car car1 = new Car(20,30,Color.BLUE);

		// initial position of second car
		int x = getWidth() - 100;
		int y = getHeight() - 100;

		// create second car object
		Car car2 = new Car(x,y,Color.RED);

		// draw objects on frame
		car1.draw(g2d);
		car2.draw(g2d);
	}
}