package godot.tests

import godot.core.*

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial") {
                constructor(KtConstructor0(::Invocation))
				function(KtFunction1(KtFunctionInfo("int", listOf(
						KtPropertyInfo(
								KtVariant.Type.LONG,
								"value",
								"Int",
								PropertyHint(),
								""
						)
				)), Invocation::int, ::KtVariant, KtVariant::asInt))
                function(KtFunction1(KtFunctionInfo("long", listOf(
						KtPropertyInfo(
								KtVariant.Type.LONG,
								"value",
								"Long",
								PropertyHint(),
								""
						)
				)), Invocation::long, ::KtVariant, KtVariant::asLong))
                function(KtFunction1(KtFunctionInfo("float", listOf(
						KtPropertyInfo(
								KtVariant.Type.DOUBLE,
								"value",
								"Float",
								PropertyHint(),
								""
						)
				)), Invocation::float, ::KtVariant, KtVariant::asFloat))
                function(KtFunction1(KtFunctionInfo("double", listOf(
						KtPropertyInfo(
								KtVariant.Type.DOUBLE,
								"value",
								"Double",
								PropertyHint(),
								""
						)
				)), Invocation::double, ::KtVariant, KtVariant::asDouble))
                function(KtFunction1(KtFunctionInfo("boolean", listOf(
						KtPropertyInfo(
								KtVariant.Type.BOOL,
								"value",
								"Boolean",
								PropertyHint(),
								""
						)
				)), Invocation::boolean, ::KtVariant, KtVariant::asBoolean))
                function(KtFunction1(KtFunctionInfo("string", listOf(
						KtPropertyInfo(
								KtVariant.Type.STRING,
								"value",
								"String",
								PropertyHint(),
								""
						)
				)), Invocation::string, ::KtVariant, KtVariant::asString))
            }
        }
    }
}
