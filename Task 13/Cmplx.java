import java.lang.Number;
import java.math.BigDecimal;

class Cmplx <T extends Number , R extends Number>
{
	private T t;
	private R r;
	public Cmplx( T t, R r)
	{
		this.t = t;
		this.r = r;
	}
	public void setReal(T t)
	{
		this.t=t;
	}
	public void setImage(R r)
	{
		this.r = r;
	}
	public T getReal()
	{
		return t;
	}
	public R getImage()
	{
		return r;
	} 
	public Cmplx <Double,Double> add( Cmplx <T,R> x)
	{
		Cmplx <Double,Double> cmplx = new Cmplx<Double,Double>(0.0,0.0);
		cmplx.t = this.t.doubleValue()+x.t.doubleValue();
		cmplx.r= this.r.doubleValue()+x.r.doubleValue();
		return cmplx;
	}
	public void print()
	{
		System.out.println("Complex = "+t+"+"+r+"i .");
	}
	public static void main(String args[]){
		Cmplx <Double,Double> a = new Cmplx <Double,Double>(5.0,10.0);
		Cmplx <Double,Double> b = new Cmplx <Double,Double>(12.0,18.0);
		a.print();
		b=a.add(b);
		b.print();
	}
}