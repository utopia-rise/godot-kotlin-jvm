
plugins {
    kotlin("jvm")
    `maven-publish`
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "0.14.0"
    id("com.utopia-rise.godot-publish")
    id("org.ajoberstar.grgit")
}

gradlePlugin {
    plugins {
        create("godotPlugin") {
            id = "com.utopia-rise.godot-kotlin-jvm"
            displayName = "Gradle plugin for godot-kotlin-jvm"
            implementationClass = "godot.gradle.GodotPlugin"
            description = "Automatically setup of godot kotlin jvm specific project configurations"
        }
    }
    isAutomatedPublishing = false
}

pluginBundle {
    website = "https://github.com/utopia-rise/godot-kotlin-jvm"
    vcsUrl = "https://github.com/utopia-rise/godot-kotlin-jvm.git"
    tags = listOf("kotlin", "godot", "gamedev")

    mavenCoordinates {
        groupId = "${project.group}"
        artifactId = "godot-gradle-plugin"
        version = "${project.version}"
    }
}

repositories {
    google()
    mavenCentral()
    mavenLocal()
}

sourceSets{

    create("functionalTest"){
        java.srcDirs.add(file("src/functionalTest/kotlin"))
        resources.srcDirs.add(file("src/functionalTest/resources"))

        compileClasspath += sourceSets.main.get().output+configurations.testRuntimeClasspath
        runtimeClasspath += output+compileClasspath
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin"))
    implementation(kotlin("gradle-plugin-api"))
    implementation("com.github.jengelman.gradle.plugins:shadow:${DependenciesVersions.shadowJarPluginVersion}")
    implementation("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:${DependenciesVersions.kspVersion}")

    implementation(project(":godot-build-props"))
    // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.1.2")
    implementation("com.konghq:unirest-java:3.13.6")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation(gradleTestKit())
}

tasks {
    build {
        finalizedBy(publishToMavenLocal)
    }
}

publishing {
    publications {
        val godotGradlePlugin by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot gradle plugin for kotlin language support.")
            }
            artifactId = project.name
            description = "Godot gradle plugin for kotlin language support."
            from(components.getByName("java"))
        }
    }
}

project.extra["artifacts"] = arrayOf("godotGradlePlugin")

val currentCommit: org.ajoberstar.grgit.Commit = grgit.head()
// check if the current commit is tagged
var tagOnCurrentCommit = grgit.tag.list().firstOrNull { tag -> tag.commit.id == currentCommit.id }
var releaseMode = tagOnCurrentCommit != null

fun isSnapshotBuild(): Boolean = tagOnCurrentCommit?.name?.endsWith("SNAPSHOT") == true

val functionalTest = task<Test>("functionalTest"){
    description = "runs functional tests"
    group = "verification"
    testClassesDirs = sourceSets.getByName("functionalTest").output.classesDirs
    classpath= sourceSets.getByName("functionalTest").runtimeClasspath

}

tasks.withType<Test> {
    //enable support fot Junit5
    useJUnitPlatform()

}

tasks.getByName("check").dependsOn(functionalTest)
