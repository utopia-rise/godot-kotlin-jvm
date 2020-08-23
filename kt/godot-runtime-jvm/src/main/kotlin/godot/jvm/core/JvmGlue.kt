package godot.jvm.core

import godot.core.Glue
import godot.core.KtVariant
import godot.util.VoidPtr

object JvmGlue : Glue {
    override fun icall(
        className: String,
        functionName: String,
        expectedReturnType: KtVariant.Type,
        vararg args: KtVariant
    ): KtVariant {
        TODO("Not yet implemented")
    }

    override fun invokeConstructor(className: String): VoidPtr {
        TODO("Not yet implemented")
    }

    override fun isUserType(className: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun setScript(rawPtr: VoidPtr, className: String) {
        TODO("Not yet implemented")
    }
}