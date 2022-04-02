package godot.core

import godot.Object
import kotlin.reflect.KFunction

//TODO/4.0: Dummy to make code compile, we can do better with interface.
class Callable internal constructor(
    private val target: Object?,
    private val methodName: StringName?,
    private val kFunction: KFunction<*>?
) {
    //TODO/4.0: Implement
    constructor() : this(null, null, null)
    constructor(target: Object, methodName: StringName) : this(target, methodName, null)
    constructor(kFunction: KFunction<*>) : this(null, null, kFunction)

    fun call(vararg params: Object): Object {
        TODO("Not yet implemented")
    }
}
