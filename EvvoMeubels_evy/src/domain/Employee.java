package domain;

public class Employee extends Person {

	private final String password;

	private Employee(Employee.Builder builder) {
		super(builder);

		this.password = builder.password;

	}

	public static class Builder extends Person.Builder {

		private String password;

		public Builder() {

		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		@Override
		public Employee build() {

			return new Employee(this);
		}

	}
	
	public String getPassword(){
		return password;
	}

	@Override
	public String toString() {
		return this.getLastname() + ", " + this.getName() + ", "+ this.getAddress();
	}
	
	

}
