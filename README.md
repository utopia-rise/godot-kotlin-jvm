# Godot JVM

1. Clone godot repo.
   ```
   godot/
   godot-jvm/
   ```

2. In `godot/`, run the following commands:
   ```
   git submodule add git@github.com:utopia-rise/godot-jvm.git modules/kotlin_jvm
   scons -j8 platform=x11 # your platform
   ```


# Protobuf

https://github.com/protocolbuffers/protobuf/tree/master/src (install the java version, which already includes cpp)

`./configure --disable-shared CXXFLAGS="-fPIC" --prefix=<repo-root>/libprotobuf`