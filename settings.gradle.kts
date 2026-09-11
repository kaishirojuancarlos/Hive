/**
 * Gradle settings file for Hive project.
 *
 * This file centralizes the configuration for:
 * - Plugin management: repositories for Gradle plugins
 * - Dependency resolution: repositories for project dependencies
 * - Project structure: included subprojects
 *
 * The configuration ensures consistent repository access across all Hive modules.
 */

/**
 * Plugin Management Configuration
 *
 * Defines repositories where Gradle should look for plugins.
 * This configuration is inherited by all subprojects.
 *
 * Repository Priority:
 * 1. Google Maven - For Android, Google, and AndroidX artifacts
 * 2. Maven Central - For most open-source dependencies
 * 3. Gradle Plugin Portal - For Gradle plugins
 */
pluginManagement {
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

/**
 * Dependency Resolution Management Configuration
 *
 * Centralizes repository configuration for all project dependencies.
 * Uses PREFER_PROJECT mode to prioritize project-local repositories.
 *
 * Repository Priority:
 * 1. Google Maven - For Android, Google, and AndroidX artifacts
 * 2. Maven Central - For most open-source dependencies
 */
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
    }
}

/**
 * Global Plugin Configuration
 *
 * Applies the Foojay resolver plugin globally for JDK toolchain management.
 * This plugin provides automatic resolution of JDK versions from Foojay.io.
 */
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

/**
 * Project Structure Configuration
 *
 * Includes the Hive library subproject:
 * - library: The main Hive utilities library module
 */
rootProject.name = "Hive"
include(":library")
