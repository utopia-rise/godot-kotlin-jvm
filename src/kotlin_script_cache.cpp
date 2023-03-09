#ifdef TOOLS_ENABLED

#include "kotlin_script_cache.h"

KotlinScriptCache& KotlinScriptCache::get_instance() {
    static KotlinScriptCache instance;
    return instance;
}

Ref<KotlinScript> KotlinScriptCache::get_or_create_script(const String &p_path) {
    MutexLock lock(KotlinScriptCache::get_instance().mutex);

    Ref<KotlinScript> ref;

    if (KotlinScriptCache::get_instance().script_cache.has(p_path)) {
        ref = KotlinScriptCache::get_instance().script_cache[p_path];
    } else {
        Ref<KotlinScript> ref_new {memnew(KotlinScript) };
        KotlinScriptCache::get_instance().script_cache[p_path] = ref_new;
        ref = ref_new;
    }

    return ref;
}

void KotlinScriptCache::invalidate() {
    MutexLock lock(KotlinScriptCache::get_instance().mutex);
    KotlinScriptCache::get_instance().script_cache.clear();
}

const Vector<Ref<KotlinScript>> KotlinScriptCache::get_cached_scripts() {
    MutexLock lock(KotlinScriptCache::get_instance().mutex);

    Vector<Ref<KotlinScript>> ret;
    for (const KeyValue<String, Ref<KotlinScript>>& E : KotlinScriptCache::get_instance().script_cache) {
        ret.append(E.value);
    }
    return ret;
}

#endif
