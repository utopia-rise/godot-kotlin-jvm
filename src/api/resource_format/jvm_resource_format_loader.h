#ifndef GODOT_JVM_KT_RESOURCE_LOADER_H
#define GODOT_JVM_KT_RESOURCE_LOADER_H

#include <classes/resource_format_loader.hpp>

namespace godot {
    class JvmResourceFormatLoader : public ResourceFormatLoader {
    public:
        JvmResourceFormatLoader() = default;
        ~JvmResourceFormatLoader() = default;
        JvmResourceFormatLoader(const JvmResourceFormatLoader&) = delete;
        void operator=(const JvmResourceFormatLoader&) = delete;

        PackedStringArray _get_recognized_extensions() const override;
        String _get_resource_type(const String& p_path) const override;
        bool _handles_type(const StringName& p_type) const override;
        Variant _load(const String& p_path, const String& p_original_path, bool p_use_sub_threads, int32_t p_cache_mode) override;
        int64_t _get_resource_uid(const String& p_path) const override;

        static Error read_all_file_utf8(const String& p_path, String& r_content);
    };
}
#endif// GODOT_JVM_KT_RESOURCE_LOADER_H
