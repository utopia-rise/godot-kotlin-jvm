import godot.Spatial
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.Dictionary
import godot.core.Transform
import godot.core.Vector3
import godot.core.variantArrayOf
import godot.tests.Invocation
import godot.tests.TestEnum

@RegisterClass
class CopyModificationCheckTestClass: Spatial() {

    @RegisterProperty
    var spatial = Spatial()
    var vectorList = variantArrayOf(Vector3.FORWARD)
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
        @Suppress("UnnecessaryVariable") // we want to keep this to test through multiple references
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

    // All modifications allowed as `vector` is assigned to something later
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

        @Suppress("UnnecessaryVariable")
        Spatial().transform = Transform().apply {
            basis {
                x {
                    Vector3().apply {
                        x = vector
                    }
                }
            }
        }
    }

    // All modifications NOT allowed as `vector` is never use later
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

    // Allowed as it's always a modification of a vector created locally
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

    // not allowed as globalTransform is a copy and it would not be set correctly to this (Spatial) again
    fun nextedHelperFunction() {
        globalTransform.origin {
            x += 3
        }
    }

    // allowed
    fun correctlyNestedHelperFunction() {
        globalTransform {
            origin {
                x += 3
            }
        }
    }

    // not allowed as origin in transform is a copy as well
    fun setCoreTypeInCoreType() {
        globalTransform {
            origin.x += 3
        }
    }

    // allowed
    fun collectionHelperFunction() {
        dictionary.get(0) {
            x += 3
        }

        vectorList.get(0) {
            x += 3
        }
    }

    // all allowed as pool arrays are not passed by value
    fun poolArrayFunctions() {
        Invocation().vectorList.pushBack(Vector3.FORWARD)
        Invocation().vectorList[0].x += 5

        @Suppress("ReplaceGetOrSet") // we explicitly want to test this case as well
        Invocation().vectorList.get(0).x += 5
        //TODO: once helper functions are merged
    }


    // allowed as no core type is used anywhere
    object Wrapper {
        val intHolder = IntHolder()
    }
    class IntHolder {
        val intValue = 1
    }
    fun regressionTextCallChainModificationFalsePositive() {
        var number = IntHolder().intValue.toDouble()
        number = 5.0

        var numberWithWrapper = Wrapper.intHolder.intValue
        numberWithWrapper = 5
    }
}
