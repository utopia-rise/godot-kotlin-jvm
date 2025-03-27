package godot.tests.registration

import godot.annotation.RegisterClass
import godot.api.Node
import godot.api.Object
import godot.api.RefCounted

@RegisterClass
class ObjectInstance : Object()

@RegisterClass
class RefCountedInstance : RefCounted()

@RegisterClass
class NodeInstance : Node()
