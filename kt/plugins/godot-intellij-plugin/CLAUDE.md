# CLAUDE.md

This file explains how to work on `kt/plugins/godot-intellij-plugin`.

## Purpose

`godot-intellij-plugin` is the IntelliJ IDEA plugin for Godot Kotlin/JVM.

Its job is intentionally narrow:

1. provide editor checks for Godot Kotlin/JVM code
2. offer small quick fixes for common mistakes
3. detect whether a file belongs to a Godot project
4. create starter projects and modules from templates

Keep it Kotlin-first, K2-only, and simple.

Java and Scala support should only be kept where the same JVM-facing implementation stays clean.

## Mental Model

Think of the plugin as six small layers:

1. plugin wiring
2. startup and caches
3. project scope helpers
4. inspections
5. analyzers
6. quick fixes and wizard

### 1. Plugin wiring

The real entry point is:

- [plugin.xml](src/main/resources/META-INF/plugin.xml)

This is where IntelliJ is told about:

- project services
- startup activity
- inspections
- the new project wizard generator
- resource bundle

If it is not registered there, IntelliJ will not load it.

### 2. Startup and caches

These files live at the root package:

- [GodotKotlinJvmProjectActivity.kt](src/main/kotlin/godot/intellij/plugin/GodotKotlinJvmProjectActivity.kt)
- [GodotKotlinJvmProjectServiceImpl.kt](src/main/kotlin/godot/intellij/plugin/GodotKotlinJvmProjectServiceImpl.kt)
- [PsiTreeListener.kt](src/main/kotlin/godot/intellij/plugin/PsiTreeListener.kt)
- [Indexer.kt](src/main/kotlin/godot/intellij/plugin/Indexer.kt)
- [RegisteredClassNameCache.kt](src/main/kotlin/godot/intellij/plugin/RegisteredClassNameCache.kt)

Flow:

1. IntelliJ loads the plugin from `plugin.xml`
2. after project startup, [GodotKotlinJvmProjectActivity.kt](src/main/kotlin/godot/intellij/plugin/GodotKotlinJvmProjectActivity.kt) calls `projectService.start()`
3. the project service schedules initial indexing in smart mode
4. the PSI listener keeps the registered-name cache updated

This keeps heavy startup logic out of the service constructor.

### 3. Project scope helpers

Shared project detection and PSI helpers live under:

- [project/](src/main/kotlin/godot/intellij/plugin/project)

Most important files:

- [GodotProjectScopeService.kt](src/main/kotlin/godot/intellij/plugin/GodotProjectScopeService.kt)
- [godotRootExt.kt](src/main/kotlin/godot/intellij/plugin/project/godotRootExt.kt)
- [moduleExt.kt](src/main/kotlin/godot/intellij/plugin/project/moduleExt.kt)

This layer answers:

- is this file inside a Godot project?
- what is the detected `project.godot` root?
- what PSI helpers should inspections reuse?

Important detail:

- `godotRootExt.kt` caches the Godot-root lookup on each `VirtualFile`
- both positive and negative lookups are cached
- inspections should use this shared gate instead of discovering roots themselves

### 4. Inspections

Inspections live under:

- [inspection/](src/main/kotlin/godot/intellij/plugin/inspection)

There are three plugin entry-point inspections:

- [JvmInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/JvmInspection.kt)
- [KotlinInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/KotlinInspection.kt)
- [CoreTypeCopyModificationInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/CoreTypeCopyModificationInspection.kt)

Use them like this:

- `JvmInspection`
  - for checks that can work on JVM or Java-shaped PSI
  - Kotlin code reaches it through light elements
  - this is the best place for logic that may later also help Java or Scala
  - currently owns class checks and the simple method checks that only need JVM PSI

- `KotlinInspection`
  - for Kotlin PSI and K2-analysis-based checks
  - use this for `KtProperty`, `KtNamedFunction`, callable references, and other Kotlin-native rules
  - currently keeps property checks, callable-reference checks, RPC argument checks, and override logic that depends on K2 analysis

- `CoreTypeCopyModificationInspection`
  - dedicated Kotlin inspection for a very specific rule: do not assign through a nested member of a `@CoreTypeLocalCopy` getter result
  - keep this conservative
  - false negatives are acceptable here, false positives are not
  - the current implementation only checks:
    - ordinary dot-qualified assignment left-hand sides like `transform.basis.x.x = 1.0`
    - ordinary dot-qualified helper-call chains like `transform.basis.x { y = 1.0 }`

These classes are intentionally simple dispatchers. They check the PSI element type, then forward to the right analyzer.

### 5. Analyzers

Rule logic lives under:

- [analysis/](src/main/kotlin/godot/intellij/plugin/analysis)

Important files:

- [GodotProblem.kt](src/main/kotlin/godot/intellij/plugin/analysis/GodotProblem.kt)
- [analysis/jvm/GodotScriptAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/jvm/GodotScriptAnalyzer.kt)
- [analysis/jvm/RegisterMethodAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/jvm/RegisterMethodAnalyzer.kt)
- [analysis/kotlin/VisibleAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/kotlin/VisibleAnalyzer.kt)
- [analysis/kotlin/RegisterAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/kotlin/RegisterAnalyzer.kt)
- [analysis/kotlin/EmitAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/kotlin/EmitAnalyzer.kt)
- [analysis/kotlin/RpcAnnotationAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/kotlin/RpcAnnotationAnalyzer.kt)
- [analysis/kotlin/CoreTypeCopyModificationAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/kotlin/CoreTypeCopyModificationAnalyzer.kt)

Mental rule:

- inspection = IntelliJ glue
- analyzer = actual rule

That split keeps it easy later to:

- add new checks
- reuse the same logic from inspections
- support another JVM language without rewriting rule code

### 6. Quick fixes and wizard

Quick fixes:

- [quickfix/](src/main/kotlin/godot/intellij/plugin/quickfix)

Wizard:

- [wizard/GodotNewProjectWizard.kt](src/main/kotlin/godot/intellij/plugin/wizard/GodotNewProjectWizard.kt)
- [wizard/GodotNewProjectWizardStep.kt](src/main/kotlin/godot/intellij/plugin/wizard/GodotNewProjectWizardStep.kt)
- [template/](src/main/resources/template)

The wizard is intentionally basic. It now uses IntelliJ's current New Project Wizard API, and it should stay easy to understand and edit.
It has:

- a built-in project name from IntelliJ
- a default package field
- a language selector
- Gradle template generation that writes `godot.languages` for the selected starter language
- top-level Android and iOS export toggles
- a Graal Native Image section that unfolds only when enabled
- iOS as a one-way dependency on Graal Native Image

## Where To Start Reading

Best reading order:

1. [plugin.xml](src/main/resources/META-INF/plugin.xml)
2. [GodotKotlinJvmProjectActivity.kt](src/main/kotlin/godot/intellij/plugin/GodotKotlinJvmProjectActivity.kt)
3. [GodotKotlinJvmProjectServiceImpl.kt](src/main/kotlin/godot/intellij/plugin/GodotKotlinJvmProjectServiceImpl.kt)
4. [GodotProjectScopeService.kt](src/main/kotlin/godot/intellij/plugin/GodotProjectScopeService.kt)
5. [godotRootExt.kt](src/main/kotlin/godot/intellij/plugin/project/godotRootExt.kt)
6. one inspection + its analyzer pair

Good first pairs:

- [inspection/JvmInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/JvmInspection.kt) + [analysis/jvm/GodotScriptAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/jvm/GodotScriptAnalyzer.kt)
- [inspection/KotlinInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/KotlinInspection.kt) + [analysis/kotlin/VisibleAnalyzer.kt](src/main/kotlin/godot/intellij/plugin/analysis/kotlin/VisibleAnalyzer.kt)

## How To Add A New Check

Keep it small.

### If it is Kotlin-specific

1. add or extend a rule in `analysis/kotlin/`
2. route to it from [KotlinInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/KotlinInspection.kt)
3. add a quick fix only if the fix is safe and obvious

### If it may help Java or Scala later

1. prefer `analysis/jvm/`
2. route to it from [JvmInspection.kt](src/main/kotlin/godot/intellij/plugin/inspection/JvmInspection.kt)
3. keep it based on JVM PSI, not Kotlin PSI

### General rules

- do not put rule logic directly in `plugin.xml`-registered classes if you can avoid it
- do not duplicate Godot-root checks in every rule
- keep inspections tiny
- prefer one feature per file
- do not reintroduce Gradle-model communication

## Running The Plugin

Run commands from:

`kt/`

### Run a sandbox IDE

```powershell
.\gradlew.bat :godot-intellij-plugin:runIde
```

This starts a fresh IntelliJ sandbox with the newly built plugin already installed.

### Compile the module

```powershell
.\gradlew.bat :godot-intellij-plugin:compileKotlin
```

### Build the plugin zip

```powershell
.\gradlew.bat :godot-intellij-plugin:buildPlugin
```

## Testing

There are no meaningful checked-in tests yet, so manual testing matters.

Good smoke checks:

- `@Visible` on a `val`
- `@Export` without `@Visible`
- duplicate registered class names
- invalid RPC channel setup
- callable reference to an unregistered function
- nested core-type copy mutation such as `transform.basis.x.x = 1.0`
- helper-call copy mutation such as `transform.basis.x { y = 1.0 }`
- wizard generation for Kotlin, Java, and Scala

## Design Constraints

Keep these constraints in mind:

- keep the structure shallow and obvious
- prefer simple services over clever infrastructure
- keep project detection centralized
- keep inspections as small adapters
- keep analyzers pure and reusable
- keep user-facing behavior stable unless a task explicitly asks otherwise
- favor maintainability over feature sprawl

If a change starts adding hidden state, duplicate sources of truth, or a new Gradle/IDE bridge, it is probably the wrong direction.

