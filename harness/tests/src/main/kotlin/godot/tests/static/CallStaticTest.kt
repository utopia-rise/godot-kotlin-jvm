package godot.tests.static

import godot.api.DirAccess
import godot.api.Node
import godot.api.ProjectSettings
import godot.annotation.GodotScript
import godot.annotation.Register

@GodotScript
class CallStaticTest: Node() {

    @Register
    fun testStaticCall(): Boolean {
        return DirAccess.dirExistsAbsolute(ProjectSettings.globalizePath("res://scripts"))
    }
}
