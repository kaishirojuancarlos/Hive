plugins {
	alias(libs.plugins.kotlin)
	alias(libs.plugins.application)
}

group = "kaishiro.hive"
version = "1.1.0"

dependencies {
	api(kotlin("stdlib"))
	api(kotlin("reflect"))
}

kotlin {
	jvmToolchain(25)
}

application {
	mainClass.set("kaishiro.hive.test.MainKt")
}

