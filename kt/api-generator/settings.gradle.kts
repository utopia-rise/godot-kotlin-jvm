
includeBuild("../tools-common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:tools-common")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
    }
}
