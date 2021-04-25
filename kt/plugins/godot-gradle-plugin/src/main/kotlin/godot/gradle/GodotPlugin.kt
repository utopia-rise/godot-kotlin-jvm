package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import godot.gradle.util.absolutePathFixedForWindows
import godot.kotlincompilerplugin.common.CompilerPluginConst
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption
import java.io.File


class GodotPlugin : KotlinCompilerPluginSupportPlugin {
    override fun apply(target: Project) {
        val godotExtension = target.extensions.create("godot", GodotExtension::class.java)
        val jvm = target.extensions.getByType<KotlinJvmProjectExtension>()
        target.pluginManager.apply(ShadowPlugin::class)
        setupPlugin(target, godotExtension, jvm)
    }

    private fun setupPlugin(project: Project, godotExtension: GodotExtension, jvm: KotlinJvmProjectExtension) {
        configureExtensionDefaults(godotExtension)
        project.afterEvaluate {
            project.setupConfigurationsAndCompilations(godotExtension, jvm)
        }
    }

    private fun configureExtensionDefaults(godotExtension: GodotExtension) {
        godotExtension.apply {
            isAndroidExportEnabled.set(false)
            dxToolPath.set("dx") //default assumes that it's in $PATH
        }
    }

    //START: Compiler plugin configuration
    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        val project = kotlinCompilation.target.project

        val srcDirs = kotlinCompilation
            .allKotlinSourceSets
            .flatMap { it.kotlin.srcDirs }
            .map { it.absolutePathFixedForWindows }

        return project.provider {
            listOf(
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.enabledOption,
                    (kotlinCompilation.name == "main").toString() //only apply the plugin to the main compilation.
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.serviceFileDirPathOption,
                    File(project.projectDir, "/src/main/resources/META-INF/services/").apply {
                        mkdirs()
                    }.absolutePath
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.sourcesDirPathOption,
                    srcDirs.joinToString(File.pathSeparator)
                ),
                SubpluginOption(
                    CompilerPluginConst.CommandLineOptionNames.projectDirPathOption,
                    project.projectDir.absolutePath
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
