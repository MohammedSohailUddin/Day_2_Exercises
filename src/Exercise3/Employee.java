package Exercise3;

public class Employee {
	private String name;
	private Integer age;
	private Long salary;
	public Employee(String name,Integer age, Long salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name: "+name+", age: "+age+", salary: "+salary+"]";
	}
}
//{
//HashMap<ImmutableKey, String> map = new HashMap<>();
//        ImmutableKey key = new ImmutableKey("A", "B");
//        map.put(key, "Test");
//        map.put(new ImmutableKey("A", "B"), "Test1");
//        map.put(new ImmutableKey("A", "B"), "Test2");
//        map.put(new ImmutableKey("A", "B"), "Test3");
//
//        System.out.println(map);
//        String data = map.get(new ImmutableKey("A", "B"));
//        System.out.println(data);
//
//}
//
//final class ImmutableKey {
//    private String key;
//    private String value;
//
//    public ImmutableKey(String key, String value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public String getValue() {
//        return value;
//    }
//}