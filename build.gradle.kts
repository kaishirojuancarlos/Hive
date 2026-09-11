/*
 * Root build script for Hive project.
 * 
 * This script configures common settings for all subprojects.
 * Subprojects should apply plugins in their own build.gradle.kts files.
 */

plugins {
	// Declare plugins that are used by subprojects
	alias(libs.plugins.kotlinJvm) apply false
	//alias(libs.plugins.application) apply false
}

// Configure common settings for all subprojects
subprojects {
	group = "kaishiro.hive"
	version = "1.1.0"

	repositories {
		mavenCentral()
		google()
	}
}

// Configure the build script classpath
buildscript {
	repositories {
		mavenCentral()
		gradlePluginPortal()
		google()
	}
}

