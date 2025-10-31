package com.bbanggloo.bbangca.javacraft.jdk25.jep513;

public class Person {
	private final int age;

	public Person(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
		}
		this.age = age;
	}
}
