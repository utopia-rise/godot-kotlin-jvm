To compile your project, run a classic *gradle build*. By default this creates a `debug` version of your code.
Ex:  
```
./gradlew build
```

## TARGETS

We have two targets: `debug` and `release`.  
In order to build in release, you should add `release` parameter to your gradle build command.  
Ex:  
```
./gradlew build -Prelease
```

Using debug builds is recommended when developing. It adds some sanity checks that are cut off in `release`.  
Release builds are recommended when retail.

## Write debug code

You can add code only for debug version of your project, by using `GodotJvmDefinitions`.  
Ex:  
```kotlin
if (GodotJvmDefinitions.DEBUG) {
    ...
}
```