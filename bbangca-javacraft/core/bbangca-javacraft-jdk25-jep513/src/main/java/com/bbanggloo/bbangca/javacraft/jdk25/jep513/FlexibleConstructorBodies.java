package com.bbanggloo.bbangca.javacraft.jdk25.jep513;

public class FlexibleConstructorBodies extends Person {

	public FlexibleConstructorBodies(int age) {
		// 기존의 코드는 int age를 미리 검사 할 수 없음 -> static 메서드는 가능
		// 부모 객체에서 유연한 확인을 하고 자식 객체에서 조금 더 디테일한 검증이 가능하다
		if (age != 20) {
			throw new IllegalArgumentException("나이가 20살이 아닙니다.");
		}
		super(age);
	}
}
