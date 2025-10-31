plugins {
	`kotlin-dsl`
}

repositories {
	gradlePluginPortal()
	mavenCentral()
}


dependencies {
	// Lombok
	implementation("io.freefair.gradle:lombok-plugin:9.0.0")

	// Spring Boot plugin
	implementation("org.springframework.boot:org.springframework.boot.gradle.plugin:4.0.0-M3")

	// Dependency Management plugin
	implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
}
