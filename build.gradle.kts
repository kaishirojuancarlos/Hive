/**
 * Root build script for Hive project.
 *
 * This script configures common settings for all subprojects within the Hive
 * library. It centralizes plugin declarations and shared configuration.
 *
 * Subprojects should apply specific plugins in their own build.gradle.kts files.
 *
 * Key responsibilities:
 * - Plugin declaration for all subprojects
 * - Common subproject configuration (group, version, repositories)
 * - Build script classpath configuration
 */

plugins {
    // Declare plugins that are used by subprojects
    // These plugins are not applied here but made available to subprojects
    alias(libs.plugins.kotlinJvm) apply false
}


// -----------------------------------------------------------------------------
// Common Subproject Configuration
// -----------------------------------------------------------------------------
// Configures settings that are applied to all subprojects within Hive
subprojects {
    // Project metadata - consistent across all Hive modules
    group = "kaishiro.hive"
    version = "1.1.0"

    // Repository configuration - centralized for all subprojects
    repositories {
        mavenCentral()
        google()
    }
}


// -----------------------------------------------------------------------------
// Build Script Classpath Configuration
// -----------------------------------------------------------------------------
// Configures repositories for the build script itself (not for the project)
buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}
