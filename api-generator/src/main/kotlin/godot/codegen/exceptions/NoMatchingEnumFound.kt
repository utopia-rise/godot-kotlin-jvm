package godot.codegen.exceptions

class NoMatchingEnumFound(enumName: String) : Exception("Cannot find enum $enumName")