package godot.gradle.subplugin

import godot.gradle.GodotPlugin
import godot.kotlincompilerplugin.common.CompilerPluginConst
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class GodotSubPlugin : KotlinGradleSubplugin<AbstractCompile> {
    override fun apply(
        project: Project,
        kotlinCompile: AbstractCompile,
        javaCompile: AbstractCompile?,
        variantData: Any?,
        androidProjectHandler: Any?,
        kotlinCompilation: KotlinCompilation<KotlinCommonOptions>?
    ): List<SubpluginOption> {
        return listOf(
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.enabledOption,
                (kotlinCompile.name == "compileDummyKotlin").toString()
            ),
            SubpluginOption(
                CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
                project.buildDir.resolve("godot-entry").absolutePath
            )
        )
    }

    override fun getCompilerPluginId(): String = CompilerPluginConst.compilerPluginId

    override fun isApplicable(project: Project, task: AbstractCompile): Boolean =
        //&& task is KotlinNativeCompile -> we cannot do this check here as the compiler plugin get's called in the
        // linking stage again, which then fails as the subPlugin is disabled for it and thus does not provide the
        // needed command line arguments
        project.plugins.findPlugin(GodotPlugin::class.java) != null

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        groupId = CompilerPluginConst.compilerPluginGroupId,
        artifactId = CompilerPluginConst.compilerPluginArtifactId,
        version = GodotBuildProperties.godotKotlinVersion
    )
}
