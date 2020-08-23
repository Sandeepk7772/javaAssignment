package javaAssignment;
import java.util.*;
public class CompareTwoSetsInHashSet {
	
	/*  Q12:-Write a Java program to compare two sets and retain elements which 
	    are same on both sets.
      ◦ Test Data :
        First HashSet Inputs : Red, Green, Black, White
        Second HashSet Inputs : Red, Pink, Black, Orange
	 */

	public static void main(String[] args) {
		 HashSet<String> hashSetInput1 = new HashSet<String>();
	     
		 hashSetInput1.add("Red");
		 hashSetInput1.add("Green");
		 hashSetInput1.add("Black");
		 hashSetInput1.add("White");
	          
	          System.out.println("Frist HashSet content: "+hashSetInput1);
	          
	          HashSet<String>hashSetInput2 = new HashSet<String>();
	          
	          hashSetInput2 .add("Red");
	          hashSetInput2 .add("Pink");
	          hashSetInput2 .add("Black");
	          hashSetInput2 .add("Orange");
	          
	          System.out.println("Second HashSet content: "+hashSetInput2 );
	          
	          hashSetInput1.retainAll(hashSetInput2 );
	          
	          System.out.println("HashSet content:" + hashSetInput1);
	         
	     }


	}

