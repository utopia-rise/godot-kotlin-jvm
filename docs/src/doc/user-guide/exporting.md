To export the game, you should copy exports into the correct template folder, which should be:

- Windows: `%APPDATA%\Godot\templates\<godot-version>`
- Linux: `~/.local/share/godot/templates/<godot-version>`  

You should also renamed the `release` export to:

- Windows: `windows_64_release.exe`
- Linux: `linux_x11_64_release`

And `release_debug` to:

- Windows: `windows_64_debug.exe`
- Linux: `linux_x11_64_debug`

On OSX use the script mentioned in [this issue](https://github.com/godotengine/godot-docs/issues/3194#issuecomment-588862977) as it will do the job for you.

Then you can export your game as usual, your game `jar` will be included in `pck`.   On desktop platforms, this also copies the jre folder of your project in the exported game folder.

## Requirements
To export your game, you need to have an embedded JRE created. Run the following command within your project's root.

```shell
jlink --add-modules java.base,java.logging --output jre
```

The above command will create a very minimal JVM, if you need extra features you can include the following modules:

- `jdk.jdwp.agent` to enable remote debugging
- `jdk.management.agent` to enable JMX.

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

!!! warning
    Similar to the desktop targets, the game copies the needed jar files to the `user://` directory upon first execution or if the files have changed. On android this is the applications `files` folder. If you do IO operations on Android, never empty the whole `files` folder! Only delete what you have added or exclude the following two files when clearing the `files` folder: `godot-bootstrap-dex.jar` and `main-dex.jar`.
