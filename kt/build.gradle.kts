import org.ajoberstar.grgit.Commit
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform

plugins {
    id("org.ajoberstar.grgit") version "4.1.0"
}

val currentCommit: Commit = grgit.head()
// check if the current commit is tagged
var tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
var releaseMode = tagOnCurrentCommit != null

version = if (!releaseMode) {
    "$godotKotlinJvmVersion-${DependenciesVersions.godotVersion}-${currentCommit.abbreviatedId}-SNAPSHOT"
} else {
    requireNotNull(tagOnCurrentCommit).name
}

val versionString = project.version.toString()

subprojects {
    group = "com.utopia-rise"
    version = versionString
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

tasks {
    val buildEngineDebug by creating(Exec::class) {
        group = "godot-kotlin-jvm"

        workingDir = File(rootProject.projectDir, "../../..")
        environment("JAVA_HOME", System.getProperty("java.home"))

        val platform = when {
            DefaultNativePlatform.getCurrentOperatingSystem().isWindows -> "windows"
            DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX -> "osx"
            DefaultNativePlatform.getCurrentOperatingSystem().isLinux -> "x11"
            else -> throw kotlin.IllegalStateException("Cannot build engine on this os. Build it manually...")
        }
        val coresAvailable = Runtime.getRuntime().availableProcessors()

        if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
            commandLine("cmd", "/c", "scons", "p=$platform", "-j$coresAvailable")
        } else {
            commandLine("scons", "p=$platform", "-j$coresAvailable")
        }
    }
    val buildEngineReleaseDebug by creating(Exec::class) {
        group = "godot-kotlin-jvm"

        workingDir = File(rootProject.projectDir, "../../..")
        environment("JAVA_HOME", System.getProperty("java.home"))

        val platform = when {
            DefaultNativePlatform.getCurrentOperatingSystem().isWindows -> "windows"
            DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX -> "osx"
            DefaultNativePlatform.getCurrentOperatingSystem().isLinux -> "x11"
            else -> throw kotlin.IllegalStateException("Cannot build engine on this os. Build it manually...")
        }
        val coresAvailable = Runtime.getRuntime().availableProcessors()

        if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
            commandLine("cmd", "/c", "scons", "p=$platform", "target=release_debug", "-j$coresAvailable")
        } else {
            commandLine("scons", "p=$platform", "target=release_debug", "-j$coresAvailable")
        }
    }
    val runEngineDebug by creating(Exec::class) {
        group = "godot-kotlin-jvm"

        workingDir = File(rootProject.projectDir, "../../../bin")
        environment("JAVA_HOME", System.getProperty("java.home"))

        when {
            DefaultNativePlatform.getCurrentOperatingSystem().isWindows ->
                commandLine("cmd", "/c", "godot.windows.tools.64.exe", "-v")
            DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX ->
                commandLine("scons", "godot.osx.tools.64", "-v")
            DefaultNativePlatform.getCurrentOperatingSystem().isLinux ->
                commandLine("scons", "godot.x11.tools.64", "-v")
        }
    }
    val runEngineReleaseDebug by creating(Exec::class) {
        group = "godot-kotlin-jvm"

        workingDir = File(rootProject.projectDir, "../../../bin")
        environment("JAVA_HOME", System.getProperty("java.home"))

        when {
            DefaultNativePlatform.getCurrentOperatingSystem().isWindows ->
                commandLine(
                    "cmd",
                    "/c",
                    "${workingDir.absolutePath}${File.pathSeparator}godot.windows.opt.tools.64.exe",
                    "-v"
                )
            DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX ->
                commandLine("${workingDir.absolutePath}/godot.osx.opt.tools.64", "-v")
            DefaultNativePlatform.getCurrentOperatingSystem().isLinux ->
                commandLine("${workingDir.absolutePath}/godot.x11.opt.tools.64", "-v")
        }
    }
    val buildAndRunEngineDebug by creating {
        group = "godot-kotlin-jvm"
        dependsOn(buildEngineDebug, getTasksByName("copyBootstrapJar", true).first())
        finalizedBy(runEngineDebug)
    }
    val buildAndRunEngineReleaseDebug by creating {
        group = "godot-kotlin-jvm"
        dependsOn(buildEngineReleaseDebug, getTasksByName("copyBootstrapJar", true).first())
        finalizedBy(runEngineReleaseDebug)
    }
}
