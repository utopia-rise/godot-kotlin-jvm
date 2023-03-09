#ifndef GODOT_KOTLIN_SCRIPT_CACHE_H
#define GODOT_KOTLIN_SCRIPT_CACHE_H

#include <core/string/ustring.h>
#include "kotlin_script.h"

#ifdef TOOLS_ENABLED

class KotlinScriptCache {
private:
    KotlinScriptCache() = default;

    ~KotlinScriptCache() = default;

    HashMap<String, Ref<KotlinScript>> script_cache;

    Mutex mutex;

public:
    KotlinScriptCache(const KotlinScriptCache&) = delete;

    static KotlinScriptCache& get_instance();

    KotlinScriptCache& operator=(const KotlinScriptCache&) = delete;

    static Ref<KotlinScript> get_or_create_script(const String &p_path);
    static void invalidate();
    static const Vector<Ref<KotlinScript>> get_cached_scripts();
};

#endif

#endif //GODOT_KOTLIN_SCRIPT_CACHE_H
