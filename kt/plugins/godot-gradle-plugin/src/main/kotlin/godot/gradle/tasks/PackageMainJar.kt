package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

open class PackageMainJar: ShadowJar(), GodotJvmTask {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Creates a fat jar containing game code and all dependencies of it"

        val shadowJarTask = project.tasks.named("shadowJar", ShadowJar::class.java).get().apply {
            archiveBaseName.set("main")
            archiveVersion.set("")
            archiveClassifier.set("")

            dependencies {
                it.exclude(it.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
                it.exclude(it.dependency("com.utopia-rise:godot-library:.*"))
            }
        }

        dependsOn(
            TaskRegistry.CREATE_BUILD_LOCK.taskName,
            TaskRegistry.GENERATE_ENTRY_SERVICE_FILE.taskName
        )
        finalizedBy(shadowJarTask)
    }
}
