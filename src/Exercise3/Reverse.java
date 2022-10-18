package Exercise3;
import java.util.TreeSet;
import java.util.Iterator;
  public class Reverse {
  public static void main(String[] args) {

	  TreeSet<String> t_set = new TreeSet<String>();
          t_set.add("Red");
          t_set.add("Green");
          t_set.add("Black");
          t_set.add("Pink");
          t_set.add("orange");

     System.out.println("Original tree set:" + t_set);  
     Iterator<String> it = t_set.descendingIterator();
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.print(it.next()+" ");
     }
  }
}
  
//  Output:
//	  
//  Original tree set:[Black, Green, Pink, Red, orange]
//  Elements in Reverse Order:
//  orange Red Pink Green Black 

  
  
//unable to get employee object
  
//import java.util.TreeSet;
//import java.util.Iterator;
//import Exercise3.Employee;
//  public class Reverse {
//  public static void main(String[] args) {
//     TreeSet<Employee> t_set = new TreeSet<Employee>();
//          t_set.add(new Employee("ABC", 30, 4000L));
//          t_set.add(new Employee("MNO", 40, 5000L));
//          t_set.add(new Employee("PQR", 50, 6000L));
//          t_set.add(new Employee("XYZ", 60, 7000L));
//   System.out.println("Original tree set:" + t_set);  
//     Iterator<Employee> it = t_set.descendingIterator();
//     System.out.println("Elements in Reverse Order:");
//     while (it.hasNext()) {
//        System.out.println(it.next());
//     }
//  }
//}
