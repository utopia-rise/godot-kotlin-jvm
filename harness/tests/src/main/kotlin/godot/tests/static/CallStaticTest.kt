package godot.tests.static

import godot.api.DirAccess
import godot.api.Node
import godot.api.ProjectSettings
import godot.annotation.script
import godot.annotation.Register

@script
class CallStaticTest: Node() {

    @Register
    fun testStaticCall(): Boolean {
        return DirAccess.dirExistsAbsolute(ProjectSettings.globalizePath("res://scripts"))
    }
}
