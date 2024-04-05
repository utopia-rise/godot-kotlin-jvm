#include "kt_binding.h"

KtBinding::KtBinding(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

KtBinding::~KtBinding() = default;