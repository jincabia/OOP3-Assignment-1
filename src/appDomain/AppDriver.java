package appDomain;


import shapes.*;
import utility.*;

import java.util.ArrayList;
import java.util.Collections;

import manager.*;
public class AppDriver
{

	public static void main( String[] args )
	{

		// Cylinder cy = new Cylinder(50,3);
		// System.out.println("base area = " + cy.calcBaseArea());

		// System.out.println("Volume = " + cy.calcVolume());

		
//		System.out.println("Hi");
		try {

			new SortManager(args);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Bruh");
		}
		
		Shape[] fart = SortManager.shapes;
//		ArrayList<Shape> asd = SortManager.getShapes();
//		System.out.println(SortManager.getFileName());
//		System.out.println("Unsorted");
//		for(Shape s: fart)
//		{
//			System.out.println(s);
//		}
		
		VolumeComparator vc = new VolumeComparator();
//		Collections.sort(fart, vc);
//		System.out.println("Sorted by Volume");
//
//		for(Shape s: fart)
//		{
//			System.out.println(s);
//		}
		
//		System.out.println("This is using Sort Insertion Sort Comparable Height");
//		System.out.println("Sort Insertion Comparator Volume");
//		sort.insertionSort(fart,vc);
		
//		System.out.println("Bubble sort height comparable");
//		System.out.println("Bubble sort volume Comparator");
//		sort.bubbleSort(fart,vc);
		
//		System.out.println("Selection sort heigh comaparable");
		System.out.println("selection sort volume comparator");
		sort.selectionSort(fart,vc);
		
		for(Shape s: fart)
		{
			System.out.println(s);
		}
		
		 
		//Do the if statements based on the args.
		
		

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
