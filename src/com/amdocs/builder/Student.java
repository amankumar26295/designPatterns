package com.amdocs.builder;

public class Student {
	
	private String name;
	private Integer rollNumber;
	private String mobileNumber;
	private Integer age;
	private Address address;
	
	private Student(Builder builder) {
		this.name=builder.name;
		this.rollNumber=builder.rollNumber;
		this.mobileNumber=builder.mobileNumber;
		this.address=builder.address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static class Builder{
		
		private String name;
		private Integer rollNumber;
		private String mobileNumber;
		private Integer age;
		private Address address;
		
		
		
		public Builder name(String name) {
			this.name=name;
			return this;
		}
		public Builder rollNumber(Integer rollNumber) {
			this.rollNumber=rollNumber;
			return this;
		}
		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;
			return this;
		}
		public Builder age(Integer age) {
			this.age=age;
			return this;
		}
		public Builder address(Address address) {
			this.address=address;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
		
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", rollNumber=" + rollNumber +
				", mobileNumber='" + mobileNumber + '\'' +
				", age=" + age +
				", address=" + address +
				'}';
	}


}
