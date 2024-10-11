import versioninfo.fullGodotKotlinJvmVersion
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform

plugins {
    // prevents the kotlin plugin being applied multiple times (once per subproject) as this is not supported. Done as suggested by the kotlin plugin
    alias(libs.plugins.kotlin.jvm) apply false
    id("com.utopia-rise.versioninfo")
    alias(libs.plugins.gradleIntelliJPlugin) apply false
    alias(libs.plugins.ideaSync) apply false
}

version = fullGodotKotlinJvmVersion

val versionString = project.version.toString()

subprojects {
    group = "com.utopia-rise"
    version = versionString
}

tasks {
    @Suppress("UNUSED_VARIABLE")
    val generateChangelog by creating {
        group = "godot-kotlin-jvm"

        doLast {
            val tags = grgit.tag.list().reversed().filter { it.name != "stable" }
            val fromTag = tags.getOrNull(1)
            val toTag = tags.getOrNull(0)
            val changeLogPrefix = """
                The files prefixed with `godot-kotlin-jvm_editor_` are the editors.
                `release` editors are the editors you use normally. `debug` editors provide debug symbols and are intended to provide better stacktraces in case of crashes of the editor. Please use those when submitting bugreports.
                
                `godot-kotlin-jvm_export_templates_$fullGodotKotlinJvmVersion.tpz` is the archive for all export templates . See [exporting](https://godot-kotl.in/en/latest/user-guide/exporting/) documentation on how to use it.
                
                **Changelog:**
                
            """.trimIndent()

            val changelogString = grgit.log {
                range(fromTag?.name, toTag?.name)
            }
                .joinToString(separator = "\n", prefix = changeLogPrefix) { commit ->
                    val link = "https://github.com/utopia-rise/godot-kotlin-jvm/commit/${commit.id}"
                    "- [${commit.abbreviatedId}]($link) ${commit.shortMessage}"
                }

            project.layout.buildDirectory.asFile.get().resolve("changelog.md").also {
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
            commandLine("cmd", "/c", "scons", "p=$platform", "target=template_debug", "-j$coresAvailable")
        } else {
            commandLine("scons", "p=$platform", "target=template_debug", "-j$coresAvailable")
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
    @Suppress("UNUSED_VARIABLE")
    val buildAndRunEngineDebug by creating {
        group = "godot-kotlin-jvm"
        dependsOn(buildEngineDebug, getTasksByName("copyBootstrapJar", true).first())
        finalizedBy(runEngineDebug)
    }
    @Suppress("UNUSED_VARIABLE")
    val buildAndRunEngineReleaseDebug by creating {
        group = "godot-kotlin-jvm"
        dependsOn(buildEngineReleaseDebug, getTasksByName("copyBootstrapJar", true).first())
        finalizedBy(runEngineReleaseDebug)
    }
}
