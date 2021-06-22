package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.google.devtools.ksp.gradle.KspExtension
import com.google.devtools.ksp.gradle.KspGradleSubplugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import java.io.File


class GodotPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.repositories.google() //add google repository for ksp (kotlin symbol processing
        target.pluginManager.apply(KspGradleSubplugin::class.java)
        target.pluginManager.apply(IdeaPlugin::class.java)

        val godotExtension = target.extensions.create("godot", GodotExtension::class.java)
        val kotlinJvmExtension = target
            .extensions
            .findByType(KotlinJvmProjectExtension::class.java)
            ?: target.rootProject.extensions.getByType(KotlinJvmProjectExtension::class.java)
        target.pluginManager.apply(ShadowPlugin::class.java)
        val kspExtension = requireNotNull(
            target
                .extensions
                .findByType(KspExtension::class.java)
        ) {
            "kspExtension not found"
        }
        val ideaExtension = requireNotNull(
            target
                .extensions
                .findByType(IdeaModel::class.java)
        ) {
            "idea extension not found"
        }

        setupPlugin(
            target,
            godotExtension,
            kotlinJvmExtension,
            kspExtension,
            ideaExtension
        )
    }

    private fun setupPlugin(
        project: Project,
        godotExtension: GodotExtension,
        kotlinJvmExtension: KotlinJvmProjectExtension,
        kspExtension: KspExtension,
        ideaExtension: IdeaModel
    ) {
        configureExtensionDefaults(godotExtension)
        configureThirdPartyPlugins(project, kotlinJvmExtension, kspExtension, ideaExtension)
        project.setupConfigurationsAndCompilations(godotExtension, kotlinJvmExtension)
    }

    private fun configureThirdPartyPlugins(
        project: Project,
        kotlinJvmExtension: KotlinJvmProjectExtension,
        kspExtension: KspExtension,
        ideaExtension: IdeaModel
    ) {
        kotlinJvmExtension
            .sourceSets
            .getByName("main")
            .kotlin
            .srcDirs(project.buildDir.resolve("generated/ksp/main/kotlin/"))

        project.afterEvaluate {
            kspExtension.apply {
                arg(
                    "srcDirs",
                    kotlinJvmExtension
                        .sourceSets
                        .getByName("main")
                        .kotlin
                        .srcDirs
                        .joinToString(File.pathSeparator) { it.absolutePath }
                )
                arg(
                    "outDir",
                    project.buildDir.resolve("godot").absolutePath
                )
                arg(
                    "projectBasePath",
                    project.projectDir.absolutePath
                )
            }

            ideaExtension.apply {
                module { ideaModule ->
                    ideaModule.generatedSourceDirs.add(project.buildDir.resolve("generated/ksp/main/kotlin/"))
                }
            }
        }
    }

    private fun configureExtensionDefaults(godotExtension: GodotExtension) {
        godotExtension.apply {
            isAndroidExportEnabled.set(false)
            dxToolPath.set("dx") //default assumes that it's in $PATH
        }
    }
}
