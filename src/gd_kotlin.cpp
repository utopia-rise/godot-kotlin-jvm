#include <core/print_string.h>
#include <cassert>
#include "gd_kotlin.h"
#include "jni/jvm.h"
#include "core/os/os.h"
#include "core/project_settings.h"

jni::JObject get_current_thread(jni::Env& env) {
    jni::JClass cls = env.find_class("java/lang/Thread");
    jni::MethodId current_thread_method = cls.getStaticMethodId(env, "currentThread", "()Ljava/lang/Thread;");
    jni::JObject thread = cls.callStaticObjectMethod(env, current_thread_method);
    assert(!thread.isNull());
    return thread;
}

jni::JObject to_java_url(jni::Env& env, const String& bootstrapJar) {
    jni::JClass cls = env.find_class("java/io/File");
    jni::MethodId ctor = cls.getConstructorMethodId(env, "(Ljava/lang/String;)V");
    jni::JObject path = env.new_string(bootstrapJar.utf8().get_data());
    jni::JObject file = cls.newInstance(env, ctor, {path});
    assert(!file.isNull());
    jni::MethodId to_url_method = cls.getMethodId(env, "toURL", "()Ljava/net/URL;");
    jni::JObject url = file.callObjectMethod(env, to_url_method);
    assert(!url.isNull());
    return url;
}

jni::JObject create_class_loader(jni::Env& env, const String& bootstrapJar) {
    jni::JObject url = to_java_url(env, bootstrapJar);
    jni::JClass url_cls = env.find_class("java/net/URL");
    jni::JObjectArray urls = url_cls.newObjectArray(env, 1, {url});
    jni::JClass class_loader_cls = env.find_class("java/net/URLClassLoader");
    jni::MethodId ctor = class_loader_cls.getConstructorMethodId(env, "([Ljava/net/URL;)V");
    jni::JObject class_loader = class_loader_cls.newInstance(env, ctor, {urls});
    assert(!class_loader_cls.isNull());
    return class_loader;
}

void set_context_class_loader(jni::Env& env, jni::JObject thread, jni::JObject classLoader) {
    auto cls = env.find_class("java/lang/Thread");
    auto setContextClassLoaderMethod = cls.getMethodId(env, "setContextClassLoader", "(Ljava/lang/ClassLoader;)V");
    thread.callObjectMethod(env, setContextClassLoaderMethod, {classLoader});
}

GDKotlin& GDKotlin::getInstance() {
    static GDKotlin instance;
    return instance;
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
    auto& env = jni::Jvm::currentEnv();
    jni::JObject current_thread = get_current_thread(env);
    class_loader = create_class_loader(env, bootstrap_jar).newGlobalRef(env);
    set_context_class_loader(env, current_thread, class_loader);

    jni::JClass bootstrap_cls = env.load_class("godot.jvm.runtime.Bootstrap", class_loader);
    jni::MethodId ctor = bootstrap_cls.getConstructorMethodId(env, "()V");
    jni::JObject instance = bootstrap_cls.newInstance(env, ctor);
    jni::MethodId init_method = bootstrap_cls.getMethodId(env, "init", "(ZLjava/lang/String;)V");
    jni::JObject project_path = env.new_string(project_settings->globalize_path("res://").utf8().get_data());
    bool is_editor = Engine::get_singleton()->is_editor_hint();
    instance.callVoidMethod(env, init_method, {is_editor, project_path});
}

void GDKotlin::finish() {
    auto& env = jni::Jvm::currentEnv();
    class_loader.deleteGlobalRef(env);
    jni::Jvm::destroy();
    print_line("Jvm destroyed!");
}
