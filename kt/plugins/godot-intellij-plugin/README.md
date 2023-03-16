# godot-kotlin-idea-plugin

[![Version](https://img.shields.io/jetbrains/plugin/v/com.utopia-rise.godotjvmideaplugin.svg)](https://plugins.jetbrains.com/plugin/com.utopia-rise.godotjvmideaplugin)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/com.utopia-rise.godotjvmideaplugin.svg)](https://plugins.jetbrains.com/plugin/com.utopia-rise.godotjvmideaplugin)


## Development
To develop for the IDE plugin you have to use and compile the plugin with Java 17!


## Description
[comment]: <> (To keep everything working, do not remove `<!-- ... -->` sections. These are added to the plugin description through gradle during build)
<!-- Plugin description -->
Adds additional source code checks specific to Godot-Kotlin-Jvm.

Features:
- Adds code insight checks for registering classes, properties, functions and signals
- Adds quick fixes for common registration problems
- Adds code insight checks for basic `rpc` and `call` usage
- Adds gutter icons and dialogs for in editor connected signals throughout the whole project (not only the currently opened scene)
- Adds refactor support for scene files (when classes are moved/renamed)
- Adds project wizard to create new godot kotlin jvm projects
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:

  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "godot-kotlin-idea-plugin"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/chippmann/godot-kotlin-idea-plugin/releases/latest) and install it manually using
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
