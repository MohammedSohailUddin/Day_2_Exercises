package Exercise6;

import java.util.TreeSet;

public class RetrieveNRemove {
public static void main(String[] args) {

	  TreeSet <Integer> mySet = new TreeSet<Integer>();
   
	  mySet.add(10);
	  mySet.add(30);
	  mySet.add(50);
	  mySet.add(40);
	  mySet.add(20);
 
 System.out.println("Original tree set: "+mySet);
 System.out.println("Removes the first(lowest) element: "+mySet.pollFirst());
 System.out.println("Removes the first(lowest) element: "+mySet.pollLast());
 System.out.println("Tree set after removing first and last element: "+mySet);
 }    
}

//Output:
//	
//	Original tree set: [10, 20, 30, 40, 50]
//			Removes the first(lowest) element: 10
//			Removes the first(lowest) element: 50
//			Tree set after removing first and last element: [20, 30, 40]

