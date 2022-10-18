package Exercise5;

import java.util.TreeMap; 
public class RemoveNGet {  
          public static void main(String args[]) {

  TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

  myMap.put(1, "Apple");
  myMap.put(2, "Banana");
  myMap.put(3, "Orange");
  myMap.put(4, "Mango");
  myMap.put(5, "Cherry");

  System.out.println("Value before poll: " + myMap);
  System.out.println("pollFirstEntry returned value: " + myMap.pollFirstEntry());
  System.out.println("pollLastEntry returned value: " + myMap.pollLastEntry());
  System.out.println("Value after first and last poll: " + myMap);
 }
}

//Output:
//	
//	Value before poll: {1=Apple, 2=Banana, 3=Orange, 4=Mango, 5=Cherry}
//	pollFirstEntry returned value: 1=Apple
//	pollLastEntry returned value: 5=Cherry
//	Value after first and last poll: {2=Banana, 3=Orange, 4=Mango}
