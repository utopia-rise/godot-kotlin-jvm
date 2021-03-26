import org.ajoberstar.grgit.Commit

plugins {
    id("org.ajoberstar.grgit") version "4.1.0"
}

val currentCommit: Commit = grgit.head()
// check if the current commit is tagged
var tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
var releaseMode = tagOnCurrentCommit != null

version = if (!releaseMode) {
    "$godotKotlinJvmVersion-${currentCommit.abbreviatedId}-SNAPSHOT"
} else {
    val godotKotlinJvmTagVersion = requireNotNull(tagOnCurrentCommit).name
    "$godotKotlinJvmTagVersion-${DependenciesVersions.godotVersion}"
}

val versionString = project.version.toString()

subprojects {
    group = "com.utopia-rise"
    version = versionString
    repositories {
        jcenter()
    }
}
