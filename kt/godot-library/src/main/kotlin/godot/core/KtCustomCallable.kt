package godot.core

import godot.core.callable.KtCallable
import godot.core.memory.TransferContext

class KtCustomCallable internal constructor(
    private val target: KtObject?,
    private val targetedCall: KtCallable<KtObject, *>?,
    private val jvmCall: (() -> Any?)?
) {
    internal constructor(target: KtObject, ktCallable: KtCallable<KtObject, *>) : this(target, ktCallable, null)
    internal constructor(jvmCall: () -> Any?) : this(null, null, jvmCall)

    fun sendTargetToNative() {
        TransferContext.writeReturnValue(target, VariantType.OBJECT)
    }

    fun callTargeted() {
        targetedCall!!.invoke(target!!)
    }

    fun callNotTargeted() {
        TransferContext.writeReturnValue(jvmCall!!(), VariantType.ANY)
    }
}
