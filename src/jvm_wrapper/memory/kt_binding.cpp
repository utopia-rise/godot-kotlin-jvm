#include "kt_binding.h"

// clang-format off
INIT_JNI_BINDINGS(KtBinding)
// clang-format on

KtBinding::KtBinding(jni::JObject p_wrapped) : JvmInstanceWrapper(p_wrapped) {}

KtBinding::~KtBinding() = default;