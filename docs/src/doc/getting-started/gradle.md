This module uses [Gradle](https://gradle.org) as its build tool and you will need version 6.0 or higher installed. The next requirement is to have a Godot project, if you don't have it yet please create one. You will also need to have Java 9 or higher installed for development. But don't worry, your users won't have to install java to use your application, this module embedds a JRE with your application. Open a terminal and `cd` to root directory of your Godot project.

## Wrapper
On this step, we will be setting up a gradle [wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html). The wrapper will ensure that anyone who wants to build your project from source will use the same gradle version.

Windows: 
```shell
fsutil file createnew build.gradle.kts 0
fsutil file createnew gradle.properties 0
fsutil file createnew settings.gradle.kts 0
```
Unix: 
```shell
touch build.gradle.kts gradle.properties settings.gradle.kts
```

The above command will create three files, which will be empty for now.

All platforms: 
```shell
gradle wrapper --gradle-version=6.8
```

That is it, you have the wrapper installed! The command will produce several files but the important ones are `gradlew` and `gradlew.bat`. Moving forward we will be using `gradlew` to run gradle (`gradlew.bat` on Windows). The first time `gradlew` is used it will download the gradle version you have specified before.

## Setup
Once you have the wrapper installed, we need to setup the Gradle plugin this module provides. Without the plugin, you will have to manually define all needed dependencies, manually register your classes, signals, properties, functions and manually create and copy the needed jar's in the correct way. To make our lives easier we use the gradle plugin which does all of this for us.
Doing this, our `build.gradle.kts` file will look like this:

```kotlin
plugins {
    kotlin("jvm") version "$kotlinVersion"
    id("com.utopia-rise.godot-jvm") version "$godotKotlinVersion"
}

repositories {
    mavenCentral()
}
```

We also want to define our project name in the `settings.gradle.kts` file:

```kotlin
rootProject.name = "$projectName"
```

That's it! Now continue with [adding your first class](add-first-class.md).