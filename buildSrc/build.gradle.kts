plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.2.21"
    id("com.vanniktech.maven.publish") version "0.35.0"
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.2.21")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.35.0")
}
