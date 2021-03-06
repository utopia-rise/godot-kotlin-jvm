#ifndef GODOT_JVM_KT_RESOURCE_LOADER_H
#define GODOT_JVM_KT_RESOURCE_LOADER_H
#include "core/io/resource_loader.h"

class KtResourceFormatLoader : public ResourceFormatLoader {
public:
    KtResourceFormatLoader() = default;
    ~KtResourceFormatLoader() = default;
    KtResourceFormatLoader(const KtResourceFormatLoader&) = delete;
    void operator=(const KtResourceFormatLoader&) = delete;

    RES load(const String& p_path, const String& p_original_path, Error* r_error) override;
    void get_recognized_extensions(List<String>* p_extensions) const override;
    bool handles_type(const String& p_type) const override;

    String get_resource_type(const String& p_path) const override;
};


#endif //GODOT_JVM_KT_RESOURCE_LOADER_H
