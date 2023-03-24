rootProject.name = "godot-kotlin-tests"

includeBuild("../../kt/api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).using(project(":"))
    }
}
includeBuild("../../kt") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).using(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-library")).using(project(":godot-library"))
        substitute(module("com.utopia-rise:godot-kotlin-symbol-processor")).using(project(":godot-kotlin-symbol-processor"))
        substitute(module("com.utopia-rise:godot-entry-generator")).using(project(":godot-entry-generator"))
    }
}

includeBuild("../../harness/hierarchical-library-tests") {
    dependencySubstitution {
        substitute(module("com.godot.tests:hierarchical-library")).using(project(":"))
    }
}

includeBuild("../../harness/flattened-library-tests") {
    dependencySubstitution {
        substitute(module("com.godot.tests:flattened-library")).using(project(":"))
    }
}

includeBuild("../../harness/fqname-library-tests") {
    dependencySubstitution {
        substitute(module("com.godot.tests:fqname-library")).using(project(":"))
    }
}

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
    resolutionStrategy.eachPlugin {
        if (requested.id.id == "com.utopia-rise.godot-kotlin-jvm") {
            useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
        }
        if (requested.id.id == "com.utopia-rise.api-generator") {
            useModule("com.utopia-rise:api-generator:${requested.version}")
        }
    }
}
