import os
import generate_templates

# godot-cpp/SConstruct reads its "build_profile" option from the global ARGUMENTS dict (via
# Variables(customs, ARGUMENTS)). A customs file like "custom.py" won't work here since its path
# is resolved relative to godot-cpp/SConstruct's own directory, not ours — so the default is
# injected directly into ARGUMENTS instead. setdefault() means an explicit
# `scons build_profile=...` on the command line still overrides this.
ARGUMENTS.setdefault("build_profile", "build_profile.json")

env = SConscript("godot-cpp/SConstruct")
java_home = os.environ["JAVA_HOME"]

# Generate templates when building the engine.
generate_templates.generate_header_from_files("kt/plugins/godot-intellij-plugin/src/main/resources/template", "src/editor/project/templates.h")

# Add those directory manually, so we can skip the godot_cpp directory when including headers in C++ files
source_path = [
    os.path.join("godot-cpp", "include", "godot_cpp"),
    os.path.join("godot-cpp", "gen", "include", "godot_cpp")
]
env.Append(CPPPATH=[env.Dir(d) for d in source_path])

# The GDExtensionScriptInstanceInfo3 setup (jvm_instance.h / jvm_placeholder_instance.h)
# is built with C++20 designated initializers.
if env.get("is_msvc", False):
    env.Append(CXXFLAGS=["/std:c++20"])
else:
    env.Append(CXXFLAGS=["-std=c++20"])


# For the reference:
# - CCFLAGS are compilation flags shared between C and C++
# - CFLAGS are for C-specific compilation flags
# - CXXFLAGS are for C++-specific compilation flags
# - CPPFLAGS are for pre-processor flags
# - CPPDEFINES are for pre-processor defines
# - LINKFLAGS are for linking flags

# tweak this if you want to use different folders, or more folders, to store your source code in.
env.Append(CPPPATH=["src/"])
sources = [
    Glob("src/*.cpp"),
    Glob("src/api/language/*.cpp"),
    Glob("src/api/resource_format/*.cpp"),
    Glob("src/api/script/*.cpp"),
    Glob("src/api/script/language/*.cpp"),
    Glob("src/core/*.cpp"),
    Glob("src/engine/*.cpp"),
    Glob("src/jvm/*.cpp"),
    Glob("src/jvm/jni/*.cpp"),
    Glob("src/jvm/lifecycle/*.cpp"),
    Glob("src/jvm/wrapper/*.cpp"),
    Glob("src/jvm/wrapper/bridge/*.cpp"),
    Glob("src/jvm/wrapper/memory/*.cpp"),
    Glob("src/jvm/wrapper/registration/*.cpp"),
    ]

# godot-cpp only defines TOOLS_ENABLED for target == "editor" (unlike the old
# module build, which also had it for "template_debug"). Several of the
# relocated editor sources (about_dialog.cpp, task_dialog.cpp) have no
# #ifdef TOOLS_ENABLED guard of their own, so only compile the editor sources
# for "editor" to avoid pulling in editor-only UI code unguarded.
if env["target"] == "editor":
    sources.append(Glob("src/editor/*.cpp"))
    sources.append(Glob("src/editor/project/*.cpp"))
    sources.append(Glob("src/editor/build/*.cpp"))
    sources.append(Glob("src/editor/ui/*.cpp"))
    sources.append(Glob("src/editor/export/*.cpp"))

# Android
if env["platform"] != "android":
    java_include_dirs = [
        java_home + "/include",
        java_home + "/include/linux",
        java_home + "/include/win32",
        java_home + "/include/darwin"
    ]
    env.Append(CPPPATH=[java_include_dirs])


# Mirrors utopia-rise/fmod-gdextension's demo/addons layout: the harness/tests Godot project
# (harness/tests/addons/jvm/) picks the library straight up via its .gdextension manifest, so a
# plain rebuild keeps that test project's extension up to date without a manual copy step.
target_path = ARGUMENTS.pop("target_path", "harness/tests/addons/jvm/libs/")
target_name = ARGUMENTS.pop("target_name", "godot.jvm")

if env["platform"] == "macos":
    library = env.SharedLibrary(
        "{}{}/{}.{}.{}.framework/{}.{}.{}".format(
            target_path, env["platform"], target_name, env["platform"], env["target"],
            target_name, env["platform"], env["target"]
        ),
        source=sources,
    )
elif env["platform"] == "ios":
    if env["ios_simulator"]:
        library = env.StaticLibrary(
            "{}{}/{}.{}.{}.simulator.a".format(target_path, env["platform"], target_name, env["platform"], env["target"]),
            source=sources,
        )
    else:
        library = env.StaticLibrary(
            "{}{}/{}.{}.{}.a".format(target_path, env["platform"], target_name, env["platform"], env["target"]),
            source=sources,
        )
else:
    library = env.SharedLibrary(
        "{}{}/{}{}{}".format(target_path, env["platform"], target_name, env["suffix"], env["SHLIBSUFFIX"]),
        source=sources,
    )

# godot-cpp's own GodotCPP() tool already calls Default() for libgodot-cpp,
# which replaces SCons' default-target list. Re-add our own library so a
# bare `scons` invocation actually builds this module, not just godot-cpp.
Default(library)