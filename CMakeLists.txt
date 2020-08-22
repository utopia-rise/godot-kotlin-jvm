cmake_minimum_required(VERSION 3.16)
project(godot_jvm)

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

set(GODOT_ROOT_DIR ../godot/)

# Get sources
file(GLOB_RECURSE SOURCES CONFIGURE_DEPENDS src/*.cpp)

add_library(${PROJECT_NAME} SHARED register_types.cpp ${SOURCES})
target_include_directories(${PROJECT_NAME}
        PUBLIC ${GODOT_ROOT_DIR}
)