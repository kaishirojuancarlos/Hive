/**
 * Build script for Hive library module.
 *
 * This module contains the core utility classes and constants for the Hive
 * library. It is configured as both a library (for use as a dependency) and an
 * application (for testing purposes).
 *
 * Key features:
 * - Kotlin JVM 25 toolchain
 * - Explicit API mode for library design (commented out by default)
 * - Kotlin standard library and reflection dependencies
 */

plugins {
    // Kotlin JVM plugin for compiling Kotlin to JVM bytecode
    alias(libs.plugins.kotlinJvm)

    // Application plugin for creating executable applications
    // This allows the library to be run as a standalone application for testing
    alias(libs.plugins.application)
}


// -----------------------------------------------------------------------------
// Project Metadata
// -----------------------------------------------------------------------------
// Note: group and version are also configured in the root build.gradle.kts
// for consistency across all subprojects
group = "kaishiro.hive"
version = "1.1.0"


// -----------------------------------------------------------------------------
// Kotlin Configuration
// -----------------------------------------------------------------------------
// Configures Kotlin compiler and toolchain settings
kotlin {
    // Use JDK 25 toolchain for compilation
    jvmToolchain(25)

    // Enable explicit API mode for better library design
    // This ensures only explicitly declared APIs are exposed
    // Uncomment when ready to enforce API boundaries
    // explicitApi()
}


// -----------------------------------------------------------------------------
// Application Configuration
// -----------------------------------------------------------------------------
// Configures the application plugin for executable JAR creation
application {
    // Main class for executable JAR
    // This allows the library to be tested as a standalone application
    mainClass.set("kaishiro.hive.test.MainKt")
}


// -----------------------------------------------------------------------------
// Dependency Configuration
// -----------------------------------------------------------------------------
dependencies {
    // -------------------------------------------------------------------------
    // Kotlin Standard Library
    // -------------------------------------------------------------------------
    // Required for all Kotlin projects - provides core Kotlin functionality
    api(libs.kotlinStdlib)

    // -------------------------------------------------------------------------
    // Kotlin Reflection
    // -------------------------------------------------------------------------
    // Used for runtime reflection features - required for many frameworks
    api(libs.kotlinReflect)
}
