import godot.Node
import godot.Spatial
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.Dictionary
import godot.core.Vector3

@RegisterClass
class ScriptInOtherSourceDir: Node() {

    @RegisterProperty
    var spatial = Spatial()
    var vectorList = listOf(Vector3.FORWARD)
    var dictionary = Dictionary<Int, Vector3>().apply {
        set(0, Vector3.FORWARD)
    }

    @RegisterFunction
    fun localCopyCheck() {
        spatial.rotation.x = 5.0
        spatial.rotation[0] = 5.0
        vectorList[0].x = 5.0
        vectorList[0][0] = 5.0
        dictionary[0].x = 5.0
        dictionary[0][0] = 5.0

        val blubbAllowed = Vector3()
        blubbAllowed[0] = 5.0

        val blubbAllowedAsAssignedLater = spatial.rotation
        blubbAllowedAsAssignedLater[0] = 5.0

        val blubbNotAllowed = spatial.rotation
        blubbNotAllowed[0] = 5.0

        val anotherSpatial = Spatial()
        anotherSpatial.rotation = blubbAllowedAsAssignedLater
    }

	@RegisterFunction
	fun greeting() = "HelloWorld"
}
