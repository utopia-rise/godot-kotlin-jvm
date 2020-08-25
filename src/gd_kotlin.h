#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H
#include "jni/jvm.h"
#include "bootstrap.h"
#include "kt_class.h"
#include "core/map.h"
#include "core/ustring.h"

class GDKotlin {
private:
    GDKotlin() = default;
    ~GDKotlin() = default;

    Map<String, KtClass*> classes;

    jni::JObject class_loader;
    Bootstrap* bootstrap;
public:
    GDKotlin(const GDKotlin&) = delete;

    static GDKotlin& getInstance();

    GDKotlin& operator=(const GDKotlin&) = delete;

    void init();
    void finish();

    void register_classes(jni::JObjectArray p_classes);
    void unregister_classes(jni::JObjectArray p_classes);
};


#endif //GODOT_JVM_GD_KOTLIN_H
