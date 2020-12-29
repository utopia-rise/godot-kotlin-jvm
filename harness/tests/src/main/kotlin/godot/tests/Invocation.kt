package godot.tests

import godot.NavigationMesh
import godot.Node
import godot.Object
import godot.Spatial
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.*
import godot.signals.signal
import godot.util.RealT
import org.joda.time.DateTime

@RegisterClass
class OtherScript : Node() {

    @RegisterFunction
    fun hookNoParam() {
        println("Hook was called with no param.")
    }

    @RegisterFunction
    fun hookOneParam(b: Boolean) {
        println("Hook was called with parameter: $b")
    }

    @RegisterFunction
    fun hookTwoParam(str: String, inv: Spatial) {
        println("Hook was called with parameters: $str, $inv")
    }

//		This will fail with:
//		class godot.Spatial cannot be cast to class godot.tests.Invocation.
//		This needs the use of user defined constructors when crossing boundaries
//		see: KtVariant::asObject() and Bootstrap::registerManagedEngineTypes methods.
//
//	fun hookTwoParam(str: String, inv: Invocation) {
//		println("Hook was calles with parameters: $str, $inv")
//	}

}

enum class TestEnum {
    ENUM_1
}

@RegisterClass
class Invocation : Spatial() {
    @RegisterProperty
    var x = 0

    @RegisterProperty
    var y = 0.0

    @RegisterProperty
    var z = 0.0f

    @RegisterProperty
    var customName = "Idonthaveanyidea"

    var invocation = OtherScript()

    @RegisterProperty
    var enumTest = TestEnum.ENUM_1

    @RegisterProperty
    var resourceTest = NavigationMesh()

    @RegisterProperty
    var jvmId: Int = 0
        get() = hashCode()
        set(value) {
            field = hashCode()
        }

    @RegisterProperty
    var testArrayAny = VariantArray<Any>()

    @RegisterProperty
    var navMeshes = variantArrayOf(NavigationMesh())

    @RegisterProperty
    var nullableArray = variantArrayOf(NavigationMesh(), null)

    @RegisterProperty
    var anyToAnyDictionary = Dictionary<Any, Any>()

    @RegisterProperty
    var navMeshesDictionary = dictionaryOf("AwesomeNavmesh" to NavigationMesh())

    @RegisterProperty
    var nullableDictionary = dictionaryOf(
            "notnull" to NavigationMesh(),
            "null" to null
    )

    @RegisterProperty
    var color = Color()

    @RegisterProperty
    var rid = RID()

    @RegisterProperty
    var poolByteArray = PoolByteArray()

    @RegisterProperty
    var poolIntArray = PoolIntArray()

    @RegisterProperty
    var poolRealArray = PoolRealArray()

    @RegisterProperty
    var poolColorArray = PoolColorArray()

    @RegisterProperty
    var poolStringArray = PoolStringArray()

    @RegisterProperty
    var poolVector2Array = PoolVector2Array()

    @RegisterProperty
    var poolVector3Array = PoolVector3Array()

    @RegisterSignal
    val signalNoParam by signal()

    @RegisterSignal
    val signalOneParam by signal<Boolean>("refresh")

    @RegisterSignal
    val signalTwoParam by signal<String, Invocation>("str", "inv")

    @RegisterFunction
    fun intValue(value: Int) = value

    @RegisterFunction
    fun longValue(value: Long) = value

    @RegisterFunction
    fun floatValue(value: Float) = value

    @RegisterFunction
    fun doubleValue(value: Double) = value

    @RegisterFunction
    fun booleanValue(value: Boolean) = value

    @RegisterFunction
    fun stringValue(value: String) = value

    @RegisterFunction
    fun intAddition(a: Int, b: Int) = a + b

    @RegisterFunction
    fun _enterTree() {
        println("Enter tree !")
        println("Instance id: ${getInstanceId()}")
        println("CustomName is $customName")
    }

    @RegisterFunction
    fun _ready() {
        val formerName = name
        println("Name is: $name")
        name = "TestName"
        println("Name is: $name")
        name = formerName
        val test = DateTime.now() //external dependency to test dependency inclusion in dummyCompilation

        signalNoParam.connect(invocation, invocation::hookNoParam)
        signalOneParam.connect(invocation, invocation::hookOneParam)
        signalTwoParam.connect(invocation, invocation::hookTwoParam)
        signalNoParam.emit()
        signalOneParam.emit(false)
        signalTwoParam.emit("My Awesome param !", this)

        println("NavMesh instance id before re-assign: ${resourceTest.getInstanceId()}")
        resourceTest = NavigationMesh()
        println("NavMesh instance id after re-assign: ${resourceTest.getInstanceId()}")
        resourceTest = NavigationMesh()
        println("NavMesh instance id after re-re-assign: ${resourceTest.getInstanceId()}")
    }

    override fun _onInit() {
        println("Hello Invocation!")
    }

    override fun _onDestroy() {
        invocation.free()
    }

    @RegisterFunction
    fun getRidId() = rid.id

    @RegisterFunction
    fun getNavMeshRid() = resourceTest.getId()

    @RegisterFunction
    fun appendToAnyDict(key: Any, value: Any) {
        anyToAnyDictionary[key] = value
    }

    @RegisterFunction
    fun removeFromAnyDict(key: Any) {
        anyToAnyDictionary.remove(key)
    }

    @RegisterFunction
    fun getFromAnyDict(key: Any) = anyToAnyDictionary[key]

    @RegisterFunction
    fun anyDictSize() = anyToAnyDictionary.size

    @RegisterFunction
    fun appendToStringNavMeshDict(key: String, value: NavigationMesh) {
        navMeshesDictionary[key] = value
    }

    @RegisterFunction
    fun removeFromStringNavMeshDict(key: String) {
        navMeshesDictionary.remove(key)
    }

    @RegisterFunction
    fun getFromStringNavMeshDict(key: String) = navMeshesDictionary[key]

    @RegisterFunction
    fun stringNavMeshDictSize() = navMeshesDictionary.size

    @RegisterFunction
    fun appendToStringNavMeshNullableDict(key: String, value: NavigationMesh) {
        nullableDictionary[key] = value
    }

    @RegisterFunction
    fun removeFromStringNavMeshNullableDict(key: String) {
        nullableDictionary.remove(key)
    }

//	TODO: This will fail to register as we cannot register nullable return type
//	@RegisterFunction
//	fun getFromStringNavMeshNullableDict(key: String) = nullableDictionary[key]

    @RegisterFunction
    fun stringNavMeshNullableDictSize() = nullableDictionary.size

    @RegisterFunction
    fun appendNullableStandardNavMesh() = nullableArray.append(NavigationMesh())

    @RegisterFunction
    fun appendNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.append(navigationMesh)

    @RegisterFunction
    fun removeNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.remove(navigationMesh)

    @RegisterFunction
    fun removeNullableNavMeshWithIndex(index: Int) = nullableArray.remove(index)

//	TODO: This will fail to register as we cannot register nullable return type
//	@RegisterFunction
//	fun getNullableNavMeshFromArray(index: Int) = nullableArray[index]

    @RegisterFunction
    fun nullableNavMeshesSize() = nullableArray.size

    @RegisterFunction
    fun appendStandardNavMesh() = navMeshes.append(NavigationMesh())

    @RegisterFunction
    fun appendNavMesh(navigationMesh: NavigationMesh) = navMeshes.append(navigationMesh)

    @RegisterFunction
    fun removeNavMesh(navigationMesh: NavigationMesh) = navMeshes.remove(navigationMesh)

    @RegisterFunction
    fun removeNavMeshWithIndex(index: Int) = navMeshes.remove(index)

    @RegisterFunction
    fun getNavMeshFromArray(index: Int) = navMeshes[index]

    @RegisterFunction
    fun navMeshesSize() = navMeshes.size

    @RegisterFunction
    fun appendAnyToArray(any: Any) = testArrayAny.append(any)

    @RegisterFunction
    fun removeAnyFromArray(any: Any) = testArrayAny.remove(any)

    @RegisterFunction
    fun getAnyFromArray(index: Int) = testArrayAny[index]

    @RegisterFunction
    fun arrayAnySize() = testArrayAny.size

    @RegisterFunction
    fun countNameshInstance(navigationMesh: NavigationMesh) = navMeshes.count(navigationMesh)

    @RegisterFunction
    fun getNavMeshCount() = navMeshes.count()

    //Type cast checks
    @RegisterFunction
    fun parentIsSpatial() = getParent() is Spatial

    @RegisterFunction
    fun isObjectSpatial(obj: Object) = obj is Spatial

    @RegisterFunction
    fun otherJvmId(invocation: Invocation) = invocation.jvmId

    @RegisterFunction
    fun hasCameraNode() = getNodeOrNull(NodePath("Camera")) != null

    @RegisterFunction
    fun addByteToPoolArray(byte: Byte) = poolByteArray.append(byte)

    @RegisterFunction
    fun addByteArrayToPoolArray(array: PoolByteArray) = poolByteArray.appendArray(array)

    @RegisterFunction
    fun deleteByteFromPoolArray(index: Int) = poolByteArray.remove(index)

    @RegisterFunction
    fun getByteFromPoolArray(index: Int) = poolByteArray[index]

    @RegisterFunction
    fun addColorToPoolArray(color: Color) = poolColorArray.append(color)

    @RegisterFunction
    fun addColorArrayToPoolArray(colorArray: PoolColorArray) = poolColorArray.appendArray(colorArray)

    @RegisterFunction
    fun deleteColorFromPoolArray(index: Int) = poolColorArray.remove(index)

    @RegisterFunction
    fun getColorFromPoolArray(index: Int) = poolColorArray[index]

    @RegisterFunction
    fun addIntToPoolArray(int: Int) = poolIntArray.append(int)

    @RegisterFunction
    fun addIntArrayToPoolArray(intArray: PoolIntArray) = this.poolIntArray.appendArray(intArray)

    @RegisterFunction
    fun deleteIntFromPoolArray(index: Int) = poolIntArray.remove(index)

    @RegisterFunction
    fun getIntFromPoolArray(index: Int) = poolIntArray[index]

    @RegisterFunction
    fun addRealToPoolArray(realT: RealT) = poolRealArray.append(realT)

    @RegisterFunction
    fun addRealArrayToPoolArray(realArray: PoolRealArray) = poolRealArray.appendArray(realArray)

    @RegisterFunction
    fun deleteRealFromPoolArray(index: Int) = poolRealArray.remove(index)

    @RegisterFunction
    fun getRealFromPoolArray(index: Int) = poolRealArray[index]

    @RegisterFunction
    fun addStringToPoolArray(string: String) = poolStringArray.append(string)

    @RegisterFunction
    fun addStringArrayToPoolArray(stringArray: PoolStringArray) = poolStringArray.appendArray(stringArray)

    @RegisterFunction
    fun deleteStringFromPoolArray(index: Int) = poolStringArray.remove(index)

    @RegisterFunction
    fun getStringFromPoolArray(index: Int) = poolStringArray[index]

    @RegisterFunction
    fun addVector2ToPoolArray(vector2: Vector2) = poolVector2Array.append(vector2)

    @RegisterFunction
    fun addVector2ArrayToPoolArray(vector2Array: PoolVector2Array) = poolVector2Array.appendArray(vector2Array)

    @RegisterFunction
    fun deleteVector2FromPoolArray(index: Int) = poolVector2Array.remove(index)

    @RegisterFunction
    fun getVector2FromPoolArray(index: Int) = poolVector2Array[index]

    @RegisterFunction
    fun addVector3ToPoolArray(vector3: Vector3) = poolVector3Array.append(vector3)

    @RegisterFunction
    fun addVector3ArrayToPoolArray(vector3Array: PoolVector3Array) = poolVector3Array.appendArray(vector3Array)

    @RegisterFunction
    fun deleteVector3FromPoolArray(index: Int) = poolVector3Array.remove(index)

    @RegisterFunction
    fun getVector3FromPoolArray(index: Int) = poolVector3Array[index]
}
