/*
 * Build script for Hive library module.
 * 
 * This module contains the core utility classes and constants.
 * It is configured as both a library (for use as a dependency) and an
 * application (for testing purposes).
 */

plugins {
	// Kotlin JVM plugin for compiling Kotlin to JVM bytecode
	alias(libs.plugins.kotlinJvm)
	// Application plugin for creating executable applications
	alias(libs.plugins.application)
}

// Project metadata (also configured in gradle.properties)
group = "kaishiro.hive"
version = "1.1.0"

// Configure Kotlin compilation
kotlin {
	// Use JDK 25 toolchain
	jvmToolchain(25)
	
	// Enable explicit API mode for better library design
	// This ensures only explicitly declared APIs are exposed
	// explicitApi() // Uncomment when ready to enforce API boundaries
}

// Configure the application plugin
application {
	// Main class for executable JAR
	mainClass.set("kaishiro.hive.test.MainKt")
}

// Project dependencies
dependencies {
	// Kotlin standard library - required for all Kotlin projects
	api(libs.kotlinStdlib)
	
	// Kotlin reflection - used for runtime reflection features
	api(libs.kotlinReflect)
}

