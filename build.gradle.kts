import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

group = "com.halilozel"
version = "2026.2"

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(kotlin("test"))
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

kotlin {
    jvmToolchain(21)

    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
        progressiveMode.set(true)
        extraWarnings.set(true)
    }
}

application {
    mainClass.set("LessonsRunnerKt")
    applicationDefaultJvmArgs = listOf("-Dfile.encoding=UTF-8")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.register<JavaExec>("runModern") {
    group = ApplicationPlugin.APPLICATION_GROUP
    description = "Runs the modern Kotlin track entrypoint (modern2026/Modern2026Runner.kt)."
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("modern2026.Modern2026RunnerKt")
}

tasks.register<JavaExec>("runAllLessons") {
    group = ApplicationPlugin.APPLICATION_GROUP
    description = "Runs every non-interactive lesson in a single pass."
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("LessonsRunnerKt")
    args("run-all")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
