# Truly Switch To `Godot-JVM`

This file tracks the remaining work required to fully rename the project from `Godot Kotlin/JVM` / `godot-kotlin-jvm` to `Godot-JVM` / `godot-jvm`.

## Current policy

These items are intentionally still using the old names today because changing them now would break consumers or links:

- Published Gradle plugin ID: `com.utopia-rise.godot-kotlin-jvm`
- Existing plugin portal / consumer `plugins {}` usage
- Existing repository URL and links until the repository is actually renamed/moved

## 1. Repository move

- Rename the GitHub repository from `utopia-rise/godot-kotlin-jvm` to `utopia-rise/godot-jvm`
- Verify redirects work for:
  - repository homepage
  - issues
  - pull requests
  - releases
  - raw file links
  - badges
- Update any external docs/websites that deep-link to the old repo

## 2. Published Gradle plugin migration

- Decide whether the plugin ID should really change from `com.utopia-rise.godot-kotlin-jvm` to `com.utopia-rise.godot-jvm`
- If yes, plan a migration path for existing users:
  - release notes
  - docs update
  - IntelliJ wizard/template update
  - compatibility messaging
  - fallback/transition period if possible
- Update these places together when the switch happens:
  - `kt/plugins/godot-gradle-plugin/build.gradle.kts`
  - `kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/generateGdIgnoreFilesTask.kt`
  - `kt/plugins/godot-intellij-plugin/src/main/resources/template/build.gradle.kts.template`
  - `kt/plugins/godot-intellij-plugin/src/main/kotlin/godot/intellij/plugin/module/GodotModuleBuilder.kt`
  - `kt/plugins/godot-intellij-plugin/src/main/resources/messages/generalLabels.properties`
  - any docs and examples using `com.utopia-rise.godot-kotlin-jvm`

## 3. Release asset names

The workflow-owned release asset names have already been switched to:

- `godot-jvm_editor_*`
- `godot-jvm_export_templates_*`

What is still left:

- Verify no downstream docs, scripts, or release automation outside `.github/workflows` still expect the old `godot-kotlin-jvm_*` asset names
- Validate one real tag/release flow end-to-end after the rename

## 4. Maven / publishing metadata

- After the repo move, switch publishing metadata from old repo URLs to new ones in:
  - `kt/build-logic/convention/src/main/kotlin/publish/PublishToMavenCentralPlugin.kt`
  - `kt/plugins/godot-gradle-plugin/build.gradle.kts`
- Recheck:
  - POM `url`
  - SCM connection
  - SCM developer connection
  - SCM URL
  - license URL
  - plugin portal website / VCS URL

## 5. Docs and external links

- Replace remaining `godot-kotlin-jvm` repo/release/issue links after the repo move
- Revisit docs pages that still intentionally point at old repo resources
- Update badges in:
  - `README.md`
  - `docs/src/doc/index.md`
  - any other docs/readmes still using old repository slugs

## 6. Internal naming cleanup

Done for the purely internal identifiers:

- `GodotKotlinJvm*` internal class/type names were renamed to `GodotJvm*`
- internal version symbols were renamed to `godotJvmVersion` / `fullGodotJvmVersion`
- internal build property keys were renamed to `godot.jvm.version` and `godot.jvm.assembled.version`
- internal workflow/output keys were renamed to `godot-jvm-version`

Still intentionally left alone because they can affect compatibility or repository structure:

- docs/examples that still instruct people to use `modules/kotlin_jvm`
- `modules/kotlin_jvm` may still need to stay supported until all external instructions and downstream workflows are migrated
- editor settings keys under `kotlin_jvm/...`
- any published or externally consumed identifiers already called out earlier in this file

## 7. IntelliJ / user-facing product naming review

- Recheck all user-facing branding once the technical migration is complete:
  - plugin display name
  - project wizard labels
  - editor menu labels
  - runtime error messages
  - docs headings
- Keep the editor menu path as `Project/Tools/JVM/...` unless there is a strong reason to change it

## 8. Validation before final cutover

- Run release workflows on a test tag
- Confirm the generated release assets are named `godot-jvm_*`
- Verify published Gradle plugin resolution in a fresh sample project
- Verify IntelliJ project wizard output
- Verify docs links and badges
- Verify Maven Central / Plugin Portal metadata
- Verify release asset names and download docs match
