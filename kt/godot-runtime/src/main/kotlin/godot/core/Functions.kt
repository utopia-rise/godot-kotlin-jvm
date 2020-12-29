package godot.core

import godot.util.camelToSnakeCase
import godot.util.threadLocal

enum class PropertyHint {
    NONE, ///< no hint provided.
    RANGE, ///< hint_text = "min,max,step,slider; //slider is optional"
    EXP_RANGE, ///< hint_text = "min,max,step", exponential edit
    ENUM, ///< hint_text= "val1,val2,val3,etc"
    EXP_EASING, /// exponential easing function (Math::ease) use "attenuation" hint string to revert (flip h), "full" to also include in/out. (ie: "attenuation,inout")
    LENGTH, ///< hint_text= "length" (as integer)
    SPRITE_FRAME, // FIXME: Obsolete: drop whenever we can break compat. Keeping now for GDNative compat.
    KEY_ACCEL, ///< hint_text= "length" (as integer)
    FLAGS, ///< hint_text= "flag1,flag2,etc" (as bit flags)
    LAYERS_2D_RENDER,
    LAYERS_2D_PHYSICS,
    LAYERS_3D_RENDER,
    LAYERS_3D_PHYSICS,
    FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,"
    DIR, ///< a directory path must be passed
    GLOBAL_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,"
    GLOBAL_DIR, ///< a directory path must be passed
    RESOURCE_TYPE, ///< a resource object type
    MULTILINE_TEXT, ///< used for string properties that can contain multiple lines
    PLACEHOLDER_TEXT, ///< used to set a placeholder text for string properties
    COLOR_NO_ALPHA, ///< used for ignoring alpha component when editing a color
    IMAGE_COMPRESS_LOSSY,
    IMAGE_COMPRESS_LOSSLESS,
    OBJECT_ID,
    TYPE_STRING, ///< a type string, the hint is the base type to choose
    NODE_PATH_TO_EDITED_NODE, ///< so something else can provide this (used in scripts)
    METHOD_OF_VARIANT_TYPE, ///< a method of a type
    METHOD_OF_BASE_TYPE, ///< a method of a base type
    METHOD_OF_INSTANCE, ///< a method of an instance
    METHOD_OF_SCRIPT, ///< a method of a script & base
    PROPERTY_OF_VARIANT_TYPE, ///< a property of a type
    PROPERTY_OF_BASE_TYPE, ///< a property of a base type
    PROPERTY_OF_INSTANCE, ///< a property of an instance
    PROPERTY_OF_SCRIPT, ///< a property of a script & base
    OBJECT_TOO_BIG, ///< object is too big to send
    NODE_PATH_VALID_TYPES,
    SAVE_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,". This opens a save dialog
    MAX,
    // When updating PropertyHint, also sync the hardcoded list in VisualScriptEditorVariableEdit
};

data class KtFunctionInfo(
        val name: String,
        val _arguments: List<KtPropertyInfo>,
        val returnVal: KtPropertyInfo
) {
    val arguments: Array<KtPropertyInfo>
        get() = _arguments.toTypedArray()
}

abstract class KtFunction<T : KtObject, R : Any?>(
        val functionInfo: KtFunctionInfo,
        val parameterCount: Int,
        val variantType: VariantType,
        private vararg val parameterTypes: VariantType
) {
    val registrationName = functionInfo.name.camelToSnakeCase()

    fun invoke(instance: T) {
        val argsSize = TransferContext.buffer.int
        require(argsSize == parameterCount) { "Expecting $parameterCount parameter(s) for function ${functionInfo.name}, but got $argsSize instead." }
        readArguments(argsSize)
        val ret = invokeKt(instance)
        resetParamsArray()
        //TODO: manage nullable returns of registered methods (only for objects)
        TransferContext.writeReturnValue(ret, variantType)
    }

    private fun readArguments(argsSize: Int) {
        for (i in 0 until argsSize) {
            //TODO: manage nullable arguments of registered methods (only for objects)
            paramsArray[i] = TransferContext.readSingleArgument(parameterTypes[i])
        }
        TransferContext.buffer.rewind()
    }

    internal abstract fun invokeKt(instance: T): R

    companion object {
        val paramsArray by threadLocal { arrayOf<Any?>(null, null, null, null, null) }

        fun resetParamsArray() {
            paramsArray.fill(null)
        }
    }
}

class KtFunction0<T : KtObject, R : Any?>(
        functionInfo: KtFunctionInfo,
        private val function: (T) -> R,
        variantType: VariantType
) : KtFunction<T, R>(functionInfo, 0, variantType) {
    override fun invokeKt(instance: T) = function(instance)
}

class KtFunction1<T : KtObject, P0 : Any?, R : Any?>(
        functionInfo: KtFunctionInfo,
        private val function: (T, P0) -> R,
        variantType: VariantType,
        p0Type: VariantType
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
        variantType: VariantType,
        p0Type: VariantType,
        p1Type: VariantType
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
        variantType: VariantType,
        p0Type: VariantType,
        p1Type: VariantType,
        p2Type: VariantType,
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
        variantType: VariantType,
        p0Type: VariantType,
        p1Type: VariantType,
        p2Type: VariantType,
        p3Type: VariantType,
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
        variantType: VariantType,
        p0Type: VariantType,
        p1Type: VariantType,
        p2Type: VariantType,
        p3Type: VariantType,
        p4Type: VariantType,
) : KtFunction<T, R>(
        functionInfo,
        5,
        variantType,
        p0Type,
        p1Type,
        p2Type,
        p3Type,
        p4Type) {
    override fun invokeKt(instance: T) = function(
            instance,
            paramsArray[0] as P0,
            paramsArray[1] as P1,
            paramsArray[2] as P2,
            paramsArray[3] as P3,
            paramsArray[4] as P4,
    )
}