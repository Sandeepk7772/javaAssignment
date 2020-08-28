package javaAssignment;

import java.util.*;
public class RetrieveElementInLinkedList {

	public static void main(String[] args) {
		
		  LinkedList <String> inputlist = new LinkedList <String> ();
		  inputlist.add("Red");
		  inputlist.add("Green");
		  inputlist.add("Black");
		  inputlist.add("White");
		  inputlist.add("Pink");
		  
		  System.out.println("Original linked list: " + inputlist);    
	
		  String peekInList = inputlist.peekLast();
		        
		  System.out.println("Last element in the list: " + peekInList);
		    
		  System.out.println("Original linked list: " + inputlist);
		    
		 }

	}


