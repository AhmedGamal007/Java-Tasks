
class StringWords
{
		public static void main(String args[])
		{
			String sentence = "Hey Buddy,How are you doing.I hope you're are doing great today,are you?";
			String word[] = sentence.split("[ ?',!.]");
			String keyword = "you";
			int counter = 0;
		
			for (int i=0;i<word.length;i++)
			{
				
				//System.out.println(word[i]);
				if(word[i].equals(keyword))
				{
					counter++;
				}
			}
			System.out.println("The Keyword you're looking for is: "+keyword);
			System.out.println("The number of times "+keyword+" was found is: "+counter);
			
		}
}		