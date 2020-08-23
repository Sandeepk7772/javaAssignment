package javaAssignment;
import java.util.*;
public class AssociteValueAndKeyInHashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> inputHashMap= new HashMap<String,String>();  
		
		inputHashMap.put("a", "Red");
		inputHashMap.put("a", "Green");
		inputHashMap.put("a", "Black");
		inputHashMap.put("d", "White");
		inputHashMap.put("e", "Red");
		
		for (Map.Entry<String, String> pair : inputHashMap.entrySet()) {
			System.out.println(pair.getValue());
		}
//		System.out.println(inputHashMap.get(66767));
//		for(int i=1; i<=5;i++) {
			
//			System.out.println(inputHashMap.get(i));
			
//		}
	
//		System.out.println(inputHashMap.entrySet());
//        inputHashMap.forEach((key, value) -> System.out.println(key + " " + value));
}

}
