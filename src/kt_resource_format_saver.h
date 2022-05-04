#ifndef GODOT_JVM_KT_RESOURCE_FORMAT_SAVER_H
#define GODOT_JVM_KT_RESOURCE_FORMAT_SAVER_H
#include "core/io/resource_saver.h"

class KtResourceFormatSaver : public ResourceFormatSaver {
public:
    KtResourceFormatSaver() = default;
    KtResourceFormatSaver(const KtResourceFormatSaver&) = delete;
    void operator=(const KtResourceFormatSaver&) = delete;

    Error save(const String& p_path, const Ref<Resource>& p_resource, uint32_t p_flags) override;
    void get_recognized_extensions(const Ref<Resource>& p_resource, List<String>* p_extensions) const override;
    bool recognize(const Ref<Resource>& p_resource) const override;
};


#endif //GODOT_JVM_KT_RESOURCE_FORMAT_SAVER_H
