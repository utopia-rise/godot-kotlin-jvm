package godot.gradle.projectExt

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.google.devtools.ksp.gradle.KspGradleSubplugin
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.jetbrains.gradle.ext.IdeaExtPlugin
import java.io.File

fun Project.configureThirdPartyPlugins() {
    //apply needed third party plugins
    repositories.google() //add google repository for ksp (kotlin symbol processing
    pluginManager.apply(KspGradleSubplugin::class.java)
    pluginManager.apply(IdeaPlugin::class.java) //needed so idea can find and index the generated sources from ksp
    pluginManager.apply(IdeaExtPlugin::class.java) //needed so idea can find and index the generated sources from ksp
    pluginManager.apply(ShadowPlugin::class.java)

    addKspGeneratedSourcesToMainSourceSet()

    afterEvaluate {
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
                projectDir.absolutePath.replace(File.separator, "/")
            )
        }

        ideaExtension.apply {
            module { ideaModule ->
                ideaModule.generatedSourceDirs.add(buildDir.resolve("generated/ksp/main/kotlin/"))
            }
        }
    }
}

private fun Project.addKspGeneratedSourcesToMainSourceSet() {
    kotlinJvmExtension
        .sourceSets
        .getByName("main")
        .kotlin
        .srcDirs(buildDir.resolve("generated/ksp/main/kotlin/"))
}
