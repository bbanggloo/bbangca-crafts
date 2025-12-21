plugins {
	id("java-common-conventions")
}

tasks.register<JavaExec>("runNormal") {
	group = "aot"
	description = "1️⃣ 일반 JVM 실행 (JIT)"
	classpath = sourceSets.main.get().runtimeClasspath
	mainClass.set("com.bbanggloo.bbangca.javacraft.jdk25.jep514.AheadOfTimeCommandLineErgonomics")
}

tasks.register<Exec>("runAot") {
	group = "aot"
	description = "2️⃣ AOT 실행 (JEP 514)"
	commandLine(
		"java",
		"--aot",
		"-cp", sourceSets.main.get().runtimeClasspath.asPath,
		"com.bbanggloo.bbangca.javacraft.jdk25.jep514.AheadOfTimeCommandLineErgonomics"
	)
}