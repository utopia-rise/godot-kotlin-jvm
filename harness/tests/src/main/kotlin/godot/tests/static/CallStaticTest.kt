package godot.tests.static

import godot.api.DirAccess
import godot.api.Node
import godot.api.ProjectSettings
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
