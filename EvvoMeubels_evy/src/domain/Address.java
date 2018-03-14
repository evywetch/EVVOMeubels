package domain;

public class Address {
	private final int id;
	private final String streetname;
	private final int housenumber;
	private final int addiHousenumber;
	private final int postcode;
	private final String city;
	private final int postaddress;

	private Address(Builder builder) {
		this.id = builder.id;
		this.streetname = builder.streetname;
		this.housenumber = builder.housenumber;
		this.addiHousenumber = builder.addiHousenumber;
		this.postcode = builder.postcode;
		this.city = builder.city;
		this.postaddress = builder.postaddress;

	}

	public static class Builder {

		private int id;
		private String streetname;
		private int housenumber;
		private int addiHousenumber;
		private int postcode;
		private String city;
		private int postaddress;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder streetname(String streetname) {
			this.streetname = streetname;
			return this;
		}

		public Builder housenumber(int housenumber) {
			this.housenumber = housenumber;
			return this;
		}

		public Builder addiHousenumber(int addiHousenumber) {

			this.addiHousenumber = addiHousenumber;

			return this;
		}

		public Builder postcode(int postcode) {

			this.postcode = postcode;

			return this;
		}

		public Builder city(String city) {

			this.city = city;

			return this;
		}

		public Builder postaddress(int postaddress) {

			this.postaddress = postaddress;

			return this;
		}
		
		public Address build(){
			return new Address(this);
		}

	}

	public int getClientId() {
		return id;
	}

	
	public String getStreetName() {
		return streetname;
	}

	
	public int getHousenumber() {
		return housenumber;
	}

	

	public int getAddiHousenumber() {
		return addiHousenumber;
	}

	
	public int getPostcode() {
		return postcode;
	}

	

	public String getCity() {
		return city;
	}

	

	public int getPostaddress() {
		return postaddress;
	}

	

}
