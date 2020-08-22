# Godot JVM

1. Clone godot repo, make sure that it is in the same parent directory as this repo.
   ```
   godot/
   godot-jvm/
   ```

2. In `godot/`, run the following commands:
   ```
   ln -s ../../godot-jvm modules/jvm
   scons -j8 platform=x11 # your platform
   ```
