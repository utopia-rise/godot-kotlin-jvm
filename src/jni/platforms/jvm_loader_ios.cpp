#ifdef IOS_ENABLED

#include "../jvm_loader.h"
#include <jni.h>

using namespace jni;

CreateJavaVM JvmLoader::get_create_jvm_function() {
    return &JNI_CreateJavaVM;
}

GetCreatedJavaVMs JvmLoader::get_get_created_java_vm_function() {
    return &JNI_GetCreatedJavaVMs;
}

void JvmLoader::close_jvm_lib() {
    //Nothing to do, everything is statically linked
}

void JvmLoader::load_jvm_lib() {
    //Nothing to do, everything is statically linked
}

String JvmLoader::get_jvm_lib_path() {
    return String();
}

String JvmLoader::get_path_to_locally_installed_jvm() {
    return String();
}

String JvmLoader::get_embedded_jre_path() {
    return String();
}

#endif
