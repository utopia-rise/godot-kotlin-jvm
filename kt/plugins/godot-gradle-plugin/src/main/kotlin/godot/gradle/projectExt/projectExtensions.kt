package godot.gradle.projectExt

import com.google.devtools.ksp.gradle.KspExtension
import godot.gradle.GodotExtension
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

val Project.godotJvmExtension: GodotExtension
    get() = extensions.getByType(GodotExtension::class.java)

val Project.kotlinJvmExtension: KotlinJvmProjectExtension
    get() = extensions
        .findByType(KotlinJvmProjectExtension::class.java)
        ?: rootProject.extensions.getByType(KotlinJvmProjectExtension::class.java)


val Project.kspExtension: KspExtension
    get() = requireNotNull(
        extensions
            .findByType(KspExtension::class.java)
    ) {
        "kspExtension not found"
    }

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
