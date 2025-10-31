package com.bbanggloo.bbangca.javacraft.jdk25.jep513;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FlexibleConstructorBodiesTest {

	@Test
	void TC_FLEXIBLE_CONSTRUCTOR_BODIES_01() {
		int age_0 = 0;
		Assertions.assertThatThrownBy(() -> new FlexibleConstructorBodies(age_0))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessageContaining("나이가 20살이 아닙니다.");

	}
}