package godot.codegen.exceptions

class NoMatchingClassFoundException(className: String) : Exception("Class $className not found")