import godot.Spatial
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.Dictionary
import godot.core.Transform
import godot.core.Vector3
import godot.tests.Invocation
import godot.tests.TestEnum

@RegisterClass
class CopyModificationCheckTestClass: Spatial() {

    @RegisterProperty
    var spatial = Spatial()
    var vectorList = arrayListOf(Vector3.FORWARD)
    var dictionary = Dictionary<Int, Vector3>().apply {
        set(0, Vector3.FORWARD)
    }

    // Not allowed as it's a direct copy modification
    fun directCopyModification() {
        rotation.x = 5.0
        rotation[0] = 5.0
        spatial.rotation.x = 5.0
        spatial.rotation[0] = 5.0
        vectorList[0].x = 5.0
        vectorList[0][0] = 5.0
        dictionary[0].x = 5.0
        dictionary[0][0] = 5.0
    }

    // Allowed as it's instantiated with a constructor call
    fun constructorCallModification() {
        val vector = Vector3()
        vector[0] = 5.0
        vector.x = 5.0
    }

    // Allowed as it's instantiated with a constructor call
    fun constructorCallModificationThroughReference() {
        val vector = Vector3()
        val vectorRef = vector
        vectorRef[0] = 5.0
        vectorRef.x = 5.0
    }

    // Allowed as it's instantiated with a constructor call
    fun constructorCallModificationThroughPropertyAccess() {
        val vector = Invocation().vector
        fun vectorProvider() = vector
        vectorProvider()[0] = 5.0
        vectorProvider().x = 5.0
    }

    // Not allowed as it's a property received by copy
    fun copyModificationThroughThroughPropertyAccess() {
        val vector = Invocation().rotation
        fun vectorProvider() = vector
        vectorProvider()[0] = 5.0
        vectorProvider().x = 5.0
    }

    // All modifications allowed as `blubb` is assigned to something later
    fun randomModificationsAllowed() {
        val invocation = Invocation()
        var vector = invocation.transform.basis.x.x
        vector += 5.0
        vector -= 5.0
        vector *= 5.0
        vector /= 5.0
        vector %= 5.0
        vector++
        vector--
        println(vector)

        Spatial().transform = Transform().apply {
            basis.x = Vector3().apply {
                x = vector
            }
        }
    }

    // All modifications NOT allowed as `blubb` is never use later
    fun randomModificationsNotAllowed() {
        val invocation = Invocation()
        var vector = invocation.transform.basis.x.x
        vector += 5.0
        vector -= 5.0
        vector *= 5.0
        vector /= 5.0
        vector %= 5.0
        vector++
        vector--
        println(vector)
    }

    // Allowed as it's instantiated with a constructor call
    fun constructorCallModificationThroughReferenceAndFunctionCall() {
        val vector = Vector3()
        fun vectorProvider() = vector
        val vectorRefThroughProvider = vectorProvider()
        vectorRefThroughProvider[0] = 5.0
        vectorRefThroughProvider.x = 5.0
    }

    // Allowed as it's instantiated with a constructor call
    fun constructorCallModificationThroughReferenceAndFunctionCallWithBody() {
        val vector = Vector3()
        fun vectorProvider(): Vector3 {
            return vector
        }
        val vectorRefThroughProvider = vectorProvider()
        vectorRefThroughProvider[0] = 5.0
        vectorRefThroughProvider.x = 5.0
    }

    // Not allowed as it's a copy modification through some refs
    fun copyModificationThroughReferenceAndFunctionCallWithBody() {
        val vector = spatial.rotation
        fun vectorProvider(): Vector3 {
            return vector
        }
        val vectorRefThroughProvider = vectorProvider()
        vectorRefThroughProvider[0] = 5.0
        vectorRefThroughProvider.x = 5.0
    }

    // Allowed as it's always a modification of a vector crated locally
    fun constructorCallModificationThroughDifferentReturnBranches(decision: TestEnum) {
        val vector = Vector3()
        fun vectorProvider(): Vector3 {
            if (decision == TestEnum.ENUM_1) {
                return Vector3()
            }
            return vector
        }
        val vectorRefThroughProvider = vectorProvider()
        vectorRefThroughProvider[0] = 5.0
        vectorRefThroughProvider.x = 5.0
    }

    // Not allowed as one branch might return a copy of a vector
    fun copyModificationThroughDifferentReturnBranches(decision: TestEnum) {
        val vector = spatial.rotation
        fun vectorProvider(): Vector3 {
            if (decision == TestEnum.ENUM_1) {
                return Vector3()
            }
            return vector
        }
        val vectorRefThroughProvider = vectorProvider()
        vectorRefThroughProvider[0] = 5.0
        vectorRefThroughProvider.x = 5.0
    }

    // Allowed as `vectorCopy` is assigned later so the change of `x` actually has a use
    fun copyButAssignedLater() {
        val vectorCopy = spatial.rotation
        vectorCopy[0] = 5.0
        vectorCopy.x = 5.0

        val anotherSpatial = Spatial()
        anotherSpatial.rotation = vectorCopy
    }

    // Not allowed as modifying a local copy without using the modified local copy later.
    // We have to assume that the modification was done by "accident"
    fun copyModificationThroughReference() {
        val vectorCopy = spatial.rotation
        vectorCopy[0] = 5.0
        vectorCopy.x = 5.0
    }

    // allowed as convenience function
    fun objectHelperFunction() {
        spatial.rotation {
            x += 5.0
        }
    }

    fun collectionHelperFunction() {
        //TODO: once helper functions are merged
    }

    fun dictionaryHelperFunction() {
        //TODO: once helper functions are merged
    }
}
