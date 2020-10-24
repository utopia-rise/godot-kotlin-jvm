#ifndef GODOT_JVM_KT_SIGNAL_INFO_H
#define GODOT_JVM_KT_SIGNAL_INFO_H


#include <core/object.h>
#include "java_instance_wrapper.h"
#include "kt_property.h"

struct KtSignalInfo : public JavaInstanceWrapper {
    KtSignalInfo(jni::JObject p_wrapped, jni::JObject& p_class_loader);
    ~KtSignalInfo();

    String name;
    List<KtPropertyInfo*> arguments;

    MethodInfo get_member_info() const;
};


#endif //GODOT_JVM_KT_SIGNAL_INFO_H
