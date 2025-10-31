package com.bbanggloo.bbangca.javacraft.jdk25.jep512;

public class InstanceMainMethods {
	private String test;

	static void main(String[] args) {
		// 불가 멤버변수 접근
		// System.out.println(this.test);
		// System.out.println(print());
	}

	void main() {
		System.out.println(this.test);
		System.out.println(print());
		System.out.println("InstanceMainMethods !!!");
	}

	String print() {
		return "print";
	}
}
