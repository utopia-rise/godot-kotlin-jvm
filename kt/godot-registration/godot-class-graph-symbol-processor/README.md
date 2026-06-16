# ClassGraph Symbol Processor

This module scans compiled JVM classes with ClassGraph and turns them into `ScriptClass` registration models.

It is the bytecode-reading front end of the registration pipeline. It does not generate registrar source code.

## Flow

1. `ClassGraphProcessor` scans the runtime classpath.
2. `RegistrationMapper` finds candidate Godot classes.
3. The matching `JvmLanguage` implementation normalizes JVM bytecode into a `LogicalClassShape`.
4. `RegistrationMapper` applies the configured registration mode and maps accepted members directly to the final registration model.

The current representations are intentionally few:

- ClassGraph raw objects: `ClassInfo`, `FieldInfo`, `MethodInfo`, `AnnotationInfo`
- Logical shape: `LogicalClassShape`, `LogicalSignal`, `LogicalProperty`, `LogicalMethod`
- Final model: `ScriptClass`, `RegisteredProperty`, `RegisteredFunction`, `RegisteredSignal`

There is no separate selected-registration IR.

The logical shape is built from declared members only. Inherited Godot API methods, properties, and signals
should not appear in a class's local `LogicalClassShape`.

## Packages

### `classgraph`

- `ClassGraphProcessor.kt`: public entry point.
- `ProcessorSettings.kt`: project and registration-mode inputs.
- `ProcessorContext.kt`: shared scan result and caches.

### `classgraph/shape`

This package contains language-specific bytecode interpretation.

- `JvmLanguage`: shared logical-shape builder.
- `KotlinJvmLanguage`, `JavaJvmLanguage`, `ScalaJvmLanguage`: language rules for synthetic members, properties, accessors, and annotations.
- `LogicalClassShape.kt`: small language-normalized view used by the mapper.

Adding JVM language support should usually mean adding one `JvmLanguage` implementation and registering it in `JvmLanguage.forClass`.

Language identification is source-file based:

- `.kt` -> Kotlin
- `.scala` -> Scala
- `.java` -> Java

If no language matches a candidate script class, the mapper warns and skips that class.

## Property Reconstruction

`JvmLanguage` rebuilds source-like properties from JVM fields and methods before registration policy runs.

The shared flow is:

1. Filter raw fields and methods to remove compiler artifacts and synthetic helpers.
2. Ask the active `JvmLanguage` which remaining methods behave like property accessors.
3. Build field-backed properties first by matching a logical field name with getter and setter candidates.
4. Build fieldless properties second from remaining getter and setter pairs.
5. Merge annotations from the field, getter, setter, and any language-specific synthetic annotation carriers.

This lets the mapper work with one logical concept, `LogicalProperty`, instead of re-implementing Kotlin, Java, and Scala bytecode rules.

### Accessor Rules

Kotlin:

- `getFoo()` -> `foo`
- `isReady()` -> `isReady`
- `setFoo(x)` -> `foo` and `isFoo`

Java:

- `getFoo()` -> `foo`
- `isFoo()` -> `foo` only if the return type is boolean
- `setFoo(x)` -> `foo`

Scala:

- `foo()` -> `foo`
- `foo_$eq(x)` -> `foo`

### Kotlin Notes

Kotlin can rebuild:

- field-backed `val` / `var`
- getter-only properties
- getter + setter properties with no visible backing field
- computed properties with no backing field
- delegated properties as logical properties

Delegated properties are reconstructed as normal logical properties. The delegate object itself is not modeled separately.

Kotlin also merges property annotations from synthetic `$annotations` carrier methods, which is why `lateinit` and annotation-based registration still work even when the annotation is not stored directly on the backing field.

Kotlin logical properties always map to property-reference code generation later, even when the source
property is getter-only, computed, delegated, or otherwise not field-backed in a simple JVM sense.

### Accessor Intent

Accessor-shaped methods are kept in the logical method pool until `RegistrationMapper` resolves registration intent.

For a method that is both accessor-shaped and callable-shaped:

- `@Visible` marks property intent
- `@Register` marks function intent
- `@Notification` marks notification handler intent
- no annotation defaults to property intent
- combined annotations can register both a property and a callable or notification function

`JvmLanguage` only detects the language shape. The mapper decides whether an accessor-shaped method is registered as a property, a function, or both.

The mapper also decides the final property binding strategy stored in `RegisteredProperty`:

- `PROPERTY_REFERENCE`
- `ACCESSOR_METHODS`

That lets the generator emit the correct Kotlin reference form without re-deriving intent from JVM names.

### `classgraph/mapper`

- `RegistrationMapper.kt`: selects classes and members for the current registration mode, maps types, hints, property binding strategy, and final model objects.
- `AnnotationMapper.kt`: maps annotation payloads to model configuration and property hints.

### `classgraph/extensions`

Small ClassGraph helpers for descriptors, meta-annotations, type checks, inheritance checks, and registration names.

## Registration Modes

### Explicit

Only directly annotated symbols are registered.

- class: `@Script`
- property: `@Visible`
- method: `@Register` or `@Notification`
- signal: `@Emit`

Meta-annotations are not expanded.

Godot base method overrides are not auto-selected in explicit mode.

### Inferred

Meta-annotations are expanded.

- class: anything carrying `@Script`
- property: anything carrying `@Visible`
- signal: any logical signal
- method: anything carrying `@Register` or `@Notification`

Godot base method overrides are also registered when their JVM signature is mappable.

### Automatic

Everything compatible is registered.

- class: every candidate Godot class
- signal: every logical signal
- method: every mappable logical method
- property: every logical property with a mappable type

Automatic properties are exported by default.

`@Notification` is still required for a selected method to become a notification handler in every mode. The mapper
stores the annotation value on the resulting `RegisteredFunction`; the generator later uses that value to emit
notification registration instead of normal method registration.

## Boundaries

`JvmLanguage` explains how a source language appears in JVM bytecode.

`RegistrationMapper` decides what registers and builds the final model.

The module should not generate registrar code or push language-specific bytecode rules into the final registration model.
