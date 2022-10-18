package Exercise1;

//Integer ArrayList
import java.util.*;

public class ArrayL {
public static void main(String[] args) {
	  
List<Integer> myList = new ArrayList<Integer>();
myList.add(1);
myList.add(2);
myList.add(3);
myList.add(4);
myList.add(5);

System.out.println(myList);

// Retrieving 3rd element
System.out.println("3rd Element is: "+ myList.get(2));

// Update the third element with 9
myList.set(2, 9);

// Print the list again
System.out.println("Updated List: "+ myList);
}
}

//Output:
//	
//	[1, 2, 3, 4, 5]
//	3rd Element is: 3
//	Updated List: [1, 2, 9, 4, 5]



//String ArrayList

//import java.util.*;
//
//public class ArrayL {
//public static void main(String[] args) {
//	  
//List<String> myList = new ArrayList<String>();
//myList.add("One");
//myList.add("Two");
//myList.add("Three");
//myList.add("Four");
//myList.add("Five");
//
//System.out.println(myList);
//
//// Retrieving 5th element
//System.out.println("5th Element is: "+ myList.get(4));
//
//// Update the fifth element with "Zero"
//myList.set(4, "Zero");
//
//// Print the list again
//System.out.println("Updated List: "+ myList);
//}
//}

//Output:
//	
//	[One, Two, Three, Four, Five]
//	5th Element is: Five
//	Updated List: [One, Two, Three, Four, Zero]
