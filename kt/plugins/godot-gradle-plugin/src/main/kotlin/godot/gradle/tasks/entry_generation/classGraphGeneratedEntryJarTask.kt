package godot.gradle.tasks

import godot.gradle.projectExt.kotlinJvmExtension
import org.gradle.api.Project
import org.gradle.api.file.Directory
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinWithJavaCompilation

fun Project.classGraphGeneratedEntryJarTask(
    generateEntryFilesTask: TaskProvider<ClassGraphGenerateEntryFilesTask>,
): TaskProvider<Jar> {
    val mainCompilation = kotlinJvmExtension.target.compilations.getByName("main")
    val generatedSourceRootDir = classGraphGeneratedSourceRootDir()
    val generatedEntryCompilation = createClassGraphGeneratedEntryCompilation(
        mainCompilation = mainCompilation,
        generatedSourceRootDir = generatedSourceRootDir,
        generateEntryFilesTask = generateEntryFilesTask
    )

    return tasks.register(
        "classGraphGeneratedEntryJar",
        Jar::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Compiles generated ClassGraph entry sources into a reusable jar."

        task.archiveBaseName.set("classgraph-entry")
        task.archiveVersion.set("")
        task.archiveClassifier.set("")

        task.dependsOn(generatedEntryCompilation.compileTaskProvider)
        task.dependsOn(generateEntryFilesTask)

        task.from(generatedEntryCompilation.output.allOutputs)
        task.from(generatedSourceRootDir.map { generatedRoot -> generatedRoot.dir("resources") })
    }
}

private fun Project.classGraphGeneratedSourceRootDir(): Provider<Directory> =
    layout.buildDirectory.dir("generated/classgraph")

private fun Project.createClassGraphGeneratedEntryCompilation(
    mainCompilation: KotlinWithJavaCompilation<*, *>,
    generatedSourceRootDir: Provider<Directory>,
    generateEntryFilesTask: TaskProvider<ClassGraphGenerateEntryFilesTask>,
): KotlinWithJavaCompilation<*, *> {
    val generatedEntryCompilation = kotlinJvmExtension.target.compilations.create("classGraphGeneratedEntry") { compilation ->
        compilation.defaultSourceSet {
            kotlin.srcDir(generatedSourceRootDir.map { generatedRoot -> generatedRoot.dir("main/kotlin").asFile })
        }

        compilation.compileDependencyFiles += mainCompilation.compileDependencyFiles
        compilation.compileDependencyFiles += mainCompilation.output.allOutputs
        compilation.runtimeDependencyFiles += mainCompilation.runtimeDependencyFiles

        compilation.compileTaskProvider.get().dependsOn(generateEntryFilesTask)
        compilation.compileTaskProvider.get().dependsOn(tasks.named("classes"))
    }
    return generatedEntryCompilation
}
