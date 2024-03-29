package manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;


import shapes.*;

public class SortManager {

	
	public static  Shape[] shapes;
	private String fileName;
	private char compareType;
	private char sortType;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public char getCompareType() {
		return compareType;
	}

	public void setCompareType(char compareType) {
		this.compareType = compareType;
	}

	public char getSortType() {
		return sortType;
	}

	public void setSortType(char sortType) {
		this.sortType = sortType;
	}
	
	public static Shape[] getShapes()
	{
		return shapes;
	}
	
	public void setShapes(int length)
	{
		this.shapes = new Shape[length];
	}
	
	

	

	public SortManager(String[] args){
		
		setFileName("res/" + (args[0]).substring(2));
		setCompareType((args[1]).charAt(2));
		setSortType((args[2]).charAt(2));
		
		
		//just for debugging 
		System.out.println(getFileName());
		System.out.println(getCompareType());
		System.out.println(getSortType());
		fillShapeList();
		
		
		

	}
	
	public void fillShapeList()
	{
		// if the first arg doesnt start with -f we throw an exception
				
				
				
//				System.out.println(this.fileName);
				
				try {
					BufferedReader fin = new BufferedReader( new FileReader( getFileName() ));
					String line = fin.readLine();
					//System.out.println(line);
					
					//This reads the first line which is the length of the list.
					//It then sizes the shapes Array
					setShapes(Integer.parseInt(line));
					
//					this is creating an array with the number of elements inside the text file 
//					using the first line of the text
					int ShapesIndex = 0;
					
					
					//read the next line
					line = fin.readLine();
					
					while(line != null)
					{
						
						Object o = null;
						
						//parsing through the line and then splitting it
						String[] data = line.split(" ");
						
						//we need the className to use reflection
//						String className = data[0];
//						double height = Double.parseDouble(data[1]);
//						double radOrSide = Double.parseDouble(data[2]);
						
						//Create a class
						Class<?> paramTypes[] = new Class[2];
						
						//Declare the Parameters of the class
						paramTypes[0] = Double.TYPE;
						paramTypes[1] = Double.TYPE;
						
						
						String className = "shapes." + data[0];
						
						Class<?> cls = Class.forName( className );
						
						Constructor<?> ct = cls.getConstructor( paramTypes );
						
						

						Object argList[] = new Object[2];
						//data[1] = height
						//[data[2] =radOrSide
						argList[0] = Double.parseDouble(data[1]);
						argList[1] = Double.parseDouble(data[2]);

						o = ct.newInstance( argList );
						
						
						
						
						if(className.substring(7).equals("Cone")) shapes[ShapesIndex] = (Cone)o;
						else if(className.substring(7).equals("Cylinder")) shapes[ShapesIndex] = (Cylinder)o;
						else if(className.substring(7).equals("OctagonalPrism")) shapes[ShapesIndex] = (OctagonalPrism)o;
						else if(className.substring(7).equals("PentagonalPrism")) shapes[ShapesIndex] = (PentagonalPrism)o;
						else if(className.substring(7).equals("Pyramid")) shapes[ShapesIndex] = (Pyramid)o;
						else if(className.substring(7).equals("SquarePrism")) shapes[ShapesIndex] = (SquarePrism)o;
						else if(className.substring(7).equals("TriangularPrism")) shapes[ShapesIndex] = (TriangularPrism)o;
						
						//This line reads the next line of the text file
						line = fin.readLine();
						//Next index of the shapes array.
						ShapesIndex++;
					}
					
					
					fin.close();
					
				
				
				}
				catch(Exception e)
				{
					System.out.println("Something went wrong, during the reflection process." + e.getMessage());
				}
	}

}

