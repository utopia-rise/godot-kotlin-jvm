package godot.tests.inheritance

import godot.annotation.GodotScript

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
@GodotScript
class AbstractClassInheritanceEmptyChild: AbstractClassInheritanceEmptyParent()
