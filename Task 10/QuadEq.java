import java.util.function.*;

class QuadEq implements Function<Inputs,Roots>
{
	public Roots apply(Inputs t)
	{
		Roots r = new Roots();
		r.x = (float)((-t.b+Math.sqrt(Math.pow(t.b,2)-4*t.a*t.c))/(2*t.a));
		r.y = (float)((-t.b-Math.sqrt(Math.pow(t.b,2)-4*t.a*t.c))/(2*t.a));
		return r;
	}
	public static void main(String args[])
	{
		QuadEq calc = new QuadEq();
		Roots r = new Roots();
		Inputs i = new Inputs();
		i.a=Float.parseFloat(args[0]);
		i.b=Float.parseFloat(args[1]);
		i.c=Float.parseFloat(args[2]);
		r = calc.apply(i);
		System.out.println("The first root is "+r.x+".\nThe second root is "+r.y+".");
}
}




class Inputs
{
	public float a,b,c;
}

class Roots{
	public float x,y;
}
