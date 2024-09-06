@file:Suppress("UNCHECKED_CAST")

package godot.core

import godot.core.callable.ParametersReader
import godot.util.camelToSnakeCase

enum class PropertyHint {
    NONE, ///< no hint provided.
    RANGE, ///< hint_text = "min,max[,step][,or_greater][,or_less][,hide_slider][,radians][,degrees][,exp][,suffix:<keyword>] range.
    ENUM, ///< hint_text= "val1,val2,val3,etc"
    ENUM_SUGGESTION, ///< hint_text= "val1,val2,val3,etc"
    EXP_EASING, /// exponential easing function (Math::ease) use "attenuation" hint string to revert (flip h), "positive_only" to exclude in-out and out-in. (ie: "attenuation,positive_only")
    LINK,
    FLAGS, ///< hint_text= "flag1,flag2,etc" (as bit flags)
    LAYERS_2D_RENDER,
    LAYERS_2D_PHYSICS,
    LAYERS_2D_NAVIGATION,
    LAYERS_3D_RENDER,
    LAYERS_3D_PHYSICS,
    LAYERS_3D_NAVIGATION,
    FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,"
    DIR, ///< a directory path must be passed
    GLOBAL_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,"
    GLOBAL_DIR, ///< a directory path must be passed
    RESOURCE_TYPE, ///< a resource object type
    MULTILINE_TEXT, ///< used for string properties that can contain multiple lines
    EXPRESSION, ///< used for string properties that can contain multiple lines
    PLACEHOLDER_TEXT, ///< used to set a placeholder text for string properties
    COLOR_NO_ALPHA, ///< used for ignoring alpha component when editing a color
    OBJECT_ID,
    TYPE_STRING, ///< a type string, the hint is the base type to choose
    NODE_PATH_TO_EDITED_NODE, ///< so something else can provide this (used in scripts)
    OBJECT_TOO_BIG, ///< object is too big to send
    NODE_PATH_VALID_TYPES,
    SAVE_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,". This opens a save dialog
    GLOBAL_SAVE_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,". This opens a save dialog
    INT_IS_OBJECTID,
    INT_IS_POINTER,
    ARRAY_TYPE,
    LOCALE_ID,
    LOCALIZABLE_STRING,
    NODE_TYPE, ///< a node object type
    HIDE_QUATERNION_EDIT, /// Only Node3D::transform should hide the quaternion editor.
    PASSWORD,
    MAX,
}

data class KtFunctionInfo(
    val name: String,
    val _arguments: List<KtPropertyInfo>,
    val returnVal: KtPropertyInfo,
    val rpcConfig: KtRpcConfig
) {
    val arguments: Array<KtPropertyInfo>
        get() = _arguments.toTypedArray()
}

data class KtRpcConfig(
    val rpcModeId: Int,
    val rpcCallLocal: Boolean,
    val rpcTransferModeId: Int,
    val rpcChannel: Int
)

abstract class KtFunction<T : KtObject, R : Any?>(
    val functionInfo: KtFunctionInfo,
    val parameterCount: Int,
    private val variantConverter: VariantConverter,
    vararg parameterTypes: VariantConverter
) {
    private val types: Array<VariantConverter> = parameterTypes.toList().toTypedArray()
    val registrationName = functionInfo.name.camelToSnakeCase()

    fun invoke(instance: T): Unit = withParameters(types) {
        invokeKt(instance)
    }

    fun invokeWithReturn(instance: T): Any? = withParametersReturn(types, variantConverter) {
        invokeKt(instance)
    }

    internal companion object : ParametersReader()

    internal abstract fun invokeKt(instance: T): R
}

class KtFunction0<T : KtObject, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T) -> R,
    variantType: VariantConverter
) : KtFunction<T, R>(functionInfo, 0, variantType) {
    override fun invokeKt(instance: T) = function(instance)
}

class KtFunction1<T : KtObject, P0 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 1, variantType, p0Type) {
    override fun invokeKt(instance: T): R {
        return function(
            instance,
            paramsArray[0] as P0
        )
    }
}

class KtFunction2<T : KtObject, P0 : Any?, P1 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter
) : KtFunction<T, R>(
    functionInfo,
    2,
    variantType,
    p0Type,
    p1Type
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
    )
}

class KtFunction3<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
) : KtFunction<T, R>(
    functionInfo,
    3,
    variantType,
    p0Type,
    p1Type,
    p2Type
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2
    )
}

class KtFunction4<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
) : KtFunction<T, R>(
    functionInfo,
    4,
    variantType,
    p0Type,
    p1Type,
    p2Type,
    p3Type
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
    )
}

class KtFunction5<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
) : KtFunction<T, R>(
    functionInfo,
    5,
    variantType,
    p0Type,
    p1Type,
    p2Type,
    p3Type,
    p4Type
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
    )
}

class KtFunction6<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
) : KtFunction<T, R>(
    functionInfo,
    6,
    variantType,
    p0Type,
    p1Type,
    p2Type,
    p3Type,
    p4Type,
    p5Type,
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
    )
}

class KtFunction7<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
) : KtFunction<T, R>(
    functionInfo,
    7,
    variantType,
    p0Type,
    p1Type,
    p2Type,
    p3Type,
    p4Type,
    p5Type,
    p6Type,
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
    )
}

class KtFunction8<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
) : KtFunction<T, R>(
    functionInfo,
    8,
    variantType,
    p0Type,
    p1Type,
    p2Type,
    p3Type,
    p4Type,
    p5Type,
    p6Type,
    p7Type,
) {
    override fun invokeKt(instance: T) = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
    )
}

class KtFunction9<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 9, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8
    )
}

class KtFunction10<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 10, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9
    )
}

class KtFunction11<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter,
    p10Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 11, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10
    )
}

class KtFunction12<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter,
    p10Type: VariantConverter,
    p11Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 12, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11
    )
}

class KtFunction13<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter,
    p10Type: VariantConverter,
    p11Type: VariantConverter,
    p12Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 13, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12
    )
}

class KtFunction14<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, P13 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter,
    p10Type: VariantConverter,
    p11Type: VariantConverter,
    p12Type: VariantConverter,
    p13Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 14, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12,
        paramsArray[13] as P13
    )
}

class KtFunction15<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, P13 : Any?, P14 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter,
    p10Type: VariantConverter,
    p11Type: VariantConverter,
    p12Type: VariantConverter,
    p13Type: VariantConverter,
    p14Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 15, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12,
        paramsArray[13] as P13,
        paramsArray[14] as P14
    )
}

class KtFunction16<T : KtObject, P0 : Any?, P1 : Any?, P2 : Any?, P3 : Any?, P4 : Any?, P5 : Any?, P6 : Any?, P7 : Any?, P8 : Any?, P9 : Any?, P10 : Any?, P11 : Any?, P12 : Any?, P13 : Any?, P14 : Any?, P15 : Any?, R : Any?>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R,
    variantType: VariantConverter,
    p0Type: VariantConverter,
    p1Type: VariantConverter,
    p2Type: VariantConverter,
    p3Type: VariantConverter,
    p4Type: VariantConverter,
    p5Type: VariantConverter,
    p6Type: VariantConverter,
    p7Type: VariantConverter,
    p8Type: VariantConverter,
    p9Type: VariantConverter,
    p10Type: VariantConverter,
    p11Type: VariantConverter,
    p12Type: VariantConverter,
    p13Type: VariantConverter,
    p14Type: VariantConverter,
    p15Type: VariantConverter
) : KtFunction<T, R>(functionInfo, 16, variantType, p0Type, p1Type, p2Type, p3Type, p4Type, p5Type, p6Type, p7Type, p8Type, p9Type, p10Type, p11Type, p12Type, p13Type, p14Type, p15Type) {
    override fun invokeKt(instance: T): R = function(
        instance,
        paramsArray[0] as P0,
        paramsArray[1] as P1,
        paramsArray[2] as P2,
        paramsArray[3] as P3,
        paramsArray[4] as P4,
        paramsArray[5] as P5,
        paramsArray[6] as P6,
        paramsArray[7] as P7,
        paramsArray[8] as P8,
        paramsArray[9] as P9,
        paramsArray[10] as P10,
        paramsArray[11] as P11,
        paramsArray[12] as P12,
        paramsArray[13] as P13,
        paramsArray[14] as P14,
        paramsArray[15] as P15
    )
}
