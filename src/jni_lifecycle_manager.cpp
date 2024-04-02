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

void JniLifecycleManager::initialize_jni_classes() {
    // Singleton
    TransferContext::initialize();
    TypeManager::initialize();
    LongStringQueue::initialize();
    MemoryManager::initialize();

    bridges::GDPrintBridge::initialize();
    bridges::CallableBridge::initialize();
    bridges::DictionaryBridge::initialize();
    bridges::RidBridge::initialize();
    bridges::StringNameBridge::initialize();
    bridges::NodePathBridge::initialize();
    bridges::VariantArrayBridge::initialize();

    bridges::PackedByteArrayBridge::initialize();
    bridges::PackedColorArrayBridge::initialize();
    bridges::PackedFloat32ArrayBridge::initialize();
    bridges::PackedFloat64ArrayBridge::initialize();
    bridges::PackedInt32IntArrayBridge::initialize();
    bridges::PackedInt64IntArrayBridge::initialize();
    bridges::PackedStringArrayBridge::initialize();
    bridges::PackedVector2ArrayBridge::initialize();
    bridges::PackedVector3ArrayBridge::initialize();

    //Instance
    Bootstrap::initialize_jni_binding();
    KtObject::initialize_jni_binding();

    KtPropertyInfo::initialize_jni_binding();
    KtProperty::initialize_jni_binding();
    KtConstructor::initialize_jni_binding();
    KtSignalInfo::initialize_jni_binding();
    KtRpcConfig::initialize_jni_binding();
    KtFunctionInfo::initialize_jni_binding();
    KtFunction::initialize_jni_binding();
    KtClass::initialize_jni_binding();
}

void JniLifecycleManager::destroy_jni_classes() {
    // Singleton
    TransferContext::destroy();
    TypeManager::destroy();
    LongStringQueue::destroy();
    MemoryManager::destroy();

    bridges::GDPrintBridge::destroy();

    bridges::GDPrintBridge::destroy();
    bridges::CallableBridge::destroy();
    bridges::DictionaryBridge::destroy();
    bridges::RidBridge::destroy();
    bridges::StringNameBridge::destroy();
    bridges::NodePathBridge::destroy();

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