plugins {
    kotlin("jvm")
    id("com.utopia-rise.godot-publish")
}

publishing {
    publications {
        val godotRuntimePublication by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Contains runtime classes and core types to make the jvm interact with cpp")
            }
            artifactId = "godot-runtime"
            description = "Contains runtime classes and core types to make the jvm interact with cpp"
            from(components.getByName("java"))
        }
    }
}

// we need to target java 1.6 in order to support android
// before kotlin 1.5.x, kotlin was actually targeting java 1.6 by default. But since 1.5.x we need to do this explicitly
// see: https://kotlinlang.org/docs/whatsnew15.html#new-default-jvm-target-1-8
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_6.toString()
    }
}
