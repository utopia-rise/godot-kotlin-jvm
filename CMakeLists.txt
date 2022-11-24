cmake_minimum_required(VERSION 3.13)
project(godot_jvm)

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

set(GODOT_ROOT_DIR ../../)

# Get sources
file(GLOB_RECURSE SOURCES src/*.c**)
file(GLOB_RECURSE HEADERS src/*.h**)
add_library(${PROJECT_NAME} SHARED register_types.h register_types.cpp ${SOURCES} ${HEADERS})

# JNI
find_package(JNI REQUIRED)
target_include_directories(${PROJECT_NAME} PUBLIC ${JNI_INCLUDE_DIRS})
target_include_directories(${PROJECT_NAME} PUBLIC ${GODOT_ROOT_DIR})

# Uncomment to pass auto completion in TOOLS mode
#add_compile_definitions(MONO_GLUE_ENABLED)
add_compile_definitions(TOOLS_ENABLED)
add_compile_definitions(DEBUG_ENABLED)

# platforms
#add_compile_definitions(WINDOWS_ENABLED)
#add_compile_definitions(X11_ENABLED)
add_compile_definitions(OSX_ENABLED)
#add_compile_definitions(__ANDROID__)