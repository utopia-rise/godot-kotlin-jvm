#ifdef TOOLS_ENABLED
#ifndef GODOT_KOTLIN_SCRIPT_CACHE_H
#define GODOT_KOTLIN_SCRIPT_CACHE_H

#include "kotlin_script.h"

#include <core/string/ustring.h>

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

    static Ref<KotlinScript> get_or_create_script(const String& p_path);
    static void invalidate();
    static const Vector<Ref<KotlinScript>> get_cached_scripts();
};

#endif// GODOT_KOTLIN_SCRIPT_CACHE_H

#endif
