# Godot JVM

1. Clone godot repo, make sure that it is in the same parent directory for this repo.
   ```
   godot/
   godot-jvm/
   ```

2. In `godot/`, run the following commands:
   ```
   ln -s ../../godot-jvm modules/jvm
   scons -j8 platform=X11 # your platform
   ```