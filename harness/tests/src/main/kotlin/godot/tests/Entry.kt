package godot.tests

import godot.core.*

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial") {
                constructor(KtConstructor0(::Invocation))
                function("int", Invocation::int, ::KtVariant, KtVariant::asInt,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.LONG
                            className = "Int"
                        },
                        returns = {
                            type = KtVariant.Type.LONG
                            className = "Int"
                        }
                )
                function("long", Invocation::long, ::KtVariant, KtVariant::asLong,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.LONG
                            className = "Long"
                        },
                        returns = {
                            type = KtVariant.Type.LONG
                            className = "Long"
                        }
                )
                function("float", Invocation::float, ::KtVariant, KtVariant::asFloat,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.DOUBLE
                            className = "Float"
                        },
                        returns = {
                            type = KtVariant.Type.DOUBLE
                            className = "Float"
                        }
                )
                function("double", Invocation::double, ::KtVariant, KtVariant::asDouble,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.DOUBLE
                            className = "Double"
                        },
                        returns = {
                            type = KtVariant.Type.DOUBLE
                            className = "Double"
                        }
                )
                function("boolean", Invocation::boolean, ::KtVariant, KtVariant::asBoolean,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.BOOL
                            className = "Boolean"
                        },
                        returns = {
                            type = KtVariant.Type.BOOL
                            className = "Boolean"
                        }
                )
                function("string", Invocation::string, ::KtVariant, KtVariant::asString,
                        arg = {
                            name = "value"
                            type = KtVariant.Type.STRING
                            className = "String"
                        },
                        returns = {
                            type = KtVariant.Type.STRING
                            className = "String"
                        }
                )

                function("intAddition", Invocation::intAddition, ::KtVariant, KtVariant::asInt, KtVariant::asInt,
                        args = arrayOf(
                                {
                                    name = "a"
                                    type = KtVariant.Type.LONG
                                    className = "Int"
                                },
                                {
                                    name = "b"
                                    type = KtVariant.Type.LONG
                                    className = "Int"
                                }
                        ),
                        returns = {
                            type = KtVariant.Type.LONG
                            className = "Int"
                        }
                )
            }
        }
    }
}
