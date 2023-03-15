plugins {
    // no need to apply kotlin jvm plugin. Our plugin already applies the correct version for you
//    kotlin("jvm") version "1.7.10"
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    registrationFileBaseDir.set(projectDir.resolve("scripts").also { it.mkdirs() })
    isRegistrationFileHierarchyEnabled.set(true)

    //uncomment to test android
//    isAndroidExportEnabled.set(true)
//    d8ToolPath.set(File("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/30.0.3/d8"))
//    androidCompileSdkDir.set(File("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"))

    //uncomment to test graal vm native image
//    isGraalNativeImageExportEnabled.set(true)
//    nativeImageToolPath.set(File("${System.getenv("JAVA_HOME")}/bin/native-image"))
//    additionalGraalResourceConfigurationFiles.set(
//        arrayOf(
//            projectDir.resolve("graal").resolve("resource-config.json").absolutePath,
//        )
//    )
//    additionalGraalReflectionConfigurationFiles.set(
//        arrayOf(
//            projectDir.resolve("graal").resolve("reflect-config.json").absolutePath,
//        )
//    )
//    windowsDeveloperVCVarsPath.set(System.getenv("VC_VARS_PATH"))
}

dependencies {
    implementation("joda-time:joda-time:2.10.6") // external dependency to test dependency inclusion in mainCompilation

    implementation("com.godot.tests:hierarchical-library")
    implementation("com.godot.tests:flattened-library")
    implementation("com.godot.tests:fqname-library")
}


kotlin.sourceSets.main {
    kotlin.srcDirs("otherSourceDir")
}
