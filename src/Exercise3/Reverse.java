package Exercise3;
import java.util.Comparator;
import java.util.TreeSet;

class MyNameComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}

  public class Reverse {
  public static void main(String[] args) {

	  TreeSet<Employee> set = new TreeSet<Employee>(new MyNameComparator());
          set.add(new Employee("Red",23,2000L));
          set.add(new Employee("Green",33,3000L));
          set.add(new Employee("Black",43,4000L));
          set.add(new Employee("Pink",53,5000L));
          set.add(new Employee("Orange",63,6000L));

          TreeSet<Employee> setReverseView =
                  (TreeSet<Employee>)set.descendingSet();
       
              System.out.println("Sorted By Name View: "+set);
              System.out.println("Reverse View: "+setReverseView);
     }
  }

  
//Output:
  
//Normal View:
// [Employee [name: Black, age: 43, salary: 4000], 
//  Employee [name: Green, age: 33, salary: 3000], 
//  Employee [name: Orange, age: 63, salary: 6000], 
//  Employee [name: Pink, age: 53, salary: 5000], 
//  Employee [name: Red, age: 23, salary: 2000]]
//		  
//Reverse View: 
// [Employee [name: Red, age: 23, salary: 2000], 
//  Employee [name: Pink, age: 53, salary: 5000], 
//  Employee [name: Orange, age: 63, salary: 6000], 
//  Employee [name: Green, age: 33, salary: 3000], 
//  Employee [name: Black, age: 43, salary: 4000]]
