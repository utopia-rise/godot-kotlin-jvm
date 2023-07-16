package godot.gradle.exception

class GraalNativeImageToolNotFountException : IllegalArgumentException(
    "native-image tool not set! Make sure you've either set the GRAALVM_HOME environment variable or set the graalVmDirectory. For more information, visit: https://godot-kotl.in/en/stable/user-guide/advanced/graal-vm-native-image"
)
