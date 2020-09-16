package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.utils.GodotBuildProperties
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension


class GodotPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        require(project.rootProject == project) { "godot-jvm plugin can only be applied on the root project!" }
        val jvm = project.extensions.getByType<KotlinJvmProjectExtension>()
        project.pluginManager.apply(ShadowPlugin::class)
        setupPlugin(project, jvm)
    }

    private fun setupPlugin(project: Project, jvm: KotlinJvmProjectExtension) {

        project.afterEvaluate {
            val bootstrap = configurations.create("bootstrap") {
                dependencies {
                    add(name, kotlin("stdlib"))
                    add(name, "com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
                }
            }
            val main = configurations.create("main").apply {
                extendsFrom(configurations.getByName("implementation"), configurations.getByName("runtimeOnly"))
                exclude(
                    mapOfNonNullValuesOf(
                        "group" to "org.jetbrains.kotlin",
                        "module" to null
                    )
                )
            }

            jvm.target.compilations.getByName("main").defaultSourceSet {
                dependencies {
                    compileOnly("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
                }
            }

            tasks {
                val bootstrapJar by creating(ShadowJar::class) {
                    archiveBaseName.set("godot-bootstrap")
                    configurations.add(bootstrap)
                }

                val shadowJar = named<ShadowJar>("shadowJar") {
                    archiveBaseName.set("main")
                    archiveVersion.set("")
                    archiveClassifier.set("")
                    configurations.clear()
                    configurations.add(main)
                }

                val build by getting {
                    dependsOn(bootstrapJar, shadowJar)
                }
            }
        }
    }

    private fun mapOfNonNullValuesOf(vararg entries: Pair<String, String?>): Map<String, String> =
        mutableMapOf<String, String>().apply {
            for ((k, v) in entries) {
                if (v != null) {
                    put(k, v)
                }
            }
        }
}