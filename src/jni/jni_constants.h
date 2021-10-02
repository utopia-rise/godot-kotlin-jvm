#ifndef GODOT_JVM_JNI_CONSTANTS_H
#define GODOT_JVM_JNI_CONSTANTS_H

namespace jni {
    class JniConstants {
    public:
        static constexpr const char* JRE_AMD64{"jre-amd64"};
        static constexpr const char* JRE_ARM64{"jre-arm64"};
        static constexpr const char* CURRENT_RUNTIME_JRE{
#ifdef __arm64__
                JniConstants::JRE_ARM64
#else
                JniConstants::JRE_AMD64
#endif
        };
    };
}

#endif //GODOT_JVM_JNI_CONSTANTS_H
