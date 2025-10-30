package com.bbanggloo.bbangca.javacraft.module.test;

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
