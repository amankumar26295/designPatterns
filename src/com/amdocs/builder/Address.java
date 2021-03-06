package com.amdocs.builder;

public class Address {
	private String street;
	private String city;
	private String district;
	private String state;
	private Integer pinCode;
	
	private Address(Builder builder) {
		this.street=builder.street;
		this.city=builder.city;
		this.district=builder.district;
		this.state=builder.state;
		this.pinCode=builder.pinCode;
	}

	public String getStreet() {
		
		return street;
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
		
		public Address build() {
			return new Address(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("street : "+street+"\n");
		sb.append("city : "+city+"\n");
		sb.append("district : "+district+"\n");
		sb.append("state : "+state+"\n");
		sb.append("pinCode :"+pinCode+"\n");
		
		return sb.toString();
		
	}

}
