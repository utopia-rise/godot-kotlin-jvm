// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Dictionary
import godot.core.KtConstructor0
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolStringArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.PropertyHint.NONE
import godot.core.PropertyHint.RESOURCE_TYPE
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_BYTE
import godot.core.VariantType.JVM_FLOAT
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.dictionaryOf
import godot.core.variantArrayOf
import godot.runtime.Entry
import godot.runtime.Entry.Context
import godot.runtime.KtFunctionArgument
import godot.tests.Invocation
import godot.tests.OtherScript
import godot.tests.TestEnum

class Entry : Entry() {
  override fun Context.init() {
    with(registry) {
      registerClass<OtherScript>(OtherScript::class.qualifiedName!!, "Node", false) {
        constructor(KtConstructor0(::OtherScript))
        function(OtherScript::hookNoParam, NIL, KtFunctionArgument(NIL, "kotlin.Unit"))
        function(OtherScript::hookOneParam, NIL, BOOL, KtFunctionArgument(BOOL, "kotlin.Boolean", "b"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(OtherScript::hookTwoParam, NIL, STRING, OBJECT, KtFunctionArgument(STRING, "kotlin.String", "str"), KtFunctionArgument(OBJECT, "godot.Spatial", "inv"), KtFunctionArgument(NIL, "kotlin.Unit"))
      }
      registerClass<Invocation>(Invocation::class.qualifiedName!!, "Spatial", false) {
        constructor(KtConstructor0(::Invocation))
        function(Invocation::intValue, JVM_INT, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "value"), KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::longValue, LONG, LONG, KtFunctionArgument(LONG, "kotlin.Long", "value"), KtFunctionArgument(LONG, "kotlin.Long"))
        function(Invocation::floatValue, JVM_FLOAT, JVM_FLOAT, KtFunctionArgument(DOUBLE, "kotlin.Float", "value"), KtFunctionArgument(DOUBLE, "kotlin.Float"))
        function(Invocation::doubleValue, DOUBLE, DOUBLE, KtFunctionArgument(DOUBLE, "kotlin.Double", "value"), KtFunctionArgument(DOUBLE, "kotlin.Double"))
        function(Invocation::booleanValue, BOOL, BOOL, KtFunctionArgument(BOOL, "kotlin.Boolean", "value"), KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::stringValue, STRING, STRING, KtFunctionArgument(STRING, "kotlin.String", "value"), KtFunctionArgument(STRING, "kotlin.String"))
        function(Invocation::intAddition, JVM_INT, JVM_INT, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "a"), KtFunctionArgument(LONG, "kotlin.Int", "b"), KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::_enterTree, NIL, KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::_ready, NIL, KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getRidId, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::getNavMeshRid, _RID, KtFunctionArgument(_RID, "godot.core.RID"))
        function(Invocation::appendToAnyDict, NIL, ANY, ANY, KtFunctionArgument(ANY, "kotlin.Any", "key"), KtFunctionArgument(ANY, "kotlin.Any", "value"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::removeFromAnyDict, NIL, ANY, KtFunctionArgument(ANY, "kotlin.Any", "key"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getFromAnyDict, ANY, ANY, KtFunctionArgument(ANY, "kotlin.Any", "key"), KtFunctionArgument(ANY, "kotlin.Any"))
        function(Invocation::anyDictSize, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::appendToStringNavMeshDict, NIL, STRING, OBJECT, KtFunctionArgument(STRING, "kotlin.String", "key"), KtFunctionArgument(OBJECT, "godot.NavigationMesh", "value"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::removeFromStringNavMeshDict, NIL, STRING, KtFunctionArgument(STRING, "kotlin.String", "key"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getFromStringNavMeshDict, OBJECT, STRING, KtFunctionArgument(STRING, "kotlin.String", "key"), KtFunctionArgument(OBJECT, "godot.NavigationMesh"))
        function(Invocation::stringNavMeshDictSize, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::appendToStringNavMeshNullableDict, NIL, STRING, OBJECT, KtFunctionArgument(STRING, "kotlin.String", "key"), KtFunctionArgument(OBJECT, "godot.NavigationMesh", "value"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::removeFromStringNavMeshNullableDict, NIL, STRING, KtFunctionArgument(STRING, "kotlin.String", "key"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::stringNavMeshNullableDictSize, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::appendNullableStandardNavMesh, NIL, KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::appendNullableNavMesh, NIL, OBJECT, KtFunctionArgument(OBJECT, "godot.NavigationMesh", "navigationMesh"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::removeNullableNavMesh, BOOL, OBJECT, KtFunctionArgument(OBJECT, "godot.NavigationMesh", "navigationMesh"), KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::removeNullableNavMeshWithIndex, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::nullableNavMeshesSize, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::appendStandardNavMesh, NIL, KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::appendNavMesh, NIL, OBJECT, KtFunctionArgument(OBJECT, "godot.NavigationMesh", "navigationMesh"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::removeNavMesh, BOOL, OBJECT, KtFunctionArgument(OBJECT, "godot.NavigationMesh", "navigationMesh"), KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::removeNavMeshWithIndex, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getNavMeshFromArray, OBJECT, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(OBJECT, "godot.NavigationMesh"))
        function(Invocation::navMeshesSize, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::appendAnyToArray, NIL, ANY, KtFunctionArgument(ANY, "kotlin.Any", "any"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::removeAnyFromArray, BOOL, ANY, KtFunctionArgument(ANY, "kotlin.Any", "any"), KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::getAnyFromArray, ANY, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(ANY, "kotlin.Any"))
        function(Invocation::arrayAnySize, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::countNameshInstance, JVM_INT, OBJECT, KtFunctionArgument(OBJECT, "godot.NavigationMesh", "navigationMesh"), KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::getNavMeshCount, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::parentIsSpatial, BOOL, KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::isObjectSpatial, BOOL, OBJECT, KtFunctionArgument(OBJECT, "godot.Object", "obj"), KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::otherJvmId, JVM_INT, OBJECT, KtFunctionArgument(OBJECT, "godot.tests.Invocation", "invocation"), KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::hasCameraNode, BOOL, KtFunctionArgument(BOOL, "kotlin.Boolean"))
        function(Invocation::addByteToPoolArray, NIL, JVM_BYTE, KtFunctionArgument(JVM_BYTE, "kotlin.Byte", "byte"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addByteArrayToPoolArray, NIL, POOL_BYTE_ARRAY, KtFunctionArgument(POOL_BYTE_ARRAY, "godot.core.PoolByteArray", "array"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteByteFromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getByteFromPoolArray, JVM_BYTE, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(JVM_BYTE, "kotlin.Byte"))
        function(Invocation::addColorToPoolArray, NIL, COLOR, KtFunctionArgument(COLOR, "godot.core.Color", "color"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addColorArrayToPoolArray, NIL, POOL_COLOR_ARRAY, KtFunctionArgument(POOL_COLOR_ARRAY, "godot.core.PoolColorArray", "colorArray"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteColorFromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getColorFromPoolArray, COLOR, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(COLOR, "godot.core.Color"))
        function(Invocation::addIntToPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "int"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addIntArrayToPoolArray, NIL, POOL_INT_ARRAY, KtFunctionArgument(POOL_INT_ARRAY, "godot.core.PoolIntArray", "intArray"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteIntFromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getIntFromPoolArray, JVM_INT, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(LONG, "kotlin.Int"))
        function(Invocation::addRealToPoolArray, NIL, DOUBLE, KtFunctionArgument(DOUBLE, "kotlin.Double", "realT"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addRealArrayToPoolArray, NIL, POOL_REAL_ARRAY, KtFunctionArgument(POOL_REAL_ARRAY, "godot.core.PoolRealArray", "realArray"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteRealFromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getRealFromPoolArray, DOUBLE, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(DOUBLE, "kotlin.Double"))
        function(Invocation::addStringToPoolArray, NIL, STRING, KtFunctionArgument(STRING, "kotlin.String", "string"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addStringArrayToPoolArray, NIL, POOL_STRING_ARRAY, KtFunctionArgument(POOL_STRING_ARRAY, "godot.core.PoolStringArray", "stringArray"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteStringFromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getStringFromPoolArray, STRING, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(STRING, "kotlin.String"))
        function(Invocation::addVector2ToPoolArray, NIL, VECTOR2, KtFunctionArgument(VECTOR2, "godot.core.Vector2", "vector2"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addVector2ArrayToPoolArray, NIL, POOL_VECTOR2_ARRAY, KtFunctionArgument(POOL_VECTOR2_ARRAY, "godot.core.PoolVector2Array", "vector2Array"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteVector2FromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getVector2FromPoolArray, VECTOR2, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(VECTOR2, "godot.core.Vector2"))
        function(Invocation::addVector3ToPoolArray, NIL, VECTOR3, KtFunctionArgument(VECTOR3, "godot.core.Vector3", "vector3"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::addVector3ArrayToPoolArray, NIL, POOL_VECTOR3_ARRAY, KtFunctionArgument(POOL_VECTOR3_ARRAY, "godot.core.PoolVector3Array", "vector3Array"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::deleteVector3FromPoolArray, NIL, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(NIL, "kotlin.Unit"))
        function(Invocation::getVector3FromPoolArray, VECTOR3, JVM_INT, KtFunctionArgument(LONG, "kotlin.Int", "index"), KtFunctionArgument(VECTOR3, "godot.core.Vector3"))
        signal(Invocation::signalNoParam)
        signal(Invocation::signalOneParam, KtFunctionArgument(BOOL, "kotlin.Boolean", "refresh"))
        signal(Invocation::signalTwoParam, KtFunctionArgument(STRING, "kotlin.String", "str"), KtFunctionArgument(OBJECT, "godot.tests.Invocation", "inv"))
        property(Invocation::x, JVM_INT, LONG, "kotlin.Int", NONE, "", 0)
        property(Invocation::y, DOUBLE, DOUBLE, "kotlin.Double", NONE, "", 0.0)
        property(Invocation::z, JVM_FLOAT, DOUBLE, "kotlin.Float", NONE, "", 0.0f)
        property(Invocation::customName, STRING, STRING, "kotlin.String", NONE, "", "Idonthaveanyidea")
        enumProperty(Invocation::enumTest, TestEnum.ENUM_1)
        property(Invocation::resourceTest, OBJECT, OBJECT, "godot.NavigationMesh", RESOURCE_TYPE, "NavigationMesh", NavigationMesh())
        property(Invocation::jvmId, JVM_INT, LONG, "kotlin.Int", NONE, "", 0)
        property(Invocation::testArrayAny, ARRAY, ARRAY, "godot.core.VariantArray", NONE, "", VariantArray())
        property(Invocation::navMeshes, ARRAY, ARRAY, "godot.core.VariantArray", NONE, "", variantArrayOf(NavigationMesh()))
        property(Invocation::nullableArray, ARRAY, ARRAY, "godot.core.VariantArray", NONE, "", variantArrayOf(NavigationMesh(), null))
        property(Invocation::anyToAnyDictionary, DICTIONARY, DICTIONARY, "godot.core.Dictionary", NONE, "", Dictionary())
        property(Invocation::navMeshesDictionary, DICTIONARY, DICTIONARY, "godot.core.Dictionary", NONE, "", dictionaryOf("AwesomeNavmesh" to NavigationMesh()))
        property(Invocation::nullableDictionary, DICTIONARY, DICTIONARY, "godot.core.Dictionary", NONE, "", dictionaryOf("notnull" to NavigationMesh(), "null" to null))
        property(Invocation::color, COLOR, COLOR, "godot.core.Color", NONE, "", Color())
        property(Invocation::rid, _RID, _RID, "godot.core.RID", NONE, "", RID())
        property(Invocation::poolByteArray, POOL_BYTE_ARRAY, POOL_BYTE_ARRAY, "godot.core.PoolByteArray", NONE, "", PoolByteArray())
        property(Invocation::poolIntArray, POOL_INT_ARRAY, POOL_INT_ARRAY, "godot.core.PoolIntArray", NONE, "", PoolIntArray())
        property(Invocation::poolRealArray, POOL_REAL_ARRAY, POOL_REAL_ARRAY, "godot.core.PoolRealArray", NONE, "", PoolRealArray())
        property(Invocation::poolColorArray, POOL_COLOR_ARRAY, POOL_COLOR_ARRAY, "godot.core.PoolColorArray", NONE, "", PoolColorArray())
        property(Invocation::poolStringArray, POOL_STRING_ARRAY, POOL_STRING_ARRAY, "godot.core.PoolStringArray", NONE, "", PoolStringArray())
        property(Invocation::poolVector2Array, POOL_VECTOR2_ARRAY, POOL_VECTOR2_ARRAY, "godot.core.PoolVector2Array", NONE, "", PoolVector2Array())
        property(Invocation::poolVector3Array, POOL_VECTOR3_ARRAY, POOL_VECTOR3_ARRAY, "godot.core.PoolVector3Array", NONE, "", PoolVector3Array())
      }
    }
  }

  override fun Context.initEngineTypes() {
    registerVariantMapping()
    registerEngineTypes()
    registerEngineTypeMethods()
  }
}
