#include "jvm_manager.h"

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

#include <jni.h>

#ifndef NO_USE_STDLIB
#include <locale>
#endif

#ifdef __ANDROID__
typedef jint(JNICALL* CreateJavaVM)(JavaVM**, JNIEnv**, void*);
typedef jint(JNICALL* GetCreatedJavaVMs)(JavaVM**, jsize, jsize*);
#else
typedef jint(JNICALL* CreateJavaVM)(JavaVM**, void**, void*);
typedef jint(JNICALL* GetCreatedJavaVMs)(JavaVM**, jsize, jsize*);
#endif

CreateJavaVM get_create_jvm_function(void* lib_handle) {
#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED
    void* createJavaVMSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(lib_handle, "JNI_CreateJavaVM", createJavaVMSymbolHandle) != OK) {}
    return reinterpret_cast<CreateJavaVM>(createJavaVMSymbolHandle);
#else
    return &JNI_CreateJavaVM;
#endif
}

GetCreatedJavaVMs get_get_created_java_vm_function(void* lib_handle) {
#if defined WINDOWS_ENABLED || defined X11_ENABLED || defined MACOS_ENABLED
    void* getCreatedJavaVMsSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(lib_handle, "JNI_GetCreatedJavaVMs", getCreatedJavaVMsSymbolHandle) != OK) {
    }
    return reinterpret_cast<GetCreatedJavaVMs>(getCreatedJavaVMsSymbolHandle);
#else
    &JNI_GetCreatedJavaVMs;
#endif
}

void JvmManager::initialize_or_get_jvm(void* lib_handle, JvmUserConfiguration& user_configuration, JvmLoadingConfiguration& loading_configuration) {
    JavaVM* java_vm {nullptr};

    if (loading_configuration.loading_type == JvmLoadingType::PROVIDED) {
        LOG_VERBOSE("Retrieving existing JVM ...");
        JavaVM* buffer[1];
        jsize count {0};
        auto result = get_get_created_java_vm_function(lib_handle)(buffer, 1, &count);
        JVM_CRASH_COND_MSG(result != JNI_OK || count == 0, "Failed to retrieve existing vm!");
        java_vm = buffer[0];
    } else {
        uint32_t nOptions {loading_configuration.options.size()};
        auto* options = new JavaVMOption[nOptions];
        JavaVMInitArgs args;
        args.version = loading_configuration.version;
        args.nOptions = static_cast<int32_t>(nOptions);
        args.options = options;

        for (auto i = 0; i < static_cast<int>(nOptions); i++) {
            args.options[i].optionString = (char*) loading_configuration.options[i].ptr();
        }

#ifndef NO_USE_STDLIB
        std::locale global;
#endif

        LOG_VERBOSE("Starting JVM ...");
        JNIEnv* jni_env {nullptr};

#ifdef __ANDROID__
        jint result {get_create_jvm_function(lib_handle)(&java_vm, &jni_env, &args)};
#else
        jint result {get_create_jvm_function(lib_handle)(&java_vm, reinterpret_cast<void**>(&jni_env), &args)};
#endif

        // Set std::local::global to value it was before creating JVM.
        // See https://github.com/utopia-rise/godot-kotlin-jvm/issues/166
        // and https://github.com/utopia-rise/godot-kotlin-jvm/issues/170
#ifndef NO_USE_STDLIB
        std::locale::global(global);
#endif

        delete[] options;
        JVM_CRASH_COND_MSG(result != JNI_OK, "Failed to create a new vm!");
    }

    // Sanity check
    JVM_CRASH_COND_MSG(java_vm == nullptr, "Current configuration doesn't allow to create or fetch a JVM.");

    jni::Jvm::initialize(java_vm, user_configuration.vm_type, loading_configuration.version);
}

void JvmManager::initialize_jni_classes(jni::Env& p_env, ClassLoader* class_loader) {
    // Singleton
    TransferContext::initialize(p_env, class_loader);
    TypeManager::initialize(p_env, class_loader);
    LongStringQueue::initialize(p_env, class_loader);
    MemoryManager::initialize(p_env, class_loader);

    bridges::GDPrintBridge::initialize(p_env, class_loader);

    bridges::CallableBridge::initialize(p_env, class_loader);
    bridges::DictionaryBridge::initialize(p_env, class_loader);
    bridges::RidBridge::initialize(p_env, class_loader);
    bridges::StringNameBridge::initialize(p_env, class_loader);
    bridges::NodePathBridge::initialize(p_env, class_loader);
    bridges::VariantArrayBridge::initialize(p_env, class_loader);

    bridges::PackedByteArrayBridge::initialize(p_env, class_loader);
    bridges::PackedColorArrayBridge::initialize(p_env, class_loader);
    bridges::PackedFloat32ArrayBridge::initialize(p_env, class_loader);
    bridges::PackedFloat64ArrayBridge::initialize(p_env, class_loader);
    bridges::PackedInt32IntArrayBridge::initialize(p_env, class_loader);
    bridges::PackedInt64IntArrayBridge::initialize(p_env, class_loader);
    bridges::PackedStringArrayBridge::initialize(p_env, class_loader);
    bridges::PackedVector2ArrayBridge::initialize(p_env, class_loader);
    bridges::PackedVector3ArrayBridge::initialize(p_env, class_loader);

    // Instance
    Bootstrap::initialize_jni_binding(p_env, class_loader);
    KtObject::initialize_jni_binding(p_env, class_loader);

    KtPropertyInfo::initialize_jni_binding(p_env, class_loader);
    KtProperty::initialize_jni_binding(p_env, class_loader);
    KtConstructor::initialize_jni_binding(p_env, class_loader);
    KtSignalInfo::initialize_jni_binding(p_env, class_loader);
    KtRpcConfig::initialize_jni_binding(p_env, class_loader);
    KtFunctionInfo::initialize_jni_binding(p_env, class_loader);
    KtFunction::initialize_jni_binding(p_env, class_loader);
    KtClass::initialize_jni_binding(p_env, class_loader);
}

void JvmManager::destroy_jni_classes() {
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

void JvmManager::close_jvm(JvmLoadingConfiguration& loading_configuration) {
    if (loading_configuration.loading_type == JvmLoadingType::PROVIDED) { return; }
    LOG_VERBOSE("Shutting down JVM ...");
    jni::Jvm::destroy();
}
