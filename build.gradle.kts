import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.5.31"
    application
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(platform("org.junit:junit-bom:5.8.1"))
	testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

application {
    mainClass.set("com.example.project.Main")
}

tasks.test {
	useJUnitPlatform()
	testLogging {
		events("passed", "skipped", "failed")
	}
}

tasks.withType<KotlinCompile>().configureEach {
	kotlinOptions.jvmTarget = "11"
}
