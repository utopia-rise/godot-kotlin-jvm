#ifdef TOOLS_ENABLED

#include <editor/editor_settings.h>
#include <core/os/os.h>
#include <core/os/dir_access.h>
#include <modules/kotlin_jvm/src/gd_kotlin.h>
#include "build_lock_watcher.h"


#endif //TOOLS_ENABLED

void BuildLockWatcher::_notificationv(int p_notification, bool p_reversed) {
    Node::_notificationv(p_notification, p_reversed);

    if (p_notification == NOTIFICATION_READY) {
        timer->set_autostart(true);
        timer->set_wait_time(0.5);
        timer->set_one_shot(false);
        timer->set_wait_time(_EDITOR_GET("kotlin_jvm/editor/build_lock_watch_interval"));
        timer->connect("timeout", this, "reloadIfNeeded");
        add_child(timer);
    }
}

void BuildLockWatcher::reloadIfNeeded() {
    String original_main_jar_file_path{"res://build/libs/usercode.jar"};

    if (!FileAccess::exists(ProjectSettings::get_singleton()->globalize_path(original_main_jar_file_path))) {
        GDKotlin::get_instance().teardown_usercode();


#if defined(__linux__) || defined(__APPLE__)
        String tmp_dir{"/tmp"};
        Vector<String> project_dir_path_splitted{ProjectSettings::get_singleton()->globalize_path("res://").split("/")};
        String project_dir_name{project_dir_path_splitted[project_dir_path_splitted.size() - 2]};
        String build_lock_dir_path{tmp_dir + "/" + project_dir_name + "_buildLockDir"};
        String jar{build_lock_dir_path + "/usercode.jar"};
#elif defined _WIN32 || defined _WIN64
        String tmp_dir{OS::get_singleton()->get_environment("TMP")};
Vector<String> project_dir_path_splitted = ProjectSettings::get_singleton()->globalize_path("res://..").split("\\");
String project_dir_name{project_dir_path_splitted[project_dir_path_splitted.size() - 2]};
String build_lock_dir_path{tmp_dir + "\\" + project_dir_name + "_buildLockDir"};
String jar{build_lock_dir_path + "\\usercode.jar"};
#endif
        if (FileAccess::exists(jar)) {
            DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
            build_lock_dir->remove(jar);
            memdelete(build_lock_dir);
        }

        return;
    }

#if defined(__linux__) || defined(__APPLE__)
    String tmp_dir{"/tmp"};
    Vector<String> project_dir_path_splitted{ProjectSettings::get_singleton()->globalize_path("res://").split("/")};
    String project_dir_name{project_dir_path_splitted[project_dir_path_splitted.size() - 2]};
    String build_lock_dir_path{tmp_dir + "/" + project_dir_name + "_buildLockDir"};
    String build_lock_file_path{build_lock_dir_path + "/buildLock.lock"};
    String main_jar_file_path{build_lock_dir_path + "/usercode.jar"};
#elif defined _WIN32 || defined _WIN64
    String tmp_dir{OS::get_singleton()->get_environment("TMP")};
    Vector<String> project_dir_path_splitted = ProjectSettings::get_singleton()->globalize_path("res://").split("\\");
    String project_dir_name{project_dir_path_splitted[project_dir_path_splitted.size() - 2]};
    String build_lock_dir_path{tmp_dir + "\\" + project_dir_name + "_buildLockDir"};
    String build_lock_file_path{build_lock_dir_path + "\\buildLock.lock"};
    String main_jar_file_path{build_lock_dir_path + "\\usercode.jar"};
#endif


    if (!DirAccess::exists(build_lock_dir_path)) {
        DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
        print_line(build_lock_dir_path);
        build_lock_dir->make_dir_recursive(build_lock_dir_path);
        memdelete(build_lock_dir);
    }

    if (!FileAccess::exists(build_lock_file_path)) {
        //TODO: find more efficient way. Atm we do this every 0.5 seconds which is far from ideal
        String original_main_jar_md5{FileAccess::get_md5(original_main_jar_file_path)};
        String main_jar_md5{FileAccess::get_md5(main_jar_file_path)};

        if (original_main_jar_md5 != main_jar_md5) {
            GDKotlin::get_instance().teardown_usercode();

            DirAccess* build_lock_dir{DirAccess::create_for_path(build_lock_dir_path)};
            build_lock_dir->copy(original_main_jar_file_path, main_jar_file_path);
            memdelete(build_lock_dir);

            GDKotlin::get_instance().init_usercode();
        }
    }
}

BuildLockWatcher::BuildLockWatcher() : timer(memnew(Timer)) {
    ClassDB::bind_method(
            D_METHOD("reloadIfNeeded"),
            &BuildLockWatcher::reloadIfNeeded
    );
}
