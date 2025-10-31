package com.bbanggloo.bbangca.javacraft.jdk25.jep512.module.test;

public class Berry {
	private Berry() {
	}

	public static Berry create() {
		return new Berry();
	}

	public String print() {
		return "Berry";
	}
}
