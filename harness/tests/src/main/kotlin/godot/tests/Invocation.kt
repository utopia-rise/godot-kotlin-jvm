package godot.tests

import godot.Button
import godot.NavigationMesh
import godot.Node3D
import godot.Object
import godot.XRServer
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.annotation.EnumFlag
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.File
import godot.annotation.FloatRange
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.annotation.IntFlag
import godot.annotation.IntRange
import godot.annotation.LongRange
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
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
import godot.extensions.getNodeAs
import godot.registration.Range
import godot.tests.subpackage.OtherScript
import godot.common.util.RealT
import org.joda.time.DateTime

enum class TestEnum {
    ENUM_1,
    ENUM_2
}

@GodotScript
class Invocation : Node3D() {
    @Export
    lateinit var button: Button

    @Export
    var enumList = listOf(TestEnum.ENUM_1)

    @Member
    var vectorList = PackedVector3Array()

    @Export
    var enumListMutable = mutableListOf(TestEnum.ENUM_1, TestEnum.ENUM_2)

    // Can't export nullable coretypes
    //@Export
    //var nullableLong: Long? = null

    private var hasInitializedLateInits = false

    // Can't export nullable coretypes
    //@Export
    //var lateinitString: String? = null

    @Member
    lateinit var registerObject: OtherScript

    @Member
    var registerObjectNullable: OtherScript? = null

    @Member
    var registerObjectNullablePreInit: OtherScript? = OtherScript()
        set(value) {
            field?.free()
            field = value
        }

    @Member
    var registerObjectNonNullablePreInit: OtherScript = OtherScript()
        set(value) {
            field.free()
            field = value
        }

    @Member
    var vector = Vector3()

    @Export
    var x = 0

    @Export
    var y = 0.0

    @Export
    var z = 0.0f

    @Export
    var customName = "Idonthaveanyidea"

    //references in default values are allowed if the property is NOT exported
    private val otherScriptReference = OtherScript()
    private fun provideOtherScriptReference() = otherScriptReference

    @Member
    var invocation = provideOtherScriptReference()

    @Export
    var enumTest = TestEnum.ENUM_1

    @Export
    var resourceTest = NavigationMesh()

    @Export
    var jvmId: Int = 0
        get() = hashCode()
        set(value) {
            field = hashCode()
        }

    @Export
    var testArrayAny = VariantArray<Any>()

    @Export
    var navMeshes = variantArrayOf(NavigationMesh())

    @Export
    var nullableArray = variantArrayOf(NavigationMesh(), null)

    @Export
    var anyToAnyDictionary = Dictionary<Any, Any>()

    @Export
    var navMeshesDictionary = dictionaryOf("AwesomeNavmesh" to NavigationMesh())

    @Export
    var nullableDictionary = dictionaryOf(
        "notnull" to NavigationMesh(),
        "null" to null
    )

    @Export
    var color = Color()

    @Export
    var rid = RID()

    @Export
    var packedByteArray = PackedByteArray()

    @Export
    var packedInt32Array = PackedInt32Array()

    @Export
    var packedFloat64Array = PackedFloat64Array()

    @Export
    var packedColorArray = PackedColorArray()

    @Export
    var packedStringArray = PackedStringArray()

    @Export
    var packedVector2Array = PackedVector2Array()

    @Export
    var packedVector3Array = PackedVector3Array()

    @IntRange(1, 2)
    var p1 = 1

    @LongRange(1L, 2L)
    var p1_1 = 1L

    @FloatRange(1f, 2f)
    var p2 = 1f

    @DoubleRange(1.0, 2.0)
    var p3 = 1.0

    @DoubleRange(min = 1.0, max = 2.0, step = 0.1, or = Range.OR_GREATER, hideSlider = true, isDegrees = true, suffix = "MyCoolSuffix")
    var p4 = 1.0

    @FloatRange(1f, 2f)
    var p5 = 1f

    @EnumTypeHint
    var p6 = TestEnum.ENUM_1

    @ExpEasing
    var p7 = 1f

    @ExpEasing
    var p8 = 1.0

    @Export
    @EnumFlag
    var p9 = setOf(TestEnum.ENUM_1)

    @EnumFlag
    var p10 = mutableSetOf(TestEnum.ENUM_1)

    @EnumFlag
    var p11 = mutableSetOf<TestEnum>()

    @IntFlag
    var p12 = 1 or 2 and 3

    @File
    var p13 = "someFile"

    @Dir
    var p14 = "someDir"

    @MultilineText
    var p15 = """
		some
		multiline
		text
	""".trimIndent()

    @PlaceHolderText
    var p16 = "some placeholderText"

    @ColorNoAlpha
    var p17 = Color()

    @Export
    var stringtemplation = "blubb ${17 + 25}"

    @Export
    var testString = "Two eggs in a boiler. One says: it's hot here, isn't ? The other: oh my god, an egg talking!"

    @Export
    var asciiString = ""

    @Export
    var utf8String = ""

    @Member
    fun intValue(value: Int) = value

    @Member
    fun longValue(value: Long) = value

    @Member
    fun floatValue(value: Float) = value

    @Member
    fun doubleValue(value: Double) = value

    @Member
    fun booleanValue(value: Boolean) = value

    @Member
    fun stringValue(value: String) = value

    @Member
    fun intAddition(a: Int, b: Int) = a + b

    @Member
    fun initNullables() {
        registerObject = OtherScript()
        registerObjectNullable = OtherScript()
        hasInitializedLateInits = true
    }

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

        (getNodeOrNull(path) as Button?)?.pressed?.connect(
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

    @Member
    fun getRidId() = rid.id

    @Member
    fun getNavMeshRid() = resourceTest.getRid()

    @Member
    fun appendToAnyDict(key: Any, value: Any) {
        anyToAnyDictionary[key] = value
    }

    @Member
    fun removeFromAnyDict(key: Any) {
        anyToAnyDictionary.remove(key)
    }

    @Member
    fun getFromAnyDict(key: Any) = anyToAnyDictionary[key]

    @Member
    fun anyDictSize() = anyToAnyDictionary.size

    @Member
    fun appendToStringNavMeshDict(key: String, value: NavigationMesh) {
        navMeshesDictionary[key] = value
    }

    @Member
    fun removeFromStringNavMeshDict(key: String) {
        navMeshesDictionary.remove(key)
    }

    @Member
    fun getFromStringNavMeshDict(key: String) = navMeshesDictionary[key]

    @Member
    fun stringNavMeshDictSize() = navMeshesDictionary.size

    @Member
    fun appendToStringNavMeshNullableDict(key: String, value: NavigationMesh) {
        nullableDictionary[key] = value
    }

    @Member
    fun removeFromStringNavMeshNullableDict(key: String) {
        nullableDictionary.remove(key)
    }

//	TODO: This will fail to register as we cannot register nullable return type
//	@Member
//	fun getFromStringNavMeshNullableDict(key: String) = nullableDictionary[key]

    @Member
    fun stringNavMeshNullableDictSize() = nullableDictionary.size

    @Member
    fun appendNullableStandardNavMesh() = nullableArray.append(NavigationMesh())

    @Member
    fun appendNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.append(navigationMesh)

    @Member
    fun removeNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.remove(navigationMesh)

    @Member
    fun removeNullableNavMeshWithIndex(index: Int) = nullableArray.removeAt(index)

//	TODO: This will fail to register as we cannot register nullable return type
//	@Member
//	fun getNullableNavMeshFromArray(index: Int) = nullableArray[index]

    @Member
    fun nullableNavMeshesSize() = nullableArray.size

    @Member
    fun appendStandardNavMesh() = navMeshes.append(NavigationMesh())

    @Member
    fun appendNavMesh(navigationMesh: NavigationMesh) = navMeshes.append(navigationMesh)

    @Member
    fun removeNavMesh(navigationMesh: NavigationMesh) = navMeshes.remove(navigationMesh)

    @Member
    fun removeNavMeshWithIndex(index: Int) = navMeshes.removeAt(index)

    @Member
    fun getNavMeshFromArray(index: Int) = navMeshes[index]

    @Member
    fun navMeshesSize() = navMeshes.size

    @Member
    fun appendAnyToArray(any: Any) = testArrayAny.append(any)

    @Member
    fun removeAnyFromArray(any: Any) = testArrayAny.remove(any)

    @Member
    fun getAnyFromArray(index: Int) = testArrayAny[index]

    @Member
    fun arrayAnySize() = testArrayAny.size

    @Member
    fun countNameshInstance(navigationMesh: NavigationMesh) = navMeshes.count(navigationMesh)

    @Member
    fun getNavMeshCount() = navMeshes.count()

    //Type cast checks
    @Member
    fun parentIsNode3D() = getParent() is Node3D

    @Member
    fun isObjectNode3D(obj: Object) = obj is Node3D

    @Member
    fun otherJvmId(invocation: Invocation) = invocation.jvmId

    @Member
    fun hasCameraNode() = getNodeOrNull(NodePath("Camera")) != null

    @Member
    fun addByteToPackedArray(byte: Byte) = packedByteArray.append(byte)

    @Member
    fun addByteArrayToPackedArray(array: PackedByteArray) = packedByteArray.appendArray(array)

    @Member
    fun deleteByteFromPackedArray(index: Int) = packedByteArray.removeAt(index)

    @Member
    fun getByteFromPackedArray(index: Int) = packedByteArray[index]

    @Member
    fun setByteInPackedArray(index: Int, value: Byte) {
        packedByteArray[index] = value
    }

    @Member
    fun resizeBytePackedArray(newSize: Int) {
        packedByteArray.resize(newSize)
    }

    @Member
    fun addColorToPackedArray(color: Color) = packedColorArray.append(color)

    @Member
    fun addColorArrayToPackedArray(colorArray: PackedColorArray) = packedColorArray.appendArray(colorArray)

    @Member
    fun deleteColorFromPackedArray(index: Int) = packedColorArray.removeAt(index)

    @Member
    fun getColorFromPackedArray(index: Int) = packedColorArray[index]

    @Member
    fun setColorInPackedArray(index: Int, color: Color) {
        packedColorArray[index] = color
    }

    @Member
    fun resizeColorPackedArray(newSize: Int) {
        packedColorArray.resize(newSize)
    }

    @Member
    fun addIntToPackedArray(int: Int) = packedInt32Array.append(int)

    @Member
    fun addIntArrayToPackedArray(intArray: PackedInt32Array) = this.packedInt32Array.appendArray(intArray)

    @Member
    fun deleteIntFromPackedArray(index: Int) = packedInt32Array.removeAt(index)

    @Member
    fun getIntFromPackedArray(index: Int) = packedInt32Array[index]

    @Member
    fun setIntInPackedArray(index: Int, value: Int) {
        packedInt32Array[index] = value
    }

    @Member
    fun resizeIntPackedArray(newSize: Int) {
        packedInt32Array.resize(newSize)
    }

    @Member
    fun addRealToPackedArray(realT: RealT) = packedFloat64Array.append(realT)

    @Member
    fun addRealArrayToPackedArray(realArray: PackedFloat64Array) = packedFloat64Array.appendArray(realArray)

    @Member
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

    @Member
    fun deleteRealFromPackedArray(index: Int) = packedFloat64Array.removeAt(index)

    @Member
    fun getRealFromPackedArray(index: Int) = packedFloat64Array[index]

    @Member
    fun setRealInPackedArray(index: Int, value: Double) {
        packedFloat64Array[index] = value
    }

    @Member
    fun resizeRealPackedArray(newSize: Int) {
        packedFloat64Array.resize(newSize)
    }

    @Member
    fun addStringToPackedArray(string: String) = packedStringArray.append(string)

    @Member
    fun addStringArrayToPackedArray(stringArray: PackedStringArray) = packedStringArray.appendArray(stringArray)

    @Member
    fun deleteStringFromPackedArray(index: Int) = packedStringArray.removeAt(index)

    @Member
    fun getStringFromPackedArray(index: Int) = packedStringArray[index]

    @Member
    fun setStringInPackedArray(index: Int, value: String) {
        packedStringArray[index] = value
    }

    @Member
    fun resizeStringPackedArray(newSize: Int) {
        packedStringArray.resize(newSize)
    }

    @Member
    fun addVector2ToPackedArray(vector2: Vector2) = packedVector2Array.append(vector2)

    @Member
    fun addVector2ArrayToPackedArray(vector2Array: PackedVector2Array) = packedVector2Array.appendArray(vector2Array)

    @Member
    fun deleteVector2FromPackedArray(index: Int) = packedVector2Array.removeAt(index)

    @Member
    fun getVector2FromPackedArray(index: Int) = packedVector2Array[index]

    @Member
    fun setVector2InPackedArray(index: Int, vector2: Vector2) {
        packedVector2Array[index] = vector2
    }

    @Member
    fun resizeVector2PackedArray(newSize: Int) {
        packedVector2Array.resize(newSize)
    }

    @Member
    fun addVector3ToPackedArray(vector3: Vector3) = packedVector3Array.append(vector3)

    @Member
    fun addVector3ArrayToPackedArray(vector3Array: PackedVector3Array) = packedVector3Array.appendArray(vector3Array)

    @Member
    fun deleteVector3FromPackedArray(index: Int) = packedVector3Array.removeAt(index)

    @Member
    fun getVector3FromPackedArray(index: Int) = packedVector3Array[index]

    @Member
    fun setVector3InPackedArray(index: Int, vector3: Vector3) {
        packedVector3Array[index] = vector3
    }

    @Member
    fun resizeVector3PackedArray(newSize: Int) {
        packedVector3Array.resize(newSize)
    }

    // Singleton tests

    @Member
    fun isSentXrSameInstanceAsJvmSingleton(arvrServer: XRServer) =
        XRServer.getInstanceId() == arvrServer.getInstanceId()

    @Member
    fun createVariantArrayOfUserType() = variantArrayOf<OtherScript>()
}
