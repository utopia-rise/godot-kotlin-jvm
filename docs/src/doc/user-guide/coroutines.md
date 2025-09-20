## Using coroutines in Godot

!!! info
    Coroutines support in Godot Kotlin/JVM is currently Kotlin-only. Java and Scala can interoperate with Kotlin wrappers, but the coroutine helpers documented here are designed for Kotlin.

Coroutines are an opt-in feature that require an additional import in Kotlin. 
We follow the same logic and keep them separated from the main library. 

To use it, you need to add the following to your build.gradle:

```kotlin
godot {
    isGodotCoroutinesEnabled.set(true)
}
```

It will automatically import our coroutine library and `kotlinx.coroutines` as a dependency.
That library adds a Godot specific coroutine scope and extensions to signals. 
To use them, you simply need to write the following:

/// tab | Kotlin
```kotlin
fun myMethod() = godotCoroutine {
    doSomething()
    mySignal.await() // the current coroutine will suspend until that signal is emitted.
    doSomething2()
}
```
///

/// tab | Java
```java
// The Godot coroutine helpers are Kotlin-first.
// From Java, prefer calling Kotlin coroutine APIs exposed by a Kotlin wrapper.
```
///

/// tab | Scala
```scala
// The Godot coroutine helpers are Kotlin-first.
// From Scala, prefer calling Kotlin coroutine APIs exposed by a Kotlin wrapper.
```
///
