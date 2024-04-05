#include "jni_lifecycle_manager.h"

#include "jvm_wrapper/bootstrap.h"
#include "jvm_wrapper/bridge/callable_bridge.h"
#include "jvm_wrapper/bridge/dictionary_bridge.h"
#include "jvm_wrapper/bridge/gd_print_bridge.h"
#include "jvm_wrapper/bridge/node_path_bridge.h"
#include "jvm_wrapper/bridge/packed_byte_array_bridge.h"
#include "jvm_wrapper/bridge/packed_color_array_bridge.h"
#include "jvm_wrapper/bridge/packed_float_32_array_bridge.h"
#include "jvm_wrapper/bridge/packed_float_64_array_bridge.h"
#include "jvm_wrapper/bridge/packed_int_32_array_bridge.h"
#include "jvm_wrapper/bridge/packed_int_64_array_bridge.h"
#include "jvm_wrapper/bridge/packed_string_array_bridge.h"
#include "jvm_wrapper/bridge/packed_vector2_array_bridge.h"
#include "jvm_wrapper/bridge/packed_vector3_array_bridge.h"
#include "jvm_wrapper/bridge/rid_bridge.h"
#include "jvm_wrapper/bridge/string_name_bridge.h"
#include "jvm_wrapper/bridge/variant_array_bridge.h"
#include "jvm_wrapper/memory/memory_manager.h"
#include "jvm_wrapper/memory/transfer_context.h"
#include "jvm_wrapper/registration//kt_class.h"

void JniLifecycleManager::initialize_jni_classes(jni::Env& p_env) {
    // Singleton
    TransferContext::initialize(p_env);
    TypeManager::initialize(p_env);
    LongStringQueue::initialize(p_env);
    MemoryManager::initialize(p_env);

    bridges::GDPrintBridge::initialize(p_env);

    bridges::CallableBridge::initialize(p_env);
    bridges::DictionaryBridge::initialize(p_env);
    bridges::RidBridge::initialize(p_env);
    bridges::StringNameBridge::initialize(p_env);
    bridges::NodePathBridge::initialize(p_env);
    bridges::VariantArrayBridge::initialize(p_env);

    bridges::PackedByteArrayBridge::initialize(p_env);
    bridges::PackedColorArrayBridge::initialize(p_env);
    bridges::PackedFloat32ArrayBridge::initialize(p_env);
    bridges::PackedFloat64ArrayBridge::initialize(p_env);
    bridges::PackedInt32IntArrayBridge::initialize(p_env);
    bridges::PackedInt64IntArrayBridge::initialize(p_env);
    bridges::PackedStringArrayBridge::initialize(p_env);
    bridges::PackedVector2ArrayBridge::initialize(p_env);
    bridges::PackedVector3ArrayBridge::initialize(p_env);

    //Instance
    Bootstrap::initialize_jni_binding(p_env);
    KtObject::initialize_jni_binding(p_env);

    KtPropertyInfo::initialize_jni_binding(p_env);
    KtProperty::initialize_jni_binding(p_env);
    KtConstructor::initialize_jni_binding(p_env);
    KtSignalInfo::initialize_jni_binding(p_env);
    KtRpcConfig::initialize_jni_binding(p_env);
    KtFunctionInfo::initialize_jni_binding(p_env);
    KtFunction::initialize_jni_binding(p_env);
    KtClass::initialize_jni_binding(p_env);
}

void JniLifecycleManager::destroy_jni_classes() {
    // Singleton
    TransferContext::destroy();
    TypeManager::destroy();
    LongStringQueue::destroy();
    MemoryManager::destroy();

    bridges::GDPrintBridge::destroy();

    bridges::CallableBridge::destroy();
    bridges::DictionaryBridge::destroy();
    bridges::RidBridge::destroy();
    bridges::StringNameBridge::destroy();
    bridges::NodePathBridge::destroy();
    bridges::VariantArrayBridge::destroy();

    bridges::PackedByteArrayBridge::destroy();
    bridges::PackedColorArrayBridge::destroy();
    bridges::PackedFloat32ArrayBridge::destroy();
    bridges::PackedFloat64ArrayBridge::destroy();
    bridges::PackedInt32IntArrayBridge::destroy();
    bridges::PackedInt64IntArrayBridge::destroy();
    bridges::PackedStringArrayBridge::destroy();
    bridges::PackedVector2ArrayBridge::destroy();
    bridges::PackedVector3ArrayBridge::destroy();
}