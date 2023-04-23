
class ZeroException extends Exception
{
	public ZeroException()
	{
		super("You can't enter zero value!");
	}
}
class Add
{
	public int add(int[] n) throws ZeroException
	{
		int total = 0;
		for(int i =0;i<n.length-1;i++)
		{
			if (n[i]==0) throw new ZeroException();
			total += n[i];
		}
		return total;
	}
	public int sub(int a,int b) throws ZeroException
	{
		int c;
		
		c = b - a;
		if(c==0) throw new ZeroException();
		return c;
	}
	public float mltply(int a, int b) throws ZeroException
	{
		float c;
		c = a * b;
		if(c==0) throw new ZeroException();
		return c;
	}
}
class Me
{
	public static void main(String[] args)
	{
		Add obj = new Add();
		int[] i={1,2,3,4,5,6,7,8,9,10};
		int j = 4;
		int k = 4;
		int res1,res2;
		float res3;
		try{
			res1 = obj.add(i);
			res2 = obj.sub(k,j);
			res3 = obj.mltply(k,j);
		}
		catch(ZeroException e){
			e.printStackTrace();
		}
	}
}
			