plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    //uncomment to test graal vm native image
//    isGraalNativeImageExportEnabled.set(true)
//    graalVmDirectory.set(System.getenv("GRAALVM_HOME"))
//    windowsDeveloperVCVarsPath.set(System.getenv("VC_VARS_PATH"))
}
