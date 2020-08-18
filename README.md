![questions-banner](https://user-images.githubusercontent.com/16836599/49394245-5e3ce800-f759-11e8-9a88-a4853a998d67.png)

1. Write a Java program to sum values of an array.
    * Test Data : 
        * Input Array : {2,5,4,8,7}
    * Expected Output : 
        * The sum is 26

2. Write a Java program to find the duplicate values of an array of integer values.
    * Test Data :
        * Input Array : {1, 2, 5, 5, 6, 6, 7, 2}
    * Expected Output : 
        * Duplicate Element : 2                                                                                         
          Duplicate Element : 5                                                                                         
          Duplicate Element : 6

3. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
    * Test Data :
        * Input Array : {2, 7, 4, -5, 11, 5, 20}                                                                                         
          Specified Number : 15
    * Expected Output : 
        * Pairs of elements and their sum :                                                                             
          4 + 11 = 15                                                                                                
          -5 + 20 = 15
        
4. Write a Java program to check if an array of integers contains only these two specified elements 65 and 77.
    * Test Data :
        * Input Array : {77, 77, 65, 65, 65, 77}
        * Input Array : {77, 78, 65, 65, 65, 77}
    * Expected Output : 
        * Original Array: [77, 77, 65, 65, 65, 77]                               
          Result: true
        * Original Array : [77, 78, 65, 65, 65, 77]                               
          Result: false


5. Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.
    * Test Data :
        * Input Array : {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}
    * Expected Output : 
        * Original Array : [0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1]                               
          Array after segregation is : [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1]

6. Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and 
then odd numbers.
    * Test Data :
        * Input Array : {20, 12, 23, 17, 7, 8, 10, 2, 1, 0}
    * Expected Output : 
        * Original Array : [20, 12, 23, 17, 7, 8, 10, 2, 1, 0]                               
          Array after separation : [20, 12, 0, 2, 10, 8, 7, 17, 1, 23]

7. Write a Java program to find the equilibrium indices from a given array of integers.
    * Test Data :
        * Input Array : {-7, 1, 5, 2, -4, 3, 0}
    * Expected Output : 
        * Original Array : [-7, 1, 5, 2, -4, 3, 0]                                                                                         
          Equilibrium indices found at : 3                                                                                         
          Equilibrium indices found at : 6

8. Write a Java program to find and print one continuous subarray (from a given array of integers) that if you only 
sort the said subarray in ascending order then the entire array will be sorted in ascending order.
    * Test Data :
        * Input Array : {1, 2, 3, 0, 4, 6}
        * Input Array : {1, 3, 2, 7, 5, 6, 4, 8}
    * Expected Output : 
        * Original Array : [1, 2, 3, 0, 4, 6]                                                                                         
          Continuous subArray is : 1 2 3 0 
        * Original Array : [1, 3, 2, 7, 5, 6, 4, 8]                                                                                         
          Continuous subarray is : 3 2 7 5 6 4 

9. Write a Java program to create a new array list, add some colors (string) and print out the collection.
    * Test Data :
        * Input's : Red, Green, Orange, White, Black
    * Expected Output : 
        * [Red, Green, Orange, White, Black]

10. Write a Java program to reverse elements in an array list.
    * Test Data :
        * Input's : Red, Green, Orange, White, Black
    * Expected Output : 
        * List before reversing : [Red, Green, Orange, White, Black]                                     
          List after reversing : [Black, White, Orange, Green, Red]

11. Write a Java program to replace the second element of an ArrayList with the specified element.
    * Test Data :
        * Input's : Red, Green
          Replace with : White
    * Expected Output : 
        * Original array list: [Red, Green]                                      
          Replace second element with 'White'.                                   
          Red                                                                    
          White
        
12. Write a Java program to append the specified element to the end of a linked list.
    * Test Data :
        * Input's : Red, Green, Black, White, Pink                                                                                         
          Element to append : Yellow
    * Expected Output : 
        * The linked list: [Red, Green, Black, White, Pink, Yellow]

13. Write a Java program to display the elements, and their positions in a linked list. 
    * Test Data :
        * Input's : Red, Green, Black, Pink, Orange
          Element to append : Yellow
    * Expected Output : 
        * Original linked list:[Red, Green, Black, Pink, Orange]                 
          Element at index 0: Red                                                
          Element at index 1: Green                                              
          Element at index 2: Black                                              
          Element at index 3: Pink                                               
          Element at index 4: Orange

14. Write a Java program to retrieve but does not remove, the last element of a linked list.
    * Test Data :
        * Input's : Red, Green, Black, White, Pink                                                                                         
          Element to append : Yellow
    * Expected Output : 
        * Original linked list: [Red, Green, Black, White, Pink]                 
          Last element in the list: Pink                                         
          Original linked list: [Red, Green, Black, White, Pink]

15. Write a Java program to append the specified element to the end of a hash set.
    * Test Data :
        * Input's : Red, Green, Black, White, Pink                                                                                         
          Element to append : Yellow
    * Expected Output : 
        * The Hash Set: [Red, White, Pink, Yellow, Black, Green]

16. Write a Java program to compare two sets and retain elements which are same on both sets.
    * Test Data :
        * First HashSet Inputs : Red, Green, Black, White                                                                                         
          Second HashSet Inputs : Red, Pink, Black, Orange
    * Expected Output : 
        * First HashSet content: [Red, White, Black, Green]                      
          Second HashSet content: [Red, Pink, Black, Orange]                     
          HashSet content:                                                       
          [Red, Black]

17. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    * Test Data :
        * Input's : Red, Green, Orange, White, Black
    * Expected Output : 
        * Tree set : [Black, Green, Orange, Red, White]

18. Write a Java program to get the element in a tree set which is less than or equal to the given element.
    * Test Data :
        * Input's : 10, 22, 36, 25, 16, 70, 82, 89, 14
    * Expected Output : 
        * Less than or equal to 86 : 82                                          
          Less than or equal to 29 : 25

19. Write a Java program to associate the specified value with the specified key in a HashMap.
    * Test Data :
        * Input's : (1, "Red"), (2, "Green"), (3, "Black"), (4, "White"), (5, "Blue");
    * Expected Output : 
        * 1 Red                                                                  
          2 Green                                                                
          3 Black                                                                
          4 White                                                                
          5 Blue

20. Write a Java program to get a set view of the keys contained in a HashMap.
    * Test Data :
        * Input's : (1, "Red"), (2, "Green"), (3, "Black"), (4, "White"), (5, "Blue");
    * Expected Output : 
        * Key set values are: [1, 2, 3, 4, 5]

21. Write a Java program to associate the specified value with the specified key in a Tree Map.
    * Test Data :
        * Input's : (1, "Red"), (2, "Green"), (3, "Black"), (4, "White"), (5, "Blue");
    * Expected Output : 
        * 1=>Red                                                                 
          2=>Green                                                               
          3=>Black                                                               
          4=>White                                                               
          5=>Blue

22. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
    * Test Data :
        * Input's : (10, "Red"), (20, "Green"), (40, "Black"), (50, "White"), (60, "Pink");
    * Expected Output : 
        * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}                                                                      
          Checking the entry for 10 :
          Value is: 10=Red                                                       
          Checking the entry for 30 :                                             
          Value is: 20=Green                                                     
          Checking the entry for 70 :                                             
          Value is: 60=Pink

23. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
    * Test Data :
        * TreeMap Values : (10, "Red"), (20, "Green"), (30, "Black"), (40, "White"), (50, "Pink");
    * Expected Output : 
        * Original TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink}                                                                      
        * Sub map key-values: {20=Green, 30=Black}
        
24. Write a Java method to find the smallest number among three numbers.
    * Test Data :
        * Inputs : 25, 37, 29
    * Expected Output : 
        * The smallest value is 25.0

25. Write a Java method to check whether a string is a valid password.
    * Password rules:
        * A password must have at least ten characters.
        * A password consists of only letters and digits.
        * A password must contain at least two digits.
    
    * Expected Output:
        * 1. A password must have at least ten characters.                                             
          2. A password consists of only letters and digits.                                         
          3. A password must contain at least two digits                                        
          Input a password (You agree to the above Terms and Conditions.): abcd1234           
          Password is valid: abcd1234 

26. Write a Java program that accepts three numbers and prints "Every number is equal" if all three numbers are equal, 
"Every number is different" if all three numbers are different and "Neither every number is equal nor different" otherwise.
    * Test Data
        * Inputs : 2564, 3526, 2456
    * Expected Output :
        * Input first number: 2564                                                                                      
          Input second number: 3526                                                                                     
          Input third number: 2456                                                                                      
          Every number is different

27. Write a Java program to break an integer into a sequence of individual digits.  
    * Test Data
        * Input: 123456
    * Expected Output :
        * Input six non-negative digits: 123456                                                                         
          1 2 3 4 5 6
