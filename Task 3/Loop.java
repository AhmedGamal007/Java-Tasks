
class Loop
{
	public static void main(String args[])
	{
		int size=-2;
		
		try{
		size = Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			size= -1;
			System.out.println("Type mismatch.");
			System.out.println("Argument 1:[Number of copies]\nArgument 2:[Keyword]");
		}
		
		if(size == 0)
		{
			System.out.println("Argument is empty.");
		}
		else{
			try{
		for(int i=0;i<size;i++)
		{
			System.out.println(args[1]);
		}
			}
			catch(Exception e)
			{
				//System.out.println(e.toString());
				System.out.println("Type mismatch.");
				System.out.println("Argument 1:[Number of copies]\nArgument 2:[Keyword]");
			}
		}
		
	}
}