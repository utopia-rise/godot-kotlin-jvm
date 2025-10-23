package godot.tests

import godot.api.Button
import godot.api.NavigationMesh
import godot.api.Node3D
import godot.api.Object
import godot.api.XRServer
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.annotation.EnumFlag
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.File
import godot.annotation.FloatRange
import godot.annotation.IntFlag
import godot.annotation.IntRange
import godot.annotation.LongRange
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.Color
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.dictionaryOf
import godot.core.variantArrayOf
import godot.registration.Range
import godot.tests.subpackage.OtherScript
import godot.common.util.RealT
import godot.extension.api.getNodeAs
import godot.extension.connectMethod
import org.joda.time.DateTime

enum class TestEnum {
    ENUM_1,
    ENUM_2
}

@RegisterClass
class Invocation : Node3D() {
    @Export
    @RegisterProperty
    lateinit var button: Button

    @Export
    @RegisterProperty
    var enumList = listOf(TestEnum.ENUM_1)

    @RegisterProperty
    var vectorList = PackedVector3Array()

    @Export
    @RegisterProperty
    var enumListMutable = mutableListOf(TestEnum.ENUM_1, TestEnum.ENUM_2)

    // Can't export nullable coretypes
    //@Export
    //@RegisterProperty
    //var nullableLong: Long? = null

    private var hasInitializedLateInits = false

    // Can't export nullable coretypes
    //@Export
    //@RegisterProperty
    //var lateinitString: String? = null

    @RegisterProperty
    lateinit var registerObject: OtherScript

    @RegisterProperty
    var registerObjectNullable: OtherScript? = null

    @RegisterProperty
    var registerObjectNullablePreInit: OtherScript? = OtherScript()
        set(value) {
            field?.free()
            field = value
        }

    @RegisterProperty
    var registerObjectNonNullablePreInit: OtherScript = OtherScript()
        set(value) {
            field.free()
            field = value
        }

    @RegisterProperty
    var vector = Vector3()

    @Export
    @RegisterProperty
    var x = 0

    @Export
    @RegisterProperty
    var y = 0.0

    @Export
    @RegisterProperty
    var z = 0.0f

    @Export
    @RegisterProperty
    var customName = "Idonthaveanyidea"

    //references in default values are allowed if the property is NOT exported
    private val otherScriptReference = OtherScript()
    private fun provideOtherScriptReference() = otherScriptReference

    @RegisterProperty
    var invocation = provideOtherScriptReference()

    @Export
    @RegisterProperty
    var enumTest = TestEnum.ENUM_1

    @Export
    @RegisterProperty
    var resourceTest = NavigationMesh()

    @Export
    @RegisterProperty
    var jvmId: Int = 0
        get() = hashCode()
        set(value) {
            field = hashCode()
        }

    @Export
    @RegisterProperty
    var testArrayAny = VariantArray<Any>()

    @Export
    @RegisterProperty
    var navMeshes = variantArrayOf(NavigationMesh())

    @Export
    @RegisterProperty
    var nullableArray = variantArrayOf(NavigationMesh(), null)

    @Export
    @RegisterProperty
    var anyToAnyDictionary = Dictionary<Any, Any>()

    @Export
    @RegisterProperty
    var navMeshesDictionary = dictionaryOf("AwesomeNavmesh" to NavigationMesh())

    @Export
    @RegisterProperty
    var nullableDictionary = dictionaryOf(
        "notnull" to NavigationMesh(),
        "null" to null
    )

    @Export
    @RegisterProperty
    var color = Color()

    @Export
    @RegisterProperty
    var rid = RID()

    @Export
    @RegisterProperty
    var packedByteArray = PackedByteArray()

    @Export
    @RegisterProperty
    var packedInt32Array = PackedInt32Array()

    @Export
    @RegisterProperty
    var packedFloat64Array = PackedFloat64Array()

    @Export
    @RegisterProperty
    var packedColorArray = PackedColorArray()

    @Export
    @RegisterProperty
    var packedStringArray = PackedStringArray()

    @Export
    @RegisterProperty
    var packedVector2Array = PackedVector2Array()

    @Export
    @RegisterProperty
    var packedVector3Array = PackedVector3Array()

    @Export
    @RegisterProperty
    @IntRange(1, 2)
    var p1 = 1

    @Export
    @RegisterProperty
    @LongRange(1L, 2L)
    var p1_1 = 1L

    @Export
    @RegisterProperty
    @FloatRange(1f, 2f)
    var p2 = 1f

    @Export
    @RegisterProperty
    @DoubleRange(1.0, 2.0)
    var p3 = 1.0

    @Export
    @RegisterProperty
    @DoubleRange(min = 1.0, max = 2.0, step = 0.1, or = Range.OR_GREATER, hideSlider = true, isDegrees = true, suffix = "MyCoolSuffix")
    var p4 = 1.0

    @Export
    @RegisterProperty
    @FloatRange(1f, 2f)
    var p5 = 1f

    @Export
    @RegisterProperty
    @EnumTypeHint
    var p6 = TestEnum.ENUM_1

    @Export
    @RegisterProperty
    @ExpEasing
    var p7 = 1f

    @Export
    @RegisterProperty
    @ExpEasing
    var p8 = 1.0

    @Export
    @RegisterProperty
    @EnumFlag
    var p9 = setOf(TestEnum.ENUM_1)

    @Export
    @RegisterProperty
    @EnumFlag
    var p10 = mutableSetOf(TestEnum.ENUM_1)

    @Export
    @RegisterProperty
    @EnumFlag
    var p11 = mutableSetOf<TestEnum>()

    @Export
    @RegisterProperty
    @IntFlag
    var p12 = 1 or 2 and 3

    @Export
    @RegisterProperty
    @File
    var p13 = "someFile"

    @Export
    @RegisterProperty
    @Dir
    var p14 = "someDir"

    @Export
    @RegisterProperty
    @MultilineText
    var p15 = """
		some
		multiline
		text
	""".trimIndent()

    @Export
    @RegisterProperty
    @PlaceHolderText
    var p16 = "some placeholderText"

    @Export
    @RegisterProperty
    @ColorNoAlpha
    var p17 = Color()

    @Export
    @RegisterProperty
    var stringtemplation = "blubb ${17 + 25}"

    @Export
    @RegisterProperty
    var testString = "Two eggs in a boiler. One says: it's hot here, isn't ? The other: oh my god, an egg talking!"

    @Export
    @RegisterProperty
    var asciiString = ""

    @Export
    @RegisterProperty
    var utf8String = ""

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
    fun initNullables() {
        registerObject = OtherScript()
        registerObjectNullable = OtherScript()
        hasInitializedLateInits = true
    }

    @RegisterFunction
    override fun _enterTree() {
        //TODO: uncomment once https://github.com/utopia-rise/godot-kotlin-jvm/issues/86 is fixed
//        GD.print("Hello", "Hello")
//        GD.printErr("Hello", "Hello")
//        GD.printRaw("Hello", "Hello")
//        GD.printStack()
//        GD.prints("1", "2")
//        GD.printt("1", "2")
        println("Enter tree !")
        println("Instance id: ${getInstanceId()}")
        println("CustomName is $customName")
    }

    @RegisterFunction
    override fun _ready() {
        val formerName = name
        println("Name is: $name")
        setName("TestName")
        println("Name is: $name")
        setName(formerName.toString())

        val test = DateTime.now() //external dependency to test dependency inclusion in main compilation

        val getNode = getNodeAs<Button>("CanvasLayer/Button")

        val path = NodePath("CanvasLayer/Button")
        val getNode2 = getNodeAs<Button>(path)

        (getNodeOrNull(path) as Button?)?.pressed?.connectMethod(
            invocation,
            OtherScript::hookNoParam
        )

        println("NavMesh instance id before re-assign: ${resourceTest.getInstanceId()}")
        resourceTest = NavigationMesh()
        println("NavMesh instance id after re-assign: ${resourceTest.getInstanceId()}")
        resourceTest = NavigationMesh()
        println("NavMesh instance id after re-re-assign: ${resourceTest.getInstanceId()}")

        //Just there to register static instances in the GC
        GodotStaticDelegateTest.myScene
        GodotStaticDelegateTest.ref
    }

    init {
        println("Hello Invocation!")
    }

    override fun _onDestroy() {
        invocation.free()
        if (hasInitializedLateInits) {
            registerObject.free()
        }
        registerObjectNullable?.free()
        registerObjectNullablePreInit?.free()
        registerObjectNonNullablePreInit.free()
    }

    @RegisterFunction
    fun getRidId() = rid.id

    @RegisterFunction
    fun getNavMeshRid() = resourceTest.getRid()

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
    fun removeNullableNavMeshWithIndex(index: Int) = nullableArray.removeAt(index)

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
    fun removeNavMeshWithIndex(index: Int) = navMeshes.removeAt(index)

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
    fun parentIsNode3D() = getParent() is Node3D

    @RegisterFunction
    fun isObjectNode3D(obj: Object) = obj is Node3D

    @RegisterFunction
    fun otherJvmId(invocation: Invocation) = invocation.jvmId

    @RegisterFunction
    fun hasCameraNode() = getNodeOrNull(NodePath("Camera")) != null

    @RegisterFunction
    fun addByteToPackedArray(byte: Byte) = packedByteArray.append(byte)

    @RegisterFunction
    fun addByteArrayToPackedArray(array: PackedByteArray) = packedByteArray.appendArray(array)

    @RegisterFunction
    fun deleteByteFromPackedArray(index: Int) = packedByteArray.removeAt(index)

    @RegisterFunction
    fun getByteFromPackedArray(index: Int) = packedByteArray[index]

    @RegisterFunction
    fun setByteInPackedArray(index: Int, value: Byte) {
        packedByteArray[index] = value
    }

    @RegisterFunction
    fun resizeBytePackedArray(newSize: Int) {
        packedByteArray.resize(newSize)
    }

    @RegisterFunction
    fun addColorToPackedArray(color: Color) = packedColorArray.append(color)

    @RegisterFunction
    fun addColorArrayToPackedArray(colorArray: PackedColorArray) = packedColorArray.appendArray(colorArray)

    @RegisterFunction
    fun deleteColorFromPackedArray(index: Int) = packedColorArray.removeAt(index)

    @RegisterFunction
    fun getColorFromPackedArray(index: Int) = packedColorArray[index]

    @RegisterFunction
    fun setColorInPackedArray(index: Int, color: Color) {
        packedColorArray[index] = color
    }

    @RegisterFunction
    fun resizeColorPackedArray(newSize: Int) {
        packedColorArray.resize(newSize)
    }

    @RegisterFunction
    fun addIntToPackedArray(int: Int) = packedInt32Array.append(int)

    @RegisterFunction
    fun addIntArrayToPackedArray(intArray: PackedInt32Array) = this.packedInt32Array.appendArray(intArray)

    @RegisterFunction
    fun deleteIntFromPackedArray(index: Int) = packedInt32Array.removeAt(index)

    @RegisterFunction
    fun getIntFromPackedArray(index: Int) = packedInt32Array[index]

    @RegisterFunction
    fun setIntInPackedArray(index: Int, value: Int) {
        packedInt32Array[index] = value
    }

    @RegisterFunction
    fun resizeIntPackedArray(newSize: Int) {
        packedInt32Array.resize(newSize)
    }

    @RegisterFunction
    fun addRealToPackedArray(realT: RealT) = packedFloat64Array.append(realT)

    @RegisterFunction
    fun addRealArrayToPackedArray(realArray: PackedFloat64Array) = packedFloat64Array.appendArray(realArray)

    @RegisterFunction
    fun readStringFromByteArray() {

        val asciiArray = testString.toByteArray(Charsets.US_ASCII)
        val packed1 = PackedByteArray()
        for (char in asciiArray) {
            packed1.append(char)
        }
        asciiString = packed1.getStringFromAscii()

        val utf8Array = testString.toByteArray(Charsets.UTF_8)
        val packed2 = PackedByteArray()
        for (char in utf8Array) {
            packed2.append(char)
        }
        utf8String = packed2.getStringFromUtf8()
    }

    @RegisterFunction
    fun deleteRealFromPackedArray(index: Int) = packedFloat64Array.removeAt(index)

    @RegisterFunction
    fun getRealFromPackedArray(index: Int) = packedFloat64Array[index]

    @RegisterFunction
    fun setRealInPackedArray(index: Int, value: Double) {
        packedFloat64Array[index] = value
    }

    @RegisterFunction
    fun resizeRealPackedArray(newSize: Int) {
        packedFloat64Array.resize(newSize)
    }

    @RegisterFunction
    fun addStringToPackedArray(string: String) = packedStringArray.append(string)

    @RegisterFunction
    fun addStringArrayToPackedArray(stringArray: PackedStringArray) = packedStringArray.appendArray(stringArray)

    @RegisterFunction
    fun deleteStringFromPackedArray(index: Int) = packedStringArray.removeAt(index)

    @RegisterFunction
    fun getStringFromPackedArray(index: Int) = packedStringArray[index]

    @RegisterFunction
    fun setStringInPackedArray(index: Int, value: String) {
        packedStringArray[index] = value
    }

    @RegisterFunction
    fun resizeStringPackedArray(newSize: Int) {
        packedStringArray.resize(newSize)
    }

    @RegisterFunction
    fun addVector2ToPackedArray(vector2: Vector2) = packedVector2Array.append(vector2)

    @RegisterFunction
    fun addVector2ArrayToPackedArray(vector2Array: PackedVector2Array) = packedVector2Array.appendArray(vector2Array)

    @RegisterFunction
    fun deleteVector2FromPackedArray(index: Int) = packedVector2Array.removeAt(index)

    @RegisterFunction
    fun getVector2FromPackedArray(index: Int) = packedVector2Array[index]

    @RegisterFunction
    fun setVector2InPackedArray(index: Int, vector2: Vector2) {
        packedVector2Array[index] = vector2
    }

    @RegisterFunction
    fun resizeVector2PackedArray(newSize: Int) {
        packedVector2Array.resize(newSize)
    }

    @RegisterFunction
    fun addVector3ToPackedArray(vector3: Vector3) = packedVector3Array.append(vector3)

    @RegisterFunction
    fun addVector3ArrayToPackedArray(vector3Array: PackedVector3Array) = packedVector3Array.appendArray(vector3Array)

    @RegisterFunction
    fun deleteVector3FromPackedArray(index: Int) = packedVector3Array.removeAt(index)

    @RegisterFunction
    fun getVector3FromPackedArray(index: Int) = packedVector3Array[index]

    @RegisterFunction
    fun setVector3InPackedArray(index: Int, vector3: Vector3) {
        packedVector3Array[index] = vector3
    }

    @RegisterFunction
    fun resizeVector3PackedArray(newSize: Int) {
        packedVector3Array.resize(newSize)
    }

    // Singleton tests

    @RegisterFunction
    fun isSentXrSameInstanceAsJvmSingleton(arvrServer: XRServer) =
        XRServer.getInstanceId() == arvrServer.getInstanceId()

    @RegisterFunction
    fun createVariantArrayOfUserType() = variantArrayOf<OtherScript>()
}
