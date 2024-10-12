
#include "java_archive_resource_format_loader.h"

#include "gd_kotlin.h"
#include "java_archive.h"
#include "lifecycle/paths.h"
#include "logging.h"

void JavaArchiveFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back("jar");
    p_extensions->push_back("dex");
}

String JavaArchiveFormatLoader::get_resource_type(const String& p_path) const {
    String ext = p_path.get_extension().to_lower();
    if(ext == "jar" || ext == "dex"){ return "JavaArchive";}
    return "";
}

bool JavaArchiveFormatLoader::handles_type(const String& p_type) const {
    return p_type == "JavaArchive";
}

Ref<Resource> JavaArchiveFormatLoader::load(
  const String& p_path,
  const String& p_original_path,
  Error* r_error,
  bool p_use_sub_threads,
  float* r_progress,
  ResourceFormatLoader::CacheMode p_cache_mode
) {
    JVM_LOG_VERBOSE(vformat("Loading Java Archive at: %s", p_path));
    Ref<JavaArchive> ref;
    ref.instantiate();

#ifdef TOOLS_ENABLED
    if(p_path.ends_with(USER_CODE_FILE)){
        GDKotlin::get_instance().reload_user_code();
    }
#endif

    return ref;
}
