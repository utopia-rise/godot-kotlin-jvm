#ifndef GODOT_JVM_JAVA_ARCHIVE_LOADER_H
#define GODOT_JVM_JAVA_ARCHIVE_LOADER_H

#include <core/io/resource_loader.h>

class JavaArchiveFormatLoader : public ResourceFormatLoader {
public:
    JavaArchiveFormatLoader() = default;
    ~JavaArchiveFormatLoader() = default;
    JavaArchiveFormatLoader(const JavaArchiveFormatLoader&) = delete;
    void operator=(const JavaArchiveFormatLoader&) = delete;

    void get_recognized_extensions(List<String>* p_extensions) const override;
    String get_resource_type(const String& p_path) const override;
    bool handles_type(const String& p_type) const override;
    Ref<Resource> load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) override;
};

#endif// GODOT_JVM_JAVA_ARCHIVE_LOADER_H
