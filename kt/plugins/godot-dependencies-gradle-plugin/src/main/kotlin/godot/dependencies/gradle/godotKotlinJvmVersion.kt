package godot.dependencies.gradle

import org.ajoberstar.grgit.Commit

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
        "$godotKotlinJvmVersion-${DependenciesVersions.godotVersion}-${currentCommit.abbreviatedId}-SNAPSHOT"
    } else {
        val baseVersion = "$godotKotlinJvmVersion-${DependenciesVersions.godotVersion}"
        if (isSnapshot) {
            "$baseVersion-SNAPSHOT"
        } else {
            baseVersion
        }
    }
}
