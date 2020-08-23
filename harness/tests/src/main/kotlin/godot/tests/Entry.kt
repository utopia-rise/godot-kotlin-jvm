package godot.tests

import godot.core.KtConstructor0
import godot.core.KtFunction1
import godot.core.KtVariant

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with(registry) {
            registerClass<Invocation>("Invocation", "Object") {
                constructor(KtConstructor0(::Invocation))
                function(KtFunction1("int", Invocation::int, variantFactory::create, KtVariant::asInt))
                function(KtFunction1("long", Invocation::long, variantFactory::create, KtVariant::asLong))
                function(KtFunction1("float", Invocation::float, variantFactory::create, KtVariant::asFloat))
                function(KtFunction1("double", Invocation::double, variantFactory::create, KtVariant::asDouble))
                function(KtFunction1("boolean", Invocation::boolean, variantFactory::create, KtVariant::asBoolean))
                function(KtFunction1("string", Invocation::string, variantFactory::create, KtVariant::asString))
            }
        }
    }
}