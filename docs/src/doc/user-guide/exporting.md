## Exporting games

To export the game, you should copy exports into the correct template folder, which should be:  
- Windows: `%APPDATA%\Godot\templates\<godot-version>`
- Linux: `~/.local/share/godot/templates/<godot-version>`  

You should also renamed the `release` export to:    
- Windows: `windows_64_release.exe`
- Linux: `linux_x11_64_release`

And `release_debug` to:  
- Windows: `windows_64_debug.exe`
- Linux: `linux_x11_64_debug`

On osx use the script mentioned in [this issue](https://github.com/godotengine/godot-docs/issues/3194#issuecomment-588862977). It will do the job for you.

Then you can export your game as usual, your game `jar` will be included in `pck`.  
On desktop platforms, this also copies the jre folder of your project in the exported game folder.

## Particularities

`godot-bootstrap.jar` and `main.jar` are set into `pck` during the export process. As a real file path is needed to
handle them, they are copied on the first game version start from `res://` to `user://` (We check if it exists and also check the md5 hash)
to only update when needed.  
Don't forget to remove them when writing an uninstaller for the game.

## Android
In order to build on android, set the `isAndroidExportEnabled` flag to true in the `build.gradle.kts`:
```kotlin
godot {
    isAndroidExportEnabled.set(true)
}
```
On android we do not embedd a JVM. We use the existing ART of android.  
In order for your game to load the necessary jar files, they need to be converted into dex format.  
Our gradle plugin will handle this for you, but you need to fulfill the following requirements:

- Android SDK installed
- `dx` tool resolvable by doing one of the following:
    - set the `PATH` environment variable to include `<android-sdk-dir>/build-tools/<version>/`
    - set the path to the `dx` tool through gradle with the property `dxToolPath`:
```kotlin
    godot {
        isAndroidExportEnabled.set(true)
        dxToolPath.set("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/30.0.3/dx")
    }
```

!!! warning "Important:"
    Same as on the desktop targets, the game copies the needed jar files to the `user://` dir upon first execution or if the files have changed. On android this is the applications `files` folder.  
    If you do IO operations on android, never empty the whole `files` folder! Only delete what you have added or exclude the following two files when clearing the `files` folder: `godot-bootstrap-dex.jar` and `main-dex.jar`.