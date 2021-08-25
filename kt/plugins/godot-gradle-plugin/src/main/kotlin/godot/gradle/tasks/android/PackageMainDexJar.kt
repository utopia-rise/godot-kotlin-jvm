package godot.gradle.tasks.android

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.gradle.ext.godotJvmExtension
import godot.gradle.tasks.GodotJvmTask
import godot.gradle.tasks.TaskRegistry

open class PackageMainDexJar: ShadowJar(), GodotJvmTask {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Packs the android dex file of main, together with the needed entry service file into a jar. Needed for android builds only"

        if (!project.godotJvmExtension.isAndroidExportEnabled.get()) {
            return
        }

        archiveBaseName.set("main-dex")

        from("src/main/resources").include("**/godot.registration.Entry")
        from("${project.buildDir.absolutePath}/libs/").include("classes.dex")

        dependsOn(TaskRegistry.CREATE_MAIN_DEX_FILE.taskName)
    }
}
