package utilities;
import java.util.Comparator;
import java.util.*;
/**
 * 
 */
public class sort {

	
	
	 
	/**
     * Sorts the input array of elements using the Insertion Sort algorithm.
     *
     * @param list The array of elements to be sorted. Elements must implement the Comparable interface.
     *             The sorting is done in-place, modifying the input array.
     * @param <T>  The type of elements in the array, which must implement the Comparable interface.
     */
	public static <T extends Comparable<? super T>> void insertionSort(T[] list) {

		
		
		int listLength = list.length;	
		
		// Iterate over the array starting from the second element
		for(int currIndex = 1; currIndex < listLength; currIndex++)
		{
			// Store the current element to be inserted at the correct position
			T temp = list[currIndex];
			int prevIndex = currIndex - 1;
			 
			
			
			 // Compare the current element with elements on its left side and shift them to the left
            // until a greater element is found or the beginning of the array is reached
			while(prevIndex>= 0 && list[prevIndex].compareTo(temp) < 0)
			{
				list[prevIndex + 1] = list[prevIndex]; //shift element to the left
				prevIndex--; //move to the left of the list
			}
			// Insert the stored element at the correct position in the sorted sequence
			list[prevIndex+1] = temp;

		}
		
		
		
		
	}
	
	/**
     * Sorts the input array of elements using the Insertion Sort algorithm.
     *
     * @param list The array of elements to be sorted. Elements must implement the Comparator interface.
     *             The sorting is done in-place, modifying the input array.
     * @param <T>  The type of elements in the array, which must implement the Comparator interface.
     */
	public static <T> void insertionSort(T[] list, Comparator<? super T> c) {
		int listLength = list.length;	
		
		// Iterate over the array starting from the second element
		for(int currIndex = 1; currIndex < listLength; currIndex++)
		{
			// Store the current element to be inserted at the correct position
			T temp = list[currIndex];
			int prevIndex = currIndex - 1;
			
			// Compare the current element with elements on its left side and shift them to the left
            // until a greater element is found or the beginning of the array is reached
			while(prevIndex>= 0 && c.compare(list[prevIndex], temp) < 0)
			{
				//shift it to the right
				list[prevIndex + 1] = list[prevIndex]; //shift element to the left
				prevIndex--; //move to the left of the list
			}
			// Insert the stored element at the correct position in the sorted sequence
			list[prevIndex+1] = temp;

		}
		
		
	}
	
	
	/**
	 * @param list The array of elements to be sorted. Elements must implement the Comparable Interface.
	 * 		  The sorting is done in-place, modifying the input array.
	 * @param <T> The type of elements in the array, which must implement the Comparable interface.
	 * 
	 */
	@SuppressWarnings("unused")
	public static <T extends Comparable<? super T>> void bubbleSort(T[] list) {
		
		int listLength = list.length;
		
		
		for (int outterIndex=0; outterIndex<list.length-1;outterIndex++)
		{
			for(int currIndex=0;currIndex<list.length-outterIndex-1;currIndex++)
			{
				
				// Checks elements beside each other if they are in order (greatest to least)
				// if they are not in order they are switched
				if((list[currIndex].compareTo(list[currIndex+1]) < 0))
				{
					//store the lesser element
					T temp = list[currIndex];
					// shift the greater element to the left
					list[currIndex] = list[currIndex+1];
					//shift the lesser element to the right
					list[currIndex+1] = temp;
					
				}
			}
		}
		
		
		
	}
	
	/**
	 * @param list The array of elements to be sorted. Elements must implement the Comparator Interface.
	 * 		  The sorting is done in-place, modifying the input array.
	 * @param <T> The type of elements in the array, which must implement the Comparator interface.
	 * 
	 */
	public static <T> void bubbleSort(T[] list, Comparator<? super T> c) {
		int listLength = list.length;
		
		for (int outterIndex=0; outterIndex<list.length-1;outterIndex++)
		{
			for(int currIndex=0;currIndex<list.length-outterIndex-1;currIndex++)
			{
				// Checks elements beside each other if they are in order (greatest to least)
				// if they are not in order they are switched
				if(c.compare(list[currIndex], list[currIndex+1]) <0)
				{
					//store the lesser element
					T temp = list[currIndex];
					// shift the greater element to the left
					list[currIndex] = list[currIndex+1];
					//shift the lesser element to the right
					list[currIndex+1] = temp;
					
				}
			}
		}
		
		
	}
	
	/**
	 * @param list The array of elements to be sorted. Elements must implement the Comparable Interface.
	 * 		  The sorting is done in-place, modifying the input array.
	 * @param <T> The type of elements in the array, which must implement the Comparable interface.
	 * 
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] list) {
		int listLength = list.length;
		
		//Iterate through the entire list, to select the minimum value
		for(int outterIndex = 0; outterIndex<listLength-1;outterIndex++)
		{
			
			int min=outterIndex;
			
			//find the index of the minimum value in the unsorted portion of the list
			for(int currIndex= outterIndex +1;currIndex < listLength;currIndex++)
			{
				if((list[min].compareTo(list[currIndex]) <0))
				{
					min = currIndex;
				}
			}
			//swap the min value with the first element of the unsorted list.
			T temp= list[outterIndex];
			list[outterIndex] = list[min];
			list[min] = temp;
			
					
		}
		
		
		
	}
	
	/**
	 * @param list The array of elements to be sorted. Elements must implement the Comparator Interface.
	 * 		  The sorting is done in-place, modifying the input array.
	 * @param <T> The type of elements in the array, which must implement the Comparator interface.
	 * 
	 */
	
	public static <T> void selectionSort(T[] list, Comparator<? super T> c) {
		int listLength = list.length;
		
		//iterate through the list to find the minimum value in the unsorted portion of the list
		for(int outterIndex = 0; outterIndex<listLength-1;outterIndex++)
		{
			int min=outterIndex;
			//find the index of the minimum value in the unsorted portion of the list
			for(int currIndex= outterIndex +1;currIndex < listLength;currIndex++)
			{
				if((c.compare(list[min], list[currIndex])) <0)
				{
					min = currIndex;
				}
			}
			//swap the minimum value with the first element of the unsorted list.
			T temp= list[outterIndex];	
			list[outterIndex] = list[min];
			list[min] = temp;
			
					
		}
		
		
		
	}
	
	public static <T extends Comparable<? super T>> void mergeSort(T[] list) {
		
		int listLength = list.length;
		
		if (listLength <= 1 || list == null) return;
		
		int mid = listLength / 2; 
		T[] leftArray = (T[]) new Comparable[mid];
		T[] rightArray = (T[]) new Comparable[listLength - mid];
		
		int  rightIndex = 0;
		
		for(int leftIndex = 0; leftIndex < listLength;leftIndex++) {
			if(leftIndex < mid)
			{
				leftArray[leftIndex] = list[leftIndex];
				
			}
			else
			{
				rightArray[rightIndex] = list[leftIndex];
				rightIndex++;
						
			}
			
			
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray,rightArray,list);
		
	}
	
	public static <T> void mergeSort(T[] list, Comparator<? super T> c) {
int listLength = list.length;
		
		if (listLength <= 1 || list == null) return;
		
		int mid = listLength / 2; 
		T[] leftArray = (T[]) new Comparable[mid];
		T[] rightArray = (T[]) new Comparable[listLength - mid];
		
		int  rightIndex = 0;
		
		for(int leftIndex = 0; leftIndex < listLength;leftIndex++) {
			if(leftIndex < mid)
			{
				leftArray[leftIndex] = list[leftIndex];
				
			}
			else
			{
				rightArray[rightIndex] = list[leftIndex];
				rightIndex++;
						
			}
			
			
		}
		mergeSort(leftArray,c);
		mergeSort(rightArray,c);
		merge(leftArray,rightArray,list,c);
			
					
		}
	
	public static <T extends Comparable<? super T>> void merge(T[] leftArray, T[] rightArray, T[]list)
	{
		int leftSize = list.length/2;
		int rightSize = list.length - leftSize;
		
		int currentIndex = 0, leftIndex = 0, rightIndex = 0;
		
		//check conditions for merging
		
		while(leftIndex < leftSize && rightIndex < rightSize)
		{
			//check if this leads it to be sorted in ascending or descending order
			if(leftArray[leftIndex].compareTo(rightArray[rightIndex]) <=0)
			{
				list[currentIndex++] = leftArray[leftIndex++];
				
			}
			else
			{
				list[currentIndex++] = rightArray[rightIndex++];
			}
		}
		
		while (leftIndex < leftSize)
		{
			list[currentIndex++] = leftArray[leftIndex++];
			
			
		}
		while (rightIndex < rightSize)
		{
			list[currentIndex++] = rightArray[rightIndex++];
			
			
		}
		
		
	}
	
	public static <T > void merge(T[] leftArray, T[] rightArray, T[]list,Comparator<? super T> c)
	{
		int leftSize = list.length/2;
		int rightSize = list.length - leftSize;
		
		int currentIndex = 0, leftIndex = 0, rightIndex = 0;
		
		//check conditions for merging
		
		while(leftIndex < leftSize && rightIndex < rightSize)
		{
			//check if this leads it to be sorted in ascending or descending order
			if(c.compare(leftArray[leftIndex], rightArray[rightIndex]) <=0)
			{
				list[currentIndex++] = leftArray[leftIndex++];
				
			}
			else
			{
				list[currentIndex++] = rightArray[rightIndex++];
			}
		}
		
		while (leftIndex < leftSize)
		{
			list[currentIndex++] = leftArray[leftIndex++];
			
			
		}
		while (rightIndex < rightSize)
		{
			list[currentIndex++] = rightArray[rightIndex++];
			
			
		}
		
	}
	
	
	
	
}
