package godot.core

import godot.util.VoidPtr

object Godot {
    fun icall(
        className: String,
        functionName: String,
        expectedReturnType: KtVariant.Type,
        vararg args: KtVariant
    ): KtVariant {
        TODO()
    }

    fun invokeConstructor(className: String): VoidPtr {
        TODO()
    }

    fun isUserType(className: String): Boolean {
        TODO()
    }

    fun setScript(rawPtr: VoidPtr, className: String) {
        TODO()
    }
}