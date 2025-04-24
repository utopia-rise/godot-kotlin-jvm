#ifndef GODOT_JVM_KT_RESOURCE_LOADER_H
#define GODOT_JVM_KT_RESOURCE_LOADER_H

#include <core/io/resource_loader.h>
namespace godot {
    class JvmResourceFormatLoader : public ResourceFormatLoader {
    public:
        JvmResourceFormatLoader() = default;
        ~JvmResourceFormatLoader() = default;
        JvmResourceFormatLoader(const JvmResourceFormatLoader&) = delete;
        void operator=(const JvmResourceFormatLoader&) = delete;

        void get_recognized_extensions(List<String>* p_extensions) const override;
        String get_resource_type(const String& p_path) const override;
        bool handles_type(const String& p_type) const override;
        Ref<Resource> load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) override;
        bool has_custom_uid_support() const override;
        ResourceUID::ID get_resource_uid(const String& p_path) const override;

        static Error read_all_file_utf8(const String& p_path, String& r_content);
    };
}
#endif// GODOT_JVM_KT_RESOURCE_LOADER_H
