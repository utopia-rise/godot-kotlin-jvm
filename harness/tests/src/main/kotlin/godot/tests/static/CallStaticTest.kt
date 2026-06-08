package godot.tests.static

import godot.api.DirAccess
import godot.api.Node
import godot.api.ProjectSettings
import godot.annotation.Script
import godot.annotation.Register

@Script
class CallStaticTest: Node() {

    @Register
    fun testStaticCall(): Boolean {
        return DirAccess.dirExistsAbsolute(ProjectSettings.globalizePath("res://scripts"))
    }
}


