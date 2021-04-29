package godot.tests

import godot.ARVRServer
import godot.Button
import godot.NavigationMesh
import godot.Object
import godot.Spatial
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.annotation.EnumFlag
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.ExpRange
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
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolStringArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.RID
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.dictionaryOf
import godot.core.variantArrayOf
import godot.extensions.getNodeAs
import godot.signals.signal
import godot.tests.subpackage.OtherScript
import godot.util.RealT
import org.joda.time.DateTime

enum class TestEnum {
	ENUM_1,
	ENUM_2
}

@RegisterClass
class Invocation : Spatial() {

	@Export
	@RegisterProperty
	var enumList = listOf(TestEnum.ENUM_1)

	@Export
	@RegisterProperty
	var enumListMutable = mutableListOf(TestEnum.ENUM_1, TestEnum.ENUM_2)

	@Export
	@RegisterProperty
	var testNullable: Int? = null

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
	var poolByteArray = PoolByteArray()

	@Export
	@RegisterProperty
	var poolIntArray = PoolIntArray()

	@Export
	@RegisterProperty
	var poolRealArray = PoolRealArray()

	@Export
	@RegisterProperty
	var poolColorArray = PoolColorArray()

	@Export
	@RegisterProperty
	var poolStringArray = PoolStringArray()

	@Export
	@RegisterProperty
	var poolVector2Array = PoolVector2Array()

	@Export
	@RegisterProperty
	var poolVector3Array = PoolVector3Array()

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
	@ExpRange(1f, 2f)
	var p4 = 1.0

	@Export
	@RegisterProperty
	@ExpRange(1f, 2f)
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
	var p16 = "someDir"

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
	fun initNullables() {
		testNullable = 1
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
		name = "TestName"
		println("Name is: $name")
		name = formerName
		val test = DateTime.now() //external dependency to test dependency inclusion in dummyCompilation

        val getNode = getNodeAs<Button>("CanvasLayer/Button")

        val path = NodePath("CanvasLayer/Button")
        val getNode2 = getNodeAs<Button>(path)

		signalNoParam.connect(invocation, invocation::hookNoParam)
		signalOneParam.connect(invocation, invocation::hookOneParam)
		signalTwoParam.connect(invocation, invocation::hookTwoParam)

		(getNodeOrNull(path) as Button?)?.signalPressed?.connect(
			invocation,
			invocation::hookNoParam
		)
		signalNoParam.emit()
		signalOneParam.emit(false)
		signalTwoParam.emit("My Awesome param !", this)

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
	fun readStringFromByteArray() {

		val asciiArray = testString.toByteArray(Charsets.US_ASCII)
		val pool1 = PoolByteArray()
		for (char in asciiArray) {
			pool1.append(char)
		}
		asciiString = pool1.getStringFromAscii()

		val utf8Array = testString.toByteArray(Charsets.UTF_8)
		val pool2 = PoolByteArray()
		for (char in utf8Array) {
			pool2.append(char)
		}
		utf8String = pool2.getStringFromUtf8()
	}

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

	// Singleton tests

	@RegisterFunction
	fun isSentArvrSameInstanceAsJvmSingleton(arvrServer: ARVRServer) =
		ARVRServer.getInstanceId() == arvrServer.getInstanceId()

	@RegisterFunction
	fun nullableStringIsNull(nullableString: String?) = nullableString == null

	@RegisterFunction
	fun nullableReturnType(shouldReturnNull: Boolean): String? = if (shouldReturnNull) {
		null
	} else {
		"not null"
	}
}
