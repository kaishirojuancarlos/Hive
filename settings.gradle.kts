/*
 * Gradle settings file for Hive project.
 * 
 * This file configures:
 * - Plugin management: repositories for Gradle plugins
 * - Dependency resolution: repositories for project dependencies
 * - Project structure: included subprojects
 */

pluginManagement {
    // Repositories for Gradle plugins
    repositories {
        // Google repository for Android and Google plugins
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        // Central repository for most plugins
        mavenCentral()
        // Gradle plugin portal
        gradlePluginPortal()
    }
}

// Apply the Foojay resolver plugin for JDK toolchain management
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    // Prefer project-local repositories over external ones
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    
    // Repositories for project dependencies
    repositories {
        google()
        mavenCentral()
    }
}

// Project structure configuration
rootProject.name = "Hive"
include(":library")
