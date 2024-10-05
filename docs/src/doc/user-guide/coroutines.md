## Using Kotlin coroutines in Godot

Coroutines are an opt-in feature that require an additional import in Kotlin. 
We follow the same logic and keep them separated from the main library. 

To use it, you need to add the following to your build.gradle:

```kotlin
godot {
    isGodotCoroutinesEnabled.set(true)
}
```

It will automatically import our coroutine library and `kotlinx.coroutine` as a dependency.
That library adds a Godot specific coroutine scope and extensions to signals. 
To use them, you simply need to write the following:

```kotlin
fun myMethod() = godotCoroutine {
    doSomething()
    mySignal.await() // the current coroutine will suspend until that signal is emitted.
    doSomething2()
}
```
