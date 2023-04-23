import java.util.StringTokenizer;

class StrTok
{
	public static void main (String args[])
	{
		StringTokenizer str = new StringTokenizer("This is what this should look like because it is what it is");
		String keyword = "is";
		int counter = 0;
		while(str.hasMoreTokens())
		{
				if((str.nextToken()).equals(keyword))
				{
					counter++;
				}
		}
		System.out.println(counter);
		

	}
}