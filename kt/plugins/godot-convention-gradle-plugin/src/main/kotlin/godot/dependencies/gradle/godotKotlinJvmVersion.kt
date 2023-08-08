package godot.dependencies.gradle

import org.ajoberstar.grgit.Commit
import java.util.*

private object LoadObject
private val buildProperties by lazy {
    val props = Properties()
    props.load(LoadObject::class.java.classLoader.getResourceAsStream("build.properties"))
    props
}

private val godotKotlinJvmVersion by lazy {
    buildProperties["godot.kotlin.jvm.version"] as String
}

private val godotVersion by lazy {
    buildProperties["godot.version"] as String
}

private val supportedKotlinVersion by lazy {
    buildProperties["kotlin.version"] as String
}

val fullGodotKotlinJvmVersion: String by lazy {
    provideAssembledVersion()
}

val isSnapshot: Boolean by lazy {
    val currentCommit: Commit = grgit.head()
    // check if the current commit is tagged
    val tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
    val releaseMode = tagOnCurrentCommit != null

    !releaseMode || requireNotNull(tagOnCurrentCommit).name.contains("-SNAPSHOT")
}

private fun provideAssembledVersion(): String {
    val currentCommit: Commit = grgit.head()
    // check if the current commit is tagged
    val tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
    val releaseMode = tagOnCurrentCommit != null

    val isSnapshot = !releaseMode || requireNotNull(tagOnCurrentCommit).name.contains("-SNAPSHOT")

    return if (!releaseMode) {
        "$godotKotlinJvmVersion-${godotVersion}-${currentCommit.abbreviatedId}-SNAPSHOT"
    } else {
        val baseVersion = "$godotKotlinJvmVersion-${godotVersion}"
        if (isSnapshot) {
            "$baseVersion-SNAPSHOT"
        } else {
            baseVersion
        }
    }
}
