package godot.core

import godot.util.VoidPtr

interface Glue {
    fun icall(
        className: String,
        functionName: String,
        expectedReturnType: KtVariant.Type,
        vararg args: KtVariant
    ): KtVariant

    fun invokeConstructor(
        className: String
    ): VoidPtr

    fun isUserType(className: String): Boolean
    fun setScript(rawPtr: VoidPtr, className: String)
}

object Godot : Glue {
    lateinit var delegate: Glue

    override fun icall(
        className: String,
        functionName: String,
        expectedReturnType: KtVariant.Type,
        vararg args: KtVariant
    ): KtVariant {
        return delegate.icall(className, functionName, expectedReturnType, *args)
    }

    override fun invokeConstructor(className: String): VoidPtr {
        return delegate.invokeConstructor(className)
    }

    override fun isUserType(className: String): Boolean {
        return delegate.isUserType(className)
    }

    override fun setScript(rawPtr: VoidPtr, className: String) {
        return delegate.setScript(rawPtr, className)
    }
}