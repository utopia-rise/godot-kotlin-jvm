package godot.tests.runtime

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register
import kotlin.reflect.full.hasAnnotation

@Script
class BaseReflectionTest: Node() {

    @Register
    fun hasGodotScriptAnnotation(): Boolean {
        return BaseReflectionTest::class.hasAnnotation<Script>()
    }
}



