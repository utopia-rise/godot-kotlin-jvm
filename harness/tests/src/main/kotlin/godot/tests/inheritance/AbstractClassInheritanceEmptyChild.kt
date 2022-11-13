package godot.tests.inheritance

import godot.annotation.RegisterClass

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
@RegisterClass
class AbstractClassInheritanceEmptyChild: AbstractClassInheritanceEmptyParent()
