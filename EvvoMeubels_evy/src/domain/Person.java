package domain;

import java.util.Locale.Builder;

public abstract class Person {

	private final int id;
	private final String name;
	private final String lastname;
	private final String middlename;
	private final String email;
	private final Address address;

	protected Person(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.lastname = builder.lastname;
		this.middlename = builder.middlename;
		this.address = builder.address;
		this.email = builder.email;
	}

	public static abstract class Builder {

		private int id;
		private String name;
		private String lastname;
		private String middlename;
		private  String email;
		private Address address;

		public Builder() {

		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder lastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public Builder middlename(String middlename) {
			this.middlename = middlename;
			return this;
		}
		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder address(Address address) {
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

	public String getLastname() {
		return lastname;
	}

	public String getMiddlename() {
		
		if(middlename == null)
			return "";
		 else
		
		return middlename;
		
	}
	public String email() {
		return email;
	}


	public Address getAddress() {
		return address;
	}
}
