package Exercise3;
class Employee {
	private String name;
	private Integer age;
	private Long salary;
	public Employee(String name,int age, Long salary) {
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
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name: "+name+", age: "+age+", salary: "+salary+"]";
	}
}
