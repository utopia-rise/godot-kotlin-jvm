<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# godot-kotlin-idea-plugin Changelog

## [Unreleased]
### Add initial code inspection and quick fix support
- Adds code inspections for classes, properties and functions annotated with:
    - `@RegisterClass`
    - `@RegisterProperty`
    - `@RegisterFunction`
    - `@RegisterSignal`
- Adds quick fixes for:
    - Adding `@RegisterClass` to class which contains registration annotations but is not registered by itself
    - Replacing wrong initializer for signals with proper signal delegate
    - Replacing `var` with `val` for registered signals
    - Replacing `val` with `var` for registered properties

### Created Plugin
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
