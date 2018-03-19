package Rsvier.evvo.medel;

public class Employee extends Person {

	private final int accountId;

	private Employee(EmployeeBuilder builder) {
		super(builder);

		this.accountId = builder.accountId;

	}

	public static class EmployeeBuilder extends Person.PersonBuilder {

		private int accountId;

		public EmployeeBuilder() {

		}

		public EmployeeBuilder accountId(int accountId) {
			this.accountId = accountId;
			return this;
		}

		@Override
		public Employee build() {

			return new Employee(this);
		}

	}
	
	public int getAccountId(){
		return accountId;
	}

	@Override
	public String toString() {
		return this.getLastName() + ", " + this.getName() + ", "+ this.getAddress();
	}
	
	

}
