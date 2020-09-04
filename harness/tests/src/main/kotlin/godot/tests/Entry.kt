package godot.tests

import godot.core.*

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial") {
                constructor(KtConstructor0(::Invocation))
                function1("int", Invocation::int, ::KtVariant, KtVariant::asInt,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.LONG
                            className = "Int"
                        },
                        returns = {
                            name = "value"
                            type = KtVariant.Type.LONG
                            className = "Int"
                        }
                )
                function1("long", Invocation::long, ::KtVariant, KtVariant::asLong,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.LONG
                            className = "Long"
                        },
                        returns = {
                            name = "value"
                            type = KtVariant.Type.LONG
                            className = "Long"
                        }
                )
                function1("float", Invocation::float, ::KtVariant, KtVariant::asFloat,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.DOUBLE
                            className = "Float"
                        },
                        returns = {
                            name = "value"
                            type = KtVariant.Type.DOUBLE
                            className = "Float"
                        }
                )
                function1("double", Invocation::double, ::KtVariant, KtVariant::asDouble,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.DOUBLE
                            className = "Double"
                        },
                        returns = {
                            name = "value"
                            type = KtVariant.Type.DOUBLE
                            className = "Double"
                        }
                )
                function1("boolean", Invocation::boolean, ::KtVariant, KtVariant::asBoolean,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.BOOL
                            className = "Boolean"
                        },
                        returns = {
                            name = "value"
                            type = KtVariant.Type.BOOL
                            className = "Boolean"
                        }
                )
                function1("string", Invocation::string, ::KtVariant, KtVariant::asString,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.STRING
                            className = "String"
                        },
                        returns = {
                            name = "value"
                            type = KtVariant.Type.STRING
                            className = "String"
                        }
                )
            }
        }
    }
}
