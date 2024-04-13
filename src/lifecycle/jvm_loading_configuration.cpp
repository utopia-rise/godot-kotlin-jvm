#include "jvm_loading_configuration.h"

#include "core/variant/variant.h"
#include "logging.h"

void JvmLoadingConfiguration::add_jni_checks() {
    options.push_back("-Xcheck:jni");
}

void JvmLoadingConfiguration::add_debug_options(uint16_t p_port, String& p_address, bool p_wait) {
    String jvm_debug_port = String::num_int64(p_port);

    String suspend;
    if (p_wait) {
        suspend = "y";
    } else {
        suspend = "n";
    }

    String debug_command {
      vformat("-agentlib:jdwp=transport=dt_socket,server=y,suspend=%s,address=%s:%s", suspend, p_address, jvm_debug_port)
    };
    options.push_back(debug_command);
}

void JvmLoadingConfiguration::add_jmx_option(uint16_t p_port) {
    String jvm_jmx_port = String::num_int64(p_port);
    options.push_back("-Djava.rmi.server.hostname=127.0.0.1");
    options.push_back("-Dcom.sun.management.jmxremote");
    options.push_back("-Dcom.sun.management.jmxremote.port=" + jvm_jmx_port);
    options.push_back("-Dcom.sun.management.jmxremote.rmi.port=" + jvm_jmx_port);
    options.push_back("-Dcom.sun.management.jmxremote.local.only=false");
    options.push_back("-Dcom.sun.management.jmxremote.authenticate=false");
    options.push_back("-Dcom.sun.management.jmxremote.ssl=false");
    LOG_VERBOSE(vformat("Started JMX on port: %s", jvm_jmx_port));
}

void JvmLoadingConfiguration::add_custom_options(const String& custom_options) {
    options.push_back(custom_options);
}

void JvmLoadingConfiguration::create(JvmUserConfiguration& user_configuration, JvmLoadingConfiguration& loading_configuration) {
    JvmLoadingType loading_type;

#ifdef IOS_ENABLED
    loading_type = JvmLoadingType::STATIC
#else
    if (user_configuration.vm_type == jni::JvmType::ART) {
        loading_type = JvmLoadingType::PROVIDED;
    } else {
        loading_type = JvmLoadingType::DYNAMIC;
    }
#endif

      // When using Graal Native Image, the users code is set in the same binary as the JVM itself
      bool user_code_included_in_vm = user_configuration.vm_type == jni::JvmType::GRAAL_NATIVE_IMAGE;

    loading_configuration.loading_type = loading_type;
    loading_configuration.code_included_in_vm = user_code_included_in_vm;
}

void JvmLoadingConfiguration::add_options(JvmUserConfiguration& user_configuration, JvmLoadingConfiguration& loading_configuration) {
#ifdef DEBUG_ENABLED
    loading_configuration.add_jni_checks();
#endif

    if (user_configuration.jvm_debug_port != -1) {
        loading_configuration.add_debug_options(
          user_configuration.jvm_debug_port,
          user_configuration.jvm_debug_address,
          user_configuration.wait_for_debugger
        );
    }

    if (user_configuration.jvm_jmx_port >= 0) { loading_configuration.add_jmx_option(user_configuration.jvm_jmx_port); }

    if (!Engine::get_singleton()->is_editor_hint()) {
        loading_configuration.add_custom_options(user_configuration.jvm_args);
    }
}
