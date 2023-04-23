import java.util.function.*;

class CenteFahre implements Function<Float,Double>
{
	public Double apply(Float c)
	{
		Double d=(double)(((c*9)/5)+32);
		return d;
	}
	public static void main(String args[])
	{	
		float	c = -273.15f;
		double f;
		CenteFahre obj = new CenteFahre();
		
		f = obj.apply(c);
		System.out.println("The temp is: "+c+"C \nThe temp is: "+f+"F");
	}
}
		