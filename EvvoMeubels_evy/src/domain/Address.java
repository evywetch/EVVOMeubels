package domain;

public class Address {
	private final int addressId;
	private final String streetName;
	private final int houseNumber;
	private final int additionalHouseNumber;
	private final String postalCode;
	private final String city;
	private final String country;

	private Address(AddressBuilder builder) {
		this.addressId = builder.addressId;
		this.streetName = builder.streetName;
		this.houseNumber = builder.houseNumber;
		this.additionalHouseNumber = builder.additionalHouseNumber;
		this.postalCode = builder.postalCode;
		this.city = builder.city;
		this.country = builder.country;

	}

	public static class AddressBuilder {

		private int addressId;
		private String streetName;
		private int houseNumber;
		private int additionalHouseNumber;
		private String postalCode;
		private String city;
		private String country;

		public AddressBuilder() {

		}

		public AddressBuilder addressId(int id) {
			this.addressId = id;
			return this;
		}

		public AddressBuilder streetName(String streetName) {
			this.streetName = streetName;
			return this;
		}

		public AddressBuilder houseNumber(int houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}

		public AddressBuilder additionalHousenumber(int additionalHouseNumber) {

			this.additionalHouseNumber = additionalHouseNumber;

			return this;
		}

		public AddressBuilder postalCode(String postalCode) {

			this.postalCode = postalCode;

			return this;
		}

		public AddressBuilder city(String city) {

			this.city = city;

			return this;
		}

		public AddressBuilder country(String country) {

			this.country = country;

			return this;
		}

		public Address build() {
			return new Address(this);
		}

	}

	public int getAddressId() {
		return addressId;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public int getAdditionalHouseNumber() {
		return additionalHouseNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {

		return getStreetName() + " " + getHouseNumber() + " " + getAdditionalHouseNumber() + " " + getPostalCode() + " "
				+ getCity() + " " + getCountry();
	}

}
