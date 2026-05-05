package godot.gradle.projectExt

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import org.gradle.api.Project
import org.gradle.api.plugins.scala.ScalaPlugin
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.gradle.plugins.ide.idea.model.IdeaModel

fun Project.configureThirdPartyPlugins() {
    // Apply IDEA integration so generated entry sources are visible to the IDE during sync.
    pluginManager.apply(IdeaPlugin::class.java)
    pluginManager.apply(ShadowPlugin::class.java)
    pluginManager.apply(ScalaPlugin::class.java)

    // The IDEA extension is owned by the root project during sync, so mirror the plugins there too.
    if (rootProject != project) {
        rootProject.pluginManager.apply(IdeaPlugin::class.java)
    }

    afterEvaluate {
        extensions.configure(IdeaModel::class.java) { ideaModel ->
            val generatedEntrySourcesDir = layout.buildDirectory.asFile.get().resolve("generated/entry-generation/main/kotlin/")
            ideaModel.module.generatedSourceDirs.add(generatedEntrySourcesDir)
            ideaModel.module.excludeDirs.add(generatedEntrySourcesDir)
        }
    }
}
