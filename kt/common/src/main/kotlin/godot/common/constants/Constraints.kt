package godot.common.constants

// when changed; also update constraints.h!
// Since Godot 4, an unlimited amount of parameters is supported. Limits should be increased when appropriate.
object Constraints {
    const val MAX_CONSTRUCTOR_ARG_COUNT = 8
    const val MAX_FUNCTION_ARG_COUNT = 16
    const val MAX_SIGNAL_ARG_COUNT = 16
}
