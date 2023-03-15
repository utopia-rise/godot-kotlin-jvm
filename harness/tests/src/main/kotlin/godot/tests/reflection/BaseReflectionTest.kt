package godot.tests.reflection

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import kotlin.reflect.full.hasAnnotation

@RegisterClass
class BaseReflectionTest: Node() {

    @RegisterFunction
    fun hasRegisterClassAnnotation(): Boolean {
        return BaseReflectionTest::class.hasAnnotation<RegisterClass>()
    }
}
