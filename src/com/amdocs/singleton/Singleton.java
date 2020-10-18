package com.amdocs.singleton;

public class Singleton {
	
	private Singleton() {
		
		System.out.println("in singleton constructor");
	}
	
	private static class SingletonHelper{
		
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
