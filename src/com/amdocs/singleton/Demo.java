package com.amdocs.singleton;

public class Demo {
	
	public static void main(String[] args) {
		
		int s = Singleton.getInstance();
		System.out.println(s);
	}

}
