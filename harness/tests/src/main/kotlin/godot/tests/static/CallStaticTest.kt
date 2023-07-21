package godot.tests.static

import godot.DirAccess
import godot.Node
import godot.ProjectSettings
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Color

@RegisterClass
class CallStaticTest: Node() {

    @RegisterFunction
    fun testStaticCall(): Boolean {
        return DirAccess.dirExistsAbsolute(ProjectSettings.globalizePath("res://scripts"))
    }
}
