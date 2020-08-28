package godot.tests

import godot.core.KtConstructor0
import godot.core.KtFunction1
import godot.core.KtFunctionInfo
import godot.core.KtVariant

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial") {
                constructor(KtConstructor0(::Invocation))
                function(KtFunction1(KtFunctionInfo("int", ::KtVariant), Invocation::int, KtVariant::asInt))
                function(KtFunction1(KtFunctionInfo("long", ::KtVariant), Invocation::long, KtVariant::asLong))
                function(KtFunction1(KtFunctionInfo("float", ::KtVariant), Invocation::float, KtVariant::asFloat))
                function(KtFunction1(KtFunctionInfo("double", ::KtVariant), Invocation::double, KtVariant::asDouble))
                function(KtFunction1(KtFunctionInfo("boolean", ::KtVariant), Invocation::boolean, KtVariant::asBoolean))
                function(KtFunction1(KtFunctionInfo("string", ::KtVariant), Invocation::string, KtVariant::asString))
            }
        }
    }
}
