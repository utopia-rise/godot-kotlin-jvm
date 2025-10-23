# godot-kotlin-idea-plugin

![Build](https://github.com/chippmann/godot-kotlin-idea-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/com.utopia-rise.godotjvmideaplugin.svg)](https://plugins.jetbrains.com/plugin/com.utopia-rise.godotjvmideaplugin)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/com.utopia-rise.godotjvmideaplugin.svg)](https://plugins.jetbrains.com/plugin/com.utopia-rise.godotjvmideaplugin)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [ ] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] [Publish a plugin manually](https://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/publishing_plugin.html) for the first time.
- [x] Set the Plugin ID in the above README badges.
- [x] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

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
  - Adds project wizard to create new Godot-JVM projects
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "godot-kotlin-idea-plugin"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/chippmann/godot-kotlin-idea-plugin/releases/latest) and install it manually using
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
