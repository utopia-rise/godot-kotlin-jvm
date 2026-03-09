package godot.codegen.exceptions

class MetaNotFoundException(meta: String) : Exception("Cannot find meta $meta")