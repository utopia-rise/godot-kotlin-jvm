version = "0.1.0-${DependenciesVersions.godotVersion}"
val versionString = project.version.toString()

buildscript {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
    dependencies {
        "classpath"(group = "com.utopia-rise", name = "api-generator", version = "0.0.1")
    }
}

subprojects {
    group = "com.utopia-rise"
    version = versionString
    repositories {
        jcenter()
    }
}
