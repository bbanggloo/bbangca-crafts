package com.bbanggloo.bbangca.javacraft.jdk25.jep511;

/**
 * jdk25 이전 방법
 *
 * 컴파일 과정에서 사용된 패키지만 import 된다.
 */
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

//import com.bbanggloo.bbangca.javacraft.module.test.Apple;
//import com.bbanggloo.bbangca.javacraft.module.test.Berry;
//import com.bbanggloo.bbangca.javacraft.module.test.Citrus;

import module bbangca.javacraft.module.test;
import module java.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class ModuleImportDeclarations {

	static void main() {
		String[] fruits = new String[] { "apple", "berry", "citrus" };
		Map<String, String> m = Stream.of(fruits)
				.collect(Collectors.toMap(s -> s.toUpperCase().substring(0, 1), Function.identity()));

		log.info("{}", Apple.create().print());
		log.info("{}", Berry.create().print());
		log.info("{}", Citrus.create().print());

	}
}
