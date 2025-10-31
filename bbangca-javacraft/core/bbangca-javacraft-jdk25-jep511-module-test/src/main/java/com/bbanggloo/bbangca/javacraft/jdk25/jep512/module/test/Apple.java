package com.bbanggloo.bbangca.javacraft.jdk25.jep512.module.test;

public class Apple {
	private Apple() {
	}

	public static Apple create() {
		return new Apple();
	}

	public String print() {
		return "Apple";
	}
}
