@file:Suppress("PackageDirectoryMismatch")
package godot.core

import godot.Object
import godot.core.callable.KtCallable

interface Callable: CoreType {
    fun call(vararg args: Any?): Any?

    companion object {
        operator fun invoke() = NativeCallable()
        operator fun invoke(target: Object, methodName: StringName) = NativeCallable(target, methodName)
        operator fun invoke(nativeCallable: NativeCallable) = NativeCallable(nativeCallable)
        operator fun invoke(ktCallable: KtCallable<*>) = NativeCallable(ktCallable)
    }
}
