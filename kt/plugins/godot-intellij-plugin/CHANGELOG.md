<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# godot-kotlin-idea-plugin Changelog

## [0.3.1-3.4.0]
### Add support for IDEA 2021.2.
- Updates the plugin to work with current IDEA versions

## [0.1.0-3.2.3]
### Add initial code inspection and quick fix support
- Adds code inspections for classes, properties and functions annotated with:
    - `@RegisterClass`
    - `@RegisterConstructor`
    - `@RegisterProperty`
    - `@RegisterFunction`
    - `@RegisterSignal`
- Adds quick fixes for:
    - Adding `@RegisterClass` to class which contains registration annotations but is not registered by itself
    - Replacing wrong initializer for signals with proper signal delegate
    - Replacing `var` with `val` for registered signals
    - Replacing `val` with `var` for registered properties
- Adds code insight checks for basic `rpc` and `call` usage
- Adds gutter icons and dialogs for in editor connected signals throughout the whole project (not only the currently opened scene)
- Adds refactor support for scene files (when classes are moved/renamed)
- Adds project wizard to create new godot kotlin jvm projects

### Created Plugin
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
