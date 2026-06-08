# Registrar Generator

This module turns registration models into registrar source files.

It does not rebuild bytecode shape or decide what should be registered. It consumes `ScriptClass` models that already contain local signals, properties, functions, and parent/interface references.

## Local Model, Effective Generation

The registration model is local-only:

- `ScriptClass.properties` contains the class's local properties
- `ScriptClass.functions` contains the class's local functions
- `ScriptClass.signals` contains the class's local signals

Parent classes and interfaces are still linked from the model, so the generator can rebuild the effective inherited registration view when generating one registrar.

For a given `ScriptClass`, the generator walks:

- all parent classes
- all interfaces
- parent interfaces recursively

It then generates from:

- local members first
- inherited members after that
- deduplication applied at the end

This means a child registrar is not local-only. It emits the child members plus inherited members reachable through the model's parent and interface references.

## Effective Member Rules

Signals:

- local signals + inherited signals
- deduplicated by signal name

Properties:

- local properties + inherited properties
- deduplicated by property name

Functions:

- local functions + inherited functions
- deduplicated by function signature
- the current signature key is function name + parameter type fqNames

Notification functions are also collected through the hierarchy before generation.

## Override Behavior

Overrides do not appear twice in the generated registrar as long as they collapse to the same deduplication key.

Because local members are added before inherited members, the child version wins:

- child property overrides parent property with the same property name
- child signal overrides parent signal with the same signal name
- child function overrides parent function with the same function signature

So the model stays local, but the generated registrar uses an effective inherited view with child-first override resolution.
