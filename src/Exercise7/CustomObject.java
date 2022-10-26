package Exercise7;

import java.util.HashMap;
import java.util.Map;

public class CustomObject {

	public static void main(String[] args) {

		Map<Customer, String> myMap = new HashMap<Customer, String>();
		
		myMap.put(new Customer("Jack","35"),"1987");
		myMap.put(new Customer("Arun","23"),"1999");
		myMap.put(new Customer("Abdul","46"),"1976");

		myMap.forEach((key, value) -> System.out.println(key + " & " + "DoB: "+value));

	}
}

//Output:
//[Customer Name: Abdul, Customer Age 46] & DoB: 1976
//[Customer Name: Jack, Customer Age 35] & DoB: 1987
//[Customer Name: Arun, Customer Age 23] & DoB: 1999
