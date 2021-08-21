package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

open class PackageBootstrapJar: ShadowJar(), GodotJvmTask {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Creates a fat jar containing everything needed to load and run the main.jar"

        archiveBaseName.set("godot-bootstrap")
        configurations.clear()
        configurations.add(project.configurations.getByName("bootstrap"))

        dependsOn(TaskRegistry.CREATE_BUILD_LOCK.taskName)
    }
}
