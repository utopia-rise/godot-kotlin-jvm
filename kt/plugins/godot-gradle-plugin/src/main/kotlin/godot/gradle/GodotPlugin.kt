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
        val godotEntryGeneratorExtension = target.extensions.create<GodotEntryGeneratorExtension>("entryGenerator")
        setupPlugin(target, jvm, godotEntryGeneratorExtension)
    }

    private fun setupPlugin(project: Project, jvm: KotlinJvmProjectExtension, godotEntryGeneratorExtension: GodotEntryGeneratorExtension) {

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

            //create a configuration for each extension so a jar for each extension gets built into the libs directory so it can be easily accessed from within the entry generation process
            val entryGeneratorExtensionConfigurations = godotEntryGeneratorExtension
                .entryGeneratorExtensions
                .apply { addAll(godotEntryGeneratorExtension.entryGeneratorExtensionsWithAnnotations) }
                .map { entryGeneratorExtensionDependency ->
                    configurations.create("entryGeneratorExtension_${entryGeneratorExtensionDependency.replace(":", "_").replace(".", "·")}") {
                        dependencies {
                            add(name, kotlin("stdlib"))
                            add(name, entryGeneratorExtensionDependency)
                        }
                    }
                }

            fun KotlinWithJavaCompilation<KotlinJvmOptions>.configureSourceSets(includeEntrySourceDir: Boolean) {
                defaultSourceSet {
                    kotlin.srcDirs("src/main/kotlin")
                    if (includeEntrySourceDir) {
                        kotlin.srcDirs(project.buildDir.resolve("godot-entry"))
                    }
                    dependencies {
                        compileOnly("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")

                        //add an entry generator extension as a dependency to the users project if it provides annotations that can be used from there
                        godotEntryGeneratorExtension.entryGeneratorExtensionsWithAnnotations.forEach { dependencyNotation ->
                            implementation(dependencyNotation)
                        }
                    }
                }
            }

            val mainCompilation = jvm.target.compilations.getByName("main").apply {
                configureSourceSets(true)
            }

            val dummy = jvm.target.compilations.create("dummy") {
                defaultSourceSet.dependencies {
                    main.allDependencies.forEach {
                        implementation(it)
                    }
                }
                configureSourceSets(false)
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
                    configurations.add(main)
                }

                //build the entry generator extension to the libs folder when the project is built
                val entryGeneratorExtensionTasks = entryGeneratorExtensionConfigurations
                    .map {
                        create("${it.name}Jar", ShadowJar::class) {
                            archiveBaseName.set(it.name)
                            configurations.add(it)
                        }
                    }
                    .toTypedArray()

                val build by getting {
                    dependsOn(bootstrapJar, shadowJar, *entryGeneratorExtensionTasks)
                }

                mainCompilation.compileKotlinTask.dependsOn(dummy.compileKotlinTask)
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
                    (kotlinCompilation.name == "dummy").toString()
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.serviceFileDirPathOption,
                    File(project.rootDir, "/src/main/resources/META-INF/services/").apply {
                        mkdirs()
                    }.absolutePath
                ),
                SubpluginOption( //used by the godotAnnotationProcessor to load built entryGenerator extensions
                    CompilerPluginConst.CommandLineOptionNames.extensionsDirPathOption,
                    project.buildDir.resolve("libs").absolutePath
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
