package godotruntime

import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.jetbrains.kotlin.ir.backend.js.ic.newFile
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.nio.file.Path
import kotlin.io.path.absolutePathString

/**
 * This seems to be redundant together with `godotruntime.GodotDownloadTaskConfigTest`, but this test checks the tasks without any configuration.
 * Using the config DSL can produce different crashes that would not be there without it, and vice versa.
 * */
class GodotPluginTest {

    @TempDir
    var testProjectDir: Path? = null
    private lateinit var gradleRunner: GradleRunner
    private lateinit var buildFile:File
    @BeforeEach
    fun setup() {
        val root = File(testProjectDir!!.absolutePathString())

        //set up test folders
        val testFile = newFile(root,"test")
        testFile.mkdirs()

        buildFile = newFile(testFile, "build.gradle.kts")
        buildFile.createNewFile()

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
            }
            
        """.trimIndent())

        val testKitFile = newFile(root,"testkit")
        testKitFile.mkdirs()

        gradleRunner = GradleRunner.create()
            .withPluginClasspath()
            .withProjectDir(testFile)
            .withTestKitDir(testKitFile)
    }

    @Test
    //TODO put every registered task into this test.
    fun `Registered tasks shows up in the task list`(){
        val result = gradleRunner.withArguments("tasks","--stacktrace").build()
        assertAll(
            {taskExists("downloadGodotBinaries",result)},
            {taskExists("extractGodotBinaries",result)},
            {taskExists("godotBinarySetup",result)},
            {taskExists("executeGodotEditor",result)},
            {taskExists("runEditor",result)}
        )

        println(result.output)
    }

    fun taskExists(task:String,result: BuildResult){
        assertTrue(result.output.contains("task"),"task with name '$task' not found")
    }

}
