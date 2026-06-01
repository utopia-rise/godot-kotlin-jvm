package godot.annotation.processor.classgraph.exceptions

import io.github.classgraph.ClassInfo

class LanguageNotIdentified(classInfo: ClassInfo) : IllegalStateException(
    "Could not identify JVM source language for ${classInfo.name}"
)
