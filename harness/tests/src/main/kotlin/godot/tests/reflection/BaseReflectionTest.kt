package godot.tests.reflection

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register
import kotlin.reflect.full.hasAnnotation

@GodotScript
class BaseReflectionTest: Node() {

    @Register
    fun hasRegisterClassAnnotation(): Boolean {
        return BaseReflectionTest::class.hasAnnotation<GodotScript>()
    }
}
