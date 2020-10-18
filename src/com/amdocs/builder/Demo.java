package com.amdocs.builder;

public class Demo {
	public static void main(String[] args) {
		Address address  = new Address.Builder()
							.street("Maharaja Hata")
							.city("arrah")
							.district("bhojpur")
							.state("bihar")
							.pinCode(802301)
							.build();
		
		System.out.println(address.toString());
		
		Student s = new Student.Builder()
						.name("aman kumar")
						.rollNumber(17223006)
						.mobileNumber("1234567890")
						.address(address)
						.build();
		
		System.out.println(s.toString());
	}
}
