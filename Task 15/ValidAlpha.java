
interface Check
{
	public boolean btrString(String b);
}

class BtrStr
{
	public static void main(String args[])
	{
		String c="Hello";
		String d="Hello World";
		BtrFunc isFactor = (b) -> (Character.isLetter? true : false);
		if(isFactor.btrString(c,d)) System.out.println(c+" is the longer string");
		else System.out.println(d+" is the longer string");
		//BtrFunc isFactor2 = (e,f) -> (e.length()>f.length()? e : f);
		//System.out.println(isFactor2.btrString2(c,d));
	}
}