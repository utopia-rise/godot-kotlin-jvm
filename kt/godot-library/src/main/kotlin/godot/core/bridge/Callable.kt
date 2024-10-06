@file:JvmName("Callables")
@file:Suppress("PackageDirectoryMismatch")
package godot.core

import godot.Object

interface Callable: CoreType {
    fun call(vararg args: Any?): Any?

    companion object {
        @JvmStatic
        @JvmName("create")
        operator fun invoke() = NativeCallable()

        @JvmStatic
        @JvmName("create")
        operator fun invoke(target: Object, methodName: StringName) = NativeCallable(target, methodName)

        @JvmStatic
        @JvmName("create")
        operator fun invoke(nativeCallable: NativeCallable) = NativeCallable(nativeCallable)

        @JvmStatic
        @JvmName("create")
        operator fun invoke(lambdaCallable: LambdaCallable<*>) = NativeCallable(lambdaCallable)
    }
}
