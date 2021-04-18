
plugins {
    kotlin("jvm") version "1.4.10"
    id("com.utopia-rise.godot-kotlin-jvm") version "0.1.3-3.2.3"
}

repositories {
    mavenCentral()
}

godot {
    //uncomment to test android
//    isAndroidExportEnabled.set(true)
//    dxToolPath.set("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/30.0.3/dx")
}

dependencies {
    implementation("joda-time:joda-time:2.10.6") //external dependency to test dependency inclusion in dummyCompilation
}


kotlin.sourceSets.main {
    kotlin.srcDirs("scripts")
}
