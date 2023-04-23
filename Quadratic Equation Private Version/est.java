import java.util.function.*;

class est implements Function<Inputs,Roots>
{
	public Roots apply(Inputs t)
	{
		Roots r = new Roots();
		r.setX((float) ((-t.getB()+Math.sqrt(Math.pow(t.getB(),2)-4*t.getA()*t.getC()))/(2*t.getA())));
		r.setY((float) ((-t.getB()-Math.sqrt(Math.pow(t.getB(),2)-4*t.getA()*t.getC()))/(2*t.getA())));
		return r;
	}
	public static void main(String args[])
	{
		est calc = new est();
		Roots r = new Roots();
		Inputs i = new Inputs();
		i.setA(Float.parseFloat(args[0]));
		i.setB(Float.parseFloat(args[1]));
		i.setC(Float.parseFloat(args[2]));
		r = calc.apply(i);
		System.out.println("The first root is "+r.getX()+".\nThe second root is "+r.getY()+".");
}
}




class Inputs
{
	private float a,b,c;
	public float getA(){
		return a;
	}
	public void setA(float a){
		this.a = a;
	}
	public float getB(){
		return b;
	}
	public void setB(float b){
		this.b = b;
	}public float getC(){
		return c;
	}
	public void setC(float c){
		this.c = c;
	}
}

class Roots{
	private float x,y;
	public float getX(){
		return x;
	}
	public void setX(float x){
		this.x = x;
	}
	public float getY(){
		return y;
	}
	public void setY(float y){
		this.y = y;
	}
}
