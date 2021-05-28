
plugins {
    id("com.google.devtools.ksp") version "1.5.0-1.0.0-alpha09"
    kotlin("jvm") version "1.5.0"
//    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
    google()
}

//godot {
//    //uncomment to test android
////    isAndroidExportEnabled.set(true)
////    dxToolPath.set("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/30.0.3/dx")
//}

dependencies {
    implementation("joda-time:joda-time:2.10.6") //external dependency to test dependency inclusion in dummyCompilation
    implementation("com.utopia-rise:godot-annotation-processor-new:0.1.4-3.3.0")
    implementation("com.utopia-rise:godot-library:0.1.4-3.3.0")
    ksp("com.utopia-rise:godot-annotation-processor-new:0.1.4-3.3.0")
}


kotlin.sourceSets.main {
    kotlin.srcDirs("scripts")
}

ksp {
    arg(
        "srcDirs",
        kotlin.sourceSets.main.get().kotlin.srcDirs.joinToString(File.pathSeparator) { it.absolutePath }
    )
    arg(
        "outDir",
        project.buildDir.resolve("godot").absolutePath
    )
    arg(
        "projectBasePath",
        projectDir.absolutePath
    )
}
