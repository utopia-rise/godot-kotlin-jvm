package godot.tests.reflection

import godot.api.Node
import godot.annotation.script
import godot.annotation.Register
import kotlin.reflect.full.hasAnnotation

@script
class BaseReflectionTest: Node() {

    @Register
    fun hasRegisterClassAnnotation(): Boolean {
        return BaseReflectionTest::class.hasAnnotation<script>()
    }
}
