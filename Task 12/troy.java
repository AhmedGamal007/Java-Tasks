import java.util.*;
abstract class Shape{
public abstract void draw();	
}
class Rectangle extends Shape
{	
public void draw(){
	System.out.println("Hello From Rectangle");
}
}
class Circle extends Shape
{
	public void draw(){
		System.out.println("Hello From Circle");
	}
}

class Square
{
	public void draw(){
	System.out.println("Hello From Square");
	}
}
class troy 
{
	public void test(ArrayList <? extends Shape> listOfShapes)
	{
		
		
		for(int i =0;i<listOfShapes.size();i++)
		{
			
			listOfShapes.get(i).draw();
			
		}
	}
	public static void main(String[] args)
	{
		//ArrayList<Rectangle> rec= new ArrayList<Rectangle>();
		ArrayList<Shape> crc = new ArrayList<>();
		//ArrayList<Square> sqr = new ArrayList<Square>();
		troy t=new troy();
		//Circle r = new Circle(); 
		crc.add(new Circle());
		crc.add(new Rectangle());
		crc.add(new Circle());
		crc.add(new Circle());
		crc.add(new Rectangle());
		crc.add(new Circle());
		crc.add(new Circle());
		crc.add(new Rectangle());
		crc.add(new Circle());
		crc.add(new Circle());
		t.test(crc);
		
		
		
	}
}
		