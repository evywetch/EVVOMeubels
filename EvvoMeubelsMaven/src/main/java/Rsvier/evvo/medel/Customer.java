package Rsvier.evvo.medel;

public class Customer extends Person{

	
	private Customer(CustomerBuilder builder) {
		super(builder);
		
	}
	
	
	public static class CustomerBuilder extends Person.PersonBuilder{
		
		public CustomerBuilder (){
			
		}

		
		@Override
		public Customer build() {
			
			return new Customer(this);
		}
	
	
	}


	@Override
	public String toString() {
		return this.getLastName() + ", " + this.getName() + ", " + this.getAddress();
	}
	
	
	
}


