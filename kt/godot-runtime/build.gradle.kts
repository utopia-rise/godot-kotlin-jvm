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
