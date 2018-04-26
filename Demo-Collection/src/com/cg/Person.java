package com.cg;

public class Person implements Comparable {
	private String userName;
	private int age;

	public Person(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		
		return this.userName.equals(((Person)obj).userName);
	
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		return 0;
		
		System.out.println("Comparing "+ this + " with "+ o);
		
		int diff = this.age - ((Person)o).age;
		return diff;
	}
	
	public String toString() {
		return userName + "/" + age;
	}
	
	
	
}
