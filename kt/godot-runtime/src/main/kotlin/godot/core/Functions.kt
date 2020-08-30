package godot.core

import godot.util.camelToSnakeCase

abstract class KtFunction<T: KtObject, R>(
    val name: String,
    val parameterCount: Int
) {
    val registrationName = name.camelToSnakeCase()
    fun invoke(instance: T): Boolean {
        val args = TransferContext.readArguments()
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s) for function $name, but got ${args.size} instead." }
        val ret = invoke(instance, args)
        return TransferContext.writeReturnValue(ret)
    }

    protected abstract fun invoke(instance: T, args: List<KtVariant>): KtVariant
}

class KtFunction0<T: KtObject, R>(
    name: String,
    private val function: (T) -> R,
    private val returnValueConverter: (R) -> KtVariant
) : KtFunction<T, R>(name, 0) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(instance)
        )
    }
}

class KtFunction1<T: KtObject, P0, R>(
    name: String,
    private val function: (T, P0) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0
) : KtFunction<T, R>(name, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0])
            )
        )
    }
}