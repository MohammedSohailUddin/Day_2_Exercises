package Exercise7;

import java.util.HashMap;
import java.util.Map;

public class CustomObject {

	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("James Gosling ", " Java");
		myMap.put("Bjourn Stroustup ", " C++");
		myMap.put("Denish Ritche ", " C");

		System.out.println(myMap);

		myMap.forEach((key, value) -> System.out.println(key + " => " + value));

	}
}


//Output:
//	
//	{Bjourn Stroustup = C++, Denish Ritche = C, James Gosling = Java}
//		Bjourn Stroustup  =>  C++
//		Denish Ritche  =>  C
//		James Gosling  =>  Java




//unable to get book object

//package Exercise7;
//
//import java.util.HashMap;
//import java.util.Map;
//import Exercise7.Book;
//
//public class CustomObject {
//
//	public static void main(String[] args) {
//
//		Map<Book, String> myMap = new HashMap<Book, String>();
//		
//		myMap.put(new Book("James Gosling", "Java"),"Java");
//		myMap.put(new Book("Bjourn Stroustup", "C++"),"C++");
//		myMap.put(new Book("Denish Ritche", "C"),"C");
//
//		System.out.println(myMap);
//
//		myMap.forEach((key, value) -> System.out.println(key + " => " + value));
//
//	}
//}
//
//Output: