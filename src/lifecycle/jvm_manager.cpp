#include "jvm_manager.h"

#include "jvm_wrapper/bootstrap.h"
#include "jvm_wrapper/bridge/callable_bridge.h"
#include "jvm_wrapper/bridge/dictionary_bridge.h"
#include "jvm_wrapper/bridge/gd_print_bridge.h"
#include "jvm_wrapper/bridge/node_path_bridge.h"
#include "jvm_wrapper/bridge/packed_array_bridge.h"
#include "jvm_wrapper/bridge/packed_byte_array_bridge.h"
#include "jvm_wrapper/bridge/packed_color_array_bridge.h"
#include "jvm_wrapper/bridge/packed_float_32_array_bridge.h"
#include "jvm_wrapper/bridge/packed_float_64_array_bridge.h"
#include "jvm_wrapper/bridge/packed_int_32_array_bridge.h"
#include "jvm_wrapper/bridge/packed_int_64_array_bridge.h"
#include "jvm_wrapper/bridge/packed_string_array_bridge.h"
#include "jvm_wrapper/bridge/packed_vector2_array_bridge.h"
#include "jvm_wrapper/bridge/packed_vector3_array_bridge.h"
#include "jvm_wrapper/bridge/string_name_bridge.h"
#include "jvm_wrapper/bridge/variant_array_bridge.h"
#include "jvm_wrapper/memory/memory_manager.h"
#include "kotlin_callable_custom.h"
#include "jvm_wrapper/bridge/kt_callable_bridge.h"
#include "jvm_wrapper/bridge/packed_vector4_array_bridge.h"

#include <jni.h>
#include <locale>

#ifdef __ANDROID__
#include <platform/android/thread_jandroid.h>
#endif

typedef jint(JNICALL* CreateJavaVM)(JavaVM**, void**, void*);

CreateJavaVM get_create_jvm_function(void* lib_handle) {
#ifdef DYNAMIC_JVM
    void* createJavaVMSymbolHandle;
    if (OS::get_singleton()->get_dynamic_library_symbol_handle(lib_handle, "JNI_CreateJavaVM", createJavaVMSymbolHandle) != OK) {
        return nullptr;
    }
    return reinterpret_cast<CreateJavaVM>(createJavaVMSymbolHandle);
#elif defined STATIC_JVM
    return &JNI_CreateJavaVM;
#else
    // Sanity check in case we mess up preprocessors
    JVM_CRASH_NOW_MSG("Current configuration doesn't provide a way to create a JVM!");
#endif
}

bool JvmManager::initialize_or_get_jvm(void* lib_handle, JvmUserConfiguration& user_configuration, JvmOptions& jvm_options) {
    JavaVM* java_vm {nullptr};

#if defined DYNAMIC_JVM || defined STATIC_JVM
    uint32_t nOptions {jvm_options.options.size()};
    auto* options = new JavaVMOption[nOptions];
    JavaVMInitArgs args;
    args.version = jvm_options.version;
    args.nOptions = static_cast<jint>(nOptions);
    args.options = options;

    for (auto i = 0; i < static_cast<int>(nOptions); i++) {
        args.options[i].optionString = jvm_options.options[i].ptrw();
        LOG_DEV_VERBOSE(vformat("JVM argument %s: %s", i, args.options[i].optionString));
    }

    std::locale global;

    LOG_VERBOSE("Starting JVM ...");
    JNIEnv* jni_env {nullptr};

    CreateJavaVM func {get_create_jvm_function(lib_handle)};
    JVM_ERR_FAIL_COND_V_MSG(func == nullptr, false, "Failed to obtain JNI_CreateJavaVM symbol from dynamic library!");
    jint result {func(&java_vm, reinterpret_cast<void**>(&jni_env), &args)};

    // Set std::local::global to value it was before creating JVM.
    // See https://github.com/utopia-rise/godot-kotlin-jvm/issues/166
    // and https://github.com/utopia-rise/godot-kotlin-jvm/issues/170

    std::locale::global(global);

    delete[] options;
    JVM_ERR_FAIL_COND_V_MSG(result != JNI_OK, false, "Failed to create a new vm!");

#elif defined PROVIDED_JVM
    LOG_VERBOSE("Retrieving existing JVM ...");
    jni::Env env {get_jni_env()};
    java_vm = env.get_jvm();
#else
    // Sanity check in case we mess up preprocessors
    JVM_CRASH_COND_MSG(java_vm == nullptr, "Current configuration doesn't allow to create or fetch a JVM.");
#endif

    jni::Jvm::initialize(java_vm, user_configuration.vm_type, jvm_options.version);
    return true;
}

bool JvmManager::initialize_jni_classes(jni::Env& p_env, ClassLoader* class_loader) {
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
    KtCallable::initialize_jni_binding(p_env, class_loader);

    return TransferContext::initialize(p_env, class_loader)
        && TypeManager::initialize(p_env, class_loader)
        && LongStringQueue::initialize(p_env, class_loader)
        && MemoryManager::initialize(p_env, class_loader)
        && bridges::GDPrintBridge::initialize(p_env, class_loader)
        && bridges::CallableBridge::initialize(p_env, class_loader)
        && bridges::KtCallableBridge::initialize(p_env, class_loader)
        && bridges::DictionaryBridge::initialize(p_env, class_loader)
        && bridges::StringNameBridge::initialize(p_env, class_loader)
        && bridges::NodePathBridge::initialize(p_env, class_loader)
        && bridges::VariantArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedByteArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedColorArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedFloat32ArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedFloat64ArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedInt32ArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedInt64ArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedStringArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedVector2ArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedVector3ArrayBridge::initialize(p_env, class_loader)
        && bridges::PackedVector4ArrayBridge::initialize(p_env, class_loader);
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
    bridges::StringNameBridge::destroy();
    bridges::NodePathBridge::destroy();
    bridges::VariantArrayBridge::destroy();

    bridges::PackedByteArrayBridge::destroy();
    bridges::PackedColorArrayBridge::destroy();
    bridges::PackedFloat32ArrayBridge::destroy();
    bridges::PackedFloat64ArrayBridge::destroy();
    bridges::PackedInt32ArrayBridge::destroy();
    bridges::PackedInt64ArrayBridge::destroy();
    bridges::PackedStringArrayBridge::destroy();
    bridges::PackedVector2ArrayBridge::destroy();
    bridges::PackedVector3ArrayBridge::destroy();
    bridges::PackedVector4ArrayBridge::destroy();
}

void JvmManager::close_jvm() {
#if defined DYNAMIC_JVM || defined STATIC_JVM
    LOG_VERBOSE("Shutting down JVM ...");
    jni::Jvm::destroy();
#endif
}
