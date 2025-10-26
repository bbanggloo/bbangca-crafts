plugins {
	`java-library`
	id("io.freefair.lombok")
}

repositories {
	mavenCentral()
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(25)
	}
}

dependencies {
	// JUnit5
	testImplementation("org.junit.jupiter:junit-jupiter:6.0.0")

	// AssertJ
	testImplementation("org.assertj:assertj-core:3.26.3")

	// SLF4J
	runtimeOnly("ch.qos.logback:logback-classic:1.5.12")
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}
