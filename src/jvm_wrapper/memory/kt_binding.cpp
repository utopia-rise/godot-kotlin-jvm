#include "kt_binding.h"

KtBinding::KtBinding(jni::Env& p_env, jni::JObject p_wrapped) : JvmInstanceWrapper(p_env, p_wrapped) {}

KtBinding::~KtBinding() = default;