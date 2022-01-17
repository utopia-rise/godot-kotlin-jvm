package godotruntime

import godot.gradle.tasks.godotruntime.OS
import org.gradle.testkit.runner.GradleRunner
import org.jetbrains.kotlin.ir.backend.js.ic.newFile
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.io.TempDir
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.ValueSource
import java.io.File
import java.nio.file.Path
import java.util.*
import kotlin.io.path.absolutePathString


class GodotDownloadTaskConfigTest {

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

        gradleRunner = GradleRunner.create()
            .withPluginClasspath()
            .withProjectDir(testFile)
            .withTestKitDir(testKitFile)
    }

    @ParameterizedTest
    @EnumSource(OS::class)
    fun `Godot download task can be configured to target any supported operating systems`(os: OS) {
        buildFile.writeText(
            """
            import godot.gradle.tasks.godotruntime.GodotBinaryDownloadTask
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
                val targetOS = OS.${os.name}
                os.set(targetOS)
                print(targetOS)        
            }
           
        """.trimIndent()
        )

        val result = gradleRunner.withArguments("tasks").build()

        //check that the base download task exists in the output.
        //we will always register it so it shows up as an option.
        assertTrue(result.output.contains("downloadGodotBinaries"))
        println(result.output)
    }

    @ParameterizedTest
    //we check every OS, no matter which platform we're on.
    //include 3 versions for redundancy
    @CsvSource(
        "LINUX, 0.3.1-3.4.0",
        "WINDOWS, 0.3.1-3.4.0",
        "MAC, 0.3.1-3.4.0",

        "LINUX, 0.2.0-3.3.0",
        "WINDOWS, 0.2.0-3.3.0",
        "MAC, 0.2.0-3.3.0",

        "LINUX, 0.1.2-3.2.3",
        "WINDOWS, 0.1.2-3.2.3",
        "MAC, 0.1.2-3.2.3",
    )
    fun `Godot download task downloads the expected binaries for any supported operating systems`(
        os: String,
        version: String
    ) {

        buildFile.writeText(
            """
            import godot.gradle.tasks.godotruntime.GodotBinaryDownloadTask
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
                godotKotlinJVMVersion.set("$version")
                val targetOS = OS.${os}
                print(targetOS)
                os.set(targetOS)
            }
        """.trimIndent()
        )

        val result = gradleRunner.withArguments("godotBinarySetup").build()

        println(result.output)

        val path = testProjectDir!!.absolutePathString() + "/test/build/godot/tmp/godot_editor_${
            os.lowercase(
                Locale.getDefault()
            )
        }.zip"
        assertTrue(
            File(
                path
            ).exists(), "editor zip file not downloaded to $path"
        )
        val osEnum = OS.valueOf(os)
        val extractedFolderPath =
            testProjectDir!!.absolutePathString() + "/test/build/godot/${os.lowercase()}/godot_editor/${osEnum.editorBinaryName}"

        assertTrue(
            File(
                extractedFolderPath
            ).exists(), "editor contents not extracted to $extractedFolderPath"
        )
    }
}
