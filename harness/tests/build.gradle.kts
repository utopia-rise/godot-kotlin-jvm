
plugins {
    kotlin("jvm") version "1.4.10"
    id("com.utopia-rise.godot-jvm") version "0.1.0-3.2"
}

repositories {
    jcenter()
}

godot {
    //uncomment to test android
//    isAndroidExportEnabled.set(true)
//    dxToolPath.set("${System.getenv("HOME")}/Android/Sdk/build-tools/30.0.3/dx")
}

dependencies {
    implementation("joda-time:joda-time:2.10.6") //external dependency to test dependency inclusion in dummyCompilation
}


kotlin.sourceSets.main {
    kotlin.srcDirs("scripts")
}
