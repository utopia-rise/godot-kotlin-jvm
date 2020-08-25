#include <core/print_string.h>
#include <cassert>
#include "gd_kotlin.h"
#include "jni/jvm.h"
#include "core/os/os.h"
#include "core/project_settings.h"
#include "bootstrap.h"

jni::JObject get_current_thread(jni::Env& env) {
    jni::JClass cls = env.find_class("java/lang/Thread");
    jni::MethodId current_thread_method = cls.get_static_method_id(env, "currentThread", "()Ljava/lang/Thread;");
    jni::JObject thread = cls.call_static_object_method(env, current_thread_method);
    assert(!thread.isNull());
    return thread;
}

jni::JObject to_java_url(jni::Env& env, const String& bootstrapJar) {
    jni::JClass cls = env.find_class("java/io/File");
    jni::MethodId ctor = cls.get_constructor_method_id(env, "(Ljava/lang/String;)V");
    jni::JObject path = env.new_string(bootstrapJar.utf8().get_data());
    jni::JObject file = cls.new_instance(env, ctor, {path});
    assert(!file.isNull());
    jni::MethodId to_url_method = cls.get_method_id(env, "toURL", "()Ljava/net/URL;");
    jni::JObject url = file.call_object_method(env, to_url_method);
    assert(!url.isNull());
    return url;
}

jni::JObject create_class_loader(jni::Env& env, const String& bootstrapJar) {
    jni::JObject url = to_java_url(env, bootstrapJar);
    jni::JClass url_cls = env.find_class("java/net/URL");
    jni::JObjectArray urls = url_cls.new_object_array(env, 1, {url});
    jni::JClass class_loader_cls = env.find_class("java/net/URLClassLoader");
    jni::MethodId ctor = class_loader_cls.get_constructor_method_id(env, "([Ljava/net/URL;)V");
    jni::JObject class_loader = class_loader_cls.new_instance(env, ctor, {urls});
    assert(!class_loader_cls.isNull());
    return class_loader;
}

void set_context_class_loader(jni::Env& env, jni::JObject thread, jni::JObject classLoader) {
    auto cls = env.find_class("java/lang/Thread");
    auto setContextClassLoaderMethod = cls.get_method_id(env, "setContextClassLoader", "(Ljava/lang/ClassLoader;)V");
    thread.call_object_method(env, setContextClassLoaderMethod, {classLoader});
}

GDKotlin& GDKotlin::getInstance() {
    static GDKotlin instance;
    return instance;
}

void load_classes_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    print_line("Classes loaded!");
    GDKotlin::getInstance().register_classes(jni::JObjectArray(p_classes));
}

void unload_classes_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    print_line("Classes unloaded!");
    GDKotlin::getInstance().unregister_classes(jni::JObjectArray(p_classes));
}

void GDKotlin::init() {
    jni::InitArgs args;
    args.version = JNI_VERSION_1_8;
    args.option("-Xcheck:jni");
    jni::Jvm::init(args);
    print_line("Jvm started!");
    auto project_settings = ProjectSettings::get_singleton();
    String bootstrap_jar = project_settings->globalize_path("res://build/libs/godot-bootstrap.jar");
    print_line(vformat("Loading bootstrap jar: %s", bootstrap_jar));
    auto& env = jni::Jvm::current_env();
    jni::JObject current_thread = get_current_thread(env);
    class_loader = create_class_loader(env, bootstrap_jar).new_global_ref(env);
    set_context_class_loader(env, current_thread, class_loader);

    jni::JClass bootstrap_cls = env.load_class("godot.runtime.Bootstrap", class_loader);
    jni::MethodId ctor = bootstrap_cls.get_constructor_method_id(env, "()V");
    jni::JObject instance = bootstrap_cls.new_instance(env, ctor);
    bootstrap = new Bootstrap(instance, class_loader);
    bootstrap->register_hooks(env, load_classes_hook, unload_classes_hook);
    bool is_editor = Engine::get_singleton()->is_editor_hint();
    String project_path = project_settings->globalize_path("res://");
    bootstrap->init(env, is_editor, project_path);
}

void GDKotlin::finish() {
    auto& env = jni::Jvm::current_env();
    delete bootstrap;
    class_loader.delete_global_ref(env);
    jni::Jvm::destroy();
    print_line("Jvm destroyed!");
}

void GDKotlin::register_classes(jni::JObjectArray p_classes) {
    auto& env = jni::Jvm::current_env();
    for (auto i = 0; i < p_classes.length(env); i++) {
        auto kt_class = new KtClass(p_classes.get(env, i), class_loader);
        print_line(vformat("got class %s : %s", kt_class->name, kt_class->super_class));
        classes[kt_class->name] = kt_class;
    }

}

void GDKotlin::unregister_classes(jni::JObjectArray p_classes) {
    auto& env = jni::Jvm::current_env();
    Map<String, KtClass*>::Element* kt_class = classes.front();
    while (kt_class != nullptr) {
        delete kt_class->value();
        kt_class = kt_class->next();
    }
}
