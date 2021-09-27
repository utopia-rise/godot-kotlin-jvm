#include <core/print_string.h>
#include <main/main.h>
#include "gd_kotlin.h"
#include "core/project_settings.h"
#include "bridges_manager.h"
#include "jni/class_loader.h"
#include "path_provider.h"
#include <core/io/resource_loader.h>
#include <core/os/dir_access.h>

#ifndef TOOLS_ENABLED

#include <core/os/dir_access.h>

#endif

#ifdef __ANDROID__

#include <platform/android/os_android.h>
#include <platform/android/java_godot_wrapper.h>

#endif

GDKotlin& GDKotlin::get_instance() {
    static GDKotlin instance;
    return instance;
}

void load_classes_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    jni::Env env(p_env);
    jni::JObjectArray classes{jni::JObjectArray(p_classes)};
    jni::JObject j_object{p_this};

    GDKotlin::get_instance().register_classes(env, classes);

    j_object.delete_local_ref(env);
    classes.delete_local_ref(env);
}

void unload_classes_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_classes) {
    jni::Env env(p_env);
    jni::JObjectArray classes{jni::JObjectArray(p_classes)};
    jni::JObject j_object{p_this};

    GDKotlin::get_instance().unregister_classes(env, classes);

    j_object.delete_local_ref(env);
    classes.delete_local_ref(env);
}

void register_engine_types_hook(
        JNIEnv* p_env,
        jobject p_this,
        jobjectArray p_engine_types,
        jobjectArray p_singleton_names,
        jobjectArray p_method_names,
        jobjectArray p_types_of_methods
) {
#ifdef DEBUG_ENABLED
    LOG_VERBOSE("Starting to register managed engine types...");
#endif
    jni::Env env(p_env);

    jni::JObjectArray engine_types{p_engine_types};
    for (int i = 0; i < engine_types.length(env); ++i) {
        jni::JObject type = engine_types.get(env, i);
        const String& class_name = env.from_jstring(static_cast<jni::JString>(type));
        GDKotlin::get_instance().engine_type_names.insert(i, class_name);
        TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS[class_name] = i;
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Registered %s engine type with index %s.", class_name, i));
#endif
        type.delete_local_ref(env);
    }

    jni::JObjectArray singleton_names{p_singleton_names};
    for (int i = 0; i < singleton_names.length(env); ++i) {
        jni::JObject name = singleton_names.get(env, i);
        const String& singleton_name{env.from_jstring(static_cast<jni::JString>(name))};
        GDKotlin::get_instance().engine_singleton_names.insert(i, singleton_name);
        name.delete_local_ref(env);
    }

    jni::JObjectArray method_names{p_method_names};
    jni::JObjectArray types_of_methods{p_types_of_methods};
    jni::JClass integer_class{env.load_class("java.lang.Integer", ClassLoader::get_default_loader())};
    jni::MethodId integer_get_value_method{integer_class.get_method_id(env, "intValue", "()I")};
    for (int i = 0; i < method_names.length(env); i++) {
        jni::JObject type = types_of_methods.get(env, i);
        jni::JObject name = method_names.get(env, i);
        int type_of_method{static_cast<int>(type.call_int_method(env, integer_get_value_method))};
        GDKotlin::get_instance().engine_type_method.insert(
                i,
                ClassDB::get_method(
                        GDKotlin::get_instance().engine_type_names[type_of_method],
                        env.from_jstring(name)
                )
        );
        name.delete_local_ref(env);
        type.delete_local_ref(env);
    }
    jni::JObject j_object{p_this};
    j_object.delete_local_ref(env);
    engine_types.delete_local_ref(env);
    singleton_names.delete_local_ref(env);
    method_names.delete_local_ref(env);
    types_of_methods.delete_local_ref(env);
    integer_class.delete_local_ref(env);
#ifdef DEBUG_ENABLED
    LOG_VERBOSE("Done registering managed engine types...");
#endif
}

void register_user_types_hook(JNIEnv* p_env, jobject p_this, jobjectArray p_types) {
    print_verbose("Starting to register user types...");
    jni::Env env(p_env);
    jni::JObjectArray types{p_types};
    for (int i = 0; i < types.length(env); ++i) {
        const String& script_path{env.from_jstring(static_cast<jni::JString>(types.get(env, i)))};
        GDKotlin::get_instance().user_scripts.insert(i, ResourceLoader::load(script_path, "KotlinScript"));
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Registered %s user type with index %s.", script_path, i));
#endif
    }
    LOG_VERBOSE("Done registering user types.");
}

void register_user_types_members_hook(JNIEnv* p_env, jobject p_this) {
    jni::Env env(p_env);
    GDKotlin::get_instance().register_members(env);
}

void GDKotlin::init() {
    if (Main::is_project_manager()) {
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("Detected that we're in the project manager. Won't initialize kotlin lang.");
#endif
        return;
    }

    if (!check_configuration()) {
        return;
    }

    configuration = GdKotlinConfiguration::load_gd_kotlin_configuration_from_json_and_args();
    copy_usercode_jar_if_necessary();

    jni::InitArgs args;
#ifndef __ANDROID__
    args.version = JNI_VERSION_1_8;
#endif
#ifdef DEBUG_ENABLED
    args.option("-Xcheck:jni");
#endif

    configuration.assemble_jinit_args(&args);

    LOG_INFO("Starting JVM ...")
    jni::Jvm::init(args, configuration.get_vm_type());

    init_usercode();
    is_initialized = true;
}

void GDKotlin::finish() {
    if (Main::is_project_manager()) {
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("Detected that we're in the project manager. No cleanup necessary")
#endif
        return;
    }
    teardown_usercode();
    jni::Jvm::destroy();
    LOG_INFO("Shutting down JVM ...")
}

void GDKotlin::register_classes(jni::Env& p_env, jni::JObjectArray p_classes) {
#ifdef DEBUG_ENABLED
    LOG_INFO("Loading classes ...")
#endif
    jni::JObject class_loader = ClassLoader::get_default_loader();
    for (auto i = 0; i < p_classes.length(p_env); i++) {
        jni::JObject clazz = p_classes.get(p_env, i);
        auto* kt_class = new KtClass(clazz, class_loader);
        classes[kt_class->name] = kt_class;
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(
                vformat(
                        "Loaded class %s : %s, as %s",
                        kt_class->name,
                        kt_class->super_class,
                        kt_class->registered_class_name
                )
        )
#endif
        clazz.delete_local_ref(p_env);
    }
}

void GDKotlin::unregister_classes(jni::Env& p_env, jni::JObjectArray p_classes) {
#ifdef DEBUG_ENABLED
    LOG_INFO("Unloading classes ...")
#endif
    Map<StringName, KtClass*>::Element* current = classes.front();
    while (current != nullptr) {
        KtClass* kt_class = current->value();
#ifdef DEBUG_ENABLED
        LOG_VERBOSE(vformat("Unloading class %s : %s", kt_class->name, kt_class->super_class));
#endif
        delete kt_class;
        current = current->next();
    }
    classes.clear();
}

KtClass* GDKotlin::find_class(const StringName& p_script_path) {
#ifdef DEBUG_ENABLED
    if (!classes.has(p_script_path)) {
        return nullptr;
    }
#endif
    return classes[p_script_path];
}

const GdKotlinConfiguration& GDKotlin::get_configuration() {
    return configuration;
}

jni::JObject GDKotlin::_prepare_class_loader(jni::Env& p_env, jni::Jvm::Type type, const String& usercode_jar) {
    if (type == jni::Jvm::GRAAL_NATIVE_IMAGE) {
        return {};
    }

    jni::JObject class_loader{ClassLoader::provide_loader(p_env, usercode_jar, jni::JObject(nullptr))};
    ClassLoader::set_default_loader(class_loader);
    class_loader.delete_local_ref(p_env);

    class_loader = ClassLoader::get_default_loader();

    return class_loader;
}

bool GDKotlin::check_configuration() {
    bool has_configuration_error = false;
    if (Engine::get_singleton()->is_editor_hint() && OS::get_singleton()->get_environment("JAVA_HOME").empty()) {
        LOG_WARNING("JAVA_HOME not defined. Godot-JVM module won't be loaded!")
        configuration_errors.push_back(
                {
                        "JAVA_HOME not defined",
                        "JAVA_HOME environment variable is not defined. This is necessary for Godot-Jvm to work while you develop on your machine.\n"
                        "You can continue to use the editor but all Godot-Jvm related functionality remains disabled until you define JAVA_HOME and restart the editor."
                }
        );
        has_configuration_error = true;
    }
    return !has_configuration_error;
}

bool GDKotlin::initialized() const {
    return is_initialized;
}

const Vector<Pair<String, String>>& GDKotlin::get_configuration_errors() const {
    return configuration_errors;
}

GDKotlin::GDKotlin() :
        bootstrap(nullptr),
        is_gc_started(false),
        transfer_context(nullptr),
        is_initialized(false) {
}

void GDKotlin::register_members(jni::Env& p_env) {
    auto* map_entry{classes.front()};
    while (map_entry) {
        map_entry->get()->fetch_members();
        map_entry = map_entry->next();
    }
}

void GDKotlin::init_usercode() {
    String runtime_usercode_path{PathProvider::provide_runtime_usercode_path()};
#ifdef TOOLS_ENABLED
    if (!FileAccess::exists(runtime_usercode_path)) {
        LOG_WARNING(
                vformat(
                        "No %s found! You need to build your code in order to use it from within the editor",
                        PathProvider::get_usercode_name()
                )
        )
        return;
    }
#endif
    JVM_CRASH_COND_MSG(
            !FileAccess::exists(runtime_usercode_path),
            vformat("No %s found!", PathProvider::get_usercode_name())
    )

    LOG_INFO(vformat("Loading usercode: %s", runtime_usercode_path))
    jni::Env env{jni::Jvm::current_env()};

    jni::JObject class_loader{_prepare_class_loader(env, configuration.get_vm_type(), runtime_usercode_path)};

    jni::JClass transfer_ctx_cls = env.load_class("godot.core.TransferContext", class_loader);
    jni::FieldId transfer_ctx_instance_field = transfer_ctx_cls.get_static_field_id(
            env,
            "INSTANCE",
            "Lgodot/core/TransferContext;"
    );
    jni::JObject transfer_ctx_instance = transfer_ctx_cls.get_static_object_field(env, transfer_ctx_instance_field);
    JVM_CRASH_COND_MSG(transfer_ctx_instance.is_null(), "Failed to retrieve TransferContext instance");
    transfer_context = new TransferContext(transfer_ctx_instance, class_loader);

    LongStringQueue::get_instance();
    if (configuration.get_max_string_size() != LongStringQueue::max_string_size) {
        LongStringQueue::get_instance().set_string_max_size(configuration.get_max_string_size());
    }

    //Garbage Collector
    jni::JClass garbage_collector_cls{env.load_class("godot.core.GarbageCollector", class_loader)};
    jni::FieldId garbage_collector_instance_field{
            garbage_collector_cls.get_static_field_id(env, "INSTANCE", "Lgodot/core/GarbageCollector;")
    };
    jni::JObject garbage_collector_instance{
            garbage_collector_cls.get_static_object_field(env, garbage_collector_instance_field)
    };
    JVM_CRASH_COND_MSG(garbage_collector_instance.is_null(), "Failed to retrieve GarbageCollector instance");

    BridgesManager::get_instance().initialize_bridges(env, class_loader);

    if (configuration.get_gc_activated()) {
        if (configuration.get_gc_force_mode()) {
#ifdef DEBUG_ENABLED
            LOG_VERBOSE("Starting GC thread with force mode.");
#endif
        }
        jni::MethodId start_method_id{garbage_collector_cls.get_method_id(env, "start", "(Z)V")};
        jvalue start_args[2] = {jni::to_jni_arg(configuration.get_gc_force_mode())};
        garbage_collector_instance.call_void_method(env, start_method_id, start_args);
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("GC thread started.");
#endif
        is_gc_started = true;
    }

    if (!configuration.get_should_display_leaked_jvm_instances_on_close()) {
        jni::MethodId set_should_display_method_id{
                garbage_collector_cls.get_method_id(env, "setShouldDisplayLeakInstancesOnClose", "(Z)V")
        };
        jvalue d_arg[1] = {jni::to_jni_arg(false)};
        garbage_collector_instance.call_void_method(env, set_should_display_method_id, d_arg);
    }

    jni::JClass bootstrap_cls = env.load_class("godot.runtime.Bootstrap", class_loader);
    jni::MethodId ctor = bootstrap_cls.get_constructor_method_id(env, "()V");
    jni::JObject instance = bootstrap_cls.new_instance(env, ctor);
    bootstrap = new Bootstrap(instance, class_loader);

    bootstrap->register_hooks(
            env,
            load_classes_hook,
            unload_classes_hook,
            register_engine_types_hook,
            register_user_types_hook,
            register_user_types_members_hook
    );

    bootstrap->init(env);
    is_usercode_loaded = true;
}

void GDKotlin::teardown_usercode() {
    if (!is_usercode_loaded)
        return;
    auto env = jni::Jvm::current_env();

    bootstrap->finish(env);

    delete transfer_context;
    transfer_context = nullptr;
    delete bootstrap;
    bootstrap = nullptr;

    if (is_gc_started) {
        jni::JClass garbage_collector_cls{
                env.load_class("godot.core.GarbageCollector", ClassLoader::get_default_loader())
        };
        jni::FieldId garbage_collector_instance_field{
                garbage_collector_cls.get_static_field_id(env, "INSTANCE", "Lgodot/core/GarbageCollector;")
        };
        jni::JObject garbage_collector_instance{
                garbage_collector_cls.get_static_object_field(env, garbage_collector_instance_field)
        };
        JVM_CRASH_COND_MSG(garbage_collector_instance.is_null(), "Failed to retrieve GarbageCollector instance");
        jni::MethodId close_method_id{garbage_collector_cls.get_method_id(env, "close", "()V")};
        garbage_collector_instance.call_void_method(env, close_method_id);
        jni::MethodId has_closed_method_id{garbage_collector_cls.get_method_id(env, "isClosed", "()Z")};
        while (!garbage_collector_instance.call_boolean_method(env, has_closed_method_id)) {
            OS::get_singleton()->delay_usec(600000);
        }
#ifdef DEBUG_ENABLED
        LOG_VERBOSE("JVM GC thread was closed");
#endif
        jni::MethodId clean_up_method_id{garbage_collector_cls.get_method_id(env, "cleanUp", "()V")};
        garbage_collector_instance.call_void_method(env, clean_up_method_id);
        is_gc_started = false;
    }

    LongStringQueue::destroy();
    BridgesManager::get_instance().delete_bridges();

    engine_type_method.clear();
    engine_type_names.clear();
    user_scripts.clear();

    TypeManager::get_instance().JAVA_ENGINE_TYPES_CONSTRUCTORS.clear();
    ClassLoader::delete_default_loader(env);
    is_usercode_loaded = false;
}

bool GDKotlin::copy_usercode_jar_if_necessary() {
    const String& runtime_usercode_path{PathProvider::provide_runtime_usercode_path()};
    const String& build_usercode_path{PathProvider::provide_build_usercode_path()};

#ifndef TOOLS_ENABLED
    if (!FileAccess::exists(runtime_usercode_path) || FileAccess::get_md5(runtime_usercode_path) != FileAccess::get_md5(build_usercode_path)) {
#ifdef DEBUG_ENABLED
        LOG_INFO(vformat("%s has changed, will copy it from res...", PathProvider::get_usercode_name()));
#endif

        Error err;
        DirAccess* dir_access{DirAccess::open("res://build/libs", &err)};

#ifdef DEBUG_ENABLED
        JVM_CRASH_COND_MSG(err != OK, vformat("Cannot open %s in res. Error was %s", PathProvider::get_usercode_name(), err))
#endif

        dir_access->copy(build_usercode_path, runtime_usercode_path);
        memdelete(dir_access);
        return true;
    }
    return false;
#else
    const String& build_lock_dir_path{PathProvider::provide_build_lock_dir_path()};
    const String& build_lock_file_path{PathProvider::provide_build_lock_file_path()};

    if (!DirAccess::exists(build_lock_dir_path)) {
        DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
        print_line(build_lock_dir_path);
        build_lock_dir->make_dir_recursive(build_lock_dir_path);
        memdelete(build_lock_dir);
    }

    if (!FileAccess::exists(build_lock_file_path)) {
        uint64_t original_usercode_jar_modification_time{FileAccess::get_modified_time(build_usercode_path)};

        if (original_usercode_jar_modification_time != copied_user_jar_modification_time) {
            // teardown any usercode which might be loaded from the old usercode at this path. Is a no op if no usercode was loaded. Only present in TOOLS_ENABLED anyways
            get_instance().teardown_usercode();

            DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
            LOG_INFO(vformat("from path: %s", build_usercode_path))
            LOG_INFO(vformat("to path: %s", runtime_usercode_path))
            JVM_CRASH_COND_MSG(build_lock_dir->copy(build_usercode_path, runtime_usercode_path) != OK,
                               "Could not copy");
            memdelete(build_lock_dir);

            copied_user_jar_modification_time = original_usercode_jar_modification_time;
            return true;
        }
    }
#endif
    return false;
}