#include "kt_class.h"
#include "gd_kotlin.h"

KtClass::KtClass(jni::JObject p_wrapped, jni::JObject& p_class_loader) :
    JavaInstanceWrapper("godot.core.KtClass", p_wrapped, p_class_loader) {
    auto env = jni::Jvm::current_env();
    name = get_name(env);
    super_class = get_super_class(env);
    fetch_methods(env);
}

KtClass::~KtClass() {
    Map<StringName, KtFunction*>::Element* current = methods.front();
    while (current) {
        KtFunction* function = current->value();
        delete function;
        current = current->next();
    }
    methods.clear();
}

KtObject* KtClass::create_instance(jni::Env& env, const Variant** p_args, int p_arg_count, Object* p_owner) {
    jni::MethodId new_method { get_method_id(env, "new", "(JI)Lgodot/core/KtObject;") };
    // TODO: send args
    jni::JObject j_kt_object { wrapped.call_object_method(env, new_method, {reinterpret_cast<long>(p_owner),
                                                                            static_cast<jint>(p_arg_count)}) };
    print_verbose(vformat("Instantiated an object of type %s", name));
    return new KtObject(j_kt_object, class_loader, wrapped);
}

KtFunction* KtClass::get_method(const StringName& methodName) {
    return methods[methodName];
}

StringName KtClass::get_name(jni::Env& env) {
    auto getter =  get_method_id(env, "getName", "()Ljava/lang/String;");
    jni::JObject ret = wrapped.call_object_method(env, getter);
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}

StringName KtClass::get_super_class(jni::Env& env) {
    auto getter =  get_method_id(env, "getSuperClass", "()Ljava/lang/String;");
    jni::JObject ret = wrapped.call_object_method(env, getter);
    return StringName(env.from_jstring(jni::JString((jstring) ret.obj)));
}

void KtClass::fetch_methods(jni::Env& env) {
    jni::MethodId getFunctionsMethod { get_method_id(env, "getFunctions", "()[Lgodot/core/KtFunction;") };
    jni::JObjectArray functionsArray { wrapped.call_object_method(env, getFunctionsMethod) };
    for (int i = 0; i < functionsArray.length(env); i++) {
        auto* ktFunction = new KtFunction(functionsArray.get(env, i), GDKotlin::get_instance().get_class_loader());
        methods[ktFunction->get_name()] = ktFunction;
        print_verbose(vformat("Fetched method %s for class %s", ktFunction->get_name(), name));
    }
}

void KtClass::get_method_list(List<MethodInfo>* p_list) {
    Map<StringName, KtFunction*>::Element* current = methods.front();
    while (current) {
        p_list->push_back(current->value()->get_method_info());
        current = current->next();
    }
}
