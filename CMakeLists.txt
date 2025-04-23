cmake_minimum_required(VERSION 3.13)
project(godot_jvm)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)


# Uncomment to pass auto completion in TOOLS mode
#add_compile_definitions(MONO_GLUE_ENABLED)
add_compile_definitions(TOOLS_ENABLED)
add_compile_definitions(DEBUG_ENABLED)
add_compile_definitions(DEV_ENABLED)

# platforms
#add_compile_definitions(WINDOWS_ENABLED)
add_compile_definitions(X11_ENABLED)
#add_compile_definitions(MACOS_ENABLED)
#add_compile_definitions(IOS_ENABLED)
#add_compile_definitions(__ANDROID__)




#Godot-cpp
file(GLOB_RECURSE GODOT-CPP godot-cpp/*.cpp)
add_library(godot STATIC ${GODOT-CPP})


# Get sources
file(GLOB_RECURSE SOURCES src/*.c**)
file(GLOB_RECURSE HEADERS src/*.h**)
add_library(${PROJECT_NAME} SHARED ${SOURCES} ${HEADERS})

# Includes
target_include_directories(godot
        PUBLIC
        godot-cpp/include
        godot-cpp/include/godot_cpp
        godot-cpp/gen/include
        godot-cpp/gen/include/godot_cpp
        godot-cpp/gdextension
)

# JNI
find_package(JNI REQUIRED)
include_directories(${JNI_INCLUDE_DIRS})

target_link_libraries(${PROJECT_NAME}
        PRIVATE
        godot
)