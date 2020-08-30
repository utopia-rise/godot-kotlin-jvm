package godot.core

import godot.util.VoidPtr

class KtClass<T : KtObject>(
    val name: String,
    val superClass: String,
    private val constructors: Map<Int, KtConstructor<T>>,
    private val functions: Map<String, KtFunction<T, *>>
) {
    fun new(rawPtr: VoidPtr, vararg args: KtVariant): T {
        val constructor = constructors[args.size]
        check(constructor != null) { "Constructor with ${args.size} parameter(s) not found." }
        return KtObject.instantiateWith(rawPtr) {
            constructor(*args)
        }
    }
}