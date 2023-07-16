To export the game, you should copy exports into the correct template folder, which should be:

- Windows: `%APPDATA%\Godot\templates\<godot-version>`
- Linux: `~/.local/share/godot/templates/<godot-version>`  

You should also renamed the `release` export to:

- Windows: `windows_64_release.exe`
- Linux: `linux_x11_64_release`

And `template_debug` to:

- Windows: `windows_64_debug.exe`
- Linux: `linux_x11_64_debug`

On OSX use the script mentioned in [this issue](https://github.com/godotengine/godot-docs/issues/3194#issuecomment-588862977) as it will do the job for you.

Then you can export your game as usual, your game `jar` will be included in `pck`.   On desktop platforms, this also copies the jre folder of your project in the exported game folder.

## Requirements
To export your game, you need to have an embedded JRE created. Run the following command within your project's root.  
For desktop exports you need to make exports based on the platform you're on, as exporting will copy jre folder to
your export. An OSX jre will not work with a windows, so you'll need a windows to export for windows.  

- amd64 systems:
    ```shell
    jlink --add-modules java.base,java.logging --output jre-amd64
    ```
- arm64 systems:
    ```shell
    jlink --add-modules java.base,java.logging --output jre-arm64
    ```

The above command will create a very minimal JVM, if you need extra features you can include the following modules:

- `jdk.jdwp.agent` to enable remote debugging
- `jdk.management.agent` to enable JMX.

*Special note for MacOS*: To create a universal app, you'll need both amd64 and arm64 JRE. You can create an amd64 jre
by using jlink with rosetta and an amd64 jdk on an arm64 MacOS.

## Specifics

`godot-bootstrap.jar` and `main.jar` are set into `pck` during the export process. As a real file path is needed to handle them, they are copied on the first game version start from `res://` to `user://` (we check if it exists and also check the md5 hash) to only update when needed. Don't forget to remove them when writing an uninstaller for your game.

## Android
!!! warning
    If you plan to export your game to android, make sure the libraries you use, are actually compatible with android.

In order to build for Android, set the `isAndroidExportEnabled` flag to `true` in your build file.

=== "build.gradke.kts"
    ```kt
    godot {
        isAndroidExportEnabled.set(true)
    }
    ```

On android, we do not embed a JVM, we use the existing ART provided by the OS. In order for your game to load the necessary jar files, they need to be converted into dex format. Our gradle plugin will handle this for you, but you need to fulfill the following requirements:

- Android SDK installed
- `d8` tool resolvable by setting the `d8ToolPath` to the file path of `d8`:
    ```kt
    godot {
        d8ToolPath = File("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/31.0.0/d8")
    }
    ```

- Setting the `androidCompileSdkDir` to your target sdk version (most of the time, you want to set it to the newest version available):
    ```kt
    godot {
        androidCompileSdkDir = File("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30")
    }
    ```

- Setting the `androidMinApi` (equivalent to `--min-api` argument of `d8` tool), default is `21`:
    ```kt
    godot {
        androidMinApi = 22
    }
    ```

!!! warning
    Similar to the desktop targets, the game copies the needed jar files to the `user://` directory upon first execution or if the files have changed. On android this is the applications `files` folder. If you do IO operations on Android, never empty the whole `files` folder! Only delete what you have added or exclude the following two files when clearing the `files` folder: `godot-bootstrap-dex.jar` and `main-dex.jar`.

## GraalVM Native Image

!!! warning
    GraalVM native image is a advanced feature and requires a lot of work to support. Especially if you rely on many third party libraries.

In order to build for graalvm, follow `GraalVM native-image` section in [advanced user guide](./advanced/graal-vm-native-image.md).

As `main.jar` and `godot-bootstrap.jar`, `usercode` shared library is set in `pck` during the export process and is copied to user directory. Don't forget to destroy them when creating an uninstaller.

- GraalVM native image is not available for android platform.

On desktop platform default export is inferred by the `godot_kotin_configuration.json` file. You still can export for `jvm` and `native-image`, by adding feature `export-all-jvm`. In this case, the default JVM started by engine is the one from `godot_kotin_configuration.json` and can be overridden by command line.  

## iOS

!!! warning
    IOS export is experimental.

IOS export rely on graalvm native image feature, so you should configure your project with same configuration than
classic graalvm native-image export.  
You should additionally add this configuration, in the godot gradle configuration:  
```kotlin
isIOSExportEnabled.set(true)
```

!!! warning
    With this export you don't have choice regarding JVM embedded in app. Godot kotlin's gradle plugin will
automatically download iOS static JDK libraries and pack them with your code for iOS.