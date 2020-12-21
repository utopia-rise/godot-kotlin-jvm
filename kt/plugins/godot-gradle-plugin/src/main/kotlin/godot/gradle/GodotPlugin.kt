package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.kotlincompilerplugin.common.CompilerPluginConst
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinWithJavaCompilation
import java.io.File


class GodotPlugin : KotlinCompilerPluginSupportPlugin {
    override fun apply(target: Project) {
        require(target.rootProject == target) { "godot-jvm plugin can only be applied on the root project!" }
        val jvm = target.extensions.getByType<KotlinJvmProjectExtension>()
        target.pluginManager.apply(ShadowPlugin::class)
        target.pluginManager.apply("org.jetbrains.kotlin.kapt")
        setupPlugin(target, jvm)
    }

    private fun setupPlugin(project: Project, jvm: KotlinJvmProjectExtension) {

        project.afterEvaluate {
            val bootstrap = configurations.create("bootstrap") {
                dependencies {
                    add(name, kotlin("stdlib"))
                    add(name, "com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
                }
            }
            val main = configurations.create("main").apply {
                extendsFrom(configurations.getByName("implementation"), configurations.getByName("runtimeOnly"))
                exclude(
                    mapOfNonNullValuesOf(
                        "group" to "org.jetbrains.kotlin",
                        "module" to null
                    )
                )
            }
            val gameConfiguration = configurations.create("game").apply {
                extendsFrom(main)
            }

            val mainCompilation = jvm.target.compilations.getByName("main").apply {
                dependencies {
                    compileOnly("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
                }
            }
            val gameCompilation = jvm.target.compilations.create("game").apply {
                defaultSourceSet {
                    dependencies {
                        implementation(mainCompilation.compileDependencyFiles + mainCompilation.output.classesDirs)
                    }
                    kotlin.srcDirs(project.buildDir.resolve("godot-entry"))
                }
            }

            tasks {
                val bootstrapJar by creating(ShadowJar::class) {
                    archiveBaseName.set("godot-bootstrap")
                    configurations.add(bootstrap)
                }

                val shadowJar = named<ShadowJar>("shadowJar") {
                    archiveBaseName.set("main")
                    archiveVersion.set("")
                    archiveClassifier.set("")
                    configurations.clear()
                    configurations.add(gameConfiguration)
                    from(gameCompilation.compileDependencyFiles + gameCompilation.output.classesDirs)
                }

                val build by getting {
                    dependsOn(bootstrapJar, shadowJar)
                }

                mainCompilation.compileKotlinTask.finalizedBy(gameCompilation.compileKotlinTask)
            }
        }
    }

    private fun mapOfNonNullValuesOf(vararg entries: Pair<String, String?>): Map<String, String> =
        mutableMapOf<String, String>().apply {
            for ((k, v) in entries) {
                if (v != null) {
                    put(k, v)
                }
            }
        }

    //START: Compiler plugin configuration
    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        val project = kotlinCompilation.target.project

        return project.provider {
            listOf(
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.enabledOption,
                    (kotlinCompilation.name == "main").toString()
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.serviceFileDirPathOption,
                    File(project.rootDir, "/src/main/resources/META-INF/services/").apply {
                        mkdirs()
                    }.absolutePath
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
                    project.buildDir.resolve("godot-entry").absolutePath
                )
            )
        }
    }

    override fun getCompilerPluginId(): String = CompilerPluginConst.compilerPluginId

    override fun isApplicable(kotlinCompilation: KotlinCompilation<*>): Boolean =
        kotlinCompilation.target.project.plugins.findPlugin(GodotPlugin::class.java) != null

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerPluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )
    //END: Compiler plugin configuration
}
