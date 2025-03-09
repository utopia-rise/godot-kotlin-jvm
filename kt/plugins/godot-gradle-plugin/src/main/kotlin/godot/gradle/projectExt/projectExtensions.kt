package godot.gradle.projectExt

import godot.gradle.GodotExtension
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import java.io.File

val Project.godotJvmExtension: GodotExtension
    get() = extensions.getByType(GodotExtension::class.java)

val Project.kotlinJvmExtension: KotlinJvmProjectExtension
    get() = extensions
        .findByType(KotlinJvmProjectExtension::class.java)
        ?: rootProject.extensions.getByType(KotlinJvmProjectExtension::class.java)


val Project.ideaExtension: IdeaModel
    get() = requireNotNull(
        extensions
            .findByType(IdeaModel::class.java)
    ) {
        "idea extension not found"
    }

val Project.isRelease: Boolean
    get() = hasProperty("release")

val Project.godotCoreArtifactName: String
    get() = "godot-core-library-${if (isRelease) "release" else "debug"}"

val Project.godotApiArtifactName: String
    get() = "godot-api-library-${if (isRelease) "release" else "debug"}"

val Project.godotExtensionArtifactName: String
    get() = "godot-extension-library-${if (isRelease) "release" else "debug"}"

val Project.godotCoroutineLibraryArtifactName: String
    get() = "godot-coroutine-library-${if (isRelease) "release" else "debug"}"

val Project.classGraphGeneratedDirectory: File
    get() = layout.buildDirectory.asFile.get().resolve("generated/classgraph/")
