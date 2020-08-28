package javaAssignment;
import java.util.*;
public class DisplayElementsAndPositions {

	public static void main(String[] args) {
		LinkedList<String> inputlist = new LinkedList<String>();
		  
		inputlist.add("Red");
		inputlist.add("Green");
		inputlist.add("Black");
		inputlist.add("Pink");
		inputlist.add("orange");
		      
		   
		   System.out.println("Original linked list: " + inputlist);  
		  for(int i=0; i < inputlist.size(); i++)
		   {
		      System.out.println("Element at index "+ i +": "+inputlist.get(i));
		    } 
		 }

	}


