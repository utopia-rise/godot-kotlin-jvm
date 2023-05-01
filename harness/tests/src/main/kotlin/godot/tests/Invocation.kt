package godot.tests

import godot.Button
import godot.NavigationMesh
import godot.Node3D
import godot.XRServer
import godot.Object
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
import godot.annotation.RegisterSignal
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
import godot.core.asStringName
import godot.core.dictionaryOf
import godot.core.variantArrayOf
import godot.extensions.getNodeAs
import godot.registration.Range
import godot.signals.signal
import godot.tests.subpackage.OtherScript
import godot.util.RealT
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

	@Export
	@RegisterProperty
	var nullableLong: Long? = null

	private var hasInitializedLateInits = false

	@Export
	@RegisterProperty
	lateinit var lateinitString: String

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

	@RegisterSignal
	val noParam by signal()

	@RegisterSignal
	val oneParam by signal<Boolean>("refresh")

	@RegisterSignal
	val twoParam by signal<String, Invocation>("str", "inv")

	@RegisterSignal
	val signalWithMultipleTargets by signal<Vector2>("vector2")

	//To store values emitted by signals
	@RegisterProperty
	var array: VariantArray<Vector2> = VariantArray()

	@RegisterFunction
	fun targetFunctionOne(vector2: Vector2) {
		array.append(vector2)
		//call GodotAPI to insert different parameters in the stack.
		this.setMeta("Random".asStringName(), "Value")
		val size = array.size
		if(size < 8)
		//Call signal inside another signal
			signalWithMultipleTargets.emit(Vector2(1, size))
	}
	@RegisterFunction
	fun targetFunctionTwo(vector2: Vector2) {
		array.append(vector2)
	}

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
		nullableLong = 1
		lateinitString = "works"
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
		name = "TestName".asStringName()
		println("Name is: $name")
		name = formerName
		val test = DateTime.now() //external dependency to test dependency inclusion in main compilation

		val getNode = getNodeAs<Button>("CanvasLayer/Button")

		val path = NodePath("CanvasLayer/Button")
		val getNode2 = getNodeAs<Button>(path)

		noParam.connect(invocation, invocation::hookNoParam)
		oneParam.connect(invocation, invocation::hookOneParam)
		twoParam.connect(invocation, invocation::hookTwoParam)

		signalWithMultipleTargets.connect(this, ::targetFunctionOne)
		signalWithMultipleTargets.connect(this, ::targetFunctionTwo)

		(getNodeOrNull(path) as Button?)?.pressed?.connect(
			invocation,
			invocation::hookNoParam
		)
		noParam.emit()
		oneParam.emit(false)
		twoParam.emit("My Awesome param !", this)

		signalWithMultipleTargets.emit(Vector2(0,0))

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
	fun parentIsNode3D() = getParent() is Node3D

	@RegisterFunction
	fun isObjectNode3D(obj: Object) = obj is Node3D

	@RegisterFunction
	fun otherJvmId(invocation: Invocation) = invocation.jvmId

	@RegisterFunction
	fun hasCameraNode() = getNodeOrNull(NodePath("Camera")) != null

	@RegisterFunction
	fun addByteToPoolArray(byte: Byte) = packedByteArray.append(byte)

	@RegisterFunction
	fun addByteArrayToPoolArray(array: PackedByteArray) = packedByteArray.appendArray(array)

	@RegisterFunction
	fun deleteByteFromPoolArray(index: Int) = packedByteArray.removeAt(index)

	@RegisterFunction
	fun getByteFromPoolArray(index: Int) = packedByteArray[index]

	@RegisterFunction
	fun setByteInPoolArray(index: Int, value: Byte) {
		packedByteArray[index] = value
	}

	@RegisterFunction
	fun resizeBytePoolArray(newSize: Int) {
		packedByteArray.resize(newSize)
	}

	@RegisterFunction
	fun addColorToPoolArray(color: Color) = packedColorArray.append(color)

	@RegisterFunction
	fun addColorArrayToPoolArray(colorArray: PackedColorArray) = packedColorArray.appendArray(colorArray)

	@RegisterFunction
	fun deleteColorFromPoolArray(index: Int) = packedColorArray.remove(index)

	@RegisterFunction
	fun getColorFromPoolArray(index: Int) = packedColorArray[index]

	@RegisterFunction
	fun setColorInPoolArray(index: Int, color: Color) {
		packedColorArray[index] = color
	}

	@RegisterFunction
	fun resizeColorPoolArray(newSize: Int) {
		packedColorArray.resize(newSize)
	}

	@RegisterFunction
	fun addIntToPoolArray(int: Int) = packedInt32Array.append(int)

	@RegisterFunction
	fun addIntArrayToPoolArray(intArray: PackedInt32Array) = this.packedInt32Array.appendArray(intArray)

	@RegisterFunction
	fun deleteIntFromPoolArray(index: Int) = packedInt32Array.remove(index)

	@RegisterFunction
	fun getIntFromPoolArray(index: Int) = packedInt32Array[index]

	@RegisterFunction
	fun setIntInPoolArray(index: Int, value: Int) {
		packedInt32Array[index] = value
	}

	@RegisterFunction
	fun resizeIntPoolArray(newSize: Int) {
		packedInt32Array.resize(newSize)
	}

	@RegisterFunction
	fun addRealToPoolArray(realT: RealT) = packedFloat64Array.append(realT)

	@RegisterFunction
	fun addRealArrayToPoolArray(realArray: PackedFloat64Array) = packedFloat64Array.appendArray(realArray)

	@RegisterFunction
	fun readStringFromByteArray() {

		val asciiArray = testString.toByteArray(Charsets.US_ASCII)
		val pool1 = PackedByteArray()
		for (char in asciiArray) {
			pool1.append(char)
		}
		asciiString = pool1.getStringFromAscii()

		val utf8Array = testString.toByteArray(Charsets.UTF_8)
		val pool2 = PackedByteArray()
		for (char in utf8Array) {
			pool2.append(char)
		}
		utf8String = pool2.getStringFromUtf8()
	}

	@RegisterFunction
	fun deleteRealFromPoolArray(index: Int) = packedFloat64Array.remove(index)

	@RegisterFunction
	fun getRealFromPoolArray(index: Int) = packedFloat64Array[index]

	@RegisterFunction
	fun setRealInPoolArray(index: Int, value: Double) {
		packedFloat64Array[index] = value
	}

	@RegisterFunction
	fun resizeRealPoolArray(newSize: Int) {
		packedFloat64Array.resize(newSize)
	}

	@RegisterFunction
	fun addStringToPoolArray(string: String) = packedStringArray.append(string)

	@RegisterFunction
	fun addStringArrayToPoolArray(stringArray: PackedStringArray) = packedStringArray.appendArray(stringArray)

	@RegisterFunction
	fun deleteStringFromPoolArray(index: Int) = packedStringArray.remove(index)

	@RegisterFunction
	fun getStringFromPoolArray(index: Int) = packedStringArray[index]

	@RegisterFunction
	fun setStringInPoolArray(index: Int, value: String) {
		packedStringArray[index] = value
	}

	@RegisterFunction
	fun resizeStringPoolArray(newSize: Int) {
		packedStringArray.resize(newSize)
	}

	@RegisterFunction
	fun addVector2ToPoolArray(vector2: Vector2) = packedVector2Array.append(vector2)

	@RegisterFunction
	fun addVector2ArrayToPoolArray(vector2Array: PackedVector2Array) = packedVector2Array.appendArray(vector2Array)

	@RegisterFunction
	fun deleteVector2FromPoolArray(index: Int) = packedVector2Array.remove(index)

	@RegisterFunction
	fun getVector2FromPoolArray(index: Int) = packedVector2Array[index]

	@RegisterFunction
	fun setVector2InPoolArray(index: Int, vector2: Vector2) {
		packedVector2Array[index] = vector2
	}

	@RegisterFunction
	fun resizeVector2PoolArray(newSize: Int) {
		packedVector2Array.resize(newSize)
	}

	@RegisterFunction
	fun addVector3ToPoolArray(vector3: Vector3) = packedVector3Array.append(vector3)

	@RegisterFunction
	fun addVector3ArrayToPoolArray(vector3Array: PackedVector3Array) = packedVector3Array.appendArray(vector3Array)

	@RegisterFunction
	fun deleteVector3FromPoolArray(index: Int) = packedVector3Array.remove(index)

	@RegisterFunction
	fun getVector3FromPoolArray(index: Int) = packedVector3Array[index]

	@RegisterFunction
	fun setVector3InPoolArray(index: Int, vector3: Vector3) {
		packedVector3Array[index] = vector3
	}

	@RegisterFunction
	fun resizeVector3PoolArray(newSize: Int) {
		packedVector3Array.resize(newSize)
	}

	// Singleton tests

	@RegisterFunction
	fun isSentXrSameInstanceAsJvmSingleton(arvrServer: XRServer) =
		XRServer.getInstanceId() == arvrServer.getInstanceId()

	@RegisterFunction
	fun nullableStringIsNull(nullableString: String?) = nullableString == null

	@RegisterFunction
	fun nullableReturnType(shouldReturnNull: Boolean): String? = if (shouldReturnNull) {
		null
	} else {
		"not null"
	}

	@RegisterFunction
	fun createVariantArrayOfUserType() = variantArrayOf<OtherScript>()
}
