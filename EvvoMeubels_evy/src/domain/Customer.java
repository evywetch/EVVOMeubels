package domain;

public class Customer extends Person{

	
	private Customer(Builder builder) {
		super(builder);
		
	}
	
	
	public static class Builder extends Person.Builder{
		
		public Builder (){
			
		}

		
		@Override
		public Customer build() {
			
			return new Customer(this);
		}
	
	
	}


	@Override
	public String toString() {
		return this.getLastname() + ", " + this.getName() + ", " + this.getAddress();
	}
	
	
	
}

// bla bla
