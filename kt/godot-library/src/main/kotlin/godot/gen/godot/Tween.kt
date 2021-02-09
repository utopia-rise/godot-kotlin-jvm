// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal2
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Tween : Node() {
  val tweenAllCompleted: Signal0 by signal()

  val tweenCompleted: Signal2<Object, NodePath> by signal("object", "key")

  val tweenStarted: Signal2<Object, NodePath> by signal("object", "key")

  val tweenStep: Signal4<Object, NodePath, Double, Object> by signal("object", "key", "elapsed",
      "value")

  open var playbackProcessMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_PLAYBACK_PROCESS_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PLAYBACK_PROCESS_MODE,
          NIL)
    }

  open var playbackSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_PLAYBACK_SPEED, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PLAYBACK_SPEED, NIL)
    }

  open var repeat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_REPEAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_REPEAT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TWEEN)

  open fun _removeByUid(uid: Long) {
  }

  open fun followMethod(
    _object: Object,
    method: String,
    initialVal: Any,
    target: Object,
    targetMethod: String,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, ANY to initialVal, OBJECT to
        target, STRING to targetMethod, DOUBLE to duration, LONG to transType, LONG to easeType,
        DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_FOLLOW_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun followProperty(
    _object: Object,
    property: NodePath,
    initialVal: Any,
    target: Object,
    targetProperty: NodePath,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to initialVal,
        OBJECT to target, NODE_PATH to targetProperty, DOUBLE to duration, LONG to transType, LONG
        to easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_FOLLOW_PROPERTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getRuntime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_RUNTIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun interpolateCallback(
    _object: Object,
    duration: Double,
    callback: String,
    arg1: Any? = null,
    arg2: Any? = null,
    arg3: Any? = null,
    arg4: Any? = null,
    arg5: Any? = null
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, DOUBLE to duration, STRING to callback, ANY to
        arg1, ANY to arg2, ANY to arg3, ANY to arg4, ANY to arg5)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_CALLBACK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun interpolateDeferredCallback(
    _object: Object,
    duration: Double,
    callback: String,
    arg1: Any? = null,
    arg2: Any? = null,
    arg3: Any? = null,
    arg4: Any? = null,
    arg5: Any? = null
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, DOUBLE to duration, STRING to callback, ANY to
        arg1, ANY to arg2, ANY to arg3, ANY to arg4, ANY to arg5)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_DEFERRED_CALLBACK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun interpolateMethod(
    _object: Object,
    method: String,
    initialVal: Any,
    finalVal: Any,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, ANY to initialVal, ANY to
        finalVal, DOUBLE to duration, LONG to transType, LONG to easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun interpolateProperty(
    _object: Object,
    property: NodePath,
    initialVal: Any,
    finalVal: Any,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to initialVal, ANY
        to finalVal, DOUBLE to duration, LONG to transType, LONG to easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_PROPERTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun remove(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_REMOVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_REMOVE_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun reset(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESET, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun resetAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESET_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun resume(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESUME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun resumeAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESUME_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun seek(time: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SEEK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_ACTIVE, NIL)
  }

  open fun start(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_START, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun stop(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_STOP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun stopAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_STOP_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun targetingMethod(
    _object: Object,
    method: String,
    initial: Object,
    initialMethod: String,
    finalVal: Any,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, OBJECT to initial, STRING to
        initialMethod, ANY to finalVal, DOUBLE to duration, LONG to transType, LONG to easeType,
        DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TARGETING_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun targetingProperty(
    _object: Object,
    property: NodePath,
    initial: Object,
    initialVal: NodePath,
    finalVal: Any,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, OBJECT to initial,
        NODE_PATH to initialVal, ANY to finalVal, DOUBLE to duration, LONG to transType, LONG to
        easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TARGETING_PROPERTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun tell(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TELL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  enum class TransitionType(
    id: Long
  ) {
    TRANS_LINEAR(0),

    TRANS_SINE(1),

    TRANS_QUINT(2),

    TRANS_QUART(3),

    TRANS_QUAD(4),

    TRANS_EXPO(5),

    TRANS_ELASTIC(6),

    TRANS_CUBIC(7),

    TRANS_CIRC(8),

    TRANS_BOUNCE(9),

    TRANS_BACK(10);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TweenProcessMode(
    id: Long
  ) {
    TWEEN_PROCESS_PHYSICS(0),

    TWEEN_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EaseType(
    id: Long
  ) {
    EASE_IN(0),

    EASE_OUT(1),

    EASE_IN_OUT(2),

    EASE_OUT_IN(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val EASE_IN: Long = 0

    final const val EASE_IN_OUT: Long = 2

    final const val EASE_OUT: Long = 1

    final const val EASE_OUT_IN: Long = 3

    final const val TRANS_BACK: Long = 10

    final const val TRANS_BOUNCE: Long = 9

    final const val TRANS_CIRC: Long = 8

    final const val TRANS_CUBIC: Long = 7

    final const val TRANS_ELASTIC: Long = 6

    final const val TRANS_EXPO: Long = 5

    final const val TRANS_LINEAR: Long = 0

    final const val TRANS_QUAD: Long = 4

    final const val TRANS_QUART: Long = 3

    final const val TRANS_QUINT: Long = 2

    final const val TRANS_SINE: Long = 1

    final const val TWEEN_PROCESS_IDLE: Long = 1

    final const val TWEEN_PROCESS_PHYSICS: Long = 0
  }
}
