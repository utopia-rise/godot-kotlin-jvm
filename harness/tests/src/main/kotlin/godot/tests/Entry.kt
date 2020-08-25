package godot.tests

import godot.core.KtConstructor0
import godot.core.KtFunction1
import godot.core.KtVariant

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>(Invocation::class.qualifiedName!!, "Object") {
                constructor(KtConstructor0(::Invocation))
                function(KtFunction1("int", Invocation::int, ::KtVariant, KtVariant::asInt))
                function(KtFunction1("long", Invocation::long, ::KtVariant, KtVariant::asLong))
                function(KtFunction1("float", Invocation::float, ::KtVariant, KtVariant::asFloat))
                function(KtFunction1("double", Invocation::double, ::KtVariant, KtVariant::asDouble))
                function(KtFunction1("boolean", Invocation::boolean, ::KtVariant, KtVariant::asBoolean))
                function(KtFunction1("string", Invocation::string, ::KtVariant, KtVariant::asString))
            }
        }
    }
}