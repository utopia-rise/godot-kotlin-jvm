package godot.core

abstract class KtConstructor<T: KtObject>(
    val parameterCount: Int
) {
    abstract operator fun invoke(vararg args: KtVariant): T
}

class KtConstructor0<T: KtObject>(
    private val constructor: () -> T
) : KtConstructor<T>(0) {
    override fun invoke(vararg args: KtVariant): T {
        return constructor()
    }
}

class KtConstructor1<T: KtObject, P0>(
    private val constructor: (P0) -> T,
    private val p0Converter: (KtVariant) -> P0
) : KtConstructor<T>(0) {
    override fun invoke(vararg args: KtVariant): T {
        return constructor(
            p0Converter(args[0])
        )
    }
}