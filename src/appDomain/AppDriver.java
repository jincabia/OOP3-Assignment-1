package appDomain;


import shapes.*;

import utilities.*;

import java.util.ArrayList;
import java.util.Collections;

import manager.*;
public class AppDriver
{

	public static void main( String[] args )
	{

		
		//TO DO
		// - Add Heap Sort
		
		try {

			SortManager SM = new SortManager(args);
			Shape[] shapes = SortManager.shapes;
			
			//Possible Compare Types could be height h, volume v, base area a
			char compareType = SM.getCompareType();
			
			//Possible Sort Types are bubble b, selection s, insertion i, merge m , quick q, or custom sort algo z
			char sortType = SM.getSortType();
			
			//initializing variables 
			long start = 0;
			long time = 0;
			
			//Checking if the Compare Type is Volume v,
			if(compareType == 'v')
			{
				System.out.println("This is sorted by Volume");
				
				//Creates a comparator to be called in sort methods
				VolumeComparator vc = new VolumeComparator();
				
				
				
//				
				//Checks for the Sort Type, then calls the appropriate sorting algorithm, and starts the timer
				if(sortType =='b')
				{
					System.out.println("Bubble Sort");
					start = System.currentTimeMillis();
					sort.bubbleSort(shapes,vc);
				}
				else if(sortType =='s')	
				{
					System.out.println("Selection Sort");

					start = System.currentTimeMillis();
					sort.selectionSort(shapes,vc);
				}
				else if(sortType =='i')
				{
					System.out.println("Insertion Sort");

					start = System.currentTimeMillis();
					sort.insertionSort(shapes,vc);
				}
				else if(sortType =='q')
				{
					System.out.println("Quick Sort");
					start = System.currentTimeMillis();
					QuickSort.sort(shapes, vc);
				}
				else if(sortType =='m')
				{
					System.out.println("Merge Sort");
					start = System.currentTimeMillis();
					sort.mergeSort(shapes, vc);
				}
				

				
				
				long stop = System.currentTimeMillis();
				time = stop-start;
				
				
				
				
			}
			//Checking if the Compare Type is Height h,
			else if(compareType == 'h')
			{
				System.out.println("This is sorted by Height");

				//Checks for the Sort Type, then calls the appropriate sorting algorithm, and starts the timer

				if(sortType =='b')
				{
					System.out.println("Bubble Sort");

					start = System.currentTimeMillis();
					sort.bubbleSort(shapes);
				}
				else if(sortType =='s')
				{
					System.out.println("Selection Sort");

					start = System.currentTimeMillis();
					sort.selectionSort(shapes);
				}
				else if(sortType =='i')
				{
					System.out.println("Insertion Sort");

					start = System.currentTimeMillis();
					sort.insertionSort(shapes);
				}
				
				else if(sortType =='q')
				{
					System.out.println("Quick Sort");
					start = System.currentTimeMillis();
					QuickSort.sort(shapes);
				}
				else if(sortType =='m')
				{
					System.out.println("Merge Sort");
					start = System.currentTimeMillis();
					sort.mergeSort(shapes);
				}
				long stop = System.currentTimeMillis();
				time = stop-start;
				
			}
			else {
				//Checking if the Compare Type is Base Area a,
				System.out.println("This is sorted by Base Area");
				BaseAreaComparator bac = new BaseAreaComparator(); 
				
				//Checks for the Sort Type, then calls the appropriate sorting algorithm, and starts the timer

				if(sortType =='b')
				{
					System.out.println("Bubble Sort");

					start = System.currentTimeMillis();
					sort.bubbleSort(shapes,bac);
				}
				else if(sortType =='s')
				{
					System.out.println("Selection Sort");

					start = System.currentTimeMillis();
					sort.selectionSort(shapes,bac);
				}
				else if(sortType =='i')
				{
					System.out.println("Insertion Sort");

					start = System.currentTimeMillis();
					sort.insertionSort(shapes,bac);
				}
				
				else if(sortType =='q')
				{
					System.out.println("Quick Sort");
					start = System.currentTimeMillis();
					QuickSort.sort(shapes, bac);
				}
				else if(sortType =='m')
				{
					System.out.println("Merge Sort");
					start = System.currentTimeMillis();
					sort.mergeSort(shapes, bac);
				}
				
				long stop = System.currentTimeMillis();
				time = stop-start;
				

			}
			
			
			
			System.out.println("First value in shapes");
			System.out.println(shapes[0]);
			
			//Checks if the array has more than 1000 objects.
//			if(shapes.length-1 > 1000)
//			{
//				for(int currentIndex = 1000; currentIndex <= shapes.length-1; currentIndex = currentIndex + 1000)
//				{
//					//Prints out every 1000th shape
////					
//					System.out.println("This value is the " + currentIndex + "th value");
//					System.out.println(shapes[currentIndex]);
//				}
//			}
			
			System.out.println("Last value in shapes");
			System.out.println(shapes[shapes.length-1]);
			
			//This time console print can be anywhere I just couldnt see it when there was 1000000 shapes.
			System.out.println("The time is: "+time+"ms");
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Bruh");
		}
		
		
//		
		
		
		
		 
		
		
		
		

		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

		// refer to demo03 OfficeManager.java on how to create specific
		// objects using reflection from a String
	}

}
