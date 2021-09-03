package godot.gradle.exception

class D8ToolNotFoundException : IllegalArgumentException(
    "d8 tool not set! Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the d8ToolPath. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android"
)
