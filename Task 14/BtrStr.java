
interface BtrFunc
{
	public boolean btrString(String a,String b);
}
/*interface BtrFunc2
{
	public String btrString2(String a,String b);
}*/

class BtrStr
{
	public static void main(String args[])
	{
		String c="Hello";
		
		
		String d="Hello World";
		BtrFunc isFactor = (String a,String b) -> (a.length()>b.length()? true : false);
		if(isFactor.btrString(c,d)) System.out.println(c+" is the longer string");
		else System.out.println(d+" is the longer string");
		//BtrFunc isFactor2 = (e,f) -> (e.length()>f.length()? e : f);
		//System.out.println(isFactor2.btrString2(c,d));
	}
}