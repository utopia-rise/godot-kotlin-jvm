package godot.gradle.projectExt

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import org.gradle.api.Project
import org.gradle.api.plugins.scala.ScalaPlugin
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.jetbrains.gradle.ext.IdeaExtPlugin

fun Project.configureThirdPartyPlugins() {
    //apply needed third party plugins
    pluginManager.apply(IdeaPlugin::class.java) //needed so idea can find and index the generated sources from classgraph
    pluginManager.apply(IdeaExtPlugin::class.java) //needed so idea can find and index the generated sources from classgraph
    pluginManager.apply(ShadowPlugin::class.java)
    pluginManager.apply(ScalaPlugin::class.java)

    // apply the idea plugin to the *root* project.
    // this is necessary because the IntelliJ IDEA plugin is used for managing some
    // of our tasks, and its capabilities are available only on the root project.
    if(this.rootProject != this.project) {
        this.rootProject.pluginManager.apply(IdeaPlugin::class.java)
        this.rootProject.pluginManager.apply(IdeaExtPlugin::class.java)
    }

    afterEvaluate {
        addClassGraphGeneratedSourcesToMainSourceSet()

        ideaExtension.apply {
            module { ideaModule ->
                ideaModule.generatedSourceDirs.add(layout.buildDirectory.asFile.get().resolve("generated/classgraph/main/kotlin/"))
            }
        }
    }
}

private fun Project.addClassGraphGeneratedSourcesToMainSourceSet() {
    kotlinJvmExtension
        .sourceSets
        .getByName("main")
        .kotlin
        .srcDirs(classGraphGeneratedDirectory.resolve("main/kotlin/"))
}
