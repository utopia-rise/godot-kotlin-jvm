package godot.core

import godot.util.camelToSnakeCase

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

abstract class KtFunction<T : KtObject, R>(
        val functionInfo: KtFunctionInfo,
        val parameterCount: Int
) {
    val registrationName = functionInfo.name.camelToSnakeCase()
    fun invoke(instance: T) {
        val args = TransferContext.readArguments()
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s) for function ${functionInfo.name}, but got ${args.size} instead." }
        val ret = invoke(instance, args)
        TransferContext.writeReturnValue(ret)
    }

    internal abstract operator fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any>
}

class KtFunction0<T : KtObject, R>(
        functionInfo: KtFunctionInfo,
        private val function: (T) -> R,
        private val returnValueConverter: (R) -> Pair<VariantType, Any>
) : KtFunction<T, R>(functionInfo, 0) {
    override operator fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any> {
        return returnValueConverter(
                function(instance)
        )
    }
}

class KtFunction1<T : KtObject, P0, R>(
        functionInfo: KtFunctionInfo,
        private val function: (T, P0) -> R,
        private val returnValueConverter: (R) -> Pair<VariantType, Any>,
        private val p0Converter: (Any) -> P0
) : KtFunction<T, Any>(functionInfo, 1) {
    override operator fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any> {
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s), but got ${args.size} instead." }
        return returnValueConverter(
                function(
                        instance,
                        p0Converter(args[0])
                )
        )
    }
}

class KtFunction2<T: KtObject, P0, P1, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1) -> R,
    private val returnValueConverter: (R) -> Pair<VariantType, Any>,
    private val p0Converter: (Any) -> P0,
    private val p1Converter: (Any) -> P1,
) : KtFunction<T, R>(functionInfo, 2) {
    override fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any> {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
            )
        )
    }
}

class KtFunction3<T: KtObject, P0, P1, P2, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2) -> R,
    private val returnValueConverter: (R) -> Pair<VariantType, Any>,
    private val p0Converter: (Any) -> P0,
    private val p1Converter: (Any) -> P1,
    private val p2Converter: (Any) -> P2,
) : KtFunction<T, R>(functionInfo, 3) {
    override fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any> {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
            )
        )
    }
}

class KtFunction4<T: KtObject, P0, P1, P2, P3, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3) -> R,
    private val returnValueConverter: (R) -> Pair<VariantType, Any>,
    private val p0Converter: (Any) -> P0,
    private val p1Converter: (Any) -> P1,
    private val p2Converter: (Any) -> P2,
    private val p3Converter: (Any) -> P3,
) : KtFunction<T, R>(functionInfo, 4) {
    override fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any> {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
                p3Converter(args[3]),
            )
        )
    }
}

class KtFunction5<T: KtObject, P0, P1, P2, P3, P4, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4) -> R,
    private val returnValueConverter: (R) -> Pair<VariantType, Any>,
    private val p0Converter: (Any) -> P0,
    private val p1Converter: (Any) -> P1,
    private val p2Converter: (Any) -> P2,
    private val p3Converter: (Any) -> P3,
    private val p4Converter: (Any) -> P4,
) : KtFunction<T, R>(functionInfo, 5) {
    override fun invoke(instance: T, args: List<Any>): Pair<VariantType, Any> {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
                p3Converter(args[3]),
                p4Converter(args[4]),
            )
        )
    }
}