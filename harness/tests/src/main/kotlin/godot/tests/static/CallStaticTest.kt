package godot.tests.static

import godot.DirAccess
import godot.Node
import godot.ProjectSettings
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class CallStaticTest: Node() {

    @Member
    fun testStaticCall(): Boolean {
        return DirAccess.dirExistsAbsolute(ProjectSettings.globalizePath("res://scripts"))
    }
}
