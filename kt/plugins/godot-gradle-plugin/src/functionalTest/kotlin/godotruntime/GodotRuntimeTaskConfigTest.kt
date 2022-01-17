package godotruntime

import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.TaskOutcome
import org.jetbrains.kotlin.ir.backend.js.ic.newFile
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.nio.file.Path
import kotlin.io.path.absolutePathString


class GodotRuntimeTaskConfigTest {

    @TempDir
    var testProjectDir: Path? = null

    private lateinit var gradleRunner: GradleRunner
    private lateinit var buildFile: File

    @BeforeEach
    fun setup() {
        val root = File(testProjectDir!!.absolutePathString())
        println(root.absolutePath)
        //set up test folders
        val testFile = newFile(root, "test")
        testFile.mkdirs()

        buildFile = newFile(testFile, "build.gradle.kts")
        buildFile.createNewFile()


        val testKitFile = newFile(root, "testkit")
        testKitFile.mkdirs()

        buildFile.writeText(
            """
            import godot.gradle.tasks.godotruntime.GodotBinaryDownloadTask
            import godot.gradle.tasks.godotruntime.PathManager
            import godot.gradle.tasks.godotruntime.OS
            
            plugins {
                // For build.gradle.kts (Kotlin DSL)
                kotlin("jvm") version "1.6.0"
                id("com.utopia-rise.godot-kotlin-jvm")
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
            
            //if this is successful, the binary can run normally.
            tasks{
                named<Exec>("executeGodotEditor"){
                    //we need to reconfigure this to have arguments.
                    val editorPath = PathManager.getEditorExecutablePath(project = project)
                    //we set to the "--quit" and "--no-window" flags so it starts with no window, and will close on it's own.
                    commandLine(editorPath,"--quit","--no-window")
                }
            }
            
        """.trimIndent()
        )

        gradleRunner = GradleRunner.create()
            .withPluginClasspath()
            .withProjectDir(testFile)
            .withTestKitDir(testKitFile)
    }

    @Test
    fun `The editor binary can be executed on a fresh project`() {

        val result = gradleRunner.withArguments("runEditor","--stacktrace").build()
        println(result.output)
        assertAll(
            //this task contains the download tasks as well, we want these to be executed as well.
            { taskWasSuccessful(result, "downloadGodotBinaries") },
            { taskWasSuccessful(result, "extractGodotBinaries") },
            { taskWasSuccessful(result, "godotBinarySetup") },
            //running itself is 2 tasks, if the `executeGodotEditor` task is successful, then the `runEditor` task should be as well.
            { taskWasSuccessful(result, "executeGodotEditor") },
            { taskWasSuccessful(result, "runEditor") }
        )

    }

    fun taskWasSuccessful(result: BuildResult, task: String) {
        Assertions.assertEquals(
            TaskOutcome.SUCCESS,
            result.task(":$task")!!.outcome,
            "task '$task' was not successful!"
        )
    }
}
