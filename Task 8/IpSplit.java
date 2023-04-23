class IpSplit
{
	public static void main(String args[])
	{
		String ip = "192.168.1.1";
		String num[] = ip.split("\\u002E");
		for (int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}