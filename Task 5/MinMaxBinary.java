import java.util.Arrays;

class MinMaxBinary
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
		
		Arrays.sort(arr);
		
		int num=arr[arr.length-1];
		int num2=arr[0];
		int end = arr.length - 1;
		int start = 0;
		int mid = 0;
		Boolean isFound=false;
		while(!isFound)
		{
		
			if(arr[mid]!= num && arr[mid]>num && arr[mid-1]<num || arr[mid]!= num && arr[mid]<num && arr[mid+1]>num) // Number doesn't exist but higher and lower does
			{
				System.out.println("The number you're searching for is not in the array.");
				break;
			}
		
			
			mid = start+((end-start)/2); //intializing mid pointer
			if(arr[mid]==num){   // if found
				System.out.println("Number is Found");
				System.out.println("The number you're searching for is: "+num);
				System.out.println("The index of "+num+" is: "+mid);
				isFound=true;
			}
			else if(arr[mid]<num) //If num is Bigger than index number go shift start to right side >
			{	
				if(mid==end){ // If mid kept shifting till the last index of the array and still didn't find the number (Number is bigger than whole array values)
					System.out.println("Number not in range Higher than expected.");
					isFound= true;
				}
				start = mid+1;
			}
			else if(arr[mid]>num) // If num is lower than index number go shift end to left side <
			{
				if(mid==start){ // If mid kept shifting to left side 
					System.out.println("Number not in range lower than expected.");
					isFound = true;
				}
				end=mid-1;				
			}
			
			
		}
		end = arr.length - 1;
		start = 0;
		mid = 0;
		Boolean isFound2=false;
		while(!isFound2)
		{
			
		
			if(arr[mid]!= num2 && arr[mid]>num2 && arr[mid-1]<num2 || arr[mid]!= num2 && arr[mid]<num2 && arr[mid+1]>num2) // Number doesn't exist but higher and lower does
			{
				System.out.println("The number you're searching for is not in the array.");
				break;
			}
			
			mid = start+((end-start)/2); //intializing mid pointer
			if(arr[mid]==num2){   // if found
				System.out.println("Number is Found");
				System.out.println("The number you're searching for is: "+num2);
				System.out.println("The index of "+num2+" is: "+mid);
				isFound2=true;
			}
			else if(arr[mid]<num2) //If num is Bigger than index number go shift start to right side >
			{	
				if(mid==end){ // If mid kept shifting till the last index of the array and still didn't find the number (Number is bigger than whole array values)
					System.out.println("Number not in range Higher than expected.");
					isFound2= true;
				}
				start = mid+1;
			}
			else if(arr[mid]>num2) // If num is lower than index number go shift end to left side <
			{
				if(mid==start){ // If mid kept shifting to left side 
					System.out.println("Number not in range lower than expected.");
					isFound2 = true;
				}
				end=mid-1;				
			}
			
			
		}
		
		System.out.println(System.nanoTime()-time);
	}
}
		
		
		
		
