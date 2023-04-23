import java.util.Arrays;

class MinMax
{
	public float l,h;
}
class RecMinMax
{
	int rec(int[] arr,int low,int mid,int high,MinMax a)
	{
		
		int max = ((mid + 1)+high)/2; //
		int min = ((mid-1)+low)/2;
		ahmed : if(arr[max]>arr[mid]){
			low = mid + 1;
			if(arr[max]
			a.h=arr[max];
			
			return rec(arr,low,max,high);
			
		if(arr[min]<arr[mid)
			return rec(
	}
	
	
	
	
	int high = arr.length-1;
		int low = 0;
		int mid = (low + high)/2;
		int max = ((mid + 1)+high)