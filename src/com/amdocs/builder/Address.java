package com.amdocs.builder;

public class Address {
	private String street;
	private String city;
	private String district;
	private String state;
	private String landMark;
	private Integer pinCode;
	
	private Address(Builder builder) {
		this.street=builder.street;
		this.city=builder.city;
		this.district=builder.district;
		this.state=builder.state;
		this.pinCode=builder.pinCode;
		this.landMark=builder.landMark;
	}

	public String getStreet() {
		
		return street;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
	
	public static class Builder{
		
		private String street;
		private String city;
		private String district;
		private String state;
		private Integer pinCode;
		private String landMark;
		
		public Builder street(String street) {	
			this.street = street;	
			return this;
		}
		
		public Builder city(String city) {
			this.city = city;
			return this;
		}
		
		public Builder district(String district) {
			this.district=district;
			return this;
		}
		
		public Builder state(String state) {
			this.state=state;
			return this;
		}
		
		public Builder pinCode(Integer pinCode) {
			this.pinCode=pinCode;
			return this;
		}

		public Builder landMarks(String landMark) {
			this.landMark=landMark;
			return this;
		}
		
		public Address build() {
			return new Address(this);
		}
	}

	@Override
	public String toString() {
		return "Address{" +
				"street='" + street + '\'' +
				", city='" + city + '\'' +
				", district='" + district + '\'' +
				", state='" + state + '\'' +
				", landMark='" + landMark + '\'' +
				", pinCode=" + pinCode +
				'}';
	}

}
