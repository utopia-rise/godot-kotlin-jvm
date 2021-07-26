
plugins {
    kotlin("jvm") version "1.5.21"
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    //uncomment to test android
    isAndroidExportEnabled.set(true)
    d8ToolPath = File("/home/cedric/Android/Sdk/build-tools/30.0.3/d8")
    androidCompileSdkDir = File("/home/cedric/Android/Sdk/platforms/android-30")
}

dependencies {
    implementation("joda-time:joda-time:2.10.6") //external dependency to test dependency inclusion in dummyCompilation
}


kotlin.sourceSets.main {
    kotlin.srcDirs("scripts")
}
