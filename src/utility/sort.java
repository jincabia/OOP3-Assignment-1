package utility;
import java.util.Comparator;
public class sort {

	//A sorting algorithim with the run time of 
	public static <T extends Comparable<? super T>> void insertionSort(T[] list) {
		
		
		
		
		//insertion sort 
		//Compare left and right elements
		//if great then (descending order) shift it over to the left else shift it to the right
		int listLength = list.length;	
		//assignment doc said no error handling so we can assume a list will have atleast more than 1 element
		
		for(int currIndex = 1; currIndex < listLength; currIndex++)
		{
			
			T temp = list[currIndex];
			int prevIndex = currIndex - 1;
			
			while(prevIndex>= 0 && list[prevIndex].compareTo(temp) < 0)
			{
				//shift it to the right
				list[prevIndex + 1] = list[prevIndex];
				prevIndex--;
			}
			list[prevIndex+1] = temp;

		}
		
		
		
		
	}
	public static <T> void insertionSort(T[] list, Comparator<? super T> c) {
		int listLength = list.length;	
		//assignment doc said no error handling so we can assume a list will have atleast more than 1 element
		
		for(int currIndex = 1; currIndex < listLength; currIndex++)
		{
			
			T temp = list[currIndex];
			int prevIndex = currIndex - 1;
			
			while(prevIndex>= 0 && c.compare(list[prevIndex], temp) < 0)
			{
				//shift it to the right
				list[prevIndex + 1] = list[prevIndex];
				prevIndex--;
			}
			list[prevIndex+1] = temp;

		}
		
		
	}
	
	
	public static <T extends Comparable<? super T>> void bubbleSort(T[] list) {
		//O(n^2)
		//the greater vavlues float to the top
		//using a temp value to swap the greater or lesser value
		
		int listLength = list.length;
		
		for (int outterIndex=0; outterIndex<list.length-1;outterIndex++)
		{
			for(int currIndex=0;currIndex<list.length-outterIndex-1;currIndex++)
			{
				if((list[currIndex].compareTo(list[currIndex+1]) < 0))
				{
					T temp = list[currIndex];
					list[currIndex] = list[currIndex+1];
					list[currIndex+1] = temp;
					
				}
			}
		}
		
		
		
	}
	public static <T> void bubbleSort(T[] list, Comparator<? super T> c) {
		int listLength = list.length;
		
		for (int outterIndex=0; outterIndex<list.length-1;outterIndex++)
		{
			for(int currIndex=0;currIndex<list.length-outterIndex-1;currIndex++)
			{
				if(c.compare(list[currIndex], list[currIndex+1]) <0)
				{
					T temp = list[currIndex];
					list[currIndex] = list[currIndex+1];
					list[currIndex+1] = temp;
					
				}
			}
		}
		
		
	}
	
	public static <T extends Comparable<? super T>> void selectionSort(T[] list) {
		int listLength = list.length;
		
		for(int outterIndex = 0; outterIndex<listLength-1;outterIndex++)
		{
			int min=outterIndex;
			for(int currIndex= outterIndex +1;currIndex < listLength;currIndex++)
			{
				if((list[min].compareTo(list[currIndex]) <0))
				{
					min = currIndex;
				}
			}
			
			T temp= list[outterIndex];
			list[outterIndex] = list[min];
			list[min] = temp;
			
					
		}
		
		
		
	}
	public static <T> void selectionSort(T[] list, Comparator<? super T> c) {
		int listLength = list.length;
		
		for(int outterIndex = 0; outterIndex<listLength-1;outterIndex++)
		{
			int min=outterIndex;
			for(int currIndex= outterIndex +1;currIndex < listLength;currIndex++)
			{
				if((c.compare(list[min], list[currIndex])) <0)
				{
					min = currIndex;
				}
			}
			
			T temp= list[outterIndex];
			list[outterIndex] = list[min];
			list[min] = temp;
			
					
		}
		
		
		
	}
	
	
}
