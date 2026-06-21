package godot.tests.registration

import godot.annotation.Script
import godot.api.Node
import godot.api.Object
import godot.api.RefCounted

@Script
class ObjectInstance : Object()

@Script
class RefCountedInstance : RefCounted()

@Script
class NodeInstance : Node()

