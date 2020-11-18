cmake_minimum_required(VERSION 3.13)
project(godot_jvm)

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

set(GODOT_ROOT_DIR ../../)

# Get sources
file(GLOB_RECURSE SOURCES CONFIGURE_DEPENDS src/*.cpp)

add_library(${PROJECT_NAME} SHARED register_types.cpp ${SOURCES} src/gd_kotlin.cpp src/gd_kotlin.h src/godotkotlin_defs.h src/jni/wrapper.h src/kt_function.cpp src/kt_function.h src/kt_property.cpp src/kt_property.h src/jni/local_frame.cpp src/jni/local_frame.h src/kt_signal_info.cpp src/kt_signal_info.h src/memory_bridge.cpp src/memory_bridge.h src/jni/java_method_signature.cpp src/jni/java_method_signature.h src/java_instance_wrapper.h src/shared_buffer.h src/shared_buffer.cpp src/type_manager.cpp src/type_manager.h)

# JNI
find_package(JNI REQUIRED)
target_include_directories(${PROJECT_NAME} PUBLIC ${JNI_INCLUDE_DIRS})

target_include_directories(${PROJECT_NAME}
        PUBLIC ${GODOT_ROOT_DIR}
)