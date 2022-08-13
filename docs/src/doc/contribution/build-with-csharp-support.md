## Build engine for C# and Kotlin/JVM
1. Fulfill requirements mentioned [here](https://docs.godotengine.org/en/stable/development/compiling/compiling_with_mono.html)
2. `scons p=<platform> tools=yes module_mono_enabled=yes mono_glue=no`
3. `<godot_binary> --generate-mono-glue modules/mono/glue`
    - For this step to work you need a jre in the `godot-root` folder
    - And a `godot-bootstrap.jar` in `<godot-root>/bin`
4. `export LD_PRELOAD=<path_to_sample_project>/jre-{amd64|arm64}/lib/libjsig.so`
5. `scons -j$(nproc) platform=<platform> module_mono_enabled=yes`
6. run with `../../../../bin/godot.x11.tools.64.mono`