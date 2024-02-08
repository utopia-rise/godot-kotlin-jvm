To compile your project, run a classic *Gradle build*. By default this creates a `debug` version of your code.

Example:

```bash
./gradlew build
```

## Targets

We have two targets: `debug` and `release`.
In order to build in release, you should add `release` parameter to your Gradle build command.

Example:

```bash
./gradlew build -Prelease
```

Using debug builds is recommended when developing. It adds some sanity checks that are cut off in `release`.  

Release builds are recommended when distributing to retail.

## Write debug code

You can add code only for debug version of your project, by using `GodotJvmDefinitions`.

Example:

```kotlin
if (GodotJvmDefinitions.DEBUG) {
    // ...
}
```