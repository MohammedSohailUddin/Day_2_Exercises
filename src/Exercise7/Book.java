package Exercise7;

public class Customer {

	private String CustomerName;
	private String CustomerAge;

	public Customer(String CustomerName, String CustomerAge) {
		super();
		this.CustomerName = CustomerName;
		this.CustomerAge = CustomerAge;
	}

	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}

	public String getCustomerAge() {
		return CustomerAge;
	}
	public void setCustomerAge(String CustomerAge) {
		this.CustomerAge = CustomerAge;
	}
	@Override
	public String toString() {
		return "[Customer Name: " + CustomerName + ", Customer Age: " + CustomerAge + "]";
	}
}
