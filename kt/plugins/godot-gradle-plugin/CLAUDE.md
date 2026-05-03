# AGENTS.md

## Purpose

`godot-gradle-plugin` turns a regular JVM project into jars usable by Godot Kotlin/JVM.

It is responsible for:

1. configuring the user project so Kotlin, Java, and Scala compile against the Godot Kotlin/JVM libraries
2. scanning compiled user code to discover Godot-registered classes
3. generating entry sources/resources and `.gdj` registration files
4. packaging the runtime jars consumed by Godot Kotlin/JVM
5. optionally deriving Android and GraalVM export artifacts

## Read This First

Start with these files, in order:

1. [`src/main/kotlin/godot/gradle/GodotPlugin.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/GodotPlugin.kt)  
   Plugin entrypoint. Shows the top-level setup sequence and the exported settings model.

2. [`src/main/kotlin/godot/gradle/GodotExtension.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/GodotExtension.kt)  
   User-facing Gradle configuration. This is where defaults such as `RegisteredNameMode.SIMPLE_NAME` and `RegistrationFileLayoutMode.FLAT` are defined.

3. [`src/main/kotlin/godot/gradle/projectExt/setupTasks.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/projectExt/setupTasks.kt)  
   The clearest map of the task workflow. This file is intentionally kept as a readable orchestration script.

4. [`src/main/kotlin/godot/gradle/projectExt/setupConfigurationsAndCompilations.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/projectExt/setupConfigurationsAndCompilations.kt)  
   Defines main source-set dependencies, compiler flags, and the dedicated `bootstrap` configuration.

5. [`src/main/kotlin/godot/gradle/projectExt/configureThirdPartyPlugins.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/projectExt/configureThirdPartyPlugins.kt)  
   Applies the supporting third-party plugins used by the build, such as Shadow, Scala, and IDEA integration.

## Mental Model

The plugin uses the normal project compilation output as the first pass.

Key properties:

- `godot.isLibrary = true` switches the plugin into library mode
- there is no separate pre-scan compile pipeline
- there is no registered-class plan task anymore
- there is no `RegisteredClassMetadata` re-scan pipeline anymore

Library mode is intentionally different:

- keep the compile-time Godot dependencies and compiler setup
- skip entry scanning and all generated entry/`.gdj` work
- skip `main.jar` / `godot-bootstrap.jar` packaging and Godot-project copy tasks
- leave the project with a regular publishable jar named after the Gradle project

The first compilation step is the project's regular build:

- `compileKotlin`
- `compileJava`
- `compileScala` when present
- `processResources`
- `classes`

Then the plugin builds an intermediary `user.jar` from that output and scans the full runtime classpath once.

The scan processor is intentionally narrow now:

- it scans the supplied classpath
- it maps matching classes to `RegisteredClass`
- it returns `List<RegisteredClass>`

All naming and `.gdj` layout policy lives in the entry-generation layer and is driven by [`Settings`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/entry-generation/godot-entry-generator/src/main/kotlin/godot/entrygenerator/settings/Settings.kt).

Performance intent:

- scan once from the packaged user artifact plus runtime classpath
- keep the generation step cacheable from Gradle's point of view
- avoid separate metadata re-scan passes
- keep the scan processor narrow so scan work stays predictable

## Core Workflow

The end-to-end workflow is:

1. normal project compilation runs
2. `packageUserJar` packages the regular `main` source set output into `user.jar`
3. `entryGenerationGenerateFiles` scans `user.jar` plus the runtime classpath, builds `RegisteredClass` instances, generates entry sources/resources, and stages generated `.gdj` files under `build/generated/entry-generation/registration`
4. `entryGenerationIndexExistingRegistrationFiles` scans the configured Godot project root for existing `.gdj` files and writes an index keyed by fqName
5. `entryGenerationSyncRegistrationFiles` syncs staged `.gdj` files by updating indexed matches in place, deleting obsolete indexed files, and copying new files into the configured registration directory
6. `entryGenerationJar` compiles generated entry code into its own intermediary jar
7. `packageBootstrapJar` builds `bootstrap.jar`
8. `packageMainJar` builds `main.jar`, merging in the generated-entry jar
9. Android and Graal tasks derive export artifacts from the packaged jars

When `godot.isLibrary` is `true`, this whole runtime pipeline is skipped after normal JVM compilation and the plain `jar` task becomes the final artifact.

The main split is now:

- scan + generate in `entryGenerationGenerateFiles`
- index existing `.gdj` files in `entryGenerationIndexExistingRegistrationFiles`
- sync staged `.gdj` files in `entryGenerationSyncRegistrationFiles`
- compile generated sources in `entryGenerationJar`

## Important Artifacts

### `user.jar`

Defined by:
[`tasks/packaging/packageUserJarTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/packaging/packageUserJarTask.kt)

- intermediary artifact
- built from normal `main` source set output
- used as the current-project scan root
- not the final runtime jar

### Generated entry output

Produced by:
[`tasks/entry_generation/ClassGraphGenerateEntryFilesTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/entry_generation/ClassGraphGenerateEntryFilesTask.kt)

- generated Kotlin entry sources under `build/generated/entry-generation`
- generated service metadata under `build/generated/entry-generation/resources/META-INF/services`
- staged `.gdj` files under `build/generated/entry-generation/registration`
- `build/.gdignore` is created so Godot does not index generated build output

### `bootstrap.jar`

Defined by:
[`tasks/packaging/packageBootstrapJarTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/packaging/packageBootstrapJarTask.kt)

- built from the dedicated `bootstrap` configuration
- contains runtime/bootstrap glue code
- does not package user project classes

### `main.jar`

Defined by:
[`tasks/packaging/packageMainJar.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/packaging/packageMainJar.kt)

- final packaged runtime jar
- built from `shadowJar`
- merges in the generated-entry jar
- merges service files so runtime `ServiceLoader` discovery works

## Settings That Matter

The shared entry-generation settings now live in:

- [`Settings.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/entry-generation/godot-entry-generator/src/main/kotlin/godot/entrygenerator/settings/Settings.kt)
- [`RegisteredNameMode.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/entry-generation/godot-entry-generator/src/main/kotlin/godot/entrygenerator/settings/RegisteredNameMode.kt)
- [`RegistrationFileLayoutMode.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/entry-generation/godot-entry-generator/src/main/kotlin/godot/entrygenerator/settings/RegistrationFileLayoutMode.kt)

Important behavior:

- `isLibrary` defaults to `false`
- `godotProjectDirectory` defaults to the Gradle project directory and must contain `project.godot`
- `RegisteredNameMode.SIMPLE_NAME` is the default
- `RegisteredNameMode.FQ_NAME` uses the fqName as the default registered name
- `RegisteredNameMode.PROJECT_PREFIX` prefixes only external classes with `sourceProjectName_`
- `RegistrationFileLayoutMode.FLAT` is the default
- `RegistrationFileLayoutMode.HIERARCHICAL` mirrors the package path inside each project directory
- `registrationFilesDirectory` defaults to `<godotProjectDirectory>/gdj`
- all scanned registered classes are generated through the same entry pipeline regardless of origin

`.gdj` layout is always project-aware:

- existing `.gdj` files are discovered project-wide and updated in place by fqName
- newly created files from the current project go under the configured registration base directory
- newly created files from external projects go under `<registrationBaseDir>/<sourceProjectName>/...`
- hierarchical mode only changes the package subpath inside that project directory

## Core Directories

### [`src/main/kotlin/godot/gradle/projectExt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/projectExt)

Project-level setup.

- `setupConfigurationsAndCompilations.kt`: dependencies, compiler flags, bootstrap configuration
- `setupTasks.kt`: workflow order and task graph
- `configureThirdPartyPlugins.kt`: Shadow, Scala, IDEA integration

### [`src/main/kotlin/godot/gradle/tasks/entry_generation`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/entry_generation)

Entry-generation and generated-artifact pipeline.

Important files:

- [`ClassGraphGenerateEntryFilesTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/entry_generation/ClassGraphGenerateEntryFilesTask.kt)  
  Cacheable task that packages scan settings, calls the scan processor, generates entry files, and stages `.gdj` files.

- [`ClassGraphIndexExistingRegistrationFilesTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/entry_generation/ClassGraphIndexExistingRegistrationFilesTask.kt)  
  Cacheable task that scans the configured Godot project and records the current `.gdj` ownership map by fqName.

- [`ClassGraphUpdateRegistrationFilesTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/entry_generation/ClassGraphUpdateRegistrationFilesTask.kt)  
  Applies staged `.gdj` files by updating existing project files in place, deleting obsolete indexed files, and copying new ones into the registration directory.

- [`classGraphGeneratedEntryJarTask.kt`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/entry_generation/classGraphGeneratedEntryJarTask.kt)  
  Compiles generated entry sources into a reusable jar.

### [`src/main/kotlin/godot/gradle/tasks/packaging`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/packaging)

Jar packaging and copy tasks.

- `packageUserJarTask.kt`
- `packageBootstrapJarTask.kt`
- `packageMainJar.kt`
- `copyJarsTask.kt`
- `generateGdIgnoreFilesTask.kt`

### [`src/main/kotlin/godot/gradle/tasks/android`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/android)

Android export pipeline built from `bootstrap.jar` and `main.jar`.

### [`src/main/kotlin/godot/gradle/tasks/graal`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/graal)

GraalVM and iOS export pipeline built from the packaged jars.

### [`src/main/kotlin/godot/gradle/tasks/lifecycle`](D:/Godot/Module/kotlin/modules/kotlin_jvm/kt/plugins/godot-gradle-plugin/src/main/kotlin/godot/gradle/tasks/lifecycle)

User-facing lifecycle wiring such as build, clean, and IDEA sync follow-up tasks.

## What Is Easy To Get Wrong

### 1. Adding a separate compile pipeline

Do not casually add a second dedicated scan compilation path.

Design intent:

- compile user code once via the normal project pipeline
- package that output into `user.jar`
- scan that artifact plus the runtime classpath once

If you add a second compilation path, make sure you actually want to pay the extra build cost.

### 2. Moving naming or `.gdj` layout policy back into the scanner

The scan processor should stay a scan-and-map component.

Naming mode and registration-file layout belong to the entry-generation layer because both entry files and `.gdj` files depend on the same policy.

### 3. Mixing generated resources into source resources

Generated service metadata should stay under `build/generated/...`, not under `src/main/resources`.

The service file is needed at runtime, but it should be treated as a generated artifact. Putting it in source resources creates second-run and duplicate-resource problems.

### 4. Breaking `.gdj` ownership

`.gdj` files are visible project outputs, not disposable internal noise.

Changes to:

- registration file locations
- Godot project root detection
- update/delete rules
- task outputs
- project-vs-external directory boundaries

should be tested carefully, because a wrong boundary can silently delete tracked registration files or move them into unexpected layouts.

### 5. Losing source-project identity

Each `RegisteredClass` carries a `sourceProjectName`.

That is now the important ownership signal for:

- external name prefixing in `PROJECT_PREFIX`
- per-project `.gdj` directories
- distinguishing the originating project/library while still generating all scanned classes through the same pipeline

### 6. Accidentally defeating task caching

`entryGenerationGenerateFiles` is intentionally modeled as a cacheable generation step.

Be careful when changing:

- annotated task inputs and outputs
- path sensitivity or classpath inputs
- generated service-file behavior
- staged registration-file output locations

If those boundaries drift, warm-build performance can regress even if correctness still looks fine.

## Verification

Prefer the smallest verification step that proves the change.

Useful commands from the monorepo root (`D:\Godot\Module\kotlin\modules\kotlin_jvm`):

```powershell
.\gradlew.bat :godot-gradle-plugin:compileKotlin
```

Use this after editing plugin code. It is the minimum sanity check.

For entry-generation changes, verify the task pipeline explicitly from a harness project, for example:

```powershell
cd D:\Godot\Module\kotlin\modules\kotlin_jvm\harness\tests
.\gradlew.bat packageUserJar entryGenerationGenerateFiles entryGenerationIndexExistingRegistrationFiles entryGenerationSyncRegistrationFiles entryGenerationJar --rerun-tasks --no-build-cache
```

When you are touching `.gdj` logic, also inspect the registration directory afterward rather than trusting task success alone.
