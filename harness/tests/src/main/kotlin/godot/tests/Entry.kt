package godot.tests

import godot.core.*

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial") {
                constructor(KtConstructor0(::Invocation))
                function(KtFunction1(KtFunctionInfo("int",
                        listOf(
                                KtPropertyInfo(
                                        KtVariant.Type.LONG,
                                        "value",
                                        "Int",
                                        PropertyHint.NONE,
                                        ""
                                )
                        ),
                        KtPropertyInfo(
                                KtVariant.Type.LONG,
                                "value",
                                "Int",
                                PropertyHint.NONE,
                                ""
                        )
                ), Invocation::int, ::KtVariant, KtVariant::asInt))
                function(KtFunction1(KtFunctionInfo("long",
                        listOf(
                                KtPropertyInfo(
                                        KtVariant.Type.LONG,
                                        "value",
                                        "Long",
                                        PropertyHint.NONE,
                                        ""
                                )
                        ),
                        KtPropertyInfo(
                                KtVariant.Type.LONG,
                                "value",
                                "Long",
                                PropertyHint.NONE,
                                ""
                        )
                ), Invocation::long, ::KtVariant, KtVariant::asLong))
                function(KtFunction1(KtFunctionInfo("float",
                        listOf(
                                KtPropertyInfo(
                                        KtVariant.Type.DOUBLE,
                                        "value",
                                        "Float",
                                        PropertyHint.NONE,
                                        ""
                                )
                        ),
                        KtPropertyInfo(
                                KtVariant.Type.DOUBLE,
                                "value",
                                "Float",
                                PropertyHint.NONE,
                                ""
                        )
                ), Invocation::float, ::KtVariant, KtVariant::asFloat))
                function(KtFunction1(KtFunctionInfo("double",
                        listOf(
                                KtPropertyInfo(
                                        KtVariant.Type.DOUBLE,
                                        "value",
                                        "Double",
                                        PropertyHint.NONE,
                                        ""
                                )
                        ),
                        KtPropertyInfo(
                                KtVariant.Type.DOUBLE,
                                "value",
                                "Double",
                                PropertyHint.NONE,
                                ""
                        )
                ), Invocation::double, ::KtVariant, KtVariant::asDouble))
                function(KtFunction1(KtFunctionInfo("boolean",
                        listOf(
                                KtPropertyInfo(
                                        KtVariant.Type.BOOL,
                                        "value",
                                        "Boolean",
                                        PropertyHint.NONE,
                                        ""
                                )
                        ),
                        KtPropertyInfo(
                                KtVariant.Type.BOOL,
                                "value",
                                "Boolean",
                                PropertyHint.NONE,
                                ""
                        )
                ), Invocation::boolean, ::KtVariant, KtVariant::asBoolean))
                function(KtFunction1(KtFunctionInfo("string",
                        listOf(
                                KtPropertyInfo(
                                        KtVariant.Type.STRING,
                                        "value",
                                        "String",
                                        PropertyHint.NONE,
                                        ""
                                )
                        ),
                        KtPropertyInfo(
                                KtVariant.Type.STRING,
                                "value",
                                "String",
                                PropertyHint.NONE,
                                ""
                        )
                ), Invocation::string, ::KtVariant, KtVariant::asString))
            }
        }
    }
}
