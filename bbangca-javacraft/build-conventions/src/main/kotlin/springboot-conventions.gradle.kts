plugins {
	java
	id("io.freefair.lombok")
	id("org.springframework.boot")
	id("io.spring.dependency-management")
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
}


tasks.named<Test>("test") {
	useJUnitPlatform()
}
