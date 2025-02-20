package godot.core

import godot.common.interop.VariantConverter
import godot.internal.logging.GodotLogging
import godot.internal.memory.TransferContext

data class KtPropertyInfo(
    val _type: VariantConverter,
    val name: String,
    val className: String,
    val _hint: PropertyHint,
    val hintString: String,
    val usage: Long = if (_type === VariantCaster.ANY) {
        PropertyUsageFlags.NIL_IS_VARIANT.flag
    } else {
        PropertyUsageFlags.NONE.flag
    }
) {
    val type: Int
        get() = _type.id

    val hint: Int
        get() = _hint.id.toInt()
}

open class KtProperty<T : KtObject, P : Any?>(
    val ktPropertyInfo: KtPropertyInfo,
    protected val getter: (T) -> P,
    protected val setter: (T, P) -> Unit,
    protected val variantConverter: VariantConverter,
) {
    open fun callGet(instance: T) {
        try {
            TransferContext.writeReturnValue(getter(instance), variantConverter)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling JVM getter ${ktPropertyInfo.name} of script $instance from Godot\n:" + t.stackTraceToString())
            TransferContext.writeReturnValue(null, VariantParser.NIL)
        }
    }

    open fun callSet(instance: T) {
        val arg = extractSetterArgument<P>()
        try {
            setter(instance, arg)
        } catch (t: Throwable) {
            GodotLogging.error("Error calling JVM setter ${ktPropertyInfo.name} of script $instance from Godot:\n" + t.stackTraceToString())
        }
    }

    protected fun <P> extractSetterArgument(): P {
        //TODO: manage nullable argument of enum setter (only for objects)
        val arg = TransferContext.readSingleArgument(variantConverter)
        @Suppress("UNCHECKED_CAST")
        return arg as P
    }
}

class KtEnumProperty<T : KtObject, P : Any>(
    ktPropertyInfo: KtPropertyInfo,
    getter: (T) -> P,
    setter: (T, P) -> Unit,
    val getValueConverter: (P?) -> Int,
    val setValueConverter: (Int) -> P
) : KtProperty<T, P>(
    ktPropertyInfo,
    getter,
    setter,
    VariantCaster.INT
) {
    override fun callGet(instance: T) {
        TransferContext.writeReturnValue(getValueConverter(getter(instance)), VariantCaster.INT)
    }

    override fun callSet(instance: T) {
        val arg = extractSetterArgument<Int>()
        setter(instance, setValueConverter(arg))
    }
}

class KtEnumListProperty<T : KtObject, P : Enum<P>, L : Collection<P>>(
    ktPropertyInfo: KtPropertyInfo,
    getter: (T) -> L,
    setter: (T, L) -> Unit,
    val getValueConverter: (L?) -> VariantArray<Int>,
    val setValueConverter: (VariantArray<Int>) -> L
) : KtProperty<T, L>(
    ktPropertyInfo,
    getter,
    setter,
    VariantParser.ARRAY
) {
    override fun callGet(instance: T) {
        TransferContext.writeReturnValue(getValueConverter(getter(instance)), VariantParser.ARRAY)
    }

    override fun callSet(instance: T) {
        val arg = extractSetterArgument<VariantArray<Int>>()
        setter(instance, setValueConverter(arg))
    }
}

