module module.test {
	/**
	 * 생각보다 까다로운 네이밍 규칙 숫자 안됨
	 * 아래와 같이 선언시 하위 패키지에서 만 접급 가능 -> 하지만 module-test에서도 bbangca.javacraft 모듈을 참조 해야한다
	 * exports com.bbanggloo.bbangca.javacraft.module.test to bbangca.javacraft;
	 */
	exports com.bbanggloo.bbangca.javacraft.jdk25.jep512.module.test;
}
