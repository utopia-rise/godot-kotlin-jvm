package godot.runtime

import godot.core.*
import godot.util.camelToSnakeCase
import kotlin.reflect.*

class KtPropertyInfoBuilderDsl {
    var type: KtVariant.Type? = null
    var name: String = ""
    var className: String? = null
    var hint: PropertyHint = PropertyHint.NONE
    var hintString: String = ""

    internal fun build() = KtPropertyInfo(checkNotNull(type), name, checkNotNull(className), hint, hintString)
}

class ClassBuilderDsl<T : KtObject>(
        private val name: String,
        private val superClass: String
) {
    private val constructors = mutableMapOf<Int, KtConstructor<T>>()

    private val functions = mutableMapOf<String, KtFunction<T, *>>()

    private val properties = mutableMapOf<String, KtProperty<T, *>>()

    fun constructor(constructor: KtConstructor<T>) {
        require(!constructors.containsKey(constructor.parameterCount)) {
            "A constructor with ${constructor.parameterCount} argument(s) already exists."
        }
        constructors[constructor.parameterCount] = constructor
    }

    fun <P> property(
            kProperty: KMutableProperty1<T, P>,
            getValueConverter: (P) -> KtVariant,
            setValueConverter: ((KtVariant) -> P),
            pib: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val builder = KtPropertyInfoBuilderDsl()
        builder.name = kProperty.name.camelToSnakeCase()
        builder.pib()
        val property = builder.build()
        require(!properties.contains(property.name)) {
            "Found two properties with name ${property.name} for class $name"
        }
        properties[property.name] = KtProperty(property, kProperty, getValueConverter, setValueConverter)
    }

    fun <R> function(
            func: KFunction1<T, R>,
            returnValueConverter: (R) -> KtVariant,
            funcName: String = func.name.camelToSnakeCase(),
            returns: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val returnBuilder = KtPropertyInfoBuilderDsl()
        returnBuilder.returns()
        appendFunction(
                KtFunction0(
                        KtFunctionInfo(funcName, listOf(), returnBuilder.build()),
                        func,
                        returnValueConverter
                )
        )
    }

    fun <P0, R> function(
            func: KFunction2<T, P0, R>,
            returnValueConverter: (R) -> KtVariant,
            p0Converter: (KtVariant) -> P0,
            funcName: String = func.name.camelToSnakeCase(),
            arg: KtPropertyInfoBuilderDsl.() -> Unit,
            returns: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, arg)
        appendFunction(
                KtFunction1(
                        KtFunctionInfo(funcName, arguments, returnType),
                        func,
                        returnValueConverter,
                        p0Converter
                )
        )
    }

    fun <P0, P1, R> function(
            func: KFunction3<T, P0, P1, R>,
            returnValueConverter: (R) -> KtVariant,
            p0Converter: (KtVariant) -> P0,
            p1Converter: (KtVariant) -> P1,
            funcName: String = func.name.camelToSnakeCase(),
            args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
            returns: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 2) {
            "Function $funcName should have 2 arguments, found ${args.size}"
        }
        appendFunction(
                KtFunction2(
                        KtFunctionInfo(funcName, arguments, returnType),
                        func,
                        returnValueConverter,
                        p0Converter,
                        p1Converter
                )
        )
    }

    fun <P0, P1, P2, R> function(
            func: KFunction4<T, P0, P1, P2, R>,
            returnValueConverter: (R) -> KtVariant,
            p0Converter: (KtVariant) -> P0,
            p1Converter: (KtVariant) -> P1,
            p2Converter: (KtVariant) -> P2,
            funcName: String = func.name.camelToSnakeCase(),
            args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
            returns: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 3) {
            "Function $funcName should have 3 arguments, found ${args.size}"
        }
        appendFunction(
                KtFunction3(
                        KtFunctionInfo(funcName, arguments, returnType),
                        func,
                        returnValueConverter,
                        p0Converter,
                        p1Converter,
                        p2Converter
                )
        )
    }

    fun <P0, P1, P2, P3, R> function(
            func: KFunction5<T, P0, P1, P2, P3, R>,
            returnValueConverter: (R) -> KtVariant,
            p0Converter: (KtVariant) -> P0,
            p1Converter: (KtVariant) -> P1,
            p2Converter: (KtVariant) -> P2,
            p3Converter: (KtVariant) -> P3,
            funcName: String = func.name.camelToSnakeCase(),
            args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
            returns: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 4) {
            "Function $funcName should have 4 arguments, found ${args.size}"
        }
        appendFunction(
                KtFunction4(
                        KtFunctionInfo(funcName, arguments, returnType),
                        func,
                        returnValueConverter,
                        p0Converter,
                        p1Converter,
                        p2Converter,
                        p3Converter
                )
        )
    }

    fun <P0, P1, P2, P3, P4, R> function(
            func: KFunction6<T, P0, P1, P2, P3, P4, R>,
            returnValueConverter: (R) -> KtVariant,
            p0Converter: (KtVariant) -> P0,
            p1Converter: (KtVariant) -> P1,
            p2Converter: (KtVariant) -> P2,
            p3Converter: (KtVariant) -> P3,
            p4Converter: (KtVariant) -> P4,
            funcName: String = func.name.camelToSnakeCase(),
            args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
            returns: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 5) {
            "Function $funcName should have 5 arguments, found ${args.size}"
        }
        appendFunction(
                KtFunction5(
                        KtFunctionInfo(funcName, arguments, returnType),
                        func,
                        returnValueConverter,
                        p0Converter,
                        p1Converter,
                        p2Converter,
                        p3Converter,
                        p4Converter
                )
        )
    }

    private fun argumentsAndReturnType(
            returns: KtPropertyInfoBuilderDsl.() -> Unit,
            vararg args: KtPropertyInfoBuilderDsl.() -> Unit
    ): Pair<List<KtPropertyInfo>, KtPropertyInfo> {
        val returnBuilder = KtPropertyInfoBuilderDsl()
        returnBuilder.returns()

        val argumentsCheckList = mutableSetOf<String>()

        val returnInfo = returnBuilder.build()
        return args.map {
            val builder = KtPropertyInfoBuilderDsl()
            builder.it()
            val propertyInfo = builder.build()
            require(!argumentsCheckList.contains(propertyInfo.name)) {
                "Cannot have two arguments with name ${propertyInfo.name}"
            }
            require(propertyInfo.name.isNotEmpty()) { "Function parameters should have names." }
            argumentsCheckList.add(propertyInfo.name)
            propertyInfo
        } to returnInfo
    }

    private fun <R> appendFunction(function: KtFunction<T, R>) {
        require(!functions.containsKey(function.functionInfo.name)) {
            "A method with ${function.functionInfo.name} already exists."
        }
        functions[function.functionInfo.name] = function
    }

    internal fun build(): KtClass<T> {
        check(constructors.isNotEmpty()) { "Please provide at least one constructor." }
        return KtClass(name, superClass, constructors, properties, functions)
    }
}

class ClassRegistry {
    val classes = mutableListOf<KtClass<*>>()

    fun <T : KtObject> registerClass(name: String, superClass: String, cb: ClassBuilderDsl<T>.() -> Unit) {
        val builder = ClassBuilderDsl<T>(name, superClass)
        builder.cb()
        registerClass(builder.build())
    }

    private fun <T : KtObject> registerClass(cls: KtClass<T>) {
        classes.add(cls)
    }
}
