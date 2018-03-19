package Rsvier.evvo.medel;

import java.util.Locale.Builder;

public abstract class Person {

	protected final int id;
	protected final String name;
	protected final String lastName;
	protected final String middleName;
	protected final String email;
	protected final Address address;

	protected Person(PersonBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.middleName = builder.middleName;
		this.address = builder.address;
		this.email = builder.email;
	}

	public static abstract class PersonBuilder {

		protected int id;
		protected String name;
		protected String lastName;
		protected String middleName;
		protected  String email;
		protected Address address;

		public PersonBuilder() {

		}

		public PersonBuilder id(int id) {
			this.id = id;
			return this;
		}

		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public PersonBuilder middlename(String middleName) {
			this.middleName = middleName;
			return this;
		}
		public PersonBuilder email(String email) {
			this.email = email;
			return this;
		}

		public PersonBuilder address(Address address) {
			this.address = address;
			return this;
		}

		public abstract Person build();

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		
		if(middleName == null)
			return "";
		 else
		
		return middleName;
		
	}
	public String getEmail() {
		return email;
	}


	public Address getAddress() {
		return address;
	}


	
}
