package godot.tests.reflection

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import kotlin.reflect.full.hasAnnotation

@GodotScript
class BaseReflectionTest: Node() {

    @Member
    fun hasRegisterClassAnnotation(): Boolean {
        return BaseReflectionTest::class.hasAnnotation<GodotScript>()
    }
}
