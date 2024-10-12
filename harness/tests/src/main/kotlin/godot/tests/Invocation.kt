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
import godot.annotation.GodotMember
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

    @GodotMember
    var vectorList = PackedVector3Array()

    @Export
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

    @GodotMember
    lateinit var registerObject: OtherScript

    @GodotMember
    var registerObjectNullable: OtherScript? = null

    @GodotMember
    var registerObjectNullablePreInit: OtherScript? = OtherScript()
        set(value) {
            field?.free()
            field = value
        }

    @GodotMember
    var registerObjectNonNullablePreInit: OtherScript = OtherScript()
        set(value) {
            field.free()
            field = value
        }

    @GodotMember
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

    @GodotMember
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

    @Export
    @IntRange(1, 2)
    var p1 = 1

    @Export
    @LongRange(1L, 2L)
    var p1_1 = 1L

    @Export
    @FloatRange(1f, 2f)
    var p2 = 1f

    @Export
    @DoubleRange(1.0, 2.0)
    var p3 = 1.0

    @Export
    @DoubleRange(min = 1.0, max = 2.0, step = 0.1, or = Range.OR_GREATER, hideSlider = true, isDegrees = true, suffix = "MyCoolSuffix")
    var p4 = 1.0

    @Export
    @FloatRange(1f, 2f)
    var p5 = 1f

    @Export
    @EnumTypeHint
    var p6 = TestEnum.ENUM_1

    @Export
    @ExpEasing
    var p7 = 1f

    @Export
    @ExpEasing
    var p8 = 1.0

    @Export
    @EnumFlag
    var p9 = setOf(TestEnum.ENUM_1)

    @Export
    @EnumFlag
    var p10 = mutableSetOf(TestEnum.ENUM_1)

    @Export
    @EnumFlag
    var p11 = mutableSetOf<TestEnum>()

    @Export
    @IntFlag
    var p12 = 1 or 2 and 3

    @Export
    @File
    var p13 = "someFile"

    @Export
    @Dir
    var p14 = "someDir"

    @Export
    @MultilineText
    var p15 = """
		some
		multiline
		text
	""".trimIndent()

    @Export
    @PlaceHolderText
    var p16 = "some placeholderText"

    @Export
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

    @GodotMember
    fun intValue(value: Int) = value

    @GodotMember
    fun longValue(value: Long) = value

    @GodotMember
    fun floatValue(value: Float) = value

    @GodotMember
    fun doubleValue(value: Double) = value

    @GodotMember
    fun booleanValue(value: Boolean) = value

    @GodotMember
    fun stringValue(value: String) = value

    @GodotMember
    fun intAddition(a: Int, b: Int) = a + b

    @GodotMember
    fun initNullables() {
        registerObject = OtherScript()
        registerObjectNullable = OtherScript()
        hasInitializedLateInits = true
    }

    @GodotMember
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

    @GodotMember
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

    @GodotMember
    fun getRidId() = rid.id

    @GodotMember
    fun getNavMeshRid() = resourceTest.getRid()

    @GodotMember
    fun appendToAnyDict(key: Any, value: Any) {
        anyToAnyDictionary[key] = value
    }

    @GodotMember
    fun removeFromAnyDict(key: Any) {
        anyToAnyDictionary.remove(key)
    }

    @GodotMember
    fun getFromAnyDict(key: Any) = anyToAnyDictionary[key]

    @GodotMember
    fun anyDictSize() = anyToAnyDictionary.size

    @GodotMember
    fun appendToStringNavMeshDict(key: String, value: NavigationMesh) {
        navMeshesDictionary[key] = value
    }

    @GodotMember
    fun removeFromStringNavMeshDict(key: String) {
        navMeshesDictionary.remove(key)
    }

    @GodotMember
    fun getFromStringNavMeshDict(key: String) = navMeshesDictionary[key]

    @GodotMember
    fun stringNavMeshDictSize() = navMeshesDictionary.size

    @GodotMember
    fun appendToStringNavMeshNullableDict(key: String, value: NavigationMesh) {
        nullableDictionary[key] = value
    }

    @GodotMember
    fun removeFromStringNavMeshNullableDict(key: String) {
        nullableDictionary.remove(key)
    }

//	TODO: This will fail to register as we cannot register nullable return type
//	@RegisterFunction
//	fun getFromStringNavMeshNullableDict(key: String) = nullableDictionary[key]

    @GodotMember
    fun stringNavMeshNullableDictSize() = nullableDictionary.size

    @GodotMember
    fun appendNullableStandardNavMesh() = nullableArray.append(NavigationMesh())

    @GodotMember
    fun appendNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.append(navigationMesh)

    @GodotMember
    fun removeNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.remove(navigationMesh)

    @GodotMember
    fun removeNullableNavMeshWithIndex(index: Int) = nullableArray.removeAt(index)

//	TODO: This will fail to register as we cannot register nullable return type
//	@RegisterFunction
//	fun getNullableNavMeshFromArray(index: Int) = nullableArray[index]

    @GodotMember
    fun nullableNavMeshesSize() = nullableArray.size

    @GodotMember
    fun appendStandardNavMesh() = navMeshes.append(NavigationMesh())

    @GodotMember
    fun appendNavMesh(navigationMesh: NavigationMesh) = navMeshes.append(navigationMesh)

    @GodotMember
    fun removeNavMesh(navigationMesh: NavigationMesh) = navMeshes.remove(navigationMesh)

    @GodotMember
    fun removeNavMeshWithIndex(index: Int) = navMeshes.removeAt(index)

    @GodotMember
    fun getNavMeshFromArray(index: Int) = navMeshes[index]

    @GodotMember
    fun navMeshesSize() = navMeshes.size

    @GodotMember
    fun appendAnyToArray(any: Any) = testArrayAny.append(any)

    @GodotMember
    fun removeAnyFromArray(any: Any) = testArrayAny.remove(any)

    @GodotMember
    fun getAnyFromArray(index: Int) = testArrayAny[index]

    @GodotMember
    fun arrayAnySize() = testArrayAny.size

    @GodotMember
    fun countNameshInstance(navigationMesh: NavigationMesh) = navMeshes.count(navigationMesh)

    @GodotMember
    fun getNavMeshCount() = navMeshes.count()

    //Type cast checks
    @GodotMember
    fun parentIsNode3D() = getParent() is Node3D

    @GodotMember
    fun isObjectNode3D(obj: Object) = obj is Node3D

    @GodotMember
    fun otherJvmId(invocation: Invocation) = invocation.jvmId

    @GodotMember
    fun hasCameraNode() = getNodeOrNull(NodePath("Camera")) != null

    @GodotMember
    fun addByteToPackedArray(byte: Byte) = packedByteArray.append(byte)

    @GodotMember
    fun addByteArrayToPackedArray(array: PackedByteArray) = packedByteArray.appendArray(array)

    @GodotMember
    fun deleteByteFromPackedArray(index: Int) = packedByteArray.removeAt(index)

    @GodotMember
    fun getByteFromPackedArray(index: Int) = packedByteArray[index]

    @GodotMember
    fun setByteInPackedArray(index: Int, value: Byte) {
        packedByteArray[index] = value
    }

    @GodotMember
    fun resizeBytePackedArray(newSize: Int) {
        packedByteArray.resize(newSize)
    }

    @GodotMember
    fun addColorToPackedArray(color: Color) = packedColorArray.append(color)

    @GodotMember
    fun addColorArrayToPackedArray(colorArray: PackedColorArray) = packedColorArray.appendArray(colorArray)

    @GodotMember
    fun deleteColorFromPackedArray(index: Int) = packedColorArray.removeAt(index)

    @GodotMember
    fun getColorFromPackedArray(index: Int) = packedColorArray[index]

    @GodotMember
    fun setColorInPackedArray(index: Int, color: Color) {
        packedColorArray[index] = color
    }

    @GodotMember
    fun resizeColorPackedArray(newSize: Int) {
        packedColorArray.resize(newSize)
    }

    @GodotMember
    fun addIntToPackedArray(int: Int) = packedInt32Array.append(int)

    @GodotMember
    fun addIntArrayToPackedArray(intArray: PackedInt32Array) = this.packedInt32Array.appendArray(intArray)

    @GodotMember
    fun deleteIntFromPackedArray(index: Int) = packedInt32Array.removeAt(index)

    @GodotMember
    fun getIntFromPackedArray(index: Int) = packedInt32Array[index]

    @GodotMember
    fun setIntInPackedArray(index: Int, value: Int) {
        packedInt32Array[index] = value
    }

    @GodotMember
    fun resizeIntPackedArray(newSize: Int) {
        packedInt32Array.resize(newSize)
    }

    @GodotMember
    fun addRealToPackedArray(realT: RealT) = packedFloat64Array.append(realT)

    @GodotMember
    fun addRealArrayToPackedArray(realArray: PackedFloat64Array) = packedFloat64Array.appendArray(realArray)

    @GodotMember
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

    @GodotMember
    fun deleteRealFromPackedArray(index: Int) = packedFloat64Array.removeAt(index)

    @GodotMember
    fun getRealFromPackedArray(index: Int) = packedFloat64Array[index]

    @GodotMember
    fun setRealInPackedArray(index: Int, value: Double) {
        packedFloat64Array[index] = value
    }

    @GodotMember
    fun resizeRealPackedArray(newSize: Int) {
        packedFloat64Array.resize(newSize)
    }

    @GodotMember
    fun addStringToPackedArray(string: String) = packedStringArray.append(string)

    @GodotMember
    fun addStringArrayToPackedArray(stringArray: PackedStringArray) = packedStringArray.appendArray(stringArray)

    @GodotMember
    fun deleteStringFromPackedArray(index: Int) = packedStringArray.removeAt(index)

    @GodotMember
    fun getStringFromPackedArray(index: Int) = packedStringArray[index]

    @GodotMember
    fun setStringInPackedArray(index: Int, value: String) {
        packedStringArray[index] = value
    }

    @GodotMember
    fun resizeStringPackedArray(newSize: Int) {
        packedStringArray.resize(newSize)
    }

    @GodotMember
    fun addVector2ToPackedArray(vector2: Vector2) = packedVector2Array.append(vector2)

    @GodotMember
    fun addVector2ArrayToPackedArray(vector2Array: PackedVector2Array) = packedVector2Array.appendArray(vector2Array)

    @GodotMember
    fun deleteVector2FromPackedArray(index: Int) = packedVector2Array.removeAt(index)

    @GodotMember
    fun getVector2FromPackedArray(index: Int) = packedVector2Array[index]

    @GodotMember
    fun setVector2InPackedArray(index: Int, vector2: Vector2) {
        packedVector2Array[index] = vector2
    }

    @GodotMember
    fun resizeVector2PackedArray(newSize: Int) {
        packedVector2Array.resize(newSize)
    }

    @GodotMember
    fun addVector3ToPackedArray(vector3: Vector3) = packedVector3Array.append(vector3)

    @GodotMember
    fun addVector3ArrayToPackedArray(vector3Array: PackedVector3Array) = packedVector3Array.appendArray(vector3Array)

    @GodotMember
    fun deleteVector3FromPackedArray(index: Int) = packedVector3Array.removeAt(index)

    @GodotMember
    fun getVector3FromPackedArray(index: Int) = packedVector3Array[index]

    @GodotMember
    fun setVector3InPackedArray(index: Int, vector3: Vector3) {
        packedVector3Array[index] = vector3
    }

    @GodotMember
    fun resizeVector3PackedArray(newSize: Int) {
        packedVector3Array.resize(newSize)
    }

    // Singleton tests

    @GodotMember
    fun isSentXrSameInstanceAsJvmSingleton(arvrServer: XRServer) =
        XRServer.getInstanceId() == arvrServer.getInstanceId()

    @GodotMember
    fun createVariantArrayOfUserType() = variantArrayOf<OtherScript>()
}
