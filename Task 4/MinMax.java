class MinMax
{
	public static void main(String args[])
	{
		int arr[];
		arr = new int[1000];
		for(int i =0;i<1000;i++)
		{
			arr[i]= (int)(Math.random()*1000);
		}
		long time = System.nanoTime();
		int tries = 0;
		int min=arr[0],max=arr[0];
		
		for(int j=1;j<1000;j++)
		{
			tries++;
			if(min>arr[j])
				min=arr[j];
			if(max<arr[j])
				max=arr[j];
		}
		System.out.println("The minimum number is: "+min+"\nThe Maximum number is: "+max);
		System.out.println("Number of tries: "+tries);
		System.out.println(System.nanoTime()-time);
		//1138150 ns; //11706500 ns
	}
}	
		