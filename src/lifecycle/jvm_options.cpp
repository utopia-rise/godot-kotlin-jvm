#include "core/variant/variant.h"
#include "jvm_options.h"

void JvmOptions::add_jni_checks() {
    options.push_back("-Xcheck:jni");
}

void JvmOptions::add_debug_options(uint16_t p_port, String& p_address, bool p_wait) {
    String jvm_debug_port = String::num_int64(p_port);

    String suspend { p_wait ? "y" : "n" };

    String debug_command {
      vformat("-agentlib:jdwp=transport=dt_socket,server=y,suspend=%s,address=%s:%s", suspend, p_address, jvm_debug_port)
    };
    options.push_back(debug_command.utf8());
}

void JvmOptions::add_jmx_option(uint16_t p_port) {
    String jvm_jmx_port = String::num_int64(p_port);
    options.push_back("-Djava.rmi.server.hostname=127.0.0.1");
    options.push_back("-Dcom.sun.management.jmxremote");
    options.push_back(vformat("-Dcom.sun.management.jmxremote.port=%s", jvm_jmx_port).utf8());
    options.push_back(vformat("-Dcom.sun.management.jmxremote.rmi.port=%s", jvm_jmx_port).utf8());
    options.push_back("-Dcom.sun.management.jmxremote.local.only=false");
    options.push_back("-Dcom.sun.management.jmxremote.authenticate=false");
    options.push_back("-Dcom.sun.management.jmxremote.ssl=false");
    JVM_LOG_VERBOSE("Started JMX on port: %s", jvm_jmx_port);
}

void JvmOptions::add_custom_options(const String& custom_options) {
    options.push_back(custom_options.utf8());
}
