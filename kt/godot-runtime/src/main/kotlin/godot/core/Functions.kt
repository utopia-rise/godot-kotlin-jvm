package godot.core

import godot.util.camelToSnakeCase

abstract class KtFunction<T: KtObject, R>(
    val name: String,
    val parameterCount: Int
) {
    val registrationName = name.camelToSnakeCase()
    abstract operator fun invoke(instance: T, vararg args: KtVariant): KtVariant
}

class KtFunction0<T: KtObject, R>(
    name: String,
    private val function: (T) -> R,
    private val returnValueConverter: (R) -> KtVariant
) : KtFunction<T, R>(name, 0) {
    override fun invoke(instance: T, vararg args: KtVariant): KtVariant {
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
    override fun invoke(instance: T, vararg args: KtVariant): KtVariant {
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s), but got ${args.size} instead." }
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0])
            )
        )
    }
}