package com.bbanggloo.bbangca.javacraft.module.test;

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
