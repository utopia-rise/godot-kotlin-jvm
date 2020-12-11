
plugins {
    kotlin("jvm") version "1.4.10"
    `maven-publish`
}

group = "com.utopia-rise"
version = "0.1.0-3.2"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compileOnly(kotlin("compiler-embeddable"))
    compileOnly("com.utopia-rise:godot-kotlin-entry-generator")
}

tasks {
    val sourceJar by creating(Jar::class) {
        archiveBaseName.set(project.name)
        archiveVersion.set(project.version.toString())
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    build {
        finalizedBy(publishToMavenLocal)
    }

//    withType<KotlinCompile>().all {
//        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.ExperimentalStdlibApi"
//    }
}
