package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.google.devtools.ksp.gradle.KspExtension
import com.google.devtools.ksp.gradle.KspGradleSubplugin
import godot.utils.GodotBuildProperties
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper
import java.io.File


class GodotPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        //apply needed third party plugins
        target.repositories.google() //add google repository for ksp (kotlin symbol processing
        target.pluginManager.apply(KspGradleSubplugin::class.java)
        target.pluginManager.apply(IdeaPlugin::class.java) //needed so idea can find and index the generated sources from ksp
        target.pluginManager.apply(ShadowPlugin::class.java)

        val kotlinPlugin = target.plugins.findPlugin(KotlinPluginWrapper::class.java)
        val kotlinPluginVersion = target
            .buildscript
            .configurations
            .firstOrNull { it.name == "classpath" }
            ?.dependencies
            ?.firstOrNull { it.name == "org.jetbrains.kotlin.jvm.gradle.plugin" }
            ?.version

        val isSuppressingKotlinIncompatibility = (target.findProperty("godot.jvm.suppressKotlinIncompatibility") as? String)?.toBoolean() ?: false

        if (!isSuppressingKotlinIncompatibility) {
            target.logger.info("Kotlin plugin already applied: ${kotlinPlugin != null}; detected version: ${kotlinPluginVersion ?: "none"}")

            when {
                kotlinPlugin != null && kotlinPluginVersion != null && kotlinPluginVersion != GodotBuildProperties.supportedKotlinVersion -> throw IllegalArgumentException(
                    "Detected that a kotlin plugin with version $kotlinPluginVersion is already applied. But Godot-Kotlin is only compatible with kotlin ${GodotBuildProperties.supportedKotlinVersion}, please change the version to ${GodotBuildProperties.supportedKotlinVersion}"
                )
                kotlinPlugin == null && kotlinPluginVersion != null && kotlinPluginVersion != GodotBuildProperties.supportedKotlinVersion -> throw IllegalArgumentException(
                    "Detected that kotlin plugin version $kotlinPluginVersion is already defined. But Godot-Kotlin is only compatible with kotlin ${GodotBuildProperties.supportedKotlinVersion}, please change the version to ${GodotBuildProperties.supportedKotlinVersion}"
                )
                kotlinPlugin == null && kotlinPluginVersion == null || kotlinPluginVersion == GodotBuildProperties.supportedKotlinVersion -> {
                    target.pluginManager.apply("org.jetbrains.kotlin.jvm") // the version will be the one with which this plugin was built
                }
            }
        } else {
            // warn is not really visible enough in the log. As this is a very important print, error is used to print it more visible
            target.logger.error("Found property \"godot.jvm.suppressKotlinIncompatibility\" is set to \"true\". This is an advanced feature! Only use it if you know what you're doing. We cannot guarantee that our compiler plugin is compatible with other kotlin version that ${GodotBuildProperties.supportedKotlinVersion} (found version: $kotlinPluginVersion). Setting this property to true can lead to build and/or runtime errors.")
        }

        val godotExtension = target.extensions.create("godot", GodotExtension::class.java)
        val kotlinJvmExtension = target
            .extensions
            .findByType(KotlinJvmProjectExtension::class.java)
            ?: target.rootProject.extensions.getByType(KotlinJvmProjectExtension::class.java)
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

        configureExtensionDefaults(godotExtension)
        configureThirdPartyPlugins(target, kotlinJvmExtension, kspExtension, ideaExtension)
        target.setupConfigurationsAndCompilations(godotExtension, kotlinJvmExtension)
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
                        .joinToString(File.pathSeparator) { it.absolutePath.replace(File.separator, "/") }
                )
                arg(
                    "projectBasePath",
                    project.projectDir.absolutePath.replace(File.separator, "/")
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
