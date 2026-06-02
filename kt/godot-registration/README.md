# godot-registration

Tooling that turns compiled user code annotated with `@RegisterClass`, `@RegisterFunction`,
`@RegisterProperty`, and `@RegisterSignal` into the registrar source and `.gdj` registration files Godot
needs at runtime.

This directory is an umbrella Gradle module. During development its three child modules are separate jars;
when published, they are shadow-merged into one self-contained `godot-registration` fat jar consumed by the
Godot Gradle plugin.

## Pipeline

```
compiled user bytecode
  -> [godot-class-graph-symbol-processor]  front-end: ClassGraph scan -> registration model
  -> [godot-registration-model]            shared model + sanity checks
  -> [godot-registrar-generator]           model -> registrar Kotlin source + .gdj files
```

The Gradle plugin task
`plugins/godot-gradle-plugin/.../registrar_generation/ClassGraphGenerateRegistrarFilesTask.kt`
orchestrates the whole flow.

1. `ClassGraphProcessor.process(runtimeClassPathFiles, ProcessorSettings)` returns `List<ScriptClass>`.
2. `ModelCheck.check(allRegisteredClasses, logger, registeredNameProvider?)` validates the model.
3. `RegistrarGenerator.generateRegistrarFilesUsingRegisteredClasses(...)` writes generated registrar source
   and the `ClassRegistrar` service file.
4. The Gradle task optionally stages `.gdj` files through `RegistrationFileGenerator`.

## Submodules

| Module                               | Role                                                                                                                            | Entry point                                                            |
|--------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| `godot-class-graph-symbol-processor` | Front-end. Uses ClassGraph to scan compiled Kotlin/Java/Scala bytecode and map relevant classes into the registration model.    | `ClassGraphProcessor.process(...)`                                     |
| `godot-registration-model`           | Shared IR and validation layer. Owns `ScriptClass`, registered members, type hierarchy nodes, property hints, and model checks. | `ModelCheck.check(...)`                                                |
| `godot-registrar-generator`          | Back-end. Consumes validated models and emits registrar Kotlin source, service metadata, and generator-side JVM type helpers.   | `RegistrarGenerator.generateRegistrarFilesUsingRegisteredClasses(...)` |

## Model Shape

The main top-level output is `ScriptClass`, not the old entry-generation `Clazz` or `RegisteredClass`.

Hierarchy is represented by `ScriptFamily`:

- `ScriptClass`: user-authored Kotlin/Java/Scala class. It may be registered, abstract registered, or a
  non-registered intermediate parent whose members must be hoisted into the nearest registered descendant.
- `GodotBaseClass`: built-in Godot API class such as `Node`, `Button`, `Resource`, or `NavigationMesh`.
  It carries no registered members, but it preserves the built-in parent chain for ancestry checks.
- `ScriptInterface`: user-authored interface that can contribute registered functions.

Class-like families implement `GodotClass`, which provides `parent`, `baseGodotClass`, and
`inheritsRefCounted`. Every `ScriptFamily` has cached `allAncestry`, built from direct parent plus direct
interfaces plus each ancestor's own ancestry.

The symbol processor also uses lightweight referenced hierarchy nodes for property/parameter/return types:
`ReferencedGodotClass` and `ReferencedScriptInterface`. They preserve ancestry for checks like
`Type.isNodeType()` without recursively materializing all registered members of referenced classes.

`JvmType` is not part of this shared model. It now lives in `godot-registrar-generator` because it is only a
generator-side JVM type bucketing helper used by hint validation and fqname matching.

## Validation

Validation belongs in `godot-registration-model`, under `checks/`. The processor maps bytecode into model
objects; the generator assumes the model was already checked.

`ModelCheck` executes every check and reports all issues before returning failure. Current checks cover
constructor shape, function argument count, signal type usage, property type/mutability/lateinit/nullability,
RPC usage, and optional registered-name uniqueness.

Registered-name uniqueness is enabled by the Gradle task only for `RegisteredNameMode.SIMPLE_NAME`, where
two classes from different packages can otherwise collapse to the same Godot registered name.

## Naming

The generator computes registered names with `ScriptClass.getRegisteredName(settings)`:

- `SIMPLE_NAME`: custom name if present, otherwise the Kotlin/JVM simple class name.
- `FQ_NAME`: package plus class name.
- `PROJECT_PREFIX`: simple name for the current project, project-prefixed name for external project roots.

The final name is sanitized by replacing `.` and `-` with `_`.

## Building

From the `kt/` Gradle build:

```bash
./gradlew :godot-registration:build
./gradlew :godot-registration:shadowJar
```

The harness project is a useful end-to-end check for this module:

```bash
cd harness/tests
./gradlew build
```

The thin jar carries the `thin` classifier. The shadow jar is the primary `godot-registration` artifact and
is published without external POM dependencies because the runtime dependencies are bundled.
