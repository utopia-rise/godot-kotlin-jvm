package godot.tests.inheritance

import godot.annotation.script

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
@script
class AbstractClassInheritanceEmptyChild: AbstractClassInheritanceEmptyParent()
