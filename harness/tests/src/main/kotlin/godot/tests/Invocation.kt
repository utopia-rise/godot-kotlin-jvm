package godot.tests

import godot.api.Button
import godot.api.NavigationMesh
import godot.api.Node3D
import godot.api.Object
import godot.api.XRServer
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
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
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.core.BitField
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
import godot.annotation.Range
import godot.tests.subpackage.OtherScript
import godot.common.util.RealT
import godot.extension.api.getNodeAs
import godot.extension.connectMethod
import org.joda.time.DateTime

enum class TestEnum {
	ENUM_1,
	ENUM_2
}


@Script
class Invocation : Node3D() {
	@Export
	@Visible
	lateinit var button: Button

	@Export
	@Visible
	var enumList = listOf(TestEnum.ENUM_1)

	@Visible
	var vectorList = PackedVector3Array()

	@Export
	@Visible
	var enumListMutable = mutableListOf(TestEnum.ENUM_1, TestEnum.ENUM_2)

	// Can't export nullable coretypes
    //@Export
    //@Visible
    //var nullableLong: Long? = null

    private var hasInitializedLateInits = false

	// Can't export nullable coretypes
	//@Export
	//@Visible
	//var lateinitString: String? = null

	@Visible
	lateinit var registerObject: OtherScript

	@Visible
	var registerObjectNullable: OtherScript? = null

	@Visible
	var registerObjectNullablePreInit: OtherScript? = OtherScript()
		set(value) {
			field?.free()
			field = value
		}

	@Visible
	var registerObjectNonNullablePreInit: OtherScript = OtherScript()
		set(value) {
			field.free()
			field = value
		}

	@Visible
	var vector = Vector3()

	@Export
	@Visible
	var x = 0

	@Export
	@Visible
	var y = 0.0

	@Export
	@Visible
	var z = 0.0f

	@Export
	@Visible
	var customName = "Idonthaveanyidea"

	//references in default values are allowed if the property is NOT exported
	private val otherScriptReference = OtherScript()
	private fun provideOtherScriptReference() = otherScriptReference

	@Visible
	var invocation = provideOtherScriptReference()

	@Export
	@Visible
	var enumTest = TestEnum.ENUM_1

	@Export
	@Visible
	var resourceTest = NavigationMesh()

	@Export
	@Visible
	var jvmId: Int = 0
		get() = hashCode()
		set(value) {
			field = hashCode()
		}

	@Export
	@Visible
	var testArrayAny = VariantArray<Any>()

	@Export
	@Visible
	var navMeshes = variantArrayOf(NavigationMesh())

	@Export
	@Visible
	var nullableArray = variantArrayOf(NavigationMesh(), null)

	@Export
	@Visible
	var anyToAnyDictionary = Dictionary<Any, Any>()

	@Export
	@Visible
	var navMeshesDictionary = dictionaryOf("AwesomeNavmesh" to NavigationMesh())

	@Export
	@Visible
	var nestedDictionary: Dictionary<Int, Dictionary<Int, Int>> = dictionaryOf()

	@Export
	@Visible
	var nullableDictionary = dictionaryOf(
		"notnull" to NavigationMesh(),
		"null" to null
	)

	@Export
	@Visible
	var color = Color()

	@Export
	@Visible
	var rid = RID()

	@Export
	@Visible
	var packedByteArray = PackedByteArray()

	@Export
	@Visible
	var packedInt32Array = PackedInt32Array()

	@Export
	@Visible
	var packedFloat64Array = PackedFloat64Array()

	@Export
	@Visible
	var packedColorArray = PackedColorArray()

	@Export
	@Visible
	var packedStringArray = PackedStringArray()

	@Export
	@Visible
	var packedVector2Array = PackedVector2Array()

	@Export
	@Visible
	var packedVector3Array = PackedVector3Array()

	@Export
	@Visible
	@IntRange(1, 2)
	var p1 = 1

	@Export
	@Visible
	@LongRange(1L, 2L)
	var p1_1 = 1L

	@Export
	@Visible
	@FloatRange(1f, 2f)
	var p2 = 1f

	@Export
	@Visible
	@DoubleRange(1.0, 2.0)
	var p3 = 1.0

	@Export
	@Visible
	@DoubleRange(min = 1.0, max = 2.0, step = 0.1, or = Range.OR_GREATER, hideSlider = true, isDegrees = true, suffix = "MyCoolSuffix")
	var p4 = 1.0

	@Export
	@Visible
	@FloatRange(1f, 2f)
	var p5 = 1f

	@Export
	@Visible
	@EnumTypeHint
	var p6 = TestEnum.ENUM_1

	@Export
	@Visible
	@ExpEasing
	var p7 = 1f

	@Export
	@Visible
	@ExpEasing
	var p8 = 1.0

	@Export
	@Visible
	var p9 = BitField.of(TestEnum.ENUM_1)

	@Export
	@Visible
	var p10 = BitField.of(TestEnum.ENUM_1, TestEnum.ENUM_2)

	@Export
	@Visible
	var p11 = BitField<TestEnum>(0)

	@Export
	@Visible
	@IntFlag
	var p12 = 1 or 2 and 3

	@Export
	@Visible
	@File
	var p13 = "someFile"

	@Export
	@Visible
	@Dir
	var p14 = "someDir"

	@Export
	@Visible
	@MultilineText
	var p15 = """
		some
		multiline
		text
	""".trimIndent()

	@Export
	@Visible
	@PlaceHolderText
	var p16 = "some placeholderText"

	@Export
	@Visible
	@ColorNoAlpha
	var p17 = Color()

	@Export
	@Visible
	var stringtemplation = "blubb ${17 + 25}"

	@Export
	@Visible
	var testString = "Two eggs in a boiler. One says: it's hot here, isn't ? The other: oh my god, an egg talking!"

	@Export
	@Visible
	var asciiString = ""

	@Export
	@Visible
	var utf8String = ""

	@Register
	fun intValue(value: Int) = value

	@Register
	fun longValue(value: Long) = value

	@Register
	fun floatValue(value: Float) = value

	@Register
	fun doubleValue(value: Double) = value

	@Register
	fun booleanValue(value: Boolean) = value

	@Register
	fun stringValue(value: String) = value

	@Register
	fun intAddition(a: Int, b: Int) = a + b

	@Register
	fun initNullables() {
		registerObject = OtherScript()
		registerObjectNullable = OtherScript()
		hasInitializedLateInits = true
	}

	@Register
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

	@Register
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

	@Register
	fun getRidId() = rid.id

	@Register
	fun getNavMeshRid() = resourceTest.getRid()

	@Register
	fun appendToAnyDict(key: Any, value: Any) {
		anyToAnyDictionary[key] = value
	}

	@Register
	fun removeFromAnyDict(key: Any) {
		anyToAnyDictionary.remove(key)
	}

	@Register
	fun getFromAnyDict(key: Any) = anyToAnyDictionary[key]

	@Register
	fun anyDictSize() = anyToAnyDictionary.size

	@Register
	fun appendToStringNavMeshDict(key: String, value: NavigationMesh) {
		navMeshesDictionary[key] = value
	}

	@Register
	fun removeFromStringNavMeshDict(key: String) {
		navMeshesDictionary.remove(key)
	}

	@Register
	fun getFromStringNavMeshDict(key: String) = navMeshesDictionary[key]

	@Register
	fun stringNavMeshDictSize() = navMeshesDictionary.size

	@Register
	fun appendToStringNavMeshNullableDict(key: String, value: NavigationMesh) {
		nullableDictionary[key] = value
	}

	@Register
	fun removeFromStringNavMeshNullableDict(key: String) {
		nullableDictionary.remove(key)
	}

//	TODO: This will fail to register as we cannot register nullable return type
//	@Register
//	fun getFromStringNavMeshNullableDict(key: String) = nullableDictionary[key]

	@Register
	fun stringNavMeshNullableDictSize() = nullableDictionary.size

	@Register
	fun appendNullableStandardNavMesh() = nullableArray.append(NavigationMesh())

	@Register
	fun appendNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.append(navigationMesh)

	@Register
	fun removeNullableNavMesh(navigationMesh: NavigationMesh?) = nullableArray.remove(navigationMesh)

	@Register
	fun removeNullableNavMeshWithIndex(index: Int) = nullableArray.removeAt(index)

//	TODO: This will fail to register as we cannot register nullable return type
//	@Register
//	fun getNullableNavMeshFromArray(index: Int) = nullableArray[index]

	@Register
	fun nullableNavMeshesSize() = nullableArray.size

	@Register
	fun appendStandardNavMesh() = navMeshes.append(NavigationMesh())

	@Register
	fun appendNavMesh(navigationMesh: NavigationMesh) = navMeshes.append(navigationMesh)

	@Register
	fun removeNavMesh(navigationMesh: NavigationMesh) = navMeshes.remove(navigationMesh)

	@Register
	fun removeNavMeshWithIndex(index: Int) = navMeshes.removeAt(index)

	@Register
	fun getNavMeshFromArray(index: Int) = navMeshes[index]

	@Register
	fun navMeshesSize() = navMeshes.size

	@Register
	fun appendAnyToArray(any: Any) = testArrayAny.append(any)

	@Register
	fun removeAnyFromArray(any: Any) = testArrayAny.remove(any)

	@Register
	fun getAnyFromArray(index: Int) = testArrayAny[index]

	@Register
	fun arrayAnySize() = testArrayAny.size

	@Register
	fun countNameshInstance(navigationMesh: NavigationMesh) = navMeshes.count(navigationMesh)

	@Register
	fun getNavMeshCount() = navMeshes.count()

	//Type cast checks
	@Register
	fun parentIsNode3D() = getParent() is Node3D

	@Register
	fun isObjectNode3D(obj: Object) = obj is Node3D

	@Register
	fun otherJvmId(invocation: Invocation) = invocation.jvmId

	@Register
	fun hasCameraNode() = getNodeOrNull(NodePath("Camera")) != null

	@Register
	fun addByteToPackedArray(byte: Byte) = packedByteArray.append(byte)

	@Register
	fun addByteArrayToPackedArray(array: PackedByteArray) = packedByteArray.appendArray(array)

	@Register
	fun deleteByteFromPackedArray(index: Int) = packedByteArray.removeAt(index)

	@Register
	fun getByteFromPackedArray(index: Int) = packedByteArray[index]

	@Register
	fun setByteInPackedArray(index: Int, value: Byte) {
		packedByteArray[index] = value
	}

	@Register
	fun resizeBytePackedArray(newSize: Int) {
		packedByteArray.resize(newSize)
	}

	@Register
	fun addColorToPackedArray(color: Color) = packedColorArray.append(color)

	@Register
	fun addColorArrayToPackedArray(colorArray: PackedColorArray) = packedColorArray.appendArray(colorArray)

	@Register
	fun deleteColorFromPackedArray(index: Int) = packedColorArray.removeAt(index)

	@Register
	fun getColorFromPackedArray(index: Int) = packedColorArray[index]

	@Register
	fun setColorInPackedArray(index: Int, color: Color) {
		packedColorArray[index] = color
	}

	@Register
	fun resizeColorPackedArray(newSize: Int) {
		packedColorArray.resize(newSize)
	}

	@Register
	fun addIntToPackedArray(int: Int) = packedInt32Array.append(int)

	@Register
	fun addIntArrayToPackedArray(intArray: PackedInt32Array) = this.packedInt32Array.appendArray(intArray)

	@Register
	fun deleteIntFromPackedArray(index: Int) = packedInt32Array.removeAt(index)

	@Register
	fun getIntFromPackedArray(index: Int) = packedInt32Array[index]

	@Register
	fun setIntInPackedArray(index: Int, value: Int) {
		packedInt32Array[index] = value
	}

	@Register
	fun resizeIntPackedArray(newSize: Int) {
		packedInt32Array.resize(newSize)
	}

	@Register
	fun addRealToPackedArray(realT: RealT) = packedFloat64Array.append(realT)

	@Register
	fun addRealArrayToPackedArray(realArray: PackedFloat64Array) = packedFloat64Array.appendArray(realArray)

	@Register
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

	@Register
	fun deleteRealFromPackedArray(index: Int) = packedFloat64Array.removeAt(index)

	@Register
	fun getRealFromPackedArray(index: Int) = packedFloat64Array[index]

	@Register
	fun setRealInPackedArray(index: Int, value: Double) {
		packedFloat64Array[index] = value
	}

	@Register
	fun resizeRealPackedArray(newSize: Int) {
		packedFloat64Array.resize(newSize)
	}

	@Register
	fun addStringToPackedArray(string: String) = packedStringArray.append(string)

	@Register
	fun addStringArrayToPackedArray(stringArray: PackedStringArray) = packedStringArray.appendArray(stringArray)

	@Register
	fun deleteStringFromPackedArray(index: Int) = packedStringArray.removeAt(index)

	@Register
	fun getStringFromPackedArray(index: Int) = packedStringArray[index]

	@Register
	fun setStringInPackedArray(index: Int, value: String) {
		packedStringArray[index] = value
	}

	@Register
	fun resizeStringPackedArray(newSize: Int) {
		packedStringArray.resize(newSize)
	}

	@Register
	fun addVector2ToPackedArray(vector2: Vector2) = packedVector2Array.append(vector2)

	@Register
	fun addVector2ArrayToPackedArray(vector2Array: PackedVector2Array) = packedVector2Array.appendArray(vector2Array)

	@Register
	fun deleteVector2FromPackedArray(index: Int) = packedVector2Array.removeAt(index)

	@Register
	fun getVector2FromPackedArray(index: Int) = packedVector2Array[index]

	@Register
	fun setVector2InPackedArray(index: Int, vector2: Vector2) {
		packedVector2Array[index] = vector2
	}

	@Register
	fun resizeVector2PackedArray(newSize: Int) {
		packedVector2Array.resize(newSize)
	}

	@Register
	fun addVector3ToPackedArray(vector3: Vector3) = packedVector3Array.append(vector3)

	@Register
	fun addVector3ArrayToPackedArray(vector3Array: PackedVector3Array) = packedVector3Array.appendArray(vector3Array)

	@Register
	fun deleteVector3FromPackedArray(index: Int) = packedVector3Array.removeAt(index)

	@Register
	fun getVector3FromPackedArray(index: Int) = packedVector3Array[index]

	@Register
	fun setVector3InPackedArray(index: Int, vector3: Vector3) {
		packedVector3Array[index] = vector3
	}

	@Register
	fun resizeVector3PackedArray(newSize: Int) {
		packedVector3Array.resize(newSize)
	}

	// Singleton tests

	@Register
	fun isSentXrSameInstanceAsJvmSingleton(arvrServer: XRServer) =
		XRServer.getInstanceId() == arvrServer.getInstanceId()

	@Register
	fun createVariantArrayOfUserType() = variantArrayOf<OtherScript>()
}


