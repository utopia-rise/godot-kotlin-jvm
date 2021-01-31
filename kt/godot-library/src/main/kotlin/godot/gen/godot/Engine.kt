// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object Engine : Object() {
  var editorHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_EDITOR_HINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_EDITOR_HINT, NIL)
    }

  var iterationsPerSecond: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_ITERATIONS_PER_SECOND,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_ITERATIONS_PER_SECOND,
          NIL)
    }

  var physicsJitterFix: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_PHYSICS_JITTER_FIX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_PHYSICS_JITTER_FIX,
          NIL)
    }

  var targetFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_TARGET_FPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_TARGET_FPS, NIL)
    }

  var timeScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_TIME_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_TIME_SCALE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_ENGINE)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun getAuthorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_AUTHOR_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getCopyrightInfo(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_COPYRIGHT_INFO, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getDonorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_DONOR_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getFramesDrawn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_FRAMES_DRAWN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getFramesPerSecond(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_FRAMES_PER_SECOND,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun getIdleFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_IDLE_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getLicenseInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_LICENSE_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getLicenseText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_LICENSE_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getMainLoop(): MainLoop? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_MAIN_LOOP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MainLoop?
  }

  fun getPhysicsFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_PHYSICS_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getPhysicsInterpolationFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__ENGINE_GET_PHYSICS_INTERPOLATION_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  fun getSingleton(name: String): Object? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_SINGLETON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  fun getVersionInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_VERSION_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun hasSingleton(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_HAS_SINGLETON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isInPhysicsFrame(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_IS_IN_PHYSICS_FRAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
