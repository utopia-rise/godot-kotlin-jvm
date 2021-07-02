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
    val generateChangelog by creating {
        group = "godot-kotlin-jvm"

        doLast {
            val tags = grgit.tag.list().reversed().filter { it.name != "stable" }
            val fromTag = tags.getOrNull(1)
            val toTag = tags.getOrNull(0)
            val changeLogPrefix = """
                The pre built engines are the zip files.  
                The other files are export templates needed for exporting your game. See [exporting](https://godot-kotl.in/en/latest/user-guide/exporting/) documentation on how to use them.
                
                **Changelog:**
                
            """.trimIndent()

            val changelogString = grgit.log {
                range(fromTag?.name, toTag?.name)
            }
                .joinToString(separator = "\n", prefix = changeLogPrefix) { commit ->
                    val link = "https://github.com/utopia-rise/godot-kotlin-jvm/commit/${commit.id}"
                    "- [${commit.abbreviatedId}]($link) ${commit.shortMessage}"
                }

            project.buildDir.resolve("changelog.md").also {
                if (!it.parentFile.exists()) {
                    it.parentFile.mkdirs()
                }
            }.writeText(changelogString)
        }
    }
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
                commandLine(
                    "cmd",
                    "/c",
                    "${workingDir.absolutePath}${File.pathSeparator}godot.windows.tools.64.exe",
                    "-v"
                )
            DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX ->
                commandLine("${workingDir.absolutePath}/godot.osx.tools.64", "-v")
            DefaultNativePlatform.getCurrentOperatingSystem().isLinux ->
                commandLine("${workingDir.absolutePath}/godot.x11.tools.64", "-v")
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
