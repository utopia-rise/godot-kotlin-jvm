Let's create a file `src/main/kotlin/com/yourcompany/game/Simple.kt` with the following content:

```kotlin
package com.yourcompany.game

import godot.Node3D
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.global.GD

@GodotScript
class Simple: Node3D() {

    @Register
    override fun _ready() {
        GD.print("Hello world!")
    }
}
```

The [classes](../user-guide/classes.md) section covers in details what we did here, but for now `@GodotScript` will register the class to Godot. Now we can trigger a build.

```shell
./gradlew build
``` 

Once the build completes, you will be able to use your class in Godot. Simply attach the generated `gdj` file (By default, generated in the `gdj/` directory at the root of the project. For more details, read [user guide](../user-guide/api-differences.md#registration-files-gdj)) to a node like you would do in GDScript. If you rebuild the project while the editor is open, your classes will be reloaded automatically in Godot and you can use them.

![Attach Node Script](../assets/img/attach.png)

!!! info
    As Kotlin is a compiled language you can only use newly created classes after you have built them, otherwise, Godot will not be able to find them.


## Final project structure

The final filesystem project should look like this:

```
~/Dev/Workspace/kotlin-godot-demo tree
.
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ build
Ã¢â€â€šÃ‚Â Ã‚Â  Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ libs
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ build.gradle.kts
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ gdj
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ gradle
Ã¢â€â€šÃ‚Â Ã‚Â  Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ wrapper
Ã¢â€â€šÃ‚Â Ã‚Â      Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ gradle-wrapper.jar
Ã¢â€â€šÃ‚Â Ã‚Â      Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ gradle-wrapper.properties
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ gradlew
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ gradlew.bat
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ icon.svg
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ kotlin-godot-demo.iml
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ project.godot
Ã¢â€Å“Ã¢â€â‚¬Ã¢â€â‚¬ settings.gradle.kts
Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ src
    Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ main
        Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ kotlin
            Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ com
                Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ utopiarise
                    Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ demo
                        Ã¢â€â€Ã¢â€â‚¬Ã¢â€â‚¬ Simple.kt

12 directories, 10 files
```