package godot.tests.reflection

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import kotlin.reflect.full.hasAnnotation

@GodotScript
class BaseReflectionTest: Node() {

    @GodotMember
    fun hasRegisterClassAnnotation(): Boolean {
        return BaseReflectionTest::class.hasAnnotation<GodotScript>()
    }
}
