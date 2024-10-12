package godot.tests.static

import godot.DirAccess
import godot.Node
import godot.ProjectSettings
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class CallStaticTest: Node() {

    @GodotMember
    fun testStaticCall(): Boolean {
        return DirAccess.dirExistsAbsolute(ProjectSettings.globalizePath("res://scripts"))
    }
}
