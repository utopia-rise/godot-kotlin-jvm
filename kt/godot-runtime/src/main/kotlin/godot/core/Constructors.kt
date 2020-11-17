package godot.core

abstract class KtConstructor<T: KtObject>(
    val parameterCount: Int
) {
    abstract operator fun invoke(vararg args: Any): T
}

class KtConstructor0<T: KtObject>(
    private val constructor: () -> T
) : KtConstructor<T>(0) {
    override fun invoke(vararg args: Any): T {
        return constructor()
    }
}

class KtConstructor1<T: KtObject, P0>(
    private val constructor: (P0) -> T,
    private val p0Converter: (Any) -> P0
) : KtConstructor<T>(0) {
    override fun invoke(vararg args: Any): T {
        return constructor(
            p0Converter(args[0])
        )
    }
}