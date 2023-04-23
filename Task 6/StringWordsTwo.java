class StringWordsTwo
{
	public static void main(String args[])
	{
		String str="Habiby is no is yes and is no buy yes is";
		String Keyword="is";
		int counter=-1;
		int s=0;
		while(s!=-1){
			s = str.indexOf(Keyword);
			str = str.replaceFirst(Keyword,"");
			counter++;
	}
		System.out.println(counter);
	}
}