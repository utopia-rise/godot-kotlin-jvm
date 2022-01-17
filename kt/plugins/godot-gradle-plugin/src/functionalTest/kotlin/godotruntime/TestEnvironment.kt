package godotruntime

import org.gradle.testkit.runner.GradleRunner
import org.jetbrains.kotlin.ir.backend.js.ic.newFile
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.nio.file.Path
import kotlin.io.path.absolutePathString

class TestEnvironment {
    @TempDir
    var testProjectDir: Path? = null
    private lateinit var gradleRunner: GradleRunner
    private lateinit var buildFile: File

    @BeforeEach
    fun setup() {
        val root = File(testProjectDir!!.absolutePathString())

        //set up test folders
        val testFile = newFile(root,"test")
        testFile.mkdirs()

        buildFile = newFile(testFile, "build.gradle.kts")
        buildFile.createNewFile()

        val testKitFile = newFile(root,"testkit")
        testKitFile.mkdirs()

        buildFile.writeText("""
            plugins {
                id("com.utopia-rise.godot-kotlin-jvm")
                // For build.gradle.kts (Kotlin DSL)
                kotlin("jvm") version "1.6.0"
            }

            repositories {
                mavenCentral()
            }
            
            godot {
                isAndroidExportEnabled.set(false)
                d8ToolPath.set(File("${'$'}{System.getenv("ANDROID_SDK_ROOT")}/build-tools/31.0.0/d8"))
                androidCompileSdkDir.set(File("${'$'}{System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"))
                godotKotlinJVMVersion.set("0.3.1-3.4.0")
            }

        """.trimIndent())

        gradleRunner = GradleRunner.create()
            .withPluginClasspath()
            .withProjectDir(testFile)
            .withTestKitDir(testKitFile)
    }

    /**
     * Could be removed, but verifies that the test environment is functional.
     * */
    @Test
    fun `Check the test setup, also printing additional information about the test environment`(){
        print(gradleRunner.pluginClasspath)
        val result = gradleRunner.withArguments("tasks","--stacktrace","--debug").build()
        println(result.output)
    }

}
