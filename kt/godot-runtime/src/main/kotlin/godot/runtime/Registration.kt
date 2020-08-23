package godot.runtime

import godot.core.KtClass
import godot.core.KtConstructor
import godot.core.KtFunction
import godot.core.KtObject

class ClassBuilderDsl<T: KtObject>(
    private val name: String,
    private val superClass: String
) {
    private val constructors = mutableMapOf<Int, KtConstructor<T>>()
    private val functions = mutableMapOf<String, KtFunction<T, *>>()

    fun constructor(constructor: KtConstructor<T>) {
        require(!constructors.containsKey(constructor.parameterCount)) {
            "A constructor with ${constructor.parameterCount} argument(s) already exists."
        }
        constructors[constructor.parameterCount] = constructor
    }

    fun function(function: KtFunction<T, *>) {
        require(!functions.containsKey(function.name)) {
            "A method with ${function.name} already exists."
        }
        functions[function.name] = function
    }

    internal fun build(): KtClass<T> {
        check(constructors.isNotEmpty()) { "Please provide at least one constructor." }
        return KtClass(name, superClass, constructors, functions)
    }
}

abstract class ClassRegistry {
    fun <T: KtObject> registerClass(name: String, superClass: String, cb: ClassBuilderDsl<T>.() -> Unit) {
        val builder = ClassBuilderDsl<T>(name, superClass)
        builder.cb()
        registerClass(builder.build())
    }

    protected abstract fun<T: KtObject> registerClass(cls: KtClass<T>)
}