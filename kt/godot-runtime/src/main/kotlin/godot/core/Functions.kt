package godot.core

import godot.util.camelToSnakeCase

class PropertyHint

data class KtPropertyInfo (
		val type: KtVariant.Type,
		val name: String,
		val className: String,
		val hint: PropertyHint,
		val hintString: String
)

data class KtFunctionInfo (
		val name: String,
		val propertyInfos: List<KtPropertyInfo>
)

abstract class KtFunction<T: KtObject, R>(
		val functionInfo: KtFunctionInfo,
		val parameterCount: Int
) {
    val registrationName = functionInfo.name.camelToSnakeCase()
    fun invoke(instance: T): Boolean {
        val args = TransferContext.readArguments()
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s) for function ${functionInfo.name}, but got ${args.size} instead." }
        val ret = invoke(instance, args)
        return TransferContext.writeReturnValue(ret)
    }

    protected abstract fun invoke(instance: T, args: List<KtVariant>): KtVariant
}

class KtFunction0<T: KtObject, R>(
		functionInfo: KtFunctionInfo,
		private val function: (T) -> R,
		private val returnValueConverter: (R) -> KtVariant
) : KtFunction<T, R>(functionInfo, 0) {
    override operator fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(instance)
        )
    }
}

class KtFunction1<T: KtObject, P0, R>(
		functionInfo: KtFunctionInfo,
		private val function: (T, P0) -> R,
		private val returnValueConverter: (R) -> KtVariant,
		private val p0Converter: (KtVariant) -> P0
) : KtFunction<T, R>(functionInfo, 1) {
    override operator fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s), but got ${args.size} instead." }
        return returnValueConverter(
			function(
                instance,
                p0Converter(args[0])
            )
        )
    }
}

class KtFunction2<T: KtObject, P0, P1, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
            )
        )
    }
}

class KtFunction3<T: KtObject, P0, P1, P2, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
    private val p2Converter: (KtVariant) -> P2,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
            )
        )
    }
}

class KtFunction4<T: KtObject, P0, P1, P2, P3, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
    private val p2Converter: (KtVariant) -> P2,
    private val p3Converter: (KtVariant) -> P3,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
                p3Converter(args[3]),
            )
        )
    }
}

class KtFunction5<T: KtObject, P0, P1, P2, P3, P4, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
    private val p2Converter: (KtVariant) -> P2,
    private val p3Converter: (KtVariant) -> P3,
    private val p4Converter: (KtVariant) -> P4,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
                p3Converter(args[3]),
                p4Converter(args[4]),
            )
        )
    }
}