#include "kt_constructor.h"

#include "engine/utilities.h"
#include "jvm/wrapper/memory/transfer_context.h"

KtConstructor::KtConstructor(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped) {}

KtObject* KtConstructor::create_instance(jni::Env& p_env, godot::Object* p_owner) {
    uint64_t id = p_owner->get_instance_id();
    // p_owner is the godot-cpp wrapper; its address is not the engine's raw object pointer. Kotlin stores whatever we pass here as its "native pointer" and hands it straight back on later self-calls (TransferContext::icall), which decodes it a...
    jvalue args[2] = {jni::to_jni_arg(p_owner->_owner), jni::to_jni_arg(id)};
    jni::JObject j_kt_object = wrapped.call_object_method(p_env, CONSTRUCT, args);
    return memnew(KtObject(p_env, j_kt_object, is_ref_counted(p_owner)));
}
