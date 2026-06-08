# Registration logic

Most of the time, registration feels simple:

- mark a class so Godot can see it
- expose the functions, properties, and signals you want
- choose how explicit you want that process to be

## `Explicit` mode

`Explicit` is the strictest mode.

In this mode, only things you mark directly are exposed.

Use:

- `@Script` for classes
- `@Register` for functions
- `@Visible` for properties
- `@Emit` for signals

Nothing is picked up automatically just because it looks compatible.

Use this mode when you want every exposed class and member to be clearly marked in source code.

For properties, this means each annotation keeps its own role.

Example:

```kotlin
@Export
@Visible
@LongRange(1L, 2L)
var speed = 1L
```

Here:

- `@Visible` makes the property visible to Godot
- `@Export` makes it editable in the inspector
- `@LongRange` gives the editor extra guidance

In explicit mode, those are not interchangeable.
If you want all three effects, you write all three.

## `Inferred` mode

`Inferred` still centers around explicit registration, but removes some repetition.

### Custom registration annotations

You can define your own annotations that reuse the usual registration annotations.

That is useful when you want a shorter project-specific annotation instead of repeating the same set everywhere.

### Signals can be discovered automatically

In inferred mode, signal-like properties can be exposed even without `@Emit`.

`@Emit` is still useful when you want to name the signal parameters, but it is no longer required just to make the signal visible.

### Exported properties do not need `@Visible`

In inferred mode, `@Export` is enough to expose a property to Godot and the inspector.

That means:

```kotlin
@Export
var speed = 1L
```

is enough when you do not need anything else.

If you also want extra editor guidance, you can add it directly:

```kotlin
@Export
@LongRange(1L, 2L)
var speed = 1L
```

You can also write just:

```kotlin
@LongRange(1L, 2L)
var speed = 1L
```

because the built-in property annotations already imply the usual exported-property behavior in inferred mode.

### Common Godot overrides can be discovered automatically

When you override a method that already exists on a Godot base class, inferred mode can recognize that pattern and expose it without requiring an extra annotation every time.

This is mainly useful for common Godot callbacks.

Use this mode when you want explicit registration most of the time, but with less boilerplate.

## `Automatic` mode

`Automatic` is the most permissive mode.

In this mode, registration is mostly based on whether something looks like a valid Godot-facing class or member.

### Classes

A class that inherits a Godot base class can be picked up automatically.

### Functions and properties

Functions and properties can be picked up automatically as long as they use types that Godot can understand.

For properties, this means you can often write:

```kotlin
var speed = 1L
```

with no registration annotation at all.

If you want the property to show extra editor guidance, you can still add it:

```kotlin
@LongRange(1L, 2L)
var speed = 1L
```

And if you want it exported in the usual inspector-oriented sense, `@Export` is still available.

### Signals

Signals behave much like in inferred mode:

- signal-like members can be discovered automatically
- `@Emit` is still useful when you want to name the parameters

### Annotations still matter

Automatic mode does not mean annotations stop being useful.

They still let you be more precise when you want to:

- rename a class for Godot
- configure networking behavior on a function
- export a property with extra guidance for the editor
- name signal parameters

Use this mode when you want the least amount of annotation boilerplate while still keeping clear rules about what Godot can expose.

## Inheritance and overrides

All three modes share the same inheritance behavior.

### Inherited members stay available

If a parent class exposes a function, property, or signal, a child class keeps access to it.

That means you do not need to repeat a parent declaration in every subclass just to keep it available to Godot.

### Inheriting an exposed parent function

```kotlin
@Script
open class Parent : Node() {
    @Register
    fun doThing() {
    }
}

@Script
class Child : Parent()
```

`Child` still exposes `doThing()`.

The same idea applies to exposed properties and signals inherited from a parent.

### Overriding behavior only

```kotlin
@Script
open class Parent : Node() {
    @Register
    open fun doThing() {
        print("parent")
    }
}

@Script
class Child : Parent() {
    override fun doThing() {
        print("child")
    }
}
```

`Child` keeps `doThing()` exposed, but the child behavior runs.

If you only override the function body and do not add a new annotation, the child still changes the behavior, but keeps the parent's exposure rules.

### Overriding behavior and exposure

```kotlin
@Script
open class Parent : Node() {
    @Register
    open fun doThing() {
    }
}

@Script
class Child : Parent() {
    @Register
    override fun doThing() {
    }
}
```

Here the child not only replaces the behavior, but also becomes the declaration that defines how `doThing()` is exposed.

### The closest declaration wins

When the same member exists at several levels of the hierarchy, the closest declaration to the final class is the one that matters.

That means:

- a child override wins over the parent version
- a class member wins over an interface member
- a parent member is reused only when nothing closer replaces it

This keeps inheritance predictable and avoids duplicate exposed members.

## Summary

The three modes mainly differ in how much you need to mark yourself:

- `Explicit`: mark everything directly
- `Inferred`: still mostly explicit, but with less repetition
- `Automatic`: mostly discovered for you

What does not change is the inheritance behavior:

- exposed parent members remain available in children
- child overrides replace parent behavior
- the closest declaration wins

