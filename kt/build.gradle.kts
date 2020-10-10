version = "0.1.0-${DependenciesVersions.godotVersion}"
val versionString = project.version.toString()

subprojects {
    group = "com.utopia-rise"
    version = versionString
    repositories {
        mavenLocal()
        jcenter()
    }
}
