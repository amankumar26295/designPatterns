package com.amdocs.singleton;

public class Singleton {
	
	private Singleton() {
		//System.out.println(SingletonHelper.INSTANCE);
		System.out.println("in singleton constructor");
	}
	
	private static class SingletonHelper{
		private static int a=10;
		//private static final Singleton INSTANCE = new Singleton();
	}
	
	public static int getInstance() {
		return SingletonHelper.a;
	//	return SingletonHelper.INSTANCE;
	}

}
