import os
import generate_templates

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
    Glob("register_types.cpp"),
    Glob("src/*.cpp"),
    Glob("src/jni/*.cpp"),
    Glob("src/binding/*.cpp"),
    Glob("src/resource_format/*.cpp"),
    Glob("src/language/*.cpp"),
    Glob("src/script/*.cpp"),
    Glob("src/script/language/*.cpp"),
    Glob("src/jvm_wrapper/*.cpp"),
    Glob("src/jvm_wrapper/registration/*.cpp"),
    Glob("src/jvm_wrapper/bridge/*.cpp"),
    Glob("src/jvm_wrapper/memory/*.cpp"),
    Glob("src/lifecycle/*.cpp"),
    Glob("src/lifecycle/platforms/*.cpp"),
    ]

if env["target"] in ["editor", "template_debug"]:
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


if env["platform"] == "macos":
    library = env.SharedLibrary(
        "bin/godot.jvm.{}.{}.framework/godot.jvm.{}.{}".format(
            env["platform"], env["target"], env["platform"], env["target"]
        ),
        source=sources,
    )
elif env["platform"] == "ios":
    if env["ios_simulator"]:
        library = env.StaticLibrary(
            "bin/godot.jvm.{}.{}.simulator.a".format(env["platform"], env["target"]),
            source=sources,
        )
    else:
        library = env.StaticLibrary(
            "bin/godot.jvm.{}.{}.a".format(env["platform"], env["target"]),
            source=sources,
        )
else:
    library = env.SharedLibrary(
        "bin/godot.jvm.{}{}".format(env["suffix"], env["SHLIBSUFFIX"]),
        source=sources,
    )