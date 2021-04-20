# Godot Kotlin EntryGenerator

## Overview

This is the entry generator which is called by the annotation processor within the corresponding project. It takes the
annotated classes, properties, functions and generates the entry file from them. This step is crucial, so the end user
does not have to write all the registration glue code by himself.

## Debug entry generation (KotlinCompilerPlugin in general)
- Build a sample project with `./gradlew build --no-daemon -Dorg.gradle.debug=true -Dkotlin.compiler.execution.strategy="in-process" -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"`
- Attach remote debugger to process (a preconfigured run configuration for it is present in the sample project `tests` called `DebugEntryGenerator` in the project [Kotlin/Jvm](https://github.com/utopia-rise/godot-jvm/. Copy it from there if you don't want to configure your own))

Note: Compilation with attached debugger will be way slower. Especially for the initial build. So be patient. It takes some time until it hits your breakpoints.

## Example
```kotlin
@RegisterClass
class Invocation : Spatial() {
    @RegisterSignal
    val signalOneParam by signal<Boolean>("refresh")

    @RegisterProperty
    var x = 0

    @RegisterFunction
    fun _ready() {
    }
}
```

will produce:  

JVM:
```kotlin
// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

/*
imports omitted for simplicity of this example
*/

class Entry : Entry() {
  override fun Context.init() {
    with(registry) {
      registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial", false) {
        constructor(KtConstructor0(::Invocation))
        function(Invocation::_ready, ::KtVariant, KtFunctionArgument(NIL, "Unit"))
        signal(Invocation::signalOneParam, KtFunctionArgument(BOOL, "Boolean"))
        property(Invocation::x, ::KtVariant, KtVariant::asInt, LONG, "Int", NONE, "")
      }
      registerEngineTypes()
    }
  }
}
```  

Kotlin/Native:  
```kotlin
// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
@file:Suppress("EXPERIMENTAL_API_USAGE")

package godot

/*
imports omitted for simplicity of this example
*/

@CName("godot_gdnative_init")
fun GDNativeInit(options: godot_gdnative_init_options) {
  Godot.init(options)
}

@CName("godot_gdnative_terminate")
fun GDNativeTerminate(options: godot_gdnative_terminate_options) {
  Godot.terminate(options)
}

@CName("godot_nativescript_init")
fun NativeScriptInit(handle: COpaquePointer) {
  Godot.nativescriptInit(handle)
  with(ClassRegistry(handle)) {
    registerClass("example.Invocation", "Spatial", ::Invocation, false) {
      function("_ready", DISABLED, Invocation::_ready, { Variant() })
      signal("signalOneParam", mapOf("refresh" to BOOL))
      property("x", Invocation::x, getTypeToVariantConversionFunction<Int>(), getVariantToTypeConversionFunction<Int>(), INT, Variant(0), true, DISABLED, GODOT_PROPERTY_HINT_NONE, "")
    }
    registerClass("example.TextureSample", "Spatial", ::TextureSample, false) {
      function("_ready", DISABLED, TextureSample::_ready, { Variant() })
      property("nodePath", TextureSample::nodePath, getTypeToVariantConversionFunction<CoreType>(), getVariantToTypeConversionFunction<NodePath>(), NODE_PATH, null, true, DISABLED, GODOT_PROPERTY_HINT_NONE, "")
      property("texture", TextureSample::texture, getTypeToVariantConversionFunction<Object>(), getVariantToTypeConversionFunction<godot.Object>(), OBJECT, null, true, DISABLED, GODOT_PROPERTY_HINT_RESOURCE_TYPE, "Texture")
    }
  }
}

@CName("godot_nativescript_terminate")
fun NativeScriptTerminate(handle: COpaquePointer) {
  Godot.nativescriptTerminate(handle)
}
```
