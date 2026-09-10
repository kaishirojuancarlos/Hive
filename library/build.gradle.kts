plugins {
	alias(libs.plugins.kotlin)
	alias(libs.plugins.application)
}

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

