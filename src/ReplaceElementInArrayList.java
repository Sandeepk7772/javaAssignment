package javaAssignment;
import java.util.*;

public class ReplaceElementInArrayList {

	public static void main(String[] args) {
				
		ArrayList<String> inputArrayList = new ArrayList<String>();
		
		inputArrayList.add("Red");
		inputArrayList.add("Green");
		
		System.out.println("Original array list:  " +inputArrayList);
		inputArrayList.set(1,"White");
		
		System.out.println("Replace second element with 'White' :" + inputArrayList);
		

	}

}
